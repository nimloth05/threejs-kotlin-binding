@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* Implementation of a [link:http://en.wikipedia.org/wiki/Quaternion quaternion]. This is used for [link:https://en.wikipedia.org/wiki/Quaternions_and_spatial_rotation rotating things] without encountering the dreaded [link:http://en.wikipedia.org/wiki/Gimbal_lock gimbal lock] issue, amongst other advantages.
	*/
open external class Quaternion(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally){

	/**
	* Used to check whether this or derived classes are Quaternions. Default is **true**. You should not change this, as it is used internally for optimisation.
	*/
	open var isQuaternion: Boolean  = definedExternally


	/**
	* Changing this property will result in [page:.onChangeCallback onChangeCallback] being called.
	*/
	open var x: Double  = definedExternally


	/**
	* Changing this property will result in [page:.onChangeCallback onChangeCallback] being called.
	*/
	open var y: Double  = definedExternally


	/**
	* Changing this property will result in [page:.onChangeCallback onChangeCallback] being called.
	*/
	open var z: Double  = definedExternally


	/**
	* Changing this property will result in [page:.onChangeCallback onChangeCallback] being called.
	*/
	open var w: Double  = definedExternally


	/**
	* Returns the angle between this quaternion and quaternion [page:Quaternion q] in radians.
	*/
	open fun angleTo(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : Double


	/**
	* Creates a new Quaternion with identical [page:.x x], [page:.y y], [page:.z z] and [page:.w w] properties to this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Returns the rotational conjugate of this quaternion. The conjugate of a quaternion represents the same rotation in the opposite direction about the rotational axis.
	*/
	open fun conjugate() : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Copies the [page:.x x], [page:.y y], [page:.z z] and [page:.w w] properties of [page:Quaternion q] into this quaternion.
	*/
	open fun copy(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* [page:Quaternion v] - Quaternion that this quaternion will be compared to. Compares the [page:.x x], [page:.y y], [page:.z z] and [page:.w w] properties of [page:Quaternion v] to the equivalent properties of this quaternion to determine if they represent the same rotation.
	*/
	open fun equals(v: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : Boolean


	/**
	* Calculates the [link:https://en.wikipedia.org/wiki/Dot_product dot product] of quaternions [page:Quaternion v] and this one.
	*/
	open fun dot(v: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : Double


	/**
	* [page:Array array] - array of format (x, y, z, w) used to construct the quaternion. [page:Integer offset] - (optional) an offset into the array. Sets this quaternion's [page:.x x], [page:.y y], [page:.z z] and [page:.w w] properties from an array.
	*/
	open fun fromArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Inverts this quaternion - calculate the [page:.conjugate conjugate] and then [page:.normalize normalizes] the result.
	*/
	open fun inverse() : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Computes the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean length] (straight-line length) of this quaternion, considered as a 4 dimensional vector.
	*/
	open fun length() : Double


	/**
	* Computes the [link:https://en.wikipedia.org/wiki/Euclidean_distance Euclidean length] (straight-line length) of this quaternion, considered as a 4 dimensional vector. This can be useful if you are comparing the lengths of two quaternions, as this is a slightly more efficient calculation than [page:.length length]().
	*/
	open fun lengthSq() : Double


	/**
	* [link:https://en.wikipedia.org/wiki/Normalized_vector Normalizes] this quaternion - that is, calculated the quaternion that performs the same rotation as this one, but has [page:.length length] equal to **1**.
	*/
	open fun normalize() : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Multiplies this quaternion by [page:Quaternion q].
	*/
	open fun multiply(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Sets this quaternion to [page:Quaternion a] x [page:Quaternion b]. Adapted from the method outlined [link:http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/code/index.htm here].
	*/
	open fun multiplyQuaternions(a: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, b: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Sets the [page:.onChangeCallback onChangeCallback]() method.
	*/
	open fun onChange(onChangeCallback: dynamic = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* This function is called whenever any of the following occurs:
	*/
	open fun onChangeCallback() : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Pre-multiplies this quaternion by [page:Quaternion q].
	*/
	open fun premultiply(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* [page:Quaternion q] - The target quaternion. [page:float step] - The angular step in radians. Rotates this quaternion by a given angular step to the defined quaternion **q**. The method ensures that the final quaternion will not overshoot **q**.
	*/
	open fun rotateTowards(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, step: Double = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* [page:Quaternion qb] - The other quaternion rotation [page:float t] - interpolation factor in the closed interval [0, 1]. Handles the spherical linear interpolation between quaternions. [page:float t] represents the amount of rotation between this quaternion (where [page:float t] is 0) and [page:Quaternion qb] (where [page:float t] is 1). This quaternion is set to the result. Also see the static version of the **slerp** below. // rotate a mesh towards a target quaternion mesh.quaternion.slerp( endQuaternion, 0.01 );
	*/
	open fun slerp(qb: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, t: Double = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Sets [page:.x x], [page:.y y], [page:.z z], [page:.w w] properties of this quaternion.
	*/
	open fun set(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Sets this quaternion from rotation specified by [page:Vector3 axis] and [page:Float angle]. Adapted from the method [link:http://www.euclideanspace.com/maths/geometry/rotations/conversions/angleToQuaternion/index.htm here]. **Axis** is assumed to be normalized, **angle** is in radians.
	*/
	open fun setFromAxisAngle(axis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, angle: Double = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Sets this quaternion from the rotation specified by [page:Euler] angle.
	*/
	open fun setFromEuler(euler: ch.viseon.threejs.declarations.math.Euler = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Sets this quaternion from rotation component of [page:Matrix4 m]. Adapted from the method [link:http://www.euclideanspace.com/maths/geometry/rotations/conversions/matrixToQuaternion/index.htm here].
	*/
	open fun setFromRotationMatrix(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* Sets this quaternion to the rotation required to rotate direction vector [page:Vector3 vFrom] to direction vector [page:Vector3 vTo]. Adapted from the method [link:http://lolengine.net/blog/2013/09/18/beautiful-maths-quaternion-from-vectors here]. [page:Vector3 vFrom] and [page:Vector3 vTo] are assumed to be normalized.
	*/
	open fun setFromUnitVectors(vFrom: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, vTo: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* [page:Array array] - An optional array to store the quaternion. If not specified, a new array will be created. [page:Integer offset] - (optional) if specified, the result will be copied into this [page:Array]. Returns the numerical elements of this quaternion in an array of format [x, y, z, w].
	*/
	open fun toArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Array<dynamic>
	companion object {

	/**
	* [page:Quaternion qStart] - The starting quaternion (where [page:Float t] is 0) [page:Quaternion qEnd] - The ending quaternion (where [page:Float t] is 1) [page:Quaternion qTarget] - The target quaternion that gets set with the result [page:float t] - interpolation factor in the closed interval [0, 1]. Unlike the normal method, the static version of slerp sets a target quaternion to the result of the slerp operation. // Code setup var startQuaternion = new THREE.Quaternion().set( 0, 0, 0, 1 ).normalize(); var endQuaternion = new THREE.Quaternion().set( 1, 1, 1, 1 ).normalize(); var t = 0; // Update a mesh's rotation in the loop t = ( t + 0.01 ) % 1; // constant angular momentum THREE.Quaternion.slerp( startQuaternion, endQuaternion, mesh.quaternion, t );
	*/
	open fun slerp(qStart: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, qEnd: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, qTarget: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, t: Double = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* [page:Array dst] - The output array. [page:Integer dstOffset] - An offset into the output array. [page:Array src0] - The source array of the starting quaternion. [page:Integer srcOffset0] - An offset into the array **src0**. [page:Array src1] - The source array of the target quatnerion. [page:Integer srcOffset1] - An offset into the array **src1**. [page:float t] - Normalized interpolation factor (between 0 and 1).
Like the static **slerp** method above, but operates directly on flat arrays of numbers.
	*/
	open fun slerpFlat(dst: Array<dynamic> = definedExternally, dstOffset: Int = definedExternally, src0: Array<dynamic> = definedExternally, srcOffset0: Int = definedExternally, src1: Array<dynamic> = definedExternally, srcOffset1: Int = definedExternally, t: Double = definedExternally) : dynamic
	
}
}