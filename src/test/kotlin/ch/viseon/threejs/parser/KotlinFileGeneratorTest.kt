package ch.viseon.threejs.parser

import org.junit.Assert.assertEquals
import org.junit.Test


class KotlinFileGeneratorTest {


    /**
     * **Bold**
     * *italic*
     *
     * * / *
     *
     */
    @Test
    fun generateDoc() {
        //replace */* with * / *
        //<strong>X</strong>/<strong>Y</strong>
        val doc =
            "Causes this action to [page:.fadeIn fade in], fading out another action simultaneously, within the passed time interval. This method can be chained.<br><br> If warpBoolean is true, additional [page:.warp warping] (gradually changes of the time scales) will be applied.<br><br> Note: Like with *fadeIn*/*fadeOut*, the fading starts/ends with a weight of 0."
        val expectedDoc =
            "\t/**\n\t* Causes this action to [page:.fadeIn fade in], fading out another action simultaneously, within the passed time interval. This method can be chained.\n\t* \n\t*  If warpBoolean is true, additional [page:.warp warping] (gradually changes of the time scales) will be applied.\n\t* \n\t*  Note: Like with **fadeIn** / **fadeOut**, the fading starts/ends with a weight of 0.\n\t*/\n"
        val actualDoc = generateKotlinDoc(doc)
        println(actualDoc)
        assertEquals(expectedDoc, actualDoc)
    }
}