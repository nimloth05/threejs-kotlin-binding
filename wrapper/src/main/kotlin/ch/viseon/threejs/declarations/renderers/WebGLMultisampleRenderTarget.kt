@file:JsModule("three")
package ch.viseon.threejs.declarations.renderers

	/**
	* A special render target that can be used to utilize multi-sampled renderbuffers. Heads up: [name] can only be used with a WebGL 2 rendering context.
	*/
open external class WebGLMultisampleRenderTarget(width: Double = definedExternally, height: Double = definedExternally, options: dynamic = definedExternally){

	/**
	* Specifies the number of samples to be used for the renderbuffer storage. However, the maximum supported size for multisampling is platform dependent and defined via **gl.MAX_SAMPLES**.
[page:WebGLRenderTarget WebGLRenderTarget] properties are available on this class.
	*/
	open var samples: Double  = definedExternally
}