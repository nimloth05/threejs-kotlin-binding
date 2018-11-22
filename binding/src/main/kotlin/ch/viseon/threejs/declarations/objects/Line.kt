//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* A continuous line. This is nearly the same as [page:LineSegments]; the only difference is that it is rendered using [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements gl.LINE_STRIP] instead of [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements gl.LINES]
	*/
open external class Line(geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Used to check whether this or derived classes are lines. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isLine: Boolean  = definedExternally


	/**
	* Vertices representing the line segment(s).
	*/
	open var geometry: ch.viseon.threejs.declarations.core.Geometry  = definedExternally


	/**
	* Material for the line.
	*/
	open var material: ch.viseon.threejs.declarations.materials.Material  = definedExternally


	/**
	* Computes an array of distance values which are necessary for [page:LineDashedMaterial]. For each vertex in the geometry, the method calculates the cumulative length from the current point to the very beginning of the line.
	*/
	open fun computeLineDistances() : ch.viseon.threejs.declarations.objects.Line


	/**
	* Get intersections between a casted [page:Ray] and this Line. [page:Raycaster.intersectObject] will call this method.
	*/
	override fun raycast(raycaster: ch.viseon.threejs.declarations.core.Raycaster, intersects: Array<dynamic>/*Array*/) : dynamic/*null*/


	/**
	* Returns a clone of this Line object and its descendants.
	*/
	open fun clone() : ch.viseon.threejs.declarations.objects.Line
}