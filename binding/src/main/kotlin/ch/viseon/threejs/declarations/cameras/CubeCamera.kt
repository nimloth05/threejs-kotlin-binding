//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.cameras

	/**
	* Creates 6 cameras that render to a [page:WebGLRenderTargetCube].
	*/
open external class CubeCamera(near: Double = definedExternally, far: Double = definedExternally, cubeResolution: Double = definedExternally, options: dynamic = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* The cube texture that gets generated.
	*/
	open var renderTarget: ch.viseon.threejs.declarations.renderers.WebGLRenderTargetCube  = definedExternally


	/**
	* renderer -- The current WebGL renderer scene -- The current scene
Call this to update the [page:CubeCamera.renderTarget renderTarget].
	*/
	open fun update(renderer: ch.viseon.threejs.declarations.renderers.WebGLRenderer = definedExternally, scene: ch.viseon.threejs.declarations.scenes.Scene = definedExternally) : dynamic


	/**
	* Call this to clear the [page:CubeCamera.renderTarget renderTarget] color, depth, and/or stencil buffers. The color buffer is set to the renderer's current clear color. Arguments default to **true**.
	*/
	open fun clear(renderer: ch.viseon.threejs.declarations.renderers.WebGLRenderer = definedExternally, color: Boolean = definedExternally, depth: Boolean = definedExternally, stencil: Boolean = definedExternally) : dynamic
}