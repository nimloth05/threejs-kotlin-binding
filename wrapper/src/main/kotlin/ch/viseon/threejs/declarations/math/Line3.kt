@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A geometric line segment represented by a start and end point.
	*/
open external class Line3(start: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, end: ch.viseon.threejs.declarations.math.Vector3 = definedExternally){

	/**
	* [page:Vector3] representing the start point of the line.
	*/
	open var start: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* [page:Vector3] representing the end point of the line.
	*/
	open var end: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* Applies a matrix transform to the line segment.
	*/
	open fun applyMatrix4(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : ch.viseon.threejs.declarations.math.Line3


	/**
	* [page:Float t] - Use values 0-1 to return a position along the line segment. [page:Vector3 target] — the result will be copied into this Vector3. Returns a vector at a certain position along the line. When [page:Float t] = 0, it returns the start vector, and when [page:Float t] = 1 it returns the end vector.
	*/
	open fun at(t: Double = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* Returns a new [page:Line3] with the same [page:.start start] and [page:.end end] vectors as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Line3


	/**
	* [page:Vector3 point] - return the closest point on the line to this point. [page:Boolean clampToLine] - whether to clamp the returned value to the line segment. [page:Vector3 target] — the result will be copied into this Vector3. Returns the closets point on the line. If [page:Boolean clampToLine] is true, then the returned value will be clamped to the line segment.
	*/
	open fun closestPointToPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, clampToLine: Boolean = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 point] - the point for which to return a point parameter. [page:Boolean clampToLine] - Whether to clamp the result to the range [0, 1]. Returns a point parameter based on the closest point as projected on the line segement. If [page:Boolean clampToLine] is true, then the returned value will be between 0 and 1.
	*/
	open fun closestPointToPointParameter(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, clampToLine: Boolean = definedExternally) : Double


	/**
	* Copies the passed line's [page:.start start] and [page:.end end] vectors to this line.
	*/
	open fun copy(line: ch.viseon.threejs.declarations.math.Line3 = definedExternally) : ch.viseon.threejs.declarations.math.Line3


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Returns the delta vector of the line segment ( [page:.end end] vector minus the [page:.start start] vector).
	*/
	open fun delta(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* Returns the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean distance] (straight-line distance) between the line's [page:.start start] and [page:.end end] points.
	*/
	open fun distance() : Double


	/**
	* Returns the square of the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean distance] (straight-line distance) between the line's [page:.start start] and [page:.end end] vectors.
	*/
	open fun distanceSq() : Double


	/**
	* [page:Line3 line] - [page:Line3] to compare with this one. Returns true if both line's [page:.start start] and [page:.end end] points are equal.
	*/
	open fun equals(line: ch.viseon.threejs.declarations.math.Line3 = definedExternally) : Boolean


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Returns the center of the line segment.
	*/
	open fun getCenter(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 start] - set the [page:.start start point] of the line. [page:Vector3 end] - set the [page:.end end point] of the line. Sets the start and end values by copying the provided vectors.
	*/
	open fun set(start: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, end: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Line3
}