package ch.viseon.threejs.parser

import org.junit.Assert.*
import org.junit.Test

class TokenTest {

    @Test
    fun `parse method`() {
        val expectedToken = Token(TokenType.method, "AnimationAction", "crossFadeFrom")
        val actualToken = Token.parse("method:AnimationAction crossFadeFrom")
        assertEquals(expectedToken, actualToken)
    }

    @Test
    fun `parse param`() {
        val expectedToken = Token(TokenType.param, "Number", "durationInSeconds")
        val actualToken = Token.parse("param:Number durationInSeconds")
        assertEquals(expectedToken, actualToken)
    }

    @Test
    fun `parse constructor`() {
        val expectedToken = Token(TokenType.constructor, "", "")
        val actualToken = Token.parse("name")
        assertEquals(expectedToken, actualToken)
    }
}