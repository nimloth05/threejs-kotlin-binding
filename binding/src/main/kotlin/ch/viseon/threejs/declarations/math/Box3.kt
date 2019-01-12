//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* Represents a box or cube in 3D space. The main purpose of this is to represent the [link:https://en.wikipedia.org/wiki/Minimum_bounding_box Minimum Bounding Boxes] for objects.
	*/
open external class Box3(min: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, max: ch.viseon.threejs.declarations.math.Vector3 = definedExternally){

	/**
	* Used to check whether this or derived classes are Box3s. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isBox3: Boolean  = definedExternally


	/**
	* [page:Vector3] representing the lower (x, y, z) boundary of the box. Default is ( + Infinity, + Infinity, + Infinity ).
	*/
	open var min: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* [page:Vector3] representing the upper (x, y, z) boundary of the box. Default is ( - Infinity, - Infinity, - Infinity ).
	*/
	open var max: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* [page:Matrix4 matrix] - The [page:Matrix4] to apply Transforms this Box3 with the supplied matrix.
	*/
	open fun applyMatrix4(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Vector3 point] - [page:Vector3] to clamp. [page:Vector3 target] — the result will be copied into this Vector3. [link:https://en.wikipedia.org/wiki/Clamping_(graphics) Clamps] the [page:Vector3 point] within the bounds of this box.
	*/
	open fun clampPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* Returns a new [page:Box3] with the same [page:.min min] and [page:.max max] as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Box3 box] - [page:Box3 Box3] to test for inclusion. Returns true if this box includes the entirety of [page:Box3 box]. If this and [page:Box3 box] are identical, this function also returns true.
	*/
	open fun containsBox(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : Boolean


	/**
	* [page:Vector3 point] - [page:Vector3] to check for inclusion. Returns true if the specified [page:Vector3 point] lies within or on the boundaries of this box.
	*/
	open fun containsPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Boolean


	/**
	* [page:Box3 box] - [page:Box3] to copy. Copies the [page:.min min] and [page:.max max] from [page:Box3 box] to this box.
	*/
	open fun copy(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Vector3 point] - [page:Vector3] to measure distance to. Returns the distance from any edge of this box to the specified point. If the [page:Vector3 point] lies inside of this box, the distance will be 0.
	*/
	open fun distanceToPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* [page:Box3 box] - Box to compare with this one. Returns true if this box and [page:Box3 box] share the same lower and upper bounds.
	*/
	open fun equals(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : Boolean


	/**
	* [page:Object3D object] - [page:Object3D] to expand the box by. Expands the boundaries of this box to include [page:Object3D object] and its children, accounting for the object's, and children's, world transforms.
	*/
	open fun expandByObject(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Vector3 point] - [page:Vector3] that should be included in the box. Expands the boundaries of this box to include [page:Vector3 point].
	*/
	open fun expandByPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:float scalar] - Distance to expand the box by. Expands each dimension of the box by [page:float scalar]. If negative, the dimensions of the box will be contracted.
	*/
	open fun expandByScalar(scalar: Double = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Vector3 vector] - [page:Vector3] to expand the box by. Expands this box equilaterally by [page:Vector3 vector]. The width of this box will be expanded by the x component of [page:Vector3 vector] in both directions. The height of this box will be expanded by the y component of [page:Vector3 vector] in both directions. The depth of this box will be expanded by the z component of **vector** in both directions.
	*/
	open fun expandByVector(vector: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Sphere target] — the result will be copied into this Sphere. Gets a [page:Sphere] that bounds the box.
	*/
	open fun getBoundingSphere(target: ch.viseon.threejs.declarations.math.Sphere = definedExternally) : ch.viseon.threejs.declarations.math.Sphere


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Returns the center point of the box as a [page:Vector3].
	*/
	open fun getCenter(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 point] - [page:Vector3]. [page:Vector3 target] — the result will be copied into this Vector3. Returns a point as a proportion of this box's width and height.
	*/
	open fun getParameter(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Returns the width, height and depth of this box.
	*/
	open fun getSize(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Box3 box] - Box to intersect with. Returns the intersection of this and [page:Box3 box], setting the upper bound of this box to the lesser of the two boxes' upper bounds and the lower bound of this box to the greater of the two boxes' lower bounds.
	*/
	open fun intersect(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Box3 box] - Box to check for intersection against. Determines whether or not this box intersects [page:Box3 box].
	*/
	open fun intersectsBox(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : Boolean


	/**
	* [page:Plane plane] - [page:Plane] to check for intersection against. Determines whether or not this box intersects [page:Plane plane].
	*/
	open fun intersectsPlane(plane: ch.viseon.threejs.declarations.math.Plane = definedExternally) : Boolean


	/**
	* [page:Sphere sphere] - [page:Sphere] to check for intersection against. Determines whether or not this box intersects [page:Sphere sphere].
	*/
	open fun intersectsSphere(sphere: ch.viseon.threejs.declarations.math.Sphere = definedExternally) : Boolean


	/**
	* [page:Triangle triangle] - [page:Triangle] to check for intersection against. Determines whether or not this box intersects [page:Triangle triangle].
	*/
	open fun intersectsTriangle(triangle: ch.viseon.threejs.declarations.math.Triangle = definedExternally) : Boolean


	/**
	* Returns true if this box includes zero points within its bounds. Note that a box with equal lower and upper bounds still includes one point, the one both bounds share.
	*/
	open fun isEmpty() : Boolean


	/**
	* Makes this box empty.
	*/
	open fun makeEmpty() : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Vector3 min] - [page:Vector3] representing the lower (x, y, z) boundary of the box. [page:Vector3 max] - [page:Vector3] representing the lower upper (x, y, z) boundary of the box. Sets the lower and upper (x, y, z) boundaries of this box.
	*/
	open fun set(min: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, max: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* array -- An array of position data that the resulting box will envelop. Sets the upper and lower bounds of this box to include all of the data in **array**.
	*/
	open fun setFromArray(array: Array<dynamic>/*Array*/ = definedExternally, `this`: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:BufferAttribute attribute] - A buffer attribute of position data that the resulting box will envelop. Sets the upper and lower bounds of this box to include all of the data in [page:BufferAttribute attribute].
	*/
	open fun setFromBufferAttribute(attribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally, `this`: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Vector3 center] - Desired center position of the box ([page:Vector3]). [page:Vector3 size] - Desired x, y and z dimensions of the box ([page:Vector3]). Centers this box on [page:Vector3 center] and sets this box's width and height to the values specified in [page:Vector3 size].
	*/
	open fun setFromCenterAndSize(center: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, size: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Vector3 center], - Desired center position of the box. [page:Vector3 size] - Desired x, y and z dimensions of the box. Centers this box on [page:Vector3 center] and sets this box's width, height and depth to the values specified in [page:Vector3 size]
	*/
	open fun setFromCenterAndSize(center: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, size: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, `this`: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Object3D object] - [page:Object3D] to compute the bounding box of. Computes the world-axis-aligned bounding box of an [page:Object3D] (including its children), accounting for the object's, and children's, world transforms.
	*/
	open fun setFromObject(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Array points] - Array of [page:Vector3 Vector3s] that the resulting box will contain. Sets the upper and lower bounds of this box to include all of the points in [page:Array points].
	*/
	open fun setFromPoints(points: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Vector3 offset] - Direction and distance of offset. Adds [page:Vector3 offset] to both the upper and lower bounds of this box, effectively moving this box [page:Vector3 offset] units in 3D space.
	*/
	open fun translate(offset: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3


	/**
	* [page:Box3 box] - Box that will be unioned with this box. Unions this box with [page:Box3 box], setting the upper bound of this box to the greater of the two boxes' upper bounds and the lower bound of this box to the lesser of the two boxes' lower bounds.
	*/
	open fun union(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : ch.viseon.threejs.declarations.math.Box3
}