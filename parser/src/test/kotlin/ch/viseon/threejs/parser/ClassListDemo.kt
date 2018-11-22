package ch.viseon.threejs.parser

object FileToken

fun main(args: Array<String>) {
    val result = ClassList.compile(FileToken::class.java.getResource("/test.json"), "a.b.c")

    result.class2PackageName.forEach { t, u ->
        println("$t\t${u.url}\t\t\t\t\t\t${u.packageName}")
    }
}