//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras

	/**
	* A class containing utility functions for shapes. Note that these are all linear functions so it is neccessary to calculate separately for x, y (and z, w if present) components of a vector.
	*/
open external class ShapeUtils(){

	/**
	* contour -- 2D polygon. Calculate area of a ( 2D ) contour polygon.
	*/
	open fun area() : Double


	/**
	* pts -- points defining a 2D polygon Note that this is a linear function so it is neccessary to calculate separately for x, y components of a polygon. Used internally by [page:Path Path], [page:ExtrudeGeometry ExtrudeGeometry] and [page:ShapeGeometry ShapeGeometry].
	*/
	open fun isClockwise() : Boolean


	/**
	* contour -- 2D polygon. holes -- array of holes Used internally by [page:ExtrudeGeometry ExtrudeGeometry] and [page:ShapeGeometry ShapeGeometry] to calculate faces in shapes with holes.
	*/
	open fun triangulateShape() : Array<dynamic>/*Array*/
}