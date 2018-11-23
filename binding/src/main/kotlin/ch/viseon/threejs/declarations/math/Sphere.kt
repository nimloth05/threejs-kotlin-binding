//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A sphere defined by a center and radius.
	*/
open external class Sphere(center: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, radius: Double = definedExternally){

	/**
	* A [page:Vector3] defining the center of the sphere. Default is (0, 0, 0).
	*/
	open var center: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* The radius of the sphere. Default is 0.
	*/
	open var radius: Double  = definedExternally


	/**
	* [page:Matrix4 matrix] - the [Page:Matrix4] to apply Transforms this sphere with the provided [page:Matrix4].
	*/
	open fun applyMatrix4(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : ch.viseon.threejs.declarations.math.Sphere


	/**
	* [page:Vector3 point] - [page:Vector3] The point to clamp. [page:Vector3 target] — the result will be copied into this Vector3. Clamps a point within the sphere. If the point is is outside the sphere, it will clamp it to the closets point on the edge of the sphere. Points already inside the sphere will not be affected.
	*/
	open fun clampPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* Returns a new sphere with the same [page:.center center] and [page:.radius radius] as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Sphere


	/**
	* [page:Vector3 point] - the [page:Vector3] to be checked Checks to see if the sphere contains the provided [page:Vector3 point] inclusive of the surface of the sphere.
	*/
	open fun containsPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Boolean


	/**
	* Copies the values of the passed sphere's [page:.center center] and [page:.radius radius] properties to this sphere.
	*/
	open fun copy(sphere: ch.viseon.threejs.declarations.math.Sphere = definedExternally) : ch.viseon.threejs.declarations.math.Sphere


	/**
	* Returns the closest distance from the boundary of the sphere to the [page:Vector3 point]. If the sphere contains the point, the distance will be negative.
	*/
	open fun distanceToPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* Checks to see if the sphere is empty (the radius set to 0).
	*/
	open fun empty() : Boolean


	/**
	* Checks to see if the two spheres' centers and radii are equal.
	*/
	open fun equals(sphere: ch.viseon.threejs.declarations.math.Sphere = definedExternally) : Boolean


	/**
	* [page:Box3 target] — the result will be copied into this Box3. Returns a[link:https://en.wikipedia.org/wiki/Minimum_bounding_box Minimum Bounding Box] for the sphere.
	*/
	open fun getBoundingBox(target: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Box3 box] - [page:Box3] to check for intersection against. Determines whether or not this sphere intersects a given [page:Box3 box].
	*/
	open fun intersectsBox(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : Boolean


	/**
	* [page:Plane plane] - Plane to check for intersection against. Determines whether or not this sphere intersects a given [page:Plane plane].
	*/
	open fun intersectsPlane(plane: ch.viseon.threejs.declarations.math.Plane = definedExternally) : Boolean


	/**
	* [page:Sphere sphere] - Sphere to check for intersection against. Checks to see if two spheres intersect.
	*/
	open fun intersectsSphere(sphere: ch.viseon.threejs.declarations.math.Sphere = definedExternally) : Boolean


	/**
	* [page:Vector3 center] - center of the sphere. [page:Float radius] - radius of the sphere. Sets the [page:.center center] and [page:.radius radius] properties of this sphere.
	*/
	open fun set(center: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, radius: Double = definedExternally) : ch.viseon.threejs.declarations.math.Sphere


	/**
	* [page:Array points] - an [page:Array] of [page:Vector3] positions. [page:Vector3 optionalCenter] - Optional [page:Vector3] position for the sphere's center. Computes the minimum bounding sphere for an array of [page:Array points]. If [page:Vector3 optionalCenter]is given, it is used as the sphere's center. Otherwise, the center of the axis-aligned bounding box encompassing [page:Array points] is calculated.
	*/
	open fun setFromPoints(points: Array<dynamic>/*Array*/ = definedExternally, optionalCenter: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Sphere


	/**
	* Translate the sphere's center by the provided offset [page:Vector3].
	*/
	open fun translate(offset: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Sphere
}