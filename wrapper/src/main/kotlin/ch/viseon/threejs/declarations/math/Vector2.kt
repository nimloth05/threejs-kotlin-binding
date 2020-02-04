@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* Class representing a 2D [link:https://en.wikipedia.org/wiki/Vector_space vector]. A 2D vector is an ordered pair of numbers (labeled x and y), which can be used to represent a number of things, such as:
	*/
open external class Vector2(x: Double = definedExternally, y: Double = definedExternally){

	/**
	* Alias for [page:.y y].
	*/
	open var height: Double  = definedExternally


	/**
	* Alias for [page:.x x].
	*/
	open var width: Double  = definedExternally

	open var x: Double  = definedExternally

	open var y: Double  = definedExternally


	/**
	* Adds [page:Vector2 v] to this vector.
	*/
	open fun add(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* Adds the scalar value [page:Float s] to this vector's [page:.x x] and [page:.y y] values.
	*/
	open fun addScalar(s: Double = definedExternally) : Vector2


	/**
	* Adds the multiple of [page:Vector2 v] and [page:Float s] to this vector.
	*/
	open fun addScaledVector(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, s: Double = definedExternally) : Vector2


	/**
	* Sets this vector to [page:Vector2 a] + [page:Vector2 b].
	*/
	open fun addVectors(a: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* Computes the angle in radians of this vector with respect to the positive x-axis.
	*/
	open fun angle() : Double


	/**
	* Multiplies this vector (with an implicit 1 as the 3rd component) by m.
	*/
	open fun applyMatrix3(m: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : Vector2


	/**
	* The [page:.x x] and [page:.y y] components of the vector are rounded up to the nearest integer value.
	*/
	open fun ceil() : Vector2


	/**
	* [page:Vector2 min] - the minimum x and y values. [page:Vector2 max] - the maximum x and y values in the desired range If this vector's x or y value is greater than the max vector's x or y value, it is replaced by the corresponding value. If this vector's x or y value is less than the min vector's x or y value, it is replaced by the corresponding value.
	*/
	open fun clamp(min: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, max: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* [page:Float min] - the minimum value the length will be clamped to [page:Float max] - the maximum value the length will be clamped to If this vector's length is greater than the max value, it is replaced by the max value. If this vector's length is less than the min value, it is replaced by the min value.
	*/
	open fun clampLength(min: Double = definedExternally, max: Double = definedExternally) : Vector2


	/**
	* [page:Float min] - the minimum value the components will be clamped to [page:Float max] - the maximum value the components will be clamped to If this vector's x or y values are greater than the max value, they are replaced by the max value. If this vector's x or y values are less than the min value, they are replaced by the min value.
	*/
	open fun clampScalar(min: Double = definedExternally, max: Double = definedExternally) : Vector2


	/**
	* Returns a new Vector2 with the same [page:.x x] and [page:.y y] values as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Vector2


	/**
	* Copies the values of the passed Vector2's [page:.x x] and [page:.y y] properties to this Vector2.
	*/
	open fun copy(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* Computes the distance from this vector to [page:Vector2 v].
	*/
	open fun distanceTo(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Double


	/**
	* Computes the [link:https://en.wikipedia.org/wiki/Taxicab_geometry Manhattan distance] from this vector to [page:Vector2 v].
	*/
	open fun manhattanDistanceTo(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Double


	/**
	* Computes the squared distance from this vector to [page:Vector2 v]. If you are just comparing the distance with another distance, you should compare the distance squared instead as it is slightly more efficient to calculate.
	*/
	open fun distanceToSquared(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Double


	/**
	* Divides this vector by [page:Vector2 v].
	*/
	open fun divide(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* Divides this vector by scalar [page:Float s]. Sets vector to **( 0, 0 )** if [page:Float s] = 0.
	*/
	open fun divideScalar(s: Double = definedExternally) : Vector2


	/**
	* Calculates the [link:https://en.wikipedia.org/wiki/Dot_product dot product] of this vector and [page:Vector2 v].
	*/
	open fun dot(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Double


	/**
	* Calculates the [link:https://en.wikipedia.org/wiki/Cross_product cross product] of this vector and [page:Vector2 v]. Note that a 'cross-product' in 2D is not well-defined. This function computes a geometric cross-product often used in 2D graphics
	*/
	open fun cross(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Double


	/**
	* Checks for strict equality of this vector and [page:Vector2 v].
	*/
	open fun equals(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Boolean


	/**
	* The components of the vector are rounded down to the nearest integer value.
	*/
	open fun floor() : Vector2


	/**
	* [page:Array array] - the source array. [page:Integer offset] - (optional) offset into the array. Default is 0. Sets this vector's [page:.x x] value to be array[ offset ] and [page:.y y] value to be array[ offset + 1 ].
	*/
	open fun fromArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Vector2


	/**
	* [page:BufferAttribute attribute] - the source attribute. [page:Integer index] - index in the attribute. Sets this vector's [page:.x x] and [page:.y y] values from the [page:BufferAttribute attribute].
	*/
	open fun fromBufferAttribute(attribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally, index: Int = definedExternally) : Vector2


	/**
	* [page:Integer index] - 0 or 1. If index equals 0 returns the [page:.x x] value. If index equals 1 returns the [page:.y y] value.
	*/
	open fun getComponent(index: Int = definedExternally) : Double


	/**
	* Computes the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean length] (straight-line length) from (0, 0) to (x, y).
	*/
	open fun length() : Double


	/**
	* Computes the [link:http://en.wikipedia.org/wiki/Taxicab_geometry Manhattan length] of this vector.
	*/
	open fun manhattanLength() : Double


	/**
	* Computes the square of the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean length] (straight-line length) from (0, 0) to (x, y). If you are comparing the lengths of vectors, you should compare the length squared instead as it is slightly more efficient to calculate.
	*/
	open fun lengthSq() : Double


	/**
	* [page:Vector2 v] - [page:Vector2] to interpolate towards. [page:Float alpha] - interpolation factor, typically in the closed interval [0, 1]. Linearly interpolates between this vector and [page:Vector2 v], where alpha is the percent distance along the line - alpha = 0 will be this vector, and alpha = 1 will be [page:Vector2 v].
	*/
	open fun lerp(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, alpha: Double = definedExternally) : Vector2


	/**
	* [page:Vector2 v1] - the starting [page:Vector2]. [page:Vector2 v2] - [page:Vector2] to interpolate towards. [page:Float alpha] - interpolation factor, typically in the closed interval [0, 1]. Sets this vector to be the vector linearly interpolated between [page:Vector2 v1] and [page:Vector2 v2] where alpha is the percent distance along the line connecting the two vectors - alpha = 0 will be [page:Vector2 v1], and alpha = 1 will be [page:Vector2 v2].
	*/
	open fun lerpVectors(v1: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, v2: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, alpha: Double = definedExternally) : Vector2


	/**
	* Inverts this vector - i.e. sets x = -x and y = -y.
	*/
	open fun negate() : Vector2


	/**
	* Converts this vector to a [link:https://en.wikipedia.org/wiki/Unit_vector unit vector] - that is, sets it equal to the vector with the same direction as this one, but [page:.length length] 1.
	*/
	open fun normalize() : Vector2


	/**
	* If this vector's x or y value is less than [page:Vector2 v]'s x or y value, replace that value with the corresponding max value.
	*/
	open fun max(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* If this vector's x or y value is greater than [page:Vector2 v]'s x or y value, replace that value with the corresponding min value.
	*/
	open fun min(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* Multiplies this vector by [page:Vector2 v].
	*/
	open fun multiply(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* Multiplies this vector by scalar [page:Float s].
	*/
	open fun multiplyScalar(s: Double = definedExternally) : Vector2


	/**
	* [page:Vector2 center] - the point around which to rotate. [page:float angle] - the angle to rotate, in radians. Rotates the vector around [page:Vector2 center] by [page:float angle] radians.
	*/
	open fun rotateAround(center: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, angle: Double = definedExternally) : Vector2


	/**
	* The components of the vector are rounded to the nearest integer value.
	*/
	open fun round() : Vector2


	/**
	* The components of the vector are rounded towards zero (up if negative, down if positive) to an integer value.
	*/
	open fun roundToZero() : Vector2


	/**
	* Sets the [page:.x x] and [page:.y y] components of this vector.
	*/
	open fun set(x: Double = definedExternally, y: Double = definedExternally) : Vector2


	/**
	* [page:Integer index] - 0 or 1. [page:Float value] - [page:Float] If index equals 0 set [page:.x x] to [page:Float value]. If index equals 1 set [page:.y y] to [page:Float value]
	*/
	open fun setComponent(index: Int = definedExternally, value: Double = definedExternally) : dynamic


	/**
	* Sets this vector to the vector with the same direction as this one, but [page:.length length] [page:Float l].
	*/
	open fun setLength(l: Double = definedExternally) : Vector2


	/**
	* Sets the [page:.x x] and [page:.y y] values of this vector both equal to [page:Float scalar].
	*/
	open fun setScalar(scalar: Double = definedExternally) : Vector2


	/**
	* Replaces this vector's [page:.x x] value with [page:Float x].
	*/
	open fun setX(x: Double = definedExternally) : Vector2


	/**
	* Replaces this vector's [page:.y y] value with [page:Float y].
	*/
	open fun setY(y: Double = definedExternally) : Vector2


	/**
	* Subtracts [page:Vector2 v] from this vector.
	*/
	open fun sub(v: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* Subtracts [page:Float s] from this vector's [page:.x x] and [page:.y y] components.
	*/
	open fun subScalar(s: Double = definedExternally) : Vector2


	/**
	* Sets this vector to [page:Vector2 a] - [page:Vector2 b].
	*/
	open fun subVectors(a: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : Vector2


	/**
	* [page:Array array] - (optional) array to store the vector to. If this is not provided, a new array will be created. [page:Integer offset] - (optional) optional offset into the array. Returns an array [x, y], or copies x and y into the provided [page:Array array].
	*/
	open fun toArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Array<dynamic>
}