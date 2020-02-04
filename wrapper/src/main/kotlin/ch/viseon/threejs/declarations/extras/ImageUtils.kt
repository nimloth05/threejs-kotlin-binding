@file:JsModule("three")
package ch.viseon.threejs.declarations.extras

	/**
	* A class containing utility functions for images.
	*/
open external class ImageUtils(){

	/**
	* image -- The image object. Returns a data URI containing a representation of the given image.
	 * can be of type: org.w3c.dom.HTMLCanvasElement | org.w3c.dom.HTMLImageElement | org.w3c.dom.ImageBitmap
	*/
	open fun getDataURL(image: dynamic) : String
}
