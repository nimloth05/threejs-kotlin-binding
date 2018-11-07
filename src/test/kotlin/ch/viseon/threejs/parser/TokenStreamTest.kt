package ch.viseon.threejs.parser

import org.junit.Assert.*
import org.junit.Test

class TokenStreamTest {

    @Test
    fun `parse method token stream`() {
        val actualStream =
            TokenStream.parse("[method:AnimationAction crossFadeFrom]( [param:AnimationAction fadeOutAction], [param:Number durationInSeconds], [param:Boolean warpBoolean] )")
        val expectedTokenStream = listOf(
            Token(TokenType.method, "AnimationAction", "crossFadeFrom"),
            Token(TokenType.param, "AnimationAction", "fadeOutAction"),
            Token(TokenType.param, "Number", "durationInSeconds"),
            Token(TokenType.param, "Boolean", "warpBoolean")
        )

        assertEquals(expectedTokenStream, actualStream)
    }

    @Test
    fun `parse property token stream`() {
        val actualStream =
            TokenStream.parse("[property:Boolean clampWhenFinished]")
        val expectedTokenStream = listOf(
            Token(TokenType.property, "Boolean", "clampWhenFinished")
        )

        assertEquals(expectedTokenStream, actualStream)
    }

    @Test
    fun `parse constructor token stream`() {
        val actualStream =
            TokenStream.parse("[name]( [param:AnimationMixer mixer], [param:AnimationClip clip], [param:Object3D localRoot] )")
        val expectedStream =
            listOf(
                Token(TokenType.constructor, "", ""),
                Token(TokenType.param, "AnimationMixer", "mixer"),
                Token(TokenType.param, "AnimationClip", "clip"),
                Token(TokenType.param, "Object3D", "localRoot")
            )

        assertEquals(expectedStream, actualStream)
    }

    @Test
    fun `test Error from property TimeBufferType`() {
        val actualStream = TokenStream.parse("[property:Constant TimeBufferType ]")
        val expectedStream = listOf(Token(TokenType.property, "Constant", "TimeBufferType"))
        assertEquals(expectedStream, actualStream)
    }

    @Test
    fun `test parse name with dot`() {
        val actualStream = TokenStream.parse("[property:Number updateRange.offset]")
        val expectedStream =  listOf(Token(TokenType.property, "Number", "updateRange.offset"))
        assertEquals(expectedStream, actualStream)
    }

    @Test
    fun `parse with dot in typename`() {
        val actualStream = TokenStream.parse("[page:Texture.format .format]")
        val expectedStream =  listOf(Token(TokenType.page, "Texture.format", ".format"))
        assertEquals(expectedStream, actualStream)
    }

}