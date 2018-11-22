//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* Represents a box in 2D space.
	*/
open external class Box2(min: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, max: ch.viseon.threejs.declarations.math.Vector2 = definedExternally){

	/**
	* [page:Vector2] representing the lower (x, y) boundary of the box. Default is ( + Infinity, + Infinity ).
	*/
	open var min: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* [page:Vector2] representing the lower upper (x, y) boundary of the box. Default is ( - Infinity, - Infinity ).
	*/
	open var max: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* [page:Vector2 point] - [page:Vector2] to clamp. [page:Vector2 target] — the result will be copied into this Vector2. [link:https://en.wikipedia.org/wiki/Clamping_(graphics) Clamps] the [page:Vector2 point] within the bounds of this box.
	*/
	open fun clampPoint(point: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Vector2


	/**
	* Returns a new [page:Box2] with the same [page:.min min] and [page:.max max] as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Box2 box] - [page:Box2 Box2] to test for inclusion. Returns true if this box includes the entirety of [page:Box2 box]. If this and [page:Box2 box] are identical, this function also returns true.
	*/
	open fun containsBox(box: ch.viseon.threejs.declarations.math.Box2 = definedExternally) : Boolean


	/**
	* [page:Vector2 point] - [page:Vector2] to check for inclusion. Returns true if the specified [page:Vector2 point] lies within or on the boundaries of this box.
	*/
	open fun containsPoint(point: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Boolean


	/**
	* Copies the [page:.min min] and [page:.max max] from [page:Box2 box] to this box.
	*/
	open fun copy(box: ch.viseon.threejs.declarations.math.Box2 = definedExternally) : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Vector2 point] - [page:Vector2] to measure distance to. Returns the distance from any edge of this box to the specified point. If the [page:Vector2 point] lies inside of this box, the distance will be 0.
	*/
	open fun distanceToPoint(point: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Float


	/**
	* [page:Box2 box] - Box to compare with this one. Returns true if this box and [page:Box2 box] share the same lower and upper bounds.
	*/
	open fun equals(box: ch.viseon.threejs.declarations.math.Box2 = definedExternally) : Boolean


	/**
	* [page:Vector2 point] - [page:Vector2] that should be included in the box. Expands the boundaries of this box to include [page:Vector2 point].
	*/
	open fun expandByPoint(point: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:float scalar] - Distance to expand the box by. Expands each dimension of the box by [page:float scalar]. If negative, the dimensions of the box will be contracted.
	*/
	open fun expandByScalar(scalar: Float = definedExternally) : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Vector2 vector] - [page:Vector2] to expand the box by. Expands this box equilaterally by [page:Vector2 vector]. The width of this box will be expanded by the x component of [page:Vector2 vector] in both directions. The height of this box will be expanded by the y component of [page:Vector2 vector] in both directions.
	*/
	open fun expandByVector(vector: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Vector2 target] — the result will be copied into this Vector2. Returns the center point of the box as a [page:Vector2].
	*/
	open fun getCenter(target: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Vector2


	/**
	* [page:Vector2 point] - [page:Vector2]. [page:Vector2 target] — the result will be copied into this Vector2. Returns a point as a proportion of this box's width and height.
	*/
	open fun getParameter(point: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Vector2


	/**
	* [page:Vector2 target] — the result will be copied into this Vector2. Returns the width and height of this box.
	*/
	open fun getSize(target: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Vector2


	/**
	* [page:Box2 box] - Box to intersect with. Returns the intersection of this and [page:Box2 box], setting the upper bound of this box to the lesser of the two boxes' upper bounds and the lower bound of this box to the greater of the two boxes' lower bounds.
	*/
	open fun intersect(box: ch.viseon.threejs.declarations.math.Box2 = definedExternally) : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Box2 box] - Box to check for intersection against. Determines whether or not this box intersects [page:Box2 box].
	*/
	open fun intersectsBox(box: ch.viseon.threejs.declarations.math.Box2 = definedExternally) : Boolean


	/**
	* Returns true if this box includes zero points within its bounds. Note that a box with equal lower and upper bounds still includes one point, the one both bounds share.
	*/
	open fun isEmpty() : Boolean


	/**
	* Makes this box empty.
	*/
	open fun makeEmpty() : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Vector2 min] - (required ) [page:Vector2] representing the lower (x, y) boundary of the box. [page:Vector2 max] - (required) [page:Vector2] representing the upper (x, y) boundary of the box. Sets the lower and upper (x, y) boundaries of this box.
	*/
	open fun set(min: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, max: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Vector2 center] - Desired center position of the box ([page:Vector2]). [page:Vector2 size] - Desired x and y dimensions of the box ([page:Vector2]). Centers this box on [page:Vector2 center] and sets this box's width and height to the values specified in [page:Vector2 size].
	*/
	open fun setFromCenterAndSize(center: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, size: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Array points] - Array of [page:Vector2 Vector2s] that the resulting box will contain. Sets the upper and lower bounds of this box to include all of the points in [page:Array points].
	*/
	open fun setFromPoints(points: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Vector2 offset] - Direction and distance of offset. Adds [page:Vector2 offset] to both the upper and lower bounds of this box, effectively moving this box [page:Vector2 offset] units in 2D space.
	*/
	open fun translate(offset: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Box2


	/**
	* [page:Box2 box] - Box that will be unioned with this box. Unions this box with [page:Box2 box], setting the upper bound of this box to the greater of the two boxes' upper bounds and the lower bound of this box to the lesser of the two boxes' lower bounds.
	*/
	open fun union(box: ch.viseon.threejs.declarations.math.Box2 = definedExternally) : ch.viseon.threejs.declarations.math.Box2
}