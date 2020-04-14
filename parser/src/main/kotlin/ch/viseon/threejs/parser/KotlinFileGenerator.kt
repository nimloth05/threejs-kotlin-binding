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
            append("@file:JsModule(\"three\")\n")

            append("package ")
            append(classList.class2PackageName[classDeclaration.name]!!.packageName)
            append("\n")

            //class Decl
            append(generateKotlinDoc(classDeclaration.doc))
            append("${getClassModifier(classDeclaration)} ")
            append(classDeclaration.name)
            append(classDeclaration.constructorDeclaration.toKotlinDeclaration(classDeclaration))
            append(classDeclaration.inheritenceDeclaration.toKotlinDeclaration())
            append("{\n")
            append(classDeclaration.overloadedConstructors.toKotlinOverloadConstructorDeclaration(classDeclaration))
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

    private val ClassDeclaration.isObject get() = DocCorrections.classesWhichShouldBeObjects.contains(name)

    /**
     * Returns the modifier for this class: `object` or `class`
     */
    private fun getClassModifier(classDeclaration: ClassDeclaration): String {
        return if (classDeclaration.isObject) "external object" else "open external class"
    }

    private fun List<Declaration>.toKotlinDeclaration(classDeclaration: ClassDeclaration): String {
        return this
            .distinct()
            .filter { (!(it as MemberDeclaration).name.contains(".")) }.joinToString(
                "\n",
                transform = { it.toKotlinDeclaration(classDeclaration) })
    }

    private fun Declaration.toKotlinDeclaration(classDeclaration: ClassDeclaration): String {
        return when {
            this is ConstructorDeclaration -> this.toKotlinDeclaration(classDeclaration)
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

    private fun ConstructorDeclaration.toKotlinDeclaration(classDeclaration: ClassDeclaration): String {
        return paramToKotlinDeclaration(classDeclaration, paramDeclarations, false, true)
    }

    private fun List<ConstructorDeclaration>.toKotlinOverloadConstructorDeclaration(classDeclaration: ClassDeclaration): String {
        return joinToString(separator = "\n") {
            "\n\tconstructor${paramToKotlinDeclaration(classDeclaration, it.paramDeclarations, false, false)}"
        }
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
                "\t$modifier var ${toKotlinSaveName(this@toKotlinDeclaration)}: $myType ${getDefaultValue(
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

        val params = paramToKotlinDeclaration(classDeclaration, paramDeclarations, isParentMember, false)
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

    /**
     * @param usedInCtor Specifies if this declartion is used in the class constructor declaration.
     */
    private fun paramToKotlinDeclaration(
        classDeclaration: ClassDeclaration,
        list: List<ParamDeclaration>,
        isParentMember: Boolean,
        usedInCtor: Boolean
    ): String {
        if (list.isEmpty()) {
            return if (usedInCtor) "" else "()"
        }
        val correctParamList = list
            .groupBy { it.name }
            .map { (key, value) ->
                if (value.size > 1) {
                    ParamDeclaration(key, "dynamic", false)
                } else {
                    value.first()
                }
            }

        val params =
            correctParamList.joinToString(", ") { paramDeclaration ->
                toKotlinSaveName(paramDeclaration) + ": " + paramDeclaration.toKotlinType(classDeclaration) + getDefaultValue(
                    isParentMember
                )
            }
        return "($params)"
    }

    private fun TypedDeclaration.toKotlinType(classDeclaration: ClassDeclaration): String {
        val name = if (this.type != "this") {
            mapType(this.type)
        } else {
            classDeclaration.name
        }

        return name + if (acceptNullValue) "?" else ""
    }

    private fun mapType(type: String): String {
        //FIXME: For this feature to work again, we would have to keep the original type from the doc
//        val mappedType = if (type == DocCorrections.DYNAMIC || type == DocCorrections.DYNAMIC_ARRAY) {
//            "$type/*$type*/"
//        } else {
//            type
//        }

        //toFullReference does return the initial input, if no entry is found
        return classList.toFullReference(type)
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
        return if (unsafeKotlinNames.contains(name)) "`$name`" else name
    }

    companion object {
        val unsafeKotlinNames = hashSetOf("object", "this")

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
