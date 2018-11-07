package ch.viseon.threejs.parser

import org.junit.Assert.*
import org.junit.Test

class DeclarationFactoryTest {

    @Test
    fun `parse method declaration`() {
        val stream =
            TokenStream.parse("[method:AnimationAction crossFadeFrom]( [param:AnimationAction fadeOutAction], [param:Number durationInSeconds], [param:Boolean warpBoolean] )")
        val actualDeclaration = DeclarationFactory.fromStream(stream)
        val expectDeclaration = MethodDeclaration(
            "crossFadeFrom", listOf(
                ParamDeclaration("fadeOutAction", "AnimationAction"),
                ParamDeclaration("durationInSeconds", "Number"),
                ParamDeclaration("warpBoolean", "Boolean")
            ), "AnimationAction"
        )

        assertEquals(expectDeclaration, actualDeclaration)
    }

    @Test
    fun `create PropertyDeclaration`() {
        val stream =
            TokenStream.parse("[property:Boolean clampWhenFinished]")
        val actualDeclaration = DeclarationFactory.fromStream(stream)
        val expectDeclaration = PropertyDeclaration("clampWhenFinished", "Boolean", "")

        assertEquals(expectDeclaration, actualDeclaration)
    }

    @Test
    fun `create ConstructorDeclaration`() {
         val stream =
            TokenStream.parse("[name]( [param:AnimationMixer mixer], [param:AnimationClip clip], [param:Object3D localRoot] )")
        val actualDeclaration = DeclarationFactory.fromStream(stream)
        val expectDeclaration = ConstructorDeclaration(
            listOf(
                ParamDeclaration("mixer", "AnimationMixer"),
                ParamDeclaration("clip", "AnimationClip"),
                ParamDeclaration("localRoot", "Object3D")
            ), ""
        )

        assertEquals(expectDeclaration, actualDeclaration)
    }
}