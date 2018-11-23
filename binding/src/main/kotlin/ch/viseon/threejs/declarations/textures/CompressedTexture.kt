//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.textures

	/**
	* Creates a texture based on data in compressed form, for example from a [link:https://en.wikipedia.org/wiki/DirectDraw_Surface DDS] file. For use with the [page:CompressedTextureLoader CompressedTextureLoader].
	*/
open external class CompressedTexture(mipmaps: Array<dynamic>/*Array*/ = definedExternally, width: Double = definedExternally, height: Double = definedExternally, format: Int = definedExternally, type: Int = definedExternally, mapping: Int = definedExternally, wrapS: Int = definedExternally, wrapT: Int = definedExternally, magFilter: Int = definedExternally, minFilter: Int = definedExternally, anisotropy: Double = definedExternally): ch.viseon.threejs.declarations.textures.Texture{

	/**
	* False by default. Flipping textures does not work for compressed textures.
	*/
	override var flipY: Boolean 


	/**
	* False by default. Mipmaps can't be generated for compressed textures
	*/
	override var generateMipmaps: Boolean 
}