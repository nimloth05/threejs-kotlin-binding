import ch.viseon.threejs.parser.*
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import org.jsoup.nodes.Node
import org.jsoup.nodes.TextNode
import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val classList = ClassList.compile(URL("https://threejs.org/docs/list.js"), "ch.viseon.threejs.declarations")
    val classDeclarations = collectClassInformation(classList)

    generateKotlinFiles(classList, classDeclarations)
}

private fun collectClassInformation(classList: ClassList): ClassDeclarations {
    val resultCollector = ClassDeclarationsCollector()
    classList.class2PackageName.entries.parallelStream().forEach { (className, entry) ->
        println("Checking $className")
        createClassDescription(entry, resultCollector)
    }
    return resultCollector.build()
}

private fun generateKotlinFiles(classList: ClassList, classDeclarations: ClassDeclarations) {
    classDeclarations.declarations.parallelStream().forEach { declaration ->
        generateKotlinFile(declaration, classList, classDeclarations)
    }
}

fun createClassDescription(classListEntry: ClassListEntry, declarationCollector: ClassDeclarationsCollector) {
    val directory = classListEntry.packageName.split(".").fold(Paths.get("gen")) { p, s -> p.resolve(s) }

    //Check if the file already exists, if so skip.
    val file = directory.resolve("${classListEntry.name}.kt")
    if (Files.exists(file)) {
        return
    }
    println("Generate ${classListEntry.name}")

    val doc = Jsoup.connect("https://threejs.org/docs/${classListEntry.url}.html").get()
    val body = doc.select("body").first()

    declarationCollector.put(generateDecl(classListEntry.name, body.childNodes()))
}

fun generateKotlinFile(declaration: ClassDeclaration, classList: ClassList, classDeclarations: ClassDeclarations) {
    val classListEntry = classList.class2PackageName[declaration.name]!!
    val directory = classListEntry.packageName.split(".").fold(Paths.get("gen")) { p, s -> p.resolve(s) }

    println("Generate ${classListEntry.name}")

    KotlinFileGenerator(classList, classDeclarations).generate(directory, declaration)
}

fun generateDecl(name: String, elements: List<Node>): ClassDeclaration {
    var i = 0

    val classBuilder = ClassDeclarationBuilder(name)
    var staticMethod = false

    val inheritenceToken: List<Token> = elements[i]
        .takeIf { it is TextNode }
        ?.let {
            if (it is TextNode) {
                TokenStream.parse(it.text())
            } else {
                emptyList()
            }
        }
        ?: emptyList()

    classBuilder.inheritence = DeclarationFactory.createInheritence(inheritenceToken)

    fun moveToNextNonBrNode(): Element {
        ++i
        while (i < elements.size) {
            val element = elements[i]
            if (element !is Element || element.tagName() == "br") {
                ++i
                continue
            } else {
                break
            }
        }
        return elements[i] as Element
    }

    fun collectPs(): String {
        val result = StringBuilder()
        ++i
        while (i < elements.size) {
            val element = elements[i]
            if (element !is Element || element.tagName() == "br") {
                ++i
                continue
            }
            if (element.tagName() != "p" && element.tagName() != "div") {
                break
            }
            result
                .append(element.text())
                .append("\n")
            ++i
        }
        return result.toString()
    }

    fun Element.ensureNodeType(expected: String): Element {
        if (this.tagName() != expected) {
            throw IllegalStateException("unexpected node found in '$name' at position $i node '$this'. expected node $expected \nnodes: $elements")
        }
        return this
    }


    while (i < elements.size) {
        val element = elements[i]
        if (element !is Element) {
            ++i
            continue
        }
        if (element.tagName() == "h1") {
            classBuilder.classDoc = collectPs()
            continue
        } else if ((element.tagName() == "h2" || element.tagName() == "h3") && (element.text() == "Example" || element.text() == "Accessing Attributes")) {
            ++i
            while (i < elements.size) {
                val subElement = elements[i]
                if (subElement !is Element) {
                    ++i
                    continue
                }
                if (subElement.tagName() == "h2" && subElement.text() == "Constructor") {
                    --i
                    break
                }
                ++i
            }
        } else if (element.tagName() == "h2" && element.text() == "Constructor") {
            val ctorNode = moveToNextNonBrNode()

            //Non arg ctor found with weird formatting (SpotLightShadow)
            if (ctorNode.tagName() == "h2") {
                classBuilder.ctorDeclaration = ConstructorDeclaration(listOf(), "")
            } else {
                val docNode = collectPs()

                classBuilder.ctorDeclaration = DeclarationFactory.fromStream(
                    TokenStream.parse(ctorNode.text()),
                    docNode
                ) as ConstructorDeclaration
            }
            continue
        } else if (element.tagName() == "h2" && element.text() == "Static Methods") {
            staticMethod = true
        } else if (element.tagName() == "h3") {
            //member found
            val stream = TokenStream.parse(element.text())
            if (stream.isEmpty()) {
                throw java.lang.IllegalStateException("Empty stream in $name tagName: ${element.tagName()} text: ${element.text()}")
            }
            if (stream.first().tokenType == TokenType.page) {
                ++i
                continue
            }

            val docNode = collectPs()
            val declaration = DeclarationFactory.fromStream(stream, docNode)
            if (declaration != EmptyDeclaration) {
                if (declaration !is ConstructorDeclaration) {
                    classBuilder.addMember(staticMethod, declaration as MemberDeclaration)
                } else {
                    //There are documents, where the title "Constructor" is missing (PointsMaterial)
                    classBuilder.ctorDeclaration = declaration
                }
            }
            continue
        }
        ++i
    }

    return classBuilder.build()
}

