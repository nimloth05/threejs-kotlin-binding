//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* Class representing a 4D [link:https://en.wikipedia.org/wiki/Vector_space vector]. A 4D vector is an ordered quadruplet of numbers (labeled x, y, z, and w), which can be used to represent a number of things, such as:
	*/
open external class Vector4(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally){

	/**
	* Used to check whether this or derived classes are Vector4s. Default is **true**. You should not change this, as it is used internally for optimisation.
	*/
	open var isVector4: Boolean  = definedExternally

	open var x: Double  = definedExternally

	open var y: Double  = definedExternally

	open var z: Double  = definedExternally

	open var w: Double  = definedExternally


	/**
	* Adds [page:Vector4 v] to this vector.
	*/
	open fun add(v: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Vector4


	/**
	* Adds the scalar value s to this vector's [page:.x x], [page:.y y], [page:.z z] and [page:.w w] values.
	*/
	open fun addScalar(s: Double = definedExternally) : Vector4


	/**
	* Adds the multiple of [page:Vector4 v] and [page:Float s] to this vector.
	*/
	open fun addScaledVector(v: ch.viseon.threejs.declarations.math.Vector4 = definedExternally, s: Double = definedExternally) : Vector4


	/**
	* Sets this vector to [page:Vector4 a] + [page:Vector4 b].
	*/
	open fun addVectors(a: ch.viseon.threejs.declarations.math.Vector4 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Vector4


	/**
	* Multiplies this vector by 4 x 4 [page:Matrix4 m].
	*/
	open fun applyMatrix4(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Vector4


	/**
	* The [page:.x x], [page:.y y], [page:.z z] and [page:.w w] components of the vector are rounded up to the nearest integer value.
	*/
	open fun ceil() : Vector4


	/**
	* [page:Vector4 min] - the minimum [page:.x x], [page:.y y], [page:.z z] and [page:.w w] values. [page:Vector4 max] - the maximum [page:.x x], [page:.y y], [page:.z z] and [page:.w w] values in the desired range If this vector's x, y, z or w value is greater than the max vector's x, y, z or w value, it is replaced by the corresponding value. If this vector's x, y, z or w value is less than the min vector's x, y, z or w value, it is replaced by the corresponding value.
	*/
	open fun clamp(min: ch.viseon.threejs.declarations.math.Vector4 = definedExternally, max: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Vector4


	/**
	* [page:Float min] - the minimum value the length will be clamped to [page:Float max] - the maximum value the length will be clamped to If this vector's length is greater than the max value, it is replaced by the max value. If this vector's length is less than the min value, it is replaced by the min value.
	*/
	open fun clampLength(min: Double = definedExternally, max: Double = definedExternally) : Vector4


	/**
	* [page:Float min] - the minimum value the components will be clamped to [page:Float max] - the maximum value the components will be clamped to If this vector's x, y, z or w values are greater than the max value, they are replaced by the max value. If this vector's x, y, z or w values are less than the min value, they are replaced by the min value.
	*/
	open fun clampScalar(min: Double = definedExternally, max: Double = definedExternally) : Vector4


	/**
	* Returns a new Vector4 with the same [page:.x x], [page:.y y], [page:.z z] and [page:.w w] values as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Vector4


	/**
	* Copies the values of the passed Vector4's [page:.x x], [page:.y y], [page:.z z] and [page:.w w] properties to this Vector4.
	*/
	open fun copy(v: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Vector4


	/**
	* Divides this vector by scalar [page:Float s]. Sets vector to **( 0, 0, 0, 0 )** if **[page:Float s] = 0**.
	*/
	open fun divideScalar(s: Double = definedExternally) : Vector4


	/**
	* Calculates the [link:https://en.wikipedia.org/wiki/Dot_product dot product] of this vector and [page:Vector4 v].
	*/
	open fun dot(v: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Double


	/**
	* Checks for strict equality of this vector and [page:Vector4 v].
	*/
	open fun equals(v: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Boolean


	/**
	* The components of the vector are rounded down to the nearest integer value.
	*/
	open fun floor() : Vector4


	/**
	* [page:Array array] - the source array. [page:Integer offset] - (optional) offset into the array. Default is 0. Sets this vector's [page:.x x] value to be array[ offset + 0 ], [page:.y y] value to be array[ offset + 1 ] [page:.z z] value to be array[ offset + 2 ] and [page:.w w ] value to be array[ offset + 3 ].
	*/
	open fun fromArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Vector4


	/**
	* [page:BufferAttribute attribute] - the source attribute. [page:Integer index] - index in the attribute. Sets this vector's [page:.x x], [page:.y y], [page:.z z] and [page:.w w] values from the [page:BufferAttribute attribute].
	*/
	open fun fromBufferAttribute(attribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally, index: Int = definedExternally) : Vector4


	/**
	* [page:Integer index] - 0, 1, 2 or 3. If index equals 0 returns the [page:.x x] value. If index equals 1 returns the [page:.y y] value. If index equals 2 returns the [page:.z z] value. If index equals 3 returns the [page:.w w] value.
	*/
	open fun getComponent(index: Int = definedExternally) : Double


	/**
	* Computes the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean length] (straight-line length) from (0, 0, 0, 0) to (x, y, z, w).
	*/
	open fun length() : Double


	/**
	* Computes the [link:http://en.wikipedia.org/wiki/Taxicab_geometry Manhattan length] of this vector.
	*/
	open fun manhattanLength() : Double


	/**
	* Computes the square of the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean length] (straight-line length) from (0, 0, 0, 0) to (x, y, z, w). If you are comparing the lengths of vectors, you should compare the length squared instead as it is slightly more efficient to calculate.
	*/
	open fun lengthSq() : Double


	/**
	* [page:Vector4 v] - [page:Vector4] to interpolate towards. alpha - interpolation factor in the closed interval [0, 1]. Linearly interpolates between this vector and [page:Vector4 v], where alpha is the distance along the line - alpha = 0 will be this vector, and alpha = 1 will be [page:Vector4 v].
	*/
	open fun lerp(v: ch.viseon.threejs.declarations.math.Vector4 = definedExternally, alpha: Double = definedExternally) : Vector4


	/**
	* [page:Vector4 v1] - the starting [page:Vector4]. [page:Vector4 v2] - [page:Vector4] to interpolate towards. [page:Float alpha] - interpolation factor in the closed interval [0, 1]. Sets this vector to be the vector linearly interpolated between [page:Vector4 v1] and [page:Vector4 v2] where alpha is the distance along the line connecting the two vectors - alpha = 0 will be [page:Vector4 v1], and alpha = 1 will be [page:Vector4 v2].
	*/
	open fun lerpVectors(v1: ch.viseon.threejs.declarations.math.Vector4 = definedExternally, v2: ch.viseon.threejs.declarations.math.Vector4 = definedExternally, alpha: Double = definedExternally) : Vector4


	/**
	* Inverts this vector - i.e. sets x = -x, y = -y, z = -z and w = -w.
	*/
	open fun negate() : Vector4


	/**
	* Converts this vector to a [link:https://en.wikipedia.org/wiki/Unit_vector unit vector] - that is, sets it equal to the vector with the same direction as this one, but [page:.length length] 1.
	*/
	open fun normalize() : Vector4


	/**
	* If this vector's x, y, z or w value is less than [page:Vector4 v]'s x, y, z or w value, replace that value with the corresponding max value.
	*/
	open fun max(v: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Vector4


	/**
	* If this vector's x, y, z or w value is greater than [page:Vector4 v]'s x, y, z or w value, replace that value with the corresponding min value.
	*/
	open fun min(v: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Vector4


	/**
	* Multiplies this vector by scalar [page:Float s].
	*/
	open fun multiplyScalar(s: Double = definedExternally) : Vector4


	/**
	* The components of the vector are rounded to the nearest integer value.
	*/
	open fun round() : Vector4


	/**
	* The components of the vector are rounded towards zero (up if negative, down if positive) to an integer value.
	*/
	open fun roundToZero() : Vector4


	/**
	* Sets the [page:.x x], [page:.y y], [page:.z z] and [page:.w w] components of this vector.
	*/
	open fun set(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally) : Vector4


	/**
	* [page:Quaterion q] - a normalized [page:Quaterion] Sets the [page:.x x], [page:.y y] and [page:.z z] components of this vector to the quaternion's axis and [page:.w w] to the angle.
	*/
	open fun setAxisAngleFromQuaternion(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : Vector4


	/**
	* [page:Matrix4 m] - a [page:Matrix4] of which the upper left 3x3 matrix is a pure rotation matrix. Sets the [page:.x x], [page:.y y] and [page:.z z] to the axis of rotation and [page:.w w] to the angle.
	*/
	open fun setAxisAngleFromRotationMatrix(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Vector4


	/**
	* [page:Integer index] - 0, 1 or 2. [page:Float value] - [page:Float] If index equals 0 set [page:.x x] to [page:Float value]. If index equals 1 set [page:.y y] to [page:Float value]. If index equals 2 set [page:.z z] to [page:Float value]. If index equals 3 set [page:.w w] to [page:Float value].
	*/
	open fun setComponent(index: Int = definedExternally, value: Double = definedExternally) : dynamic


	/**
	* Sets this vector to the vector with the same direction as this one, but [page:.length length] [page:Float l].
	*/
	open fun setLength(l: Double = definedExternally) : Vector4


	/**
	* Sets the [page:.x x], [page:.y y], [page:.z z] and [page:.w w] values of this vector both equal to [page:Float scalar].
	*/
	open fun setScalar(scalar: Double = definedExternally) : Vector4


	/**
	* Replaces this vector's [page:.x x] value with [page:Float x].
	*/
	open fun setX(x: Double = definedExternally) : Vector4


	/**
	* Replaces this vector's [page:.y y] value with [page:Float y].
	*/
	open fun setY(y: Double = definedExternally) : Vector4


	/**
	* Replaces this vector's [page:.z z] value with [page:Float z].
	*/
	open fun setZ(z: Double = definedExternally) : Vector4


	/**
	* Replaces this vector's [page:.w w] value with [page:Float w].
	*/
	open fun setW(w: Double = definedExternally) : Vector4


	/**
	* Subtracts [page:Vector4 v] from this vector.
	*/
	open fun sub(v: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Vector4


	/**
	* Subtracts [page:Float s] from this vector's [page:.x x], [page:.y y], [page:.z z] and [page:.w w] compnents.
	*/
	open fun subScalar(s: Double = definedExternally) : Vector4


	/**
	* Sets this vector to [page:Vector4 a] - [page:Vector4 b].
	*/
	open fun subVectors(a: ch.viseon.threejs.declarations.math.Vector4 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : Vector4


	/**
	* [page:Array array] - (optional) array to store the vector to. If this is not provided, a new array will be created. [page:Integer offset] - (optional) optional offset into the array. Returns an array [x, y, z, w], or copies x, y, z and w into the provided [page:Array array].
	*/
	open fun toArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Array<dynamic>
}