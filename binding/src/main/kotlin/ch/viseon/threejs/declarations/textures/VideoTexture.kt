//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.textures

	/**
	* Creates a texture for use with a video texture. This is almost the same as the base [page:Texture Texture] class, except that it continuosly sets [page:Texture.needsUpdate needsUpdate] to **true** so that the texture is updated as the video plays. Automatic creation of [page:Texture.mipmaps mipmaps] is also disabled.
	*/
open external class VideoTexture(video: dynamic = definedExternally, mapping: Int = definedExternally, wrapS: Int = definedExternally, wrapT: Int = definedExternally, magFilter: Int = definedExternally, minFilter: Int = definedExternally, format: Int = definedExternally, type: Int = definedExternally, anisotropy: Double = definedExternally): ch.viseon.threejs.declarations.textures.Texture{

	/**
	* You will not need to set this manually here as it is handled by the [page:VideoTexture.update update] method.
	*/
	override var needsUpdate: Boolean 


	/**
	* This is called automatically and sets [property:boolean needsUpdate] to **true** every time a new frame is available.
	*/
	open fun update() : dynamic
}