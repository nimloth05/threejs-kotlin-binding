package ch.viseon.threejs.parser

import java.lang.StringBuilder
import java.nio.file.Files
import java.nio.file.Path
import java.text.SimpleDateFormat
import java.util.*


class KotlinFileGenerator(
    private val classList: ClassList,
    private val classDeclarations: ClassDeclarations
) {

    fun generate(destinationDirectory: Path, classDeclaration: ClassDeclaration) {
        Files.createDirectories(destinationDirectory)

        val content = buildString {
            append("//Generated date ${SimpleDateFormat.getDateInstance(SimpleDateFormat.MEDIUM, Locale.GERMAN).format(Date())}")
            append("@file:JsModule(\"three\")\n")

            append("package ")
            append(classList.class2PackageName[classDeclaration.name]!!.packageName)
            append("\n")

            //class Decl
            append(generateKotlinDoc(classDeclaration.doc))
            append("open external class ")
            append(classDeclaration.name)
            append(classDeclaration.constructorDeclaration.toKotlinDeclaration())
            append(classDeclaration.inheritenceDeclaration.toKotlinDeclaration())
            append("{\n")
            append(classDeclaration.members.toKotlinDeclaration(classDeclaration))
            if (classDeclaration.staticMembers.isNotEmpty()) {
                append("\tcompanion object {\n")
                append(classDeclaration.staticMembers.toKotlinDeclaration(classDeclaration))
                append("\t\n}\n")
            }
            append("}")
        }


        Files.newBufferedWriter(destinationDirectory.resolve("${classDeclaration.name}.kt")).use {
            it.write(content)
        }
    }

    private fun List<Declaration>.toKotlinDeclaration(classDeclaration: ClassDeclaration): String {
        return this
            .distinct()
            .filter { (!(it as MemberDeclaration).name.contains(".")) }.joinToString(
                "\n",
                transform = { it -> it.toKotlinDeclaration(classDeclaration) })
    }

    private fun Declaration.toKotlinDeclaration(classDeclaration: ClassDeclaration): String {
        return when {
            this is ConstructorDeclaration -> this.toKotlinDeclaration()
            this is MethodDeclaration -> this.toKotlinDeclaration(classDeclaration)
            this is PropertyDeclaration -> this.toKotlinDeclaration(classDeclaration)
            else -> ""
        }
    }

    private fun InheritenceDeclaration.toKotlinDeclaration(): String {
        return if (this.parentClass.isEmpty()) {
            ""
        } else {
            val fullName = classList.toFullReference(parentClass)
            ": $fullName"
        }
    }

    private fun ConstructorDeclaration.toKotlinDeclaration(): String {
        return paramToKotlinDeclaration(paramDeclarations, false)
    }

    private fun PropertyDeclaration.toKotlinDeclaration(classDeclarations: ClassDeclaration): String {
        return buildString {
            if (doc.isNotEmpty()) {
                append(generateKotlinDoc(doc))
            }
            val myType = toKotlinType(classDeclarations)
            val myName = this@toKotlinDeclaration.name
            val (isParentMember, modifier) = determineModifier(classDeclarations) { other ->
                val otherType = other.toKotlinType(other.owningClass)
                myName == other.name && myType == otherType
            }
            append(
                "\t$modifier var ${toKotlinSaveName(this@toKotlinDeclaration)}: ${mapType(type)} ${getDefaultValue(
                    isParentMember
                )}\n"
            )
        }
    }

    private fun MethodDeclaration.toKotlinDeclaration(classDeclaration: ClassDeclaration): String {
        val stringBuilder = StringBuilder()
        if (doc.isNotEmpty()) {
            stringBuilder.append(generateKotlinDoc(doc))
        }
        //If this class derives from a another class, we have to
        //- skip all "= definedExternally
        //- add override modifier

        val (isParentMember, modifier) = determineModifier(classDeclaration) { other: MemberDeclaration ->
            other.takeIf { other is MethodDeclaration }
                ?.let {
                    val otherMethod = other as MethodDeclaration
                    this.name == otherMethod.name && this.compareParams(other)
                } ?: false
        }

        val params = paramToKotlinDeclaration(paramDeclarations, isParentMember)
        val returnType = toKotlinType(owningClass).let { if (it.isEmpty()) "" else ": $it" }
        stringBuilder.append("\t$modifier fun $name$params $returnType\n")
        return stringBuilder.toString()
    }


    private fun MethodDeclaration.compareParams(otherMethodDecl: MethodDeclaration): Boolean {
        val otherParams = otherMethodDecl.paramDeclarations
        if (this.paramDeclarations.size != otherParams.size) {
            return false
        }

        paramDeclarations.forEachIndexed { index, myParam ->
            otherParams[index].also { otherParam ->
                //the type of the param has to be identical
                if (myParam.toKotlinType(this.owningClass) != otherParam.toKotlinType(otherMethodDecl.owningClass)) {
                    return false
                }
            }
        }
        return true
    }

    private fun MemberDeclaration.determineModifier(
        classDeclaration: ClassDeclaration,
        comparator: (MemberDeclaration) -> Boolean
    ): Pair<Boolean, String> {
        val isParentMember = classDeclaration.findParentMember(classDeclarations, comparator)
        val modifier = if (!isParentMember) "open" else "override"
        return Pair(isParentMember, modifier)
    }

    private fun getDefaultValue(isParentMember: Boolean): String {
        return if (!isParentMember) " = definedExternally" else ""
    }

    private fun paramToKotlinDeclaration(
        list: List<ParamDeclaration>,
        isParentMember: Boolean
    ): String {
        if (list.isEmpty()) {
            return "()"
        }
        val params =
            list.joinToString(", ") { toKotlinSaveName(it) + ": " + mapType(it.type) + getDefaultValue(isParentMember) }
        return "($params)"
    }

    private fun TypedDeclaration.toKotlinType(classDeclaration: ClassDeclaration): String {
        return if (this.type != "this") {
            mapType(this.type)
        } else {
            classDeclaration.name
        }
    }

    private fun mapType(type: String): String {
        val mappedType = typeMap.getOrDefault(type, type).let {
            if (it == DYNAMIC || it == DYNAMIC_ARRAY) {
                "$it/*$type*/"
            } else {
                it
            }
        }

        //toFullReference does return the initial input, if no entry if found
        return classList.toFullReference(mappedType)
    }

    private fun toKotlinSaveName(token: MemberDeclaration): String {
        return if (token.name.isNotBlank()) {
            toKotlinSaveName(token.name)
        } else {
            toKotlinSaveName(token.type)
        }
    }

    private fun toKotlinSaveName(token: ParamDeclaration): String {
        return if (token.name.isNotBlank()) {
            toKotlinSaveName(token.name)
        } else {
            toKotlinSaveName(token.type)
        }
    }

    private fun toKotlinSaveName(name: String): String {
        return if (notSaveNames.contains(name)) "`$name`" else name
    }

    companion object {
        const val DYNAMIC = "dynamic"
        const val DYNAMIC_ARRAY = "Array<dynamic>"
        const val FLOAT_TYPE = "Float"

        val notSaveNames = hashSetOf("object", "this")

        val typeMap = mapOf(
            "object" to DYNAMIC,
            "Object" to DYNAMIC,
            "Constant" to "Int",
            "Float32Array" to "org.khronos.webgl.Float32Array",
            "Float64Array" to "org.khronos.webgl.Float64Array",
            "Int8Array" to "org.khronos.webgl.Int8Array",
            "Int16Array" to "org.khronos.webgl.Int16Array",
            "Int32Array" to "org.khronos.webgl.Int32Array",
            "Uint8Array" to "org.khronos.webgl.Uint8Array",
            "Uint16Array" to "org.khronos.webgl.Uint16Array",
            "Uint32Array" to "org.khronos.webgl.Uint32Array",
            "Uint8ClampedArray" to "org.khronos.webgl.Uint8ClampedArray",
            "Array" to DYNAMIC_ARRAY,
            "array" to DYNAMIC_ARRAY,
            "TypedArray" to DYNAMIC_ARRAY,
            "GainNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
            "AudioNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
            "AnalyserNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
            "AudioContext" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
            "PannerNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
            "BiquadFilterNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
            "UUID" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
            "Integer" to "Int",
            "integer" to "Int",
            "float" to FLOAT_TYPE,
            "number" to FLOAT_TYPE,
            "Number" to FLOAT_TYPE,
            "Radians" to FLOAT_TYPE,
            "Hex" to "Int",
            "hex" to "Int",
            "Vector" to DYNAMIC, //FIXME Most likely vector2
            "Color_Hex_or_String" to DYNAMIC,
            "boolean" to "Boolean",
            "Video" to "dynamic",
            "WebGLShadowMap" to DYNAMIC,
            "WebGLRenderLists" to DYNAMIC,
            "WebGLRenderingContext" to "org.khronos.webgl.WebGLRenderingContext",
            "WebGLProgram" to DYNAMIC,
            "RenderTarget" to DYNAMIC,
            "WebGLContextAttributes" to "org.khronos.webgl.WebGLContextAttributes",
            "DOMElement" to "org.w3c.dom.Element",
            "HTMLElement" to "org.w3c.dom.HTMLElement",
            "Function" to DYNAMIC,
            "function" to DYNAMIC,
            "null" to DYNAMIC,
            "string" to "String",
            "Blending" to "Int",
            "shaderprogram" to DYNAMIC,  //FIXME Could this be WebGlProgram?
            "void" to "Unit",  //FIXME Could this be WebGlProgram?
            "Constructor" to DYNAMIC,
            //Typos
            "material" to "Material",
            "AudioConetxt" to DYNAMIC,
            "Quaterion" to "Quaternion",
            "TextureCube" to "CubeTexture"
        )
    }
}

fun generateKotlinDoc(htmlDoc: String): String {
    return buildString {
        append("\n\t/**\n")
        htmlDoc
            .split("<br>")
            .asSequence()
            .map {
                it
                    .replace("*", "**")
                    .replace("<strong>", "**")
                    .replace("</strong>", "**")
                    .replace("*/*", "* / *")
            }
            .map { "\t* $it" }
            .joinTo(this, "\n")
        append("\t*/\n")
    }
}