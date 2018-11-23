//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* A continuous line that connects back to the start. This is nearly the same as [page:Line]; the only difference is that it is rendered using [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements gl.LINE_LOOP] instead of [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements gl.LINE_STRIP], which draws a straight line to the next vertex, and connects the last vertex back to the first.
	*/
open external class LineLoop(geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.objects.Line{

	/**
	* Used to check whether this or derived classes are line loops. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isLineLoop: Boolean  = definedExternally
}