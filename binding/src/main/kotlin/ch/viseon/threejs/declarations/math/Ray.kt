//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A ray that emits from an origin in a certain direction. This is used by the [page:Raycaster] to assist with [link:https://en.wikipedia.org/wiki/Ray_casting raycasting]. Raycasting is used for mouse picking (working out what objects in the 3D space the mouse is over) amongst other things.
	*/
open external class Ray(origin: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, direction: ch.viseon.threejs.declarations.math.Vector3 = definedExternally){

	/**
	* The origin of the [page:Ray]. Default is a [page:Vector3] at (0, 0, 0).
	*/
	open var origin: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* The direction of the [page:Ray]. This must be normalized (with [page:Vector3.normalize]) for the methods to operate properly. Default is a [page:Vector3] at (0, 0, 0).
	*/
	open var direction: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* [page:Matrix4 matrix4] - the [page:Matrix4] to apply to this [page:Ray]. Transform this [page:Ray] by the [page:Matrix4].
	*/
	open fun applyMatrix4(matrix4: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : ch.viseon.threejs.declarations.math.Ray


	/**
	* [page:Float t] - the distance along the [page:Ray] to retrieve a position for. [page:Vector3 target] — the result will be copied into this Vector3. Get a [page:Vector3] that is a given distance along this [page:Ray].
	*/
	open fun at(t: Double = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* Creates a new Ray with identical [page:.origin origin] and [page:.direction direction] to this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Ray


	/**
	* [page:Vector3 point] - the point to get the closest approach to. [page:Vector3 target] — the result will be copied into this Vector3. Get the point along this [page:Ray] that is closest to the [page:Vector3] provided.
	*/
	open fun closestPointToPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* Copies the [page:.origin origin] and [page:.direction direction] properties of [page:Ray ray] into this ray.
	*/
	open fun copy(ray: ch.viseon.threejs.declarations.math.Ray = definedExternally) : ch.viseon.threejs.declarations.math.Ray


	/**
	* [page:Vector3 point] - the [page:Vector3] to compute a distance to. Get the squared distance of the closest approach between the [page:Ray] and the [page:Vector3].
	*/
	open fun distanceSqToPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* [page:Vector3 v0] - the start of the line segment. [page:Vector3 v1] - the end of the line segment. optionalPointOnRay - (optional) if this is provided, it receives the point on this [page:Ray] that is closest to the segment. optionalPointOnSegment - (optional) if this is provided, it receives the point on the line segment that is closest to this [page:Ray]. Get the squared distance between this [page:Ray] and a line segment.
	*/
	open fun distanceSqToSegment(v0: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, v1: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, optionalPointOnRay: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, optionalPointOnSegment: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* [page:Plane plane] - the [page:Plane] to get the distance to. Get the distance from [page:.origin origin] to the [page:Plane], or **null** if the [page:Ray] doesn't intersect the [page:Plane].
	*/
	open fun distanceToPlane(plane: ch.viseon.threejs.declarations.math.Plane = definedExternally) : Double


	/**
	* [page:Vector3 point] - [page:Vector3] The [page:Vector3] to compute a distance to. Get the distance of the closest approach between the [page:Ray] and the [page:Vector3 point].
	*/
	open fun distanceToPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* [page:Ray ray] - the [page:Ray] to compare to. Returns true if this and the other [page:Ray ray] have equal [page:.offset offset] and [page:.direction direction].
	*/
	open fun equals(ray: ch.viseon.threejs.declarations.math.Ray = definedExternally) : Boolean


	/**
	* [page:Box3 box] - the [page:Box3] to intersect with. [page:Vector3 target] — the result will be copied into this Vector3. Intersect this [page:Ray] with a [page:Box3], returning the intersection point or **null** if there is no intersection.
	*/
	open fun intersectBox(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Plane plane] - the [page:Plane] to intersect with. [page:Vector3 target] — the result will be copied into this Vector3. Intersect this [page:Ray] with a [page:Plane], returning the intersection point or **null** if there is no intersection.
	*/
	open fun intersectPlane(plane: ch.viseon.threejs.declarations.math.Plane = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Sphere sphere] - the [page:Sphere] to intersect with. [page:Vector3 target] — the result will be copied into this Vector3. Intersect this [page:Ray] with a [page:Sphere], returning the intersection point or **null** if there is no intersection.
	*/
	open fun intersectSphere(sphere: ch.viseon.threejs.declarations.math.Sphere = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 a], [page:Vector3 b], [page:Vector3 c] - The [page:Vector3] points making up the triangle. [page:Boolean backfaceCulling] - whether to use backface culling. [page:Vector3 target] — the result will be copied into this Vector3. Intersect this [page:Ray] with a triangle, returning the intersection point or **null** if there is no intersection.
	*/
	open fun intersectTriangle(a: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, c: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, backfaceCulling: Boolean = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Box3 box] - the [page:Box3] to intersect with. Return true if this [page:Ray] intersects with the [page:Box3].
	*/
	open fun intersectsBox(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : Boolean


	/**
	* [page:Plane plane] - the [page:Plane] to intersect with. Return true if this [page:Ray] intersects with the [page:Plane].
	*/
	open fun intersectsPlane(plane: ch.viseon.threejs.declarations.math.Plane = definedExternally) : Boolean


	/**
	* [page:Sphere sphere] - the [page:Sphere] to intersect with. Return true if this [page:Ray] intersects with the [page:Sphere].
	*/
	open fun intersectsSphere(sphere: ch.viseon.threejs.declarations.math.Sphere = definedExternally) : Boolean


	/**
	* [page:Vector3 v] - The [page:Vector3] to look at. Adjusts the direction of the ray to point at the vector in world coordinates.
	*/
	open fun lookAt(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Ray


	/**
	* [page:Float t] - The distance along the [page:Ray] to interpolate. Shift the origin of this [page:Ray] along its direction by the distance given.
	*/
	open fun recast(t: Double = definedExternally) : ch.viseon.threejs.declarations.math.Ray


	/**
	* [page:Vector3 origin] - the [page:.origin origin] of the [page:Ray]. [page:Vector3 origin] - the [page:.direction direction] of the [page:Ray]. This must be normalized (with [page:Vector3.normalize]) for the methods to operate properly. Copy the parameters to the [page:.origin origin] and [page:.direction direction] properties of this ray.
	*/
	open fun set(origin: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, direction: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Ray
}