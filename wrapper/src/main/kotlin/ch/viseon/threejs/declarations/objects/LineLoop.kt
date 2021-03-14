@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* A continuous line that connects back to the start. This is nearly the same as [page:Line]; the only difference is that it is rendered using [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements gl.LINE_LOOP] instead of [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements gl.LINE_STRIP], which draws a straight line to the next vertex, and connects the last vertex back to the first.
	*/
open external class LineLoop(geometry: ch.viseon.threejs.declarations.core.BufferGeometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.objects.Line{
}