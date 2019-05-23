//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* Class representing a 3D [link:https://en.wikipedia.org/wiki/Vector_space vector]. A 3D vector is an ordered triplet of numbers (labeled x, y, and z), which can be used to represent a number of things, such as:
	*/
open external class Vector3(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally){

	/**
	* Used to check whether this or derived classes are Vector3s. Default is **true**. You should not change this, as it is used internally for optimisation.
	*/
	open var isVector3: Boolean  = definedExternally

	open var x: Double  = definedExternally

	open var y: Double  = definedExternally

	open var z: Double  = definedExternally


	/**
	* Adds [page:Vector3 v] to this vector.
	*/
	open fun add(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* Adds the scalar value s to this vector's [page:.x x], [page:.y y] and [page:.z z] values.
	*/
	open fun addScalar(s: Double = definedExternally) : Vector3


	/**
	* Adds the multiple of [page:Vector3 v] and [page:Float s] to this vector.
	*/
	open fun addScaledVector(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, s: Double = definedExternally) : Vector3


	/**
	* Sets this vector to [page:Vector3 a] + [page:Vector3 b].
	*/
	open fun addVectors(a: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* [page:Vector3 axis] - A normalized [page:Vector3]. [page:Float angle] - An angle in radians. Applies a rotation specified by an axis and an angle to this vector.
	*/
	open fun applyAxisAngle(axis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, angle: Double = definedExternally) : Vector3


	/**
	* Applies euler transform to this vector by converting the [page:Euler] object to a [page:Quaternion] and applying.
	*/
	open fun applyEuler(euler: ch.viseon.threejs.declarations.math.Euler = definedExternally) : Vector3


	/**
	* Multiplies this vector by [page:Matrix3 m]
	*/
	open fun applyMatrix3(m: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : Vector3


	/**
	* Multiplies this vector (with an implicit 1 in the 4th dimension) and m, and divides by perspective.
	*/
	open fun applyMatrix4(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Vector3


	/**
	* Applies a [page:Quaternion] transform to this vector.
	*/
	open fun applyQuaternion(quaternion: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : Vector3


	/**
	* Returns the angle between this vector and vector [page:Vector3 v] in radians.
	*/
	open fun angleTo(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* The [page:.x x], [page:.y y] and [page:.z z] components of the vector are rounded up to the nearest integer value.
	*/
	open fun ceil() : Vector3


	/**
	* [page:Vector3 min] - the minimum [page:.x x], [page:.y y] and [page:.z z] values. [page:Vector3 max] - the maximum [page:.x x], [page:.y y] and [page:.z z] values in the desired range If this vector's x, y or z value is greater than the max vector's x, y or z value, it is replaced by the corresponding value. If this vector's x, y or z value is less than the min vector's x, y or z value, it is replaced by the corresponding value.
	*/
	open fun clamp(min: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, max: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* [page:Float min] - the minimum value the length will be clamped to [page:Float max] - the maximum value the length will be clamped to If this vector's length is greater than the max value, it is replaced by the max value. If this vector's length is less than the min value, it is replaced by the min value.
	*/
	open fun clampLength(min: Double = definedExternally, max: Double = definedExternally) : Vector3


	/**
	* [page:Float min] - the minimum value the components will be clamped to [page:Float max] - the maximum value the components will be clamped to If this vector's x, y or z values are greater than the max value, they are replaced by the max value. If this vector's x, y or z values are less than the min value, they are replaced by the min value.
	*/
	open fun clampScalar(min: Double = definedExternally, max: Double = definedExternally) : Vector3


	/**
	* Returns a new vector3 with the same [page:.x x], [page:.y y] and [page:.z z] values as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Vector3


	/**
	* Copies the values of the passed vector3's [page:.x x], [page:.y y] and [page:.z z] properties to this vector3.
	*/
	open fun copy(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* Sets this vector to [link:https://en.wikipedia.org/wiki/Cross_product cross product] of itself and [page:Vector3 v].
	*/
	open fun cross(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* Sets this vector to [link:https://en.wikipedia.org/wiki/Cross_product cross product] of [page:Vector3 a] and [page:Vector3 b].
	*/
	open fun crossVectors(a: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* Computes the distance from this vector to [page:Vector3 v].
	*/
	open fun distanceTo(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* Computes the [link:https://en.wikipedia.org/wiki/Taxicab_geometry Manhattan distance] from this vector to [page:Vector3 v].
	*/
	open fun manhattanDistanceTo(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* Computes the squared distance from this vector to [page:Vector3 v]. If you are just comparing the distance with another distance, you should compare the distance squared instead as it is slightly more efficient to calculate.
	*/
	open fun distanceToSquared(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* Divides this vector by [page:Vector3 v].
	*/
	open fun divide(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* Divides this vector by scalar [page:Float s]. Sets vector to **( 0, 0, 0 )** if **[page:Float s] = 0**.
	*/
	open fun divideScalar(s: Double = definedExternally) : Vector3


	/**
	* Calculate the [link:https://en.wikipedia.org/wiki/Dot_product dot product] of this vector and [page:Vector3 v].
	*/
	open fun dot(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Double


	/**
	* Checks for strict equality of this vector and [page:Vector3 v].
	*/
	open fun equals(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Boolean


	/**
	* The components of the vector are rounded down to the nearest integer value.
	*/
	open fun floor() : Vector3


	/**
	* [page:Array array] - the source array. [page:Integer offset] - ( optional) offset into the array. Default is 0. Sets this vector's [page:.x x] value to be array[ offset + 0 ], [page:.y y] value to be array[ offset + 1 ] and [page:.z z] value to be array[ offset + 2 ].
	*/
	open fun fromArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Vector3


	/**
	* [page:BufferAttribute attribute] - the source attribute. [page:Integer index] - index in the attribute. Sets this vector's [page:.x x], [page:.y y] and [page:.z z] values from the [page:BufferAttribute attribute].
	*/
	open fun fromBufferAttribute(attribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally, index: Int = definedExternally) : Vector3


	/**
	* [page:Integer index] - 0, 1 or 2. If index equals 0 returns the [page:.x x] value. If index equals 1 returns the [page:.y y] value. If index equals 2 returns the [page:.z z] value.
	*/
	open fun getComponent(index: Int = definedExternally) : Double


	/**
	* Computes the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean length] (straight-line length) from (0, 0, 0) to (x, y, z).
	*/
	open fun length() : Double


	/**
	* Computes the [link:http://en.wikipedia.org/wiki/Taxicab_geometry Manhattan length] of this vector.
	*/
	open fun manhattanLength() : Double


	/**
	* Computes the square of the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean length] (straight-line length) from (0, 0, 0) to (x, y, z). If you are comparing the lengths of vectors, you should compare the length squared instead as it is slightly more efficient to calculate.
	*/
	open fun lengthSq() : Double


	/**
	* [page:Vector3 v] - [page:Vector3] to interpolate towards. alpha - interpolation factor in the closed interval [0, 1]. Linearly interpolate between this vector and [page:Vector3 v], where alpha is the distance along the line - alpha = 0 will be this vector, and alpha = 1 will be [page:Vector3 v].
	*/
	open fun lerp(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, alpha: Double = definedExternally) : Vector3


	/**
	* [page:Vector3 v1] - the starting [page:Vector3]. [page:Vector3 v2] - [page:Vector3] to interpolate towards. [page:Float alpha] - interpolation factor in the closed interval [0, 1]. Sets this vector to be the vector linearly interpolated between [page:Vector3 v1] and [page:Vector3 v2] where alpha is the distance along the line connecting the two vectors - alpha = 0 will be [page:Vector3 v1], and alpha = 1 will be [page:Vector3 v2].
	*/
	open fun lerpVectors(v1: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, v2: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, alpha: Double = definedExternally) : Vector3


	/**
	* If this vector's x, y or z value is less than [page:Vector3 v]'s x, y or z value, replace that value with the corresponding max value.
	*/
	open fun max(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* If this vector's x, y or z value is greater than [page:Vector3 v]'s x, y or z value, replace that value with the corresponding min value.
	*/
	open fun min(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* Multiplies this vector by [page:Vector3 v].
	*/
	open fun multiply(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* Multiplies this vector by scalar [page:Float s].
	*/
	open fun multiplyScalar(s: Double = definedExternally) : Vector3


	/**
	* Sets this vector equal to [page:Vector3 a] ** [page:Vector3 b], component-wise.
	*/
	open fun multiplyVectors(a: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* Inverts this vector - i.e. sets x = -x, y = -y and z = -z.
	*/
	open fun negate() : Vector3


	/**
	* Convert this vector to a [link:https://en.wikipedia.org/wiki/Unit_vector unit vector] - that is, sets it equal to the vector with the same direction as this one, but [page:.length length] 1.
	*/
	open fun normalize() : Vector3


	/**
	* [page:Camera camera] — camera to use in the projection. [link:https://en.wikipedia.org/wiki/Vector_projection Projects] the vector with the camera.
	*/
	open fun project(camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally) : Vector3


	/**
	* [page:Vector3 planeNormal] - A vector representing a plane normal. [link:https://en.wikipedia.org/wiki/Vector_projection Projects] this vector onto a plane by subtracting this vector projected onto the plane's normal from this vector.
	*/
	open fun projectOnPlane(planeNormal: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* [link:https://en.wikipedia.org/wiki/Vector_projection Projects] this vector onto another vector.
	*/
	open fun projectOnVector(Vector3: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* [page:Vector3 normal] - the normal to the reflecting plane Reflect the vector off of plane orthogonal to [page:Vector3 normal]. Normal is assumed to have unit length.
	*/
	open fun reflect(normal: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* The components of the vector are rounded to the nearest integer value.
	*/
	open fun round() : Vector3


	/**
	* The components of the vector are rounded towards zero (up if negative, down if positive) to an integer value.
	*/
	open fun roundToZero() : Vector3


	/**
	* Sets the [page:.x x], [page:.y y] and [page:.z z] components of this vector.
	*/
	open fun set(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : Vector3


	/**
	* [page:Integer index] - 0, 1 or 2. [page:Float value] - [page:Float] If index equals 0 set [page:.x x] to [page:Float value]. If index equals 1 set [page:.y y] to [page:Float value]. If index equals 2 set [page:.z z] to [page:Float value]
	*/
	open fun setComponent(index: Int = definedExternally, value: Double = definedExternally) : dynamic


	/**
	* Sets this vector from the cylindrical coordinates [page:Cylindrical c].
	*/
	open fun setFromCylindrical(c: ch.viseon.threejs.declarations.math.Cylindrical = definedExternally) : Vector3


	/**
	* Sets this vector from the cylindrical coordinates [page:Cylindrical radius], [page:Cylindrical theta] and [page:Cylindrical y].
	*/
	open fun setFromCylindricalCoords(radius: Double = definedExternally, theta: Double = definedExternally, y: Double = definedExternally) : Vector3


	/**
	* Sets this vector's [page:.x x], [page:.y y] and [page:.z z] equal to the column of the [page:Matrix4 matrix] specified by the [page:Integer index].
	*/
	open fun setFromMatrixColumn(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally, index: Int = definedExternally) : Vector3


	/**
	* Sets this vector to the position elements of the [link:https://en.wikipedia.org/wiki/Transformation_matrix transformation matrix] [page:Matrix4 m].
	*/
	open fun setFromMatrixPosition(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Vector3


	/**
	* Sets this vector to the scale elements of the [link:https://en.wikipedia.org/wiki/Transformation_matrix transformation matrix] [page:Matrix4 m].
	*/
	open fun setFromMatrixScale(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Vector3


	/**
	* Sets this vector from the spherical coordinates [page:Spherical s].
	*/
	open fun setFromSpherical(s: ch.viseon.threejs.declarations.math.Spherical = definedExternally) : Vector3


	/**
	* Sets this vector from the spherical coordinates [page:Spherical radius], [page:Spherical phi] and [page:Spherical theta].
	*/
	open fun setFromSphericalCoords(radius: Double = definedExternally, phi: Double = definedExternally, theta: Double = definedExternally) : Vector3


	/**
	* Set this vector to the vector with the same direction as this one, but [page:.length length] [page:Float l].
	*/
	open fun setLength(l: Double = definedExternally) : Vector3


	/**
	* Set the [page:.x x], [page:.y y] and [page:.z z] values of this vector both equal to [page:Float scalar].
	*/
	open fun setScalar(scalar: Double = definedExternally) : Vector3


	/**
	* Replace this vector's [page:.x x] value with [page:Float x].
	*/
	open fun setX(x: Double = definedExternally) : Vector3


	/**
	* Replace this vector's [page:.y y] value with [page:Float y].
	*/
	open fun setY(y: Double = definedExternally) : Vector3


	/**
	* Replace this vector's [page:.z z] value with [page:Float z].
	*/
	open fun setZ(z: Double = definedExternally) : Vector3


	/**
	* Subtracts [page:Vector3 v] from this vector.
	*/
	open fun sub(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* Subtracts [page:Float s] from this vector's [page:.x x], [page:.y y] and [page:.z z] compnents.
	*/
	open fun subScalar(s: Double = definedExternally) : Vector3


	/**
	* Sets this vector to [page:Vector3 a] - [page:Vector3 b].
	*/
	open fun subVectors(a: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, b: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Vector3


	/**
	* [page:Array array] - (optional) array to store the vector to. If this is not provided a new array will be created. [page:Integer offset] - (optional) optional offset into the array. Returns an array [x, y, z], or copies x, y and z into the provided [page:Array array].
	*/
	open fun toArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Array<dynamic>


	/**
	* Transforms the direction of this vector by a matrix (the upper left 3 x 3 subset of a [page:Matrix4 m]) and then [page:.normalize normalizes] the result.
	*/
	open fun transformDirection(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Vector3


	/**
	* [page:Camera camera] — camera to use in the projection. [link:https://en.wikipedia.org/wiki/Vector_projection Unprojects] the vector with the camera's projection matrix.
	*/
	open fun unproject(camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally) : Vector3
}