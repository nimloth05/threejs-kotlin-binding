//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.renderers

	/**
	* Used by the [page:CubeCamera] as its [page:WebGLRenderTarget].
	*/
open external class WebGLRenderTargetCube(width: Float = definedExternally, height: Float = definedExternally, options: dynamic/*Object*/ = definedExternally): ch.viseon.threejs.declarations.renderers.WebGLRenderTarget{

	/**
	* The activeCubeFace property corresponds to a cube side (PX 0, NX 1, PY 2, NY 3, PZ 4, NZ 5) and is used and set internally by the [page:CubeCamera].
	*/
	open var activeCubeFace: Int  = definedExternally
}