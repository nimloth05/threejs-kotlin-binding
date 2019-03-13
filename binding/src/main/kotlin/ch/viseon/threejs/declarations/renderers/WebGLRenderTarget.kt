//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.renderers

	/**
	* A [link:https://msdn.microsoft.com/en-us/library/ff604997.aspx render target] is a buffer where the video card draws pixels for a scene that is being rendered in the background. It is used in different effects, such as applying postprocessing to a rendered image before displaying it on the screen.
	*/
open external class WebGLRenderTarget(width: Double = definedExternally, height: Double = definedExternally, options: dynamic = definedExternally){

	/**
	* The width of the render target.
	*/
	open var width: Double  = definedExternally


	/**
	* The height of the render target.
	*/
	open var height: Double  = definedExternally


	/**
	* A rectangular area inside the render target's viewport. Fragments that are outside the area will be discarded.
	*/
	open var scissor: ch.viseon.threejs.declarations.math.Vector4  = definedExternally


	/**
	* Indicates whether the scissor test is active or not.
	*/
	open var scissorTest: Boolean  = definedExternally


	/**
	* The viewport of this render target.
	*/
	open var viewport: ch.viseon.threejs.declarations.math.Vector4  = definedExternally


	/**
	* This texture instance holds the rendered pixels. Use it as input for further processing.
	*/
	open var texture: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Renders to the depth buffer. Default is true.
	*/
	open var depthBuffer: Boolean  = definedExternally


	/**
	* Renders to the stencil buffer. Default is true.
	*/
	open var stencilBuffer: Boolean  = definedExternally


	/**
	* If set, the scene depth will be rendered to this texture. Default is null.
	*/
	open var depthTexture: ch.viseon.threejs.declarations.textures.DepthTexture  = definedExternally


	/**
	* Sets the size of the render target.
	*/
	open fun setSize(width: Double = definedExternally, height: Double = definedExternally) : dynamic


	/**
	* Creates a copy of this render target.
	*/
	open fun clone() : ch.viseon.threejs.declarations.renderers.WebGLRenderTarget


	/**
	* Adopts the settings of the given render target.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.renderers.WebGLRenderTarget = definedExternally) : ch.viseon.threejs.declarations.renderers.WebGLRenderTarget


	/**
	* Dispatches a dispose event.
	*/
	open fun dispose() : dynamic
}