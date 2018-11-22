//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A class representing [link:http://en.wikipedia.org/wiki/Euler_angles Euler Angles]. Euler angles describe a rotational transformation by rotating an object on its various axes in specified amounts per axis, and a specified axis order.
	*/
open external class Euler(x: Float = definedExternally, y: Float = definedExternally, z: Float = definedExternally, order: String = definedExternally){

	/**
	* Used to check whether this or derived classes are Eulers. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isEuler: Boolean  = definedExternally


	/**
	* The order in which to apply rotations. Default is 'XYZ', which means that the object will first be rotated around its X axis, then its Y axis and finally its Z axis. Other possibilities are: 'YZX', 'ZXY', 'XZY', 'YXZ' and 'ZYX'. These must be in upper case. Three.js uses intrinsic Tait-Bryan angles. This means that rotations are performed with respect to the local coordinate system. That is, for order 'XYZ', the rotation is first around the local-X axis (which is the same as the world-X axis), then around local-Y (which may now be different from the world Y-axis), then local-Z (which may be different from the world Z-axis). If the order is changed, [page:.onChangeCallback onChangeCallback] will be called.
	*/
	open var order: String  = definedExternally


	/**
	* The current value of the x component. If this is changed, [page:.onChangeCallback onChangeCallback] will be called.
	*/
	open var x: Float  = definedExternally


	/**
	* The current value of the y component. If this is changed, [page:.onChangeCallback onChangeCallback] will be called.
	*/
	open var y: Float  = definedExternally


	/**
	* The current value of the z component. If this is changed, [page:.onChangeCallback onChangeCallback] will be called.
	*/
	open var z: Float  = definedExternally


	/**
	* Copies value of [page:Euler euler] to this euler.
	*/
	open fun copy(euler: ch.viseon.threejs.declarations.math.Euler = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* Returns a new Euler with the same parameters as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Euler


	/**
	* Checks for strict equality of this euler and [page:Euler euler].
	*/
	open fun equals(euler: ch.viseon.threejs.declarations.math.Euler = definedExternally) : Boolean


	/**
	* [page:Array array] of length 3 or 4. The optional 4th argument corresponds to the [page:.order order]. Assigns this euler's [page:.x x] angle to array[0]. Assigns this euler's [page:.y y] angle to array[1]. Assigns this euler's [page:.z z] angle to array[2]. Optionally assigns this euler's [page:.order order] to array[3].
	*/
	open fun fromArray(array: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:Function onChangeCallback] - set the value of the onChangeCallback() function.
	*/
	open fun onChange(onChangeCallback: dynamic/*Function*/ = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* By default this is an empty function, however it can be set via [page:.onChange onChange](). It gets called after changing the [page:.x x], [page:.y y], [page:.z z] or [page:.order order] properties, and also after calling most setter functions (see those for details).
	*/
	open fun onChangeCallback() : ch.viseon.threejs.declarations.math.Euler


	/**
	* Resets the euler angle with a new order by creating a quaternion from this euler angle and then setting this euler angle with the quaternion and the new order. WARNING: this discards revolution information.
	*/
	open fun reorder(newOrder: String = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:.x x] - the angle of the x axis in radians. [page:.y y] - the angle of the y axis in radians. [page:.z z] - the angle of the z axis in radians. [page:.order order] - (optional) a string representing the order that the rotations are applied. Sets the angles of this euler transform and optionally the [page:.order order] and then call [page:.onChangeCallback onChangeCallback]().
	*/
	open fun set(x: Float = definedExternally, y: Float = definedExternally, z: Float = definedExternally, order: String = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:Matrix4 m] - a [page:Matrix4] of which the upper 3x3 of matrix is a pure [link:https://en.wikipedia.org/wiki/Rotation_matrix rotation matrix] (i.e. unscaled). [page:.order order] - (optional) a string representing the order that the rotations are applied. [page:Boolean update] - (optional) whether to call [page:.onChangeCallback onChangeCallback]() after applying the matrix. Sets the angles of this euler transform from a pure rotation matrix based on the orientation specified by order.
	*/
	open fun setFromRotationMatrix(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally, order: String = definedExternally, update: Boolean = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:Quaternion q] - a normalized quaternion. [page:.order order] - (optional) a string representing the order that the rotations are applied. [page:Boolean update] - (optional) whether to call [page:.onChangeCallback onChangeCallback]() after applying the matrix. Sets the angles of this euler transform from a normalized quaternion based on the orientation specified by [page:.order order].
	*/
	open fun setFromQuaternion(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, order: String = definedExternally, update: Boolean = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:Vector3 vector] - [page:Vector3]. [page:.order order] - (optional) a string representing the order that the rotations are applied. Set the [page:.x x], [page:.y y] and [page:.z z], and optionally update the [page:.order order]. [page:.onChangeCallback onChangeCallback]() is called after these changes are made.
	*/
	open fun setFromVector3(vector: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, order: String = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:Array array] - (optional) array to store the euler in. [page:Integer offset] (optional) offset in the array. Returns an array of the form [[page:.x x], [page:.y y], [page:.z z], [page:.order order ]].
	*/
	open fun toArray(array: Array<dynamic>/*Array*/ = definedExternally, offset: Int = definedExternally) : Array<dynamic>/*Array*/


	/**
	* [page:Vector3 optionalResult] — (optional) If specified, the result will be copied into this Vector, otherwise a new one will be created. Returns the Euler's [page:.x x], [page:.y y] and [page:.z z] properties as a [page:Vector3].
	*/
	open fun toVector3(optionalResult: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3
}