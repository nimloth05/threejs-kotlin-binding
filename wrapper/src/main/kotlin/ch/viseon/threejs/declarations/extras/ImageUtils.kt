@file:JsModule("three")
package ch.viseon.threejs.declarations.extras

	/**
	* A class containing utility functions for images.
	*/
open external class ImageUtils(){

	/**
	* image -- The image object. Returns a data URI containing a representation of the given image.
	*/
	open fun getDataURL(image: dynamic = definedExternally) : String
}