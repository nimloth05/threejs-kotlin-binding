package ch.viseon.threejs.parser

import java.lang.IllegalArgumentException
import java.util.concurrent.ConcurrentHashMap


object DeclarationFactory {

    fun fromStream(owningClassName: String, stream: List<Token>, htmlDoc: String): Declaration {
        if (stream.isEmpty()) {
            throw IllegalArgumentException("Empty stream received")
        }

        val first = stream.first()
        return when (first.tokenType) {
            TokenType.method -> {
                val rest = stream.subList(1, stream.size)
                val (name, type, acceptNullValue) = extractNameAndType(owningClassName, first)
                MethodDeclaration(name, rest.toParamDeclarations(), type, htmlDoc, acceptNullValue)
            }
            TokenType.property -> {
                val (name, type, acceptNullValue) = extractNameAndType(owningClassName, first)
                PropertyDeclaration(name, type, htmlDoc, acceptNullValue)
            }
            TokenType.constructor -> {
                val rest = stream.subList(1, stream.size)
                val params =
                    DocCorrections.constructorDeclarationCorrections.getOrDefault(owningClassName, rest.toParamDeclarations())
                ConstructorDeclaration(params, htmlDoc)
            }
            TokenType.page -> {
                EmptyDeclaration
            }
            TokenType.param -> {
                //stray params
                val (name, type, acceptNullValue) = extractNameAndType(owningClassName, first)
                ParamDeclaration(name, type, acceptNullValue)
            }
            else -> throw IllegalArgumentException("Unknown tokenType ${first.tokenType}")
        }
    }

    private fun extractNameAndType(owningClassName: String, token: Token): Triple<String, String, Boolean> {
        val docName = token.name
        val docType = token.type

        val correspondingKotlinType = DocCorrections.docType2KotlinType.getOrDefault(docType, docType)

        val finalName = DocCorrections.correctMemberName(owningClassName, docName)
        val fullMemberName = "$owningClassName.$finalName"
        val finalType = DocCorrections.fullMemberName2Type.getOrDefault(fullMemberName, correspondingKotlinType)
        val acceptNullValue = DocCorrections.declarationsAcceptingNullValues.contains(fullMemberName)
        return Triple(finalName, finalType, acceptNullValue)
    }

    private fun List<Token>.toParamDeclarations(): List<ParamDeclaration> {
        return this.map { token ->
            val correspondingKotlinType = DocCorrections.docType2KotlinType.getOrDefault(token.type, token.type)
            ParamDeclaration(token.name, correspondingKotlinType)
        }
    }

    fun createInheritance(inheritanceToken: List<Token>): InheritenceDeclaration {
        return if (inheritanceToken.isEmpty()) {
            InheritenceDeclaration("")
        } else {
            //Token is a pageToken, and pageTokens have their name in store as type. (given by threejs doc)
            InheritenceDeclaration(inheritanceToken.last().type)
        }
    }
}

sealed class Declaration

interface TypedDeclaration {
    val acceptNullValue: Boolean
    val type: String
}

abstract class MemberDeclaration : Declaration(), TypedDeclaration {

    abstract val name: String
    lateinit var owningClass: ClassDeclaration
}

data class ClassDeclaration(
    val name: String,
    val inheritenceDeclaration: InheritenceDeclaration,
    val constructorDeclaration: ConstructorDeclaration,
    val overloadedConstructors: List<ConstructorDeclaration>,
    val members: List<MemberDeclaration>,
    val staticMembers: List<MemberDeclaration>,
    val doc: String = ""
) {

    init {
        members.forEach { it.owningClass = this }
        staticMembers.forEach { it.owningClass = this }
    }

    private val isDerived get() = inheritenceDeclaration.parentClass.isNotBlank()

    private fun hasMember(comparator: (MemberDeclaration) -> Boolean): Boolean {
        return members.find(comparator)?.let { true } ?: false
    }

    fun findParentMember(
        classDeclarations: ClassDeclarations,
        comparator: (MemberDeclaration) -> Boolean
    ): Boolean {
        var currentClass = this
        while (currentClass.isDerived) {
            val parentClass = classDeclarations[currentClass.inheritenceDeclaration.parentClass]
            if (parentClass.hasMember(comparator)) {
                return true
            }
            currentClass = parentClass
        }
        return false
    }
}

data class ParamDeclaration(
    val name: String,
    override val type: String,
    override val acceptNullValue: Boolean = false
) : Declaration(), TypedDeclaration

class MethodDeclaration(
    override val name: String,
    val paramDeclarations: List<ParamDeclaration>,
    override val type: String, //returnType
    val doc: String,
    /**
     * Indicates if the return value can be null or not
     */
    override val acceptNullValue: Boolean
) : MemberDeclaration() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MethodDeclaration

        if (name != other.name) return false
        if (paramDeclarations != other.paramDeclarations) return false
        if (type != other.type) return false
        if (acceptNullValue != other.acceptNullValue) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + paramDeclarations.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }
}

class PropertyDeclaration(
    override val name: String,
    override val type: String,
    val doc: String,
    override val acceptNullValue: Boolean
) :
    MemberDeclaration() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PropertyDeclaration

        if (name != other.name) return false
        if (type != other.type) return false
        if (acceptNullValue != other.acceptNullValue) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }
}

data class ConstructorDeclaration(
    val paramDeclarations: List<ParamDeclaration>,
    val htmlDoc: String = ""
) : Declaration()

data class InheritenceDeclaration(val parentClass: String) : Declaration()

object EmptyDeclaration : Declaration()

class ClassDeclarations(private val descs: Map<String, ClassDeclaration>) {

    val declarations: Collection<ClassDeclaration> get() = descs.values

    operator fun get(name: String): ClassDeclaration {
        return descs[name] ?: throw IllegalArgumentException("Class not found: $name")
    }


}

class ClassDeclarationsCollector {

    private val synchronizedMap = ConcurrentHashMap<String, ClassDeclaration>()

    fun put(classDeclaration: ClassDeclaration) {
        synchronizedMap[classDeclaration.name] = classDeclaration
    }

    fun build(): ClassDeclarations {
        return ClassDeclarations(synchronizedMap.toMap())
    }
}

class ClassDeclarationBuilder(val name: String) {
    var classDoc: String = ""
    var ctorDeclaration = ConstructorDeclaration(emptyList(), "")
    private val members = mutableListOf<MemberDeclaration>()
    private val staticMembers = mutableListOf<MemberDeclaration>()
    lateinit var inheritance: InheritenceDeclaration

    fun addMember(staticMember: Boolean, declaration: MemberDeclaration) {
        (if (staticMember) staticMembers else members).add(declaration)
    }

    fun build(): ClassDeclaration {
        return ClassDeclaration(name, inheritance, ctorDeclaration, DocCorrections.getOverloadedConstructors(name), members, staticMembers, classDoc)
    }
}

