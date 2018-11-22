//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* Class representing a color.
	*/
open external class Color(r: dynamic/*Color_Hex_or_String*/ = definedExternally, g: Float = definedExternally, b: Float = definedExternally){

	/**
	* Used to check whether this or derived classes are Colors. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isColor: Boolean  = definedExternally


	/**
	* Red channel value between 0 and 1. Default is 1.
	*/
	open var r: Float  = definedExternally


	/**
	* Green channel value between 0 and 1. Default is 1.
	*/
	open var g: Float  = definedExternally


	/**
	* Blue channel value between 0 and 1. Default is 1.
	*/
	open var b: Float  = definedExternally


	/**
	* Adds the RGB values of [page:Color color] to the RGB values of this color.
	*/
	open fun add(color: ch.viseon.threejs.declarations.math.Color = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Sets this color's RGB values to the sum of the RGB values of [page:Color color1] and [page:Color color2].
	*/
	open fun addColors(color1: ch.viseon.threejs.declarations.math.Color = definedExternally, color2: ch.viseon.threejs.declarations.math.Color = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Adds [page:Number s] to the RGB values of this color.
	*/
	open fun addScalar(s: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Returns a new Color with the same [page:.r r], [page:.g g] and [page:.b b] values as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Color


	/**
	* Copies the [page:.r r], [page:.g g] and [page:.b b] parameters from [page:Color color] in to this color.
	*/
	open fun copy(color: ch.viseon.threejs.declarations.math.Color = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Float gammaFactor] - (optional). Default is **2.0**. Converts this color from gamma space to linear space by taking [page:.r r], [page:.g g] and [page:.b b] to the power of [page:Float gammaFactor].
	*/
	open fun convertGammaToLinear(gammaFactor: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Float gammaFactor] - (optional). Default is **2.0**. Converts this color from linear space to gamma space by taking [page:.r r], [page:.g g] and [page:.b b] to the power of 1 / [page:Float gammaFactor].
	*/
	open fun convertLinearToGamma(gammaFactor: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Converts this color from linear space to sRGB space.
	*/
	open fun convertLinearToSRGB() : ch.viseon.threejs.declarations.math.Color


	/**
	* Converts this color from sRGB space to linear space.
	*/
	open fun convertSRGBToLinear() : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Color color] — Color to copy. [page:Float gammaFactor] - (optional). Default is **2.0**. Copies the given color into this color, and then converts this color from gamma space to linear space by taking [page:.r r], [page:.g g] and [page:.b b] to the power of [page:Float gammaFactor].
	*/
	open fun copyGammaToLinear(color: ch.viseon.threejs.declarations.math.Color = definedExternally, gammaFactor: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Color color] — Color to copy. [page:Float gammaFactor] - (optional). Default is **2.0**. Copies the given color into this color, and then converts this color from linear space to gamma space by taking [page:.r r], [page:.g g] and [page:.b b] to the power of 1 / [page:Float gammaFactor].
	*/
	open fun copyLinearToGamma(color: ch.viseon.threejs.declarations.math.Color = definedExternally, gammaFactor: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Color color] — Color to copy. Copies the given color into this color, and then converts this color from linear space to sRGB space.
	*/
	open fun copyLinearToSRGB(color: ch.viseon.threejs.declarations.math.Color = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Color color] — Color to copy. Copies the given color into this color, and then converts this color from sRGB space to linear space.
	*/
	open fun copySRGBToLinear(color: ch.viseon.threejs.declarations.math.Color = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Compares the RGB values of [page:Color color] with those of this object. Returns true if they are the same, false otherwise.
	*/
	open fun equals(color: ch.viseon.threejs.declarations.math.Color = definedExternally) : Boolean


	/**
	* [page:Array array] - [page:Array] of floats in the form [ [page:Float r], [page:Float g], [page:Float b] ]. [page:Integer offset] - An optional offset into the array. Sets this color's components based on an array formatted like [ [page:Float r], [page:Float g], [page:Float b] ].
	*/
	open fun fromArray(array: Array<dynamic>/*Array*/ = definedExternally, offset: Int = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Returns the hexadecimal value of this color.
	*/
	open fun getHex() : Int


	/**
	* Returns the hexadecimal value of this color as a string (for example, 'FFFFFF').
	*/
	open fun getHexString() : String


	/**
	* [page:Object target] — the result will be copied into this Object. Adds h, s and l keys to the object (if not already present). Convert this Color's [page:.r r], [page:.g g] and [page:.b b] values to [link:https://en.wikipedia.org/wiki/HSL_and_HSV HSL] format and returns an object of the form: { h: 0, s: 0, l: 0 }
	*/
	open fun getHSL(target: dynamic/*Object*/ = definedExternally) : dynamic/*Object*/


	/**
	* Returns the value of this color as a CSS style string. Example: 'rgb(255,0,0)'.
	*/
	open fun getStyle() : String


	/**
	* [page:Color color] - color to converge on. [page:Float alpha] - interpolation factor in the closed interval [0, 1]. Linearly interpolates this color's RGB values toward the RGB values of the passed argument. The alpha argument can be thought of as the ratio between the two colors, where 0.0 is this color and 1.0 is the first argument.
	*/
	open fun lerp(color: ch.viseon.threejs.declarations.math.Color = definedExternally, alpha: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Color color] - color to converge on. [page:Float alpha] - interpolation factor in the closed interval [0, 1]. Linearly interpolates this color's HSL values toward the HSL values of the passed argument. It differs from the classic [page:.lerp] by not interpolating straight from one color to the other, but instead going through all the hues in between those two colors. The alpha argument can be thought of as the ratio between the two colors, where 0.0 is this color and 1.0 is the first argument.
	*/
	open fun lerpHSL(color: ch.viseon.threejs.declarations.math.Color = definedExternally, alpha: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Multiplies this color's RGB values by the given [page:Color color]'s RGB values.
	*/
	open fun multiply(color: ch.viseon.threejs.declarations.math.Color = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Multiplies this color's RGB values by [page:Number s].
	*/
	open fun multiplyScalar(s: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Adds the given [page:Float h], [page:Float s], and [page:Float l] to this color's values. Internally, this converts the color's [page:.r r], [page:.g g] and [page:.b b] values to HSL, adds [page:Float h], [page:Float s], and [page:Float l], and then converts the color back to RGB.
	*/
	open fun offsetHSL(h: Float = definedExternally, s: Float = definedExternally, l: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Color_Hex_or_String value] - Value to set this color to. See the Constructor above for full details of what [page:Color_Hex_or_String value] can be. Delegates to [page:.copy], [page:.setStyle], or [page:.setHex] depending on input type.
	*/
	open fun set(value: dynamic/*Color_Hex_or_String*/ = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Integer hex] — [link:https://en.wikipedia.org/wiki/Web_colors#Hex_triplet hexadecimal triplet] format. Sets this color from a hexadecimal value.
	*/
	open fun setHex(hex: Int = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Float h] — hue value between 0.0 and 1.0 [page:Float s] — saturation value between 0.0 and 1.0 [page:Float l] — lightness value between 0.0 and 1.0 Sets color from HSL values.
	*/
	open fun setHSL(h: Float = definedExternally, s: Float = definedExternally, l: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Float r] — Red channel value between 0.0 and 1.0. [page:Float g] — Green channel value between 0.0 and 1.0. [page:Float b] — Blue channel value between 0.0 and 1.0. Sets this color from RGB values.
	*/
	open fun setRGB(r: Float = definedExternally, g: Float = definedExternally, b: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Float scalar] — a value between 0.0 and 1.0. Sets all three color components to the value [page:Float scalar].
	*/
	open fun setScalar(scalar: Float = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:String style] — color as a CSS-style string. Sets this color from a CSS-style string. For example, "rgb(250, 0,0)", "rgb(100%, 0%, 0%)", "hsl(0, 100%, 50%)", "#ff0000", "#f00", or "red" ( or any [link:https://en.wikipedia.org/wiki/X11_color_names#Color_name_chart X11 color name] - all 140 color names are supported ). Translucent colors such as "rgba(255, 0, 0, 0.5)" and "hsla(0, 100%, 50%, 0.5)" are also accepted, but the alpha-channel coordinate will be discarded. Note that for X11 color names, multiple words such as Dark Orange become the string 'darkorange' (all lowercase).
	*/
	open fun setStyle(style: String = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Subtracts the RGB components of the given color from the RGB components of this color. If this results in a negative component, that component is set to zero.
	*/
	open fun sub(color: ch.viseon.threejs.declarations.math.Color = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* [page:Array array] - An optional array to store the color to. [page:Integer offset] - An optional offset into the array. Returns an array of the form [ r, g, b ].
	*/
	open fun toArray(array: Array<dynamic>/*Array*/ = definedExternally, offset: Int = definedExternally) : Array<dynamic>/*Array*/
}