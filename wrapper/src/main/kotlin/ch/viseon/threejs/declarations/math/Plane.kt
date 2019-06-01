@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A two dimensional surface that extends infinitely in 3d space, represented in [link:http://mathworld.wolfram.com/HessianNormalForm.html Hessian normal form] by a unit length normal vector and a constant.
	*/
open external class Plane(normal: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, constant: Double = definedExternally){
	open var normal: ch.viseon.threejs.declarations.math.Vector3  = definedExternally

	open var constant: Double  = definedExternally


	/**
	* [page:Matrix4 matrix] - the [Page:Matrix4] to apply. [page:Matrix3 optionalNormalMatrix] - (optional) pre-computed normal [Page:Matrix3] of the Matrix4 being applied. Apply a Matrix4 to the plane. The matrix must be an affine, homogeneous transform. If supplying an [page:Matrix3 optionalNormalMatrix], it can be created like so: var optionalNormalMatrix = new THREE.Matrix3().getNormalMatrix( matrix );
	*/
	open fun applyMatrix4(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally, optionalNormalMatrix: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : ch.viseon.threejs.declarations.math.Plane


	/**
	* Returns a new plane with the same [page:.normal normal] and [page:.constant constant] as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Plane


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Returns a [page:Vector3] coplanar to the plane, by calculating the projection of the normal vector at the origin onto the plane.
	*/
	open fun coplanarPoint(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* Copies the values of the passed plane's [page:.normal normal] and [page:.constant constant] properties to this plane.
	*/
	open fun copy(plane: ch.viseon.threejs.declarations.math.Plane = definedExternally) : ch.viseon.threejs.declarations.math.Plane


	/**
	* Returns the signed distance from the [page:Vector3 point] to the plane.
	*/
	open fun distanceToPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* Returns the signed distance from the [page:Sphere sphere] to the plane.
	*/
	open fun distanceToSphere(sphere: ch.viseon.threejs.declarations.math.Sphere = definedExternally) : Double


	/**
	* Checks to see if two planes are equal (their [page:.normal normal] and [page:.constant constant] properties match).
	*/
	open fun equals(plane: ch.viseon.threejs.declarations.math.Plane = definedExternally) : Boolean


	/**
	* [page:Line3 line] - the [page:Line3] to check for intersection. [page:Vector3 target] — the result will be copied into this Vector3. Returns the intersection point of the passed line and the plane. Returns undefined if the line does not intersect. Returns the line's starting point if the line is coplanar with the plane.
	*/
	open fun intersectLine(line: ch.viseon.threejs.declarations.math.Line3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Box3 box] - the [page:Box3] to check for intersection. Determines whether or not this plane intersects [page:Box3 box].
	*/
	open fun intersectsBox(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : Boolean


	/**
	* [page:Line3 line] - the [page:Line3] to check for intersection. Tests whether a line segment intersects with (passes through) the plane.
	*/
	open fun intersectsLine(line: ch.viseon.threejs.declarations.math.Line3 = definedExternally) : Boolean


	/**
	* [page:Sphere sphere] - the [page:Sphere] to check for intersection. Determines whether or not this plane intersects [page:Sphere sphere].
	*/
	open fun intersectsSphere(sphere: ch.viseon.threejs.declarations.math.Sphere = definedExternally) : Boolean


	/**
	* Negates both the normal vector and the constant.
	*/
	open fun negate() : ch.viseon.threejs.declarations.math.Plane


	/**
	* Normalizes the [page:.normal normal] vector, and adjusts the [page:.constant constant] value accordingly.
	*/
	open fun normalize() : ch.viseon.threejs.declarations.math.Plane


	/**
	* [page:Vector3 point] - the [page:Vector3] to project onto the plane. [page:Vector3 target] — the result will be copied into this Vector3. Projects a [page:Vector3 point] onto the plane.
	*/
	open fun projectPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 normal] - a unit length [page:Vector3] defining the normal of the plane. [page:Float constant] - the signed distance from the origin to the plane. Default is **0**. Sets the plane's [page:.normal normal] and [page:.constant constant] properties.
	*/
	open fun set(normal: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, constant: Double = definedExternally) : ch.viseon.threejs.declarations.math.Plane


	/**
	* [page:Float x] - x value of the unit length normal vector. [page:Float y] - y value of the unit length normal vector. [page:Float z] - z value of the unit length normal vector. [page:Float w] - the value of the plane's [page:.constant constant] property. Set the individual components that define the plane.
	*/
	open fun setComponents(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally) : ch.viseon.threejs.declarations.math.Plane


	/**
	* [page:Vector3 a] - first point on the plane. [page:Vector3 b] - second point on the plane. [page:Vector3 c] - third point on the plane. Defines the plane based on the 3 provided points. The winding order is assumed to be counter-clockwise, and determines the direction of the [page:.normal normal].
	*/
	open fun setFromCoplanarPoints(a: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, c: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Plane


	/**
	* [page:Vector3 normal] - a unit length [page:Vector3] defining the normal of the plane. [page:Vector3 point] - [page:Vector3] Sets the plane's properties as defined by a [page:Vector3 normal] and an arbitrary coplanar [page:Vector3 point].
	*/
	open fun setFromNormalAndCoplanarPoint(normal: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, `this`: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Plane


	/**
	* [page:Vector3 offset] - the amount to move the plane by. Translates the plane by the distance defined by the [page:Vector3 offset] vector. Note that this only affects the plane constant and will not affect the normal vector.
	*/
	open fun translate(offset: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Plane
}