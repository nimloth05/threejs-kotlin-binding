//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.textures

	/**
	* Creates a texture from a canvas element. This is almost the same as the base [page:Texture Texture] class, except that it sets [page:Texture.needsUpdate needsUpdate] to **true** immediately.
	*/
open external class CanvasTexture(canvas: org.w3c.dom.HTMLElement = definedExternally, mapping: Int = definedExternally, wrapS: Int = definedExternally, wrapT: Int = definedExternally, magFilter: Int = definedExternally, minFilter: Int = definedExternally, format: Int = definedExternally, type: Int = definedExternally, anisotropy: Double = definedExternally): ch.viseon.threejs.declarations.textures.Texture{

	/**
	* True by default. This is required so that the canvas data is loaded.
	*/
	override var needsUpdate: Boolean 
}