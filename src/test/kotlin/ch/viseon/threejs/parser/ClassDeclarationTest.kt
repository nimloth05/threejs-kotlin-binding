package ch.viseon.threejs.parser

import org.junit.Assert.assertTrue
import org.junit.Test


class ClassDeclarationTest {

    @Test
    fun `parent member search`() {
        val methodDeclaration = MethodDeclaration("methodA", listOf(), "Int")

        val classA = ClassDeclaration(
            "A",
            InheritenceDeclaration(""),
            ConstructorDeclaration(emptyList()),
            listOf(methodDeclaration),
            emptyList()
        )

        val classB = ClassDeclaration(
            "B",
            InheritenceDeclaration("A"),
            ConstructorDeclaration(emptyList()),
            listOf(methodDeclaration),
            emptyList()
        )

        val classDeclarations = ClassDeclarations(mapOf(classA.name to classA, classB.name to classB))

        val result = classB.findParentMember(classDeclarations, methodDeclaration)
        assertTrue(result)
    }

    @Test
    fun `find parent member over multiple tree`() {
        val methodDeclaration = MethodDeclaration("methodA", listOf(), "Int")

        val classA = ClassDeclaration(
            "A",
            InheritenceDeclaration(""),
            ConstructorDeclaration(emptyList()),
            listOf(methodDeclaration),
            emptyList()
        )

        //This class has no member...
        val classB = ClassDeclaration(
            "B",
            InheritenceDeclaration("A"),
            ConstructorDeclaration(emptyList()),
            emptyList(),
            emptyList()
        )

        //... but class C will override member from Class A
        val classC = ClassDeclaration(
            "C",
            InheritenceDeclaration("B"),
            ConstructorDeclaration(emptyList()),
            listOf(methodDeclaration),
            emptyList()
        )

        val classDeclarations = ClassDeclarations(mapOf(classA.name to classA, classB.name to classB, classC.name to classC))

        val result = classC.findParentMember(classDeclarations, methodDeclaration)
        assertTrue(result)
    }
}