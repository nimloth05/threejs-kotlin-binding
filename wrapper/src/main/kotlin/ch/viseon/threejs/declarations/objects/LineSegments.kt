@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* A series of lines drawn between pairs of vertices. This is nearly the same as [page:Line]; the only difference is that it is rendered using [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements gl.LINES] instead of [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements gl.LINE_STRIP].
	*/
open external class LineSegments(geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.objects.Line{

	constructor(geometry: ch.viseon.threejs.declarations.core.BufferGeometry? = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally)
	/**
	* Used to check whether this or derived classes are line segments. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isLineSegments: Boolean  = definedExternally
}