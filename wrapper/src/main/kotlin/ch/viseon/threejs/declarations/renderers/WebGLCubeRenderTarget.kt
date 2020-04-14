@file:JsModule("three")
package ch.viseon.threejs.declarations.renderers

	/**
	* Used by the [page:CubeCamera] as its [page:WebGLRenderTarget].
	*/
open external class WebGLCubeRenderTarget(size: Double = definedExternally, options: dynamic = definedExternally): ch.viseon.threejs.declarations.renderers.WebGLRenderTarget{

	/**
	* [page:WebGLRenderer renderer] — the renderer. [page:Texture texture] — the equirectangular texture.
Use this method if you want to convert an equirectangular panorama to the cubemap format.
	*/
	open fun fromEquirectangularTexture(renderer: ch.viseon.threejs.declarations.renderers.WebGLRenderer = definedExternally, texture: ch.viseon.threejs.declarations.textures.Texture = definedExternally) : ch.viseon.threejs.declarations.renderers.WebGLCubeRenderTarget
}