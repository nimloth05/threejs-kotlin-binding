package ch.viseon.threejs.parser

import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.google.gson.stream.JsonReader
import java.io.StringReader
import java.net.URL

class ClassList(val class2PackageName: Map<String, ClassListEntry>) {

    companion object {

        private val ignoreList = setOf("Constants", "Deprecated", "Core / BufferAttributes")

        fun compile(url: URL, packagePrefix: String): ClassList {
            val jsonString = url.openStream().bufferedReader(Charsets.UTF_8)
                .readText()
                .replace("var list = ", "")
                .replace("/extras/objects/ImmediateRenderObject\",", "/extras/objects/ImmediateRenderObject\"")
                .replace("\"examples/objects/Lensflare\",", "\"examples/objects/Lensflare\"")
                .replace("\"examples/Lut\",", "\"examples/Lut\"")

            return compile(jsonString, packagePrefix)
        }

        fun compile(jsonString: String, packagePrefix: String): ClassList {
            val tree = JsonParser().parse(JsonReader(StringReader(jsonString)).apply {
                isLenient = true
            })

            val apiRoot = tree.asJsonObject["en"].asJsonObject["Reference"].asJsonObject

            return compile(apiRoot, packagePrefix)
        }

        fun compile(root: JsonObject, packagePrefix: String): ClassList {

            val map = mutableMapOf<String, ClassListEntry>()

            fun recursiveCompile(obj: JsonObject, packageName: String) {
                obj.entrySet().forEach { (key, value) ->
                    if (ignoreList.contains(key)) {
                        return@forEach
                    }
                    if (value.isJsonObject) {
                        recursiveCompile(value.asJsonObject, packageName + "." + key.toLowerCase().replace(" / ", "."))
                    }
                    if (value.isJsonPrimitive) {
                        map[key] = ClassListEntry(key, value.asString, packageName)
                    }
                }
            }

            recursiveCompile(root, packagePrefix)

            return ClassList(map)
        }
    }

    fun toFullReference(type: String): String {
        return class2PackageName[type]?.let {
            it.packageName + "." + it.name
        } ?: type
    }

}

data class ClassListEntry(val name: String, val url: String, val packageName: String)