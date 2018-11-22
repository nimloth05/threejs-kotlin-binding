package ch.viseon.threejs.parser

import org.intellij.lang.annotations.Language

object TokenStream {

    @Language("RegExp")
    private val nameRegEx = "\\[([\\w\\.]*:?[\\w\\.]* ?[\\w\\.]*) ?\\][ (,)]*".toPattern()

    fun parse(text: String): List<Token> {
        //special cases: inconsistencies with usage of HTML
        if (text == ".parameters") {
            return listOf(Token(TokenType.property, "object", "parameters"))
        }

        val matcher = nameRegEx.matcher(text)
        val result = mutableListOf<Token>()
        while (matcher.find()) {
            result.add(Token.parse(matcher.group(1)))
        }

        return result.toList()
    }
}

data class Token(val tokenType: TokenType, val type: String, val name: String) {

    companion object {
        fun parse(tokenCode: String): Token {
            val parts = tokenCode.split(":", " ")
            return Token(
                TokenType.parse(parts[0]),
                if (parts.size > 1) parts[1] else "",
                if (parts.size > 2) parts[2] else ""
            )
        }
    }
}


@Suppress("EnumEntryName")
enum class TokenType {
    method,
    param,
    property,
    `constructor`,
    page,

    ;

    companion object {
        fun parse(name: String): TokenType {
            return when (name) {
                "name" -> TokenType.constructor
                else -> TokenType.valueOf(name)
            }
        }
    }
}