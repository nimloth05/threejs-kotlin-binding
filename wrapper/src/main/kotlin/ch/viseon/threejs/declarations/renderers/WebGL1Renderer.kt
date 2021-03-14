@file:JsModule("three")
package ch.viseon.threejs.declarations.renderers

	/**
	* Since r118 [page:WebGLRenderer] automatically uses a WebGL 2 rendering context. When upgrading an existing project to => r118, applications might break because of two reasons:
	*/
open external class WebGL1Renderer(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.renderers.WebGLRenderer{
}