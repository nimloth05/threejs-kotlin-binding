@file:JsModule("three")
package ch.viseon.threejs.declarations.textures

	/**
	* This class can be used to automatically save the depth information of a rendering into a texture. When using a WebGL 1 rendering context, [name] requires support for the [link:https://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/ WEBGL_depth_texture] extension.
	*/
open external class DepthTexture(width: Double = definedExternally, height: Double = definedExternally, type: Int = definedExternally, wrapS: Int = definedExternally, wrapT: Int = definedExternally, magFilter: Int = definedExternally, minFilter: Int = definedExternally, anisotropy: Double = definedExternally, format: Int = definedExternally): ch.viseon.threejs.declarations.textures.Texture{
}