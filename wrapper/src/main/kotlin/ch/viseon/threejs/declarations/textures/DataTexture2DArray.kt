@file:JsModule("three")
package ch.viseon.threejs.declarations.textures

	/**
	* Creates an array of textures directly from raw data, width and height and depth. This type of texture can only be used with a WebGL 2 rendering context.
	*/
open external class DataTexture2DArray: ch.viseon.threejs.declarations.textures.Texture{

	/**
	* Overridden with a record type holding data, width and height and depth.
	*/
	override var image: dynamic 
}