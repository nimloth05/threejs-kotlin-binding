//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A geometric triangle as defined by three [page:Vector3 Vector3s] representing its three corners.
	*/
open external class Triangle(a: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, c: ch.viseon.threejs.declarations.math.Vector3 = definedExternally){

	/**
	* The first corner of the triangle. Default is a [page:Vector3] at (0, 0, 0).
	*/
	open var a: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* The second corner of the triangle. Default is a [page:Vector3] at (0, 0, 0).
	*/
	open var b: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* the final corner of the triangle. Default is a [page:Vector3] at (0, 0, 0)
	*/
	open var c: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* Returns a new triangle with the same [page:.a a], [page:.b b] and [page:.c c] properties as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Triangle


	/**
	* [page:Vector3 point] - [page:Vector3] [page:Vector3 target] — the result will be copied into this Vector3. Returns the closest point on the triangle to [page:Vector3 point].
	*/
	open fun closestPointToPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 point] - [page:Vector3] to check. Returns true if the passed point, when projected onto the plane of the triangle, lies within the triangle.
	*/
	open fun containsPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Boolean


	/**
	* Copies the values of the passed triangles's [page:.a a], [page:.b b] and [page:.c c] properties to this triangle.
	*/
	open fun copy(triangle: ch.viseon.threejs.declarations.math.Triangle = definedExternally) : ch.viseon.threejs.declarations.math.Triangle


	/**
	* Returns true if the two triangles have identical [page:.a a], [page:.b b] and [page:.c c] properties.
	*/
	open fun equals(triangle: ch.viseon.threejs.declarations.math.Triangle = definedExternally) : Boolean


	/**
	* Return the area of the triangle.
	*/
	open fun getArea() : Double


	/**
	* [page:Vector3 point] - [page:Vector3] [page:Vector3 target] — the result will be copied into this Vector3. Return a [link:https://en.wikipedia.org/wiki/Barycentric_coordinate_system barycentric coordinate] from the given vector. [link:http://commons.wikimedia.org/wiki/File:Barycentric_coordinates_1.png Picture of barycentric coordinates]
	*/
	open fun getBarycoord(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Calculate the midpoint of the triangle.
	*/
	open fun getMidpoint(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Calculate the [link:https://en.wikipedia.org/wiki/Normal_(geometry) normal vector] of the triangle.
	*/
	open fun getNormal(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 target] — the result will be copied into this Plane. Calculate a [page:Plane plane] based on the triangle. .
	*/
	open fun getPlane(target: ch.viseon.threejs.declarations.math.Plane = definedExternally) : ch.viseon.threejs.declarations.math.Plane


	/**
	* [page:Box3 box] - Box to check for intersection against. Determines whether or not this triangle intersects [page:Box3 box].
	*/
	open fun intersectsBox(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : Boolean


	/**
	* Sets the triangle's [page:.a a], [page:.b b] and [page:.c c] properties to the passed [page:vector3 vector3s].
	*/
	open fun set(a: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, c: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, `this`: ch.viseon.threejs.declarations.math.Triangle = definedExternally) : ch.viseon.threejs.declarations.math.Triangle


	/**
	* points - [page:Array] of [page:Vector3]s i0 - [page:Integer] index i1 - [page:Integer] index i2 - [page:Integer] index Sets the triangle's vectors to the vectors in the array.
	*/
	open fun setFromPointsAndIndices(points: Array<dynamic>/*Array*/ = definedExternally, i0: Int = definedExternally, i1: Int = definedExternally, i2: Int = definedExternally, `this`: ch.viseon.threejs.declarations.math.Triangle = definedExternally) : ch.viseon.threejs.declarations.math.Triangle
}