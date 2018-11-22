//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* Defines an arbitrary 2d shape plane using paths with optional holes. It can be used with [page:ExtrudeGeometry], [page:ShapeGeometry], to get points, or to get triangulated faces.
	*/
open external class Shape(points: Array<dynamic>/*Array*/ = definedExternally): ch.viseon.threejs.declarations.extras.core.Path{

	/**
	* [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this instance. This gets automatically assigned, so this shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* An array of [page:Path paths] that define the holes in the shape.
	*/
	open var holes: Array<dynamic>/*array*/  = definedExternally


	/**
	* divisions -- The fineness of the result. Call [page:Curve.getPoints getPoints] on the shape and the [page:.holes] array, and return an object of the form: { shape holes } where shape and holes are arrays of [page:Vector2 Vector2s].
	*/
	open fun extractPoints(divisions: Int = definedExternally) : Array<dynamic>/*Array*/


	/**
	* divisions -- The fineness of the result. Get an array of [page:Vector2 Vector2s] that represent the holes in the shape.
	*/
	open fun getPointsHoles(divisions: Int = definedExternally) : Array<dynamic>/*Array*/
}