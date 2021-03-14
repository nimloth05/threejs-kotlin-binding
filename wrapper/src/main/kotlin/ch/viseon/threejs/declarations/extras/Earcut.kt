@file:JsModule("three")
package ch.viseon.threejs.declarations.extras

	/**
	* An implementation of the earcut polygon triangulation algorithm. The code is a port of [link:https://github.com/mapbox/earcut mapbox/earcut].
	*/
open external class Earcut{

	/**
	* data -- A flat array of vertex coordinates. holeIndices -- An array of hole indices if any. dim -- The number of coordinates per vertex in the input array. Triangulates the given shape definition by returning an array of triangles. A triangle is defined by three consecutive integers representing vertex indices.
	*/
	open fun triangulate() : Array<dynamic>
}