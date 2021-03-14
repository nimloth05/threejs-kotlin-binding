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


	/**
	* Call this to clear the renderTarget's color, depth, and/or stencil buffers. The color buffer is set to the renderer's current clear color. Arguments default to **true**.
	*/
	open fun clear(renderer: ch.viseon.threejs.declarations.renderers.WebGLRenderer = definedExternally, color: Boolean = definedExternally, depth: Boolean = definedExternally, stencil: Boolean = definedExternally) : dynamic
}
