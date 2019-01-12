//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* Create a set of [page:Shape Shapes] representing a font loaded in JSON format. This is used internally by the [page:FontLoader].
	*/
open external class Font(){

	/**
	* The JSON data passed in the constructor.
	*/
	open var data: Array<dynamic>/*array*/  = definedExternally


	/**
	* Used to check whether this or derived classes are fonts. Default is **true**. You should not change this, as it used internally by the renderer for optimisation.
	*/
	open var isFont: Boolean  = definedExternally


	/**
	* [page:String text] -- string of text. [page:Float size] -- (optional) scale for the [page:Shape Shapes]. Default is **100**. Creates an array of [page:Shape Shapes] representing the text in the font.
	*/
	open fun generateShapes(text: String = definedExternally, size: Double = definedExternally) : dynamic/*null*/
}