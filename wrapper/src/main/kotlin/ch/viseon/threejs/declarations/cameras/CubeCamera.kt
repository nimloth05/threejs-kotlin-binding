@file:JsModule("three")
package ch.viseon.threejs.declarations.cameras

	/**
	* Creates 6 cameras that render to a [page:WebGLCubeRenderTarget].
	*/
open external class CubeCamera(near: Double = definedExternally, far: Double = definedExternally, renderTarget: ch.viseon.threejs.declarations.renderers.WebGLCubeRenderTarget = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* The destination cube render target.
	*/
	open var renderTarget: ch.viseon.threejs.declarations.renderers.WebGLCubeRenderTarget  = definedExternally


	/**
	* renderer -- The current WebGL renderer scene -- The current scene
Call this to update the [page:CubeCamera.renderTarget renderTarget].
	*/
	open fun update(renderer: ch.viseon.threejs.declarations.renderers.WebGLRenderer = definedExternally, scene: ch.viseon.threejs.declarations.scenes.Scene = definedExternally) : dynamic
}