@file:JsModule("three")

package ch.viseon.threejs.declarations.extras

/**
 * A class containing utility functions for data.
 */
open external class DataUtils {

    /**
     * val -- A single precision floating point value. Returns a half precision floating point value represented as an uint16 value.
     */
    open fun toHalfFloat(`val`: Double = definedExternally): Double
}
