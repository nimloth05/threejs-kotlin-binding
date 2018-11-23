package ch.viseon.threejs.parser

import java.lang.IllegalArgumentException
import java.util.concurrent.ConcurrentHashMap


object DeclarationFactory {

    fun fromStream(stream: List<Token>, htmlDoc: String = ""): Declaration {
        if (stream.isEmpty()) {
            throw IllegalArgumentException("Empty stream received")
        }

        val first = stream.first()
        return when (first.tokenType) {
            TokenType.method -> {
                val rest = stream.subList(1, stream.size)
                MethodDeclaration(first.name, rest.toParamDeclarations(), first.type, htmlDoc)
            }
            TokenType.property -> {
                PropertyDeclaration(first.name, first.type, htmlDoc)
            }
            TokenType.constructor -> {
                val rest = stream.subList(1, stream.size)
                ConstructorDeclaration(rest.toParamDeclarations(), htmlDoc)
            }
            TokenType.page -> {
                EmptyDeclaration
            }
            else -> throw IllegalArgumentException("Unknown tokenType ${first.tokenType}")
        }
    }

    private fun List<Token>.toParamDeclarations(): List<ParamDeclaration> {
        return this.map { token ->
            ParamDeclaration(token.name, token.type)
        }
    }

    fun createInheritence(inheritenceToken: List<Token>): InheritenceDeclaration {
        return if (inheritenceToken.isEmpty()) {
            InheritenceDeclaration("")
        } else {
            //Token is a pageToken, and pageTokens have their name in store as type. (given by threejs doc)
            InheritenceDeclaration(inheritenceToken.last().type)
        }
    }
}

sealed class Declaration

interface TypedDeclaration {
    val type: String
}

abstract class MemberDeclaration : Declaration(), TypedDeclaration {
    abstract fun correctIfDifferent(newName: String, newType: String): MemberDeclaration

    abstract val name: String
    lateinit var owningClass: ClassDeclaration
}

data class ClassDeclaration(
    val name: String,
    val inheritenceDeclaration: InheritenceDeclaration,
    val constructorDeclaration: ConstructorDeclaration,
    val members: List<MemberDeclaration>,
    val staticMembers: List<MemberDeclaration>,
    val doc: String = ""
) {

    init {
        members.forEach { it.owningClass = this }
        staticMembers.forEach { it.owningClass = this }
    }

    val isDerived get() = inheritenceDeclaration.parentClass.isNotBlank()

    fun hasMember(comparator: (MemberDeclaration) -> Boolean): Boolean {
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

data class ParamDeclaration(val name: String, override val type: String) : Declaration(), TypedDeclaration

class MethodDeclaration(
    override val name: String,
    val paramDeclarations: List<ParamDeclaration>,
    override val type: String, //returnType
    val doc: String = ""
) : MemberDeclaration() {

    override fun correctIfDifferent(newName: String, newType: String): MemberDeclaration {
        return if (newName != name || newType != type) {
            MethodDeclaration(newName, paramDeclarations, newType, doc)
        } else {
            this
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MethodDeclaration

        if (name != other.name) return false
        if (paramDeclarations != other.paramDeclarations) return false
        if (type != other.type) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + paramDeclarations.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }
}

class PropertyDeclaration(override val name: String, override val type: String, val doc: String = "") :
    MemberDeclaration() {

    override fun correctIfDifferent(newName: String, newType: String): MemberDeclaration {
        return if (newName != name || newType != type) {
            PropertyDeclaration(newName, newType, doc)
        } else {
            this
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PropertyDeclaration

        if (name != other.name) return false
        if (type != other.type) return false

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

class ClassDeclarationBuilder(private val name: String) {
    var classDoc: String = ""
    var ctorDeclaration = ConstructorDeclaration(emptyList(), "")
    private val members = mutableListOf<MemberDeclaration>()
    private val staticMembers = mutableListOf<MemberDeclaration>()
    lateinit var inheritence: InheritenceDeclaration

    fun addMember(staticMember: Boolean, declaration: MemberDeclaration) {

        val finalName = DocCorrections.correctMemberName(name, declaration.name)
        val finalType = DocCorrections.types.getOrDefault("$name.${declaration.name}", declaration.type)
        val finalDeclaration = declaration.correctIfDifferent(finalName, finalType)

        (if (staticMember) staticMembers else members).add(finalDeclaration)
    }

    fun build(): ClassDeclaration {
        //check if some of the declrations need some correction
        return ClassDeclaration(name, inheritence, ctorDeclaration, members, staticMembers, classDoc)
    }
}

