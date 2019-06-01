@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A class representing a 4x4 [link:https://en.wikipedia.org/wiki/Matrix_(mathematics) matrix]. The most common use of a 4x4 matrix in 3D computer graphics is as a [link:https://en.wikipedia.org/wiki/Transformation_matrix Transformation Matrix]. For an introduction to transformation matrices as used in WebGL, check out [link:http://www.opengl-tutorial.org/beginners-tutorials/tutorial-3-matrices this tutorial]. This allows a [page:Vector3] representing a point in 3D space to undergo transformations such as translation, rotation, shear, scale, reflection, orthogonal or perspective projection and so on, by being multiplied by the matrix. This is known as applying the matrix to the vector. Every [page:Object3D] has three associated Matrix4s:
	*/
open external class Matrix4(){

	/**
	* A [link:https://en.wikipedia.org/wiki/Row-_and_column-major_order#Column-major_order column-major] list of matrix values.
	*/
	open var elements: Array<dynamic>  = definedExternally


	/**
	* Used to check whether this or derived classes are Matrix4s. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMatrix4: Boolean  = definedExternally


	/**
	* [page:BufferAttribute attribute] - An attribute of floats that represent 3D vectors. Multiplies (applies) this matrix to every 3D vector in the [page:BufferAttribute attribute].
	*/
	open fun applyToBufferAttribute(attribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally) : Array<dynamic>


	/**
	* Creates a new Matrix4 with identical [page:.elements elements] to this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Matrix4


	/**
	* Sets this matrix to the transformation composed of [page:Vector3 position], [page:Quaternion quaternion] and [page:Vector3 scale]. Internally this calls [page:.makeRotationFromQuaternion makeRotationFromQuaternion]( [page:Quaternion quaternion] ) followed by [page:.scale scale]( [page:Vector3 scale] ), then finally [page:.setPosition setPosition]( [page:Vector3 position] ).
	*/
	open fun compose(position: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, quaternion: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, scale: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Matrix4


	/**
	* Copies the [page:.elements elements] of matrix [page:Matrix4 m] into this matrix.
	*/
	open fun copy(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Matrix4


	/**
	* Copies the translation component of the supplied matrix [page:Matrix4 m] into this matrix's translation component.
	*/
	open fun copyPosition(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Matrix4


	/**
	* Decomposes this matrix into it's [page:Vector3 position], [page:Quaternion quaternion] and [page:Vector3 scale] components.
	*/
	open fun decompose(position: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, quaternion: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, scale: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : dynamic


	/**
	* Computes and returns the [link:https://en.wikipedia.org/wiki/Determinant determinant] of this matrix. Based on the method outlined [link:http://www.euclideanspace.com/maths/algebra/matrix/functions/inverse/fourD/index.htm here].
	*/
	open fun determinant() : Double


	/**
	* Return true if this matrix and [page:Matrix4 m] are equal.
	*/
	open fun equals(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Boolean


	/**
	* Extracts the [link:https://en.wikipedia.org/wiki/Basis_(linear_algebra) basis] of this matrix into the three axis vectors provided. If this matrix is: a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p then the [page:Vector3 xAxis], [page:Vector3 yAxis], [page:Vector3 zAxis] will be set to: xAxis = (a, e, i) yAxis = (b, f, j) zAxis = (c, g, k)
	*/
	open fun extractBasis(xAxis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, yAxis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, zAxis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Matrix4


	/**
	* Extracts the rotation component of the supplied matrix [page:Matrix4 m] into this matrix's rotation component.
	*/
	open fun extractRotation(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Matrix4


	/**
	* [page:Array array] - the array to read the elements from. [page:Integer offset] - ( optional ) offset into the array. Default is 0. Sets the elements of this matrix based on an [page:Array array] in [link:https://en.wikipedia.org/wiki/Row-_and_column-major_order#Column-major_order column-major] format.
	*/
	open fun fromArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Matrix4


	/**
	* [page:Matrix4 m] - the matrix to take the inverse of. [page:Boolean throwOnDegenerate] - (optional) If true, throw an error if the matrix is degenerate (not invertible). Set this matrix to the [link:https://en.wikipedia.org/wiki/Invertible_matrix inverse] of the passed matrix [page:Matrix4 m], using the method outlined [link:http://www.euclideanspace.com/maths/algebra/matrix/functions/inverse/fourD/index.htm here]. If [page:Boolean throwOnDegenerate] is not set and the matrix is not invertible, set this to the 4x4 identity matrix.
	*/
	open fun getInverse(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally, throwOnDegenerate: Boolean = definedExternally) : Matrix4


	/**
	* Gets the maximum scale value of the 3 axes.
	*/
	open fun getMaxScaleOnAxis() : Double


	/**
	* Resets this matrix to the [link:https://en.wikipedia.org/wiki/Identity_matrix identity matrix].
	*/
	open fun identity() : Matrix4


	/**
	* Constructs a rotation matrix, looking from [page:Vector3 eye] towards [page:Vector3 center] oriented by the [page:Vector3 up] vector.
	*/
	open fun lookAt(eye: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, center: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, up: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Matrix4


	/**
	* [page:Vector3 axis] — Rotation axis, should be normalized. [page:Float theta] — Rotation angle in radians. Sets this matrix as rotation transform around [page:Vector3 axis] by [page:Float theta] radians. This is a somewhat controversial but mathematically sound alternative to rotating via [page:Quaternions]. See the discussion [link:http://www.gamedev.net/reference/articles/article1199.asp here].
	*/
	open fun makeRotationAxis(axis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, theta: Double = definedExternally) : Matrix4


	/**
	* Set this to the [link:https://en.wikipedia.org/wiki/Basis_(linear_algebra) basis] matrix consisting of the three provided basis vectors: xAxis.x, yAxis.x, zAxis.x, 0, xAxis.y, yAxis.y, zAxis.y, 0, xAxis.z, yAxis.z, zAxis.z, 0, 0, 0, 0, 1
	*/
	open fun makeBasis(xAxis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, yAxis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, zAxis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Matrix4


	/**
	* Creates a [link:https://en.wikipedia.org/wiki/3D_projection#Perspective_projection perspective projection] matrix. This is used internally by [page:PerspectiveCamera.updateProjectionMatrix]()
	*/
	open fun makePerspective(left: Double = definedExternally, right: Double = definedExternally, top: Double = definedExternally, bottom: Double = definedExternally, near: Double = definedExternally, far: Double = definedExternally) : Matrix4


	/**
	* Creates an [link:https://en.wikipedia.org/wiki/Orthographic_projection orthographic projection] matrix. This is used internally by [page:OrthographicCamera.updateProjectionMatrix]().
	*/
	open fun makeOrthographic(left: Double = definedExternally, right: Double = definedExternally, top: Double = definedExternally, bottom: Double = definedExternally, near: Double = definedExternally, far: Double = definedExternally) : Matrix4


	/**
	* Sets the rotation component (the upper left 3x3 matrix) of this matrix to the rotation specified by the given [page:Euler Euler Angle]. The rest of the matrix is set to the identity. Depending on the [page:Euler.order order] of the [page:Euler euler], there are six possible outcomes. See [link:https://en.wikipedia.org/wiki/Euler_angles#Rotation_matrix this page] for a complete list.
	*/
	open fun makeRotationFromEuler(euler: ch.viseon.threejs.declarations.math.Euler = definedExternally) : Matrix4


	/**
	* Sets the rotation component of this matrix to the rotation specified by [page:Quaternion q], as outlined [link:https://en.wikipedia.org/wiki/Rotation_matrix#Quaternion here]. The rest of the matrix is set to the identity. So, given [page:Quaternion q] = w + xi + yj + zk, the resulting matrix will be: 1-2y²-2z² 2xy-2zw 2xz+2yw 0 2xy+2zw 1-2x²-2z² 2yz-2xw 0 2xz-2yw 2yz+2xw 1-2x²-2y² 0 0 0 0 1
	*/
	open fun makeRotationFromQuaternion(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : Matrix4


	/**
	* [page:Float theta] — Rotation angle in radians. Sets this matrix as a rotational transformation around the X axis by [page:Float theta] (θ) radians. The resulting matrix will be: 1 0 0 0 0 cos(θ) -sin(θ) 0 0 sin(θ) cos(θ) 0 0 0 0 1
	*/
	open fun makeRotationX(theta: Double = definedExternally) : Matrix4


	/**
	* [page:Float theta] — Rotation angle in radians. Sets this matrix as a rotational transformation around the Y axis by [page:Float theta] (θ) radians. The resulting matrix will be: cos(θ) 0 sin(θ) 0 0 1 0 0 -sin(θ) 0 cos(θ) 0 0 0 0 1
	*/
	open fun makeRotationY(theta: Double = definedExternally) : Matrix4


	/**
	* [page:Float theta] — Rotation angle in radians. Sets this matrix as a rotational transformation around the Z axis by [page:Float theta] (θ) radians. The resulting matrix will be: cos(θ) -sin(θ) 0 0 sin(θ) cos(θ) 0 0 0 0 1 0 0 0 0 1
	*/
	open fun makeRotationZ(theta: Double = definedExternally) : Matrix4


	/**
	* [page:Float x] - the amount to scale in the X axis. [page:Float y] - the amount to scale in the Y axis. [page:Float z] - the amount to scale in the Z axis. Sets this matrix as scale transform: x, 0, 0, 0, 0, y, 0, 0, 0, 0, z, 0, 0, 0, 0, 1
	*/
	open fun makeScale(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : Matrix4


	/**
	* [page:Float x] - the amount to shear in the X axis. [page:Float y] - the amount to shear in the Y axis. [page:Float z] - the amount to shear in the Z axis. Sets this matrix as a shear transform: 1, y, z, 0, x, 1, z, 0, x, y, 1, 0, 0, 0, 0, 1
	*/
	open fun makeShear(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : Matrix4


	/**
	* [page:Float x] - the amount to translate in the X axis. [page:Float y] - the amount to translate in the Y axis. [page:Float z] - the amount to translate in the Z axis. Sets this matrix as a translation transform: 1, 0, 0, x, 0, 1, 0, y, 0, 0, 1, z, 0, 0, 0, 1
	*/
	open fun makeTranslation(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : Matrix4


	/**
	* Post-multiplies this matrix by [page:Matrix4 m].
	*/
	open fun multiply(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Matrix4


	/**
	* Sets this matrix to [page:Matrix4 a] x [page:Matrix4 b].
	*/
	open fun multiplyMatrices(a: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally, b: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Matrix4


	/**
	* Multiplies every component of the matrix by a scalar value [page:Float s].
	*/
	open fun multiplyScalar(s: Double = definedExternally) : Matrix4


	/**
	* Pre-multiplies this matrix by [page:Matrix4 m].
	*/
	open fun premultiply(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Matrix4


	/**
	* Multiplies the columns of this matrix by vector [page:Vector3 v].
	*/
	open fun scale(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Matrix4


	/**
	* Set the [page:.elements elements] of this matrix to the supplied row-major values [page:Float n11], [page:Float n12], ... [page:Float n44].
	*/
	open fun set(n11: Double = definedExternally, n12: Double = definedExternally, n13: Double = definedExternally, n14: Double = definedExternally, n21: Double = definedExternally, n22: Double = definedExternally, n23: Double = definedExternally, n24: Double = definedExternally, n31: Double = definedExternally, n32: Double = definedExternally, n33: Double = definedExternally, n34: Double = definedExternally, n41: Double = definedExternally, n42: Double = definedExternally, n43: Double = definedExternally, n44: Double = definedExternally) : Matrix4

	open fun setPosition(v: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Matrix4


	/**
	* Sets the position component for this matrix from vector [page:Vector3 v], without affecting the rest of the matrix - i.e. if the matrix is currently: a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p This becomes: a, b, c, v.x, e, f, g, v.y, i, j, k, v.z, m, n, o, p
	*/
	open fun setPosition(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : Matrix4


	/**
	* [page:Array array] - (optional) array to store the resulting vector in. [page:Integer offset] - (optional) offset in the array at which to put the result. Writes the elements of this matrix to an array in [link:https://en.wikipedia.org/wiki/Row-_and_column-major_order#Column-major_order column-major] format.
	*/
	open fun toArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Array<dynamic>


	/**
	* [link:https://en.wikipedia.org/wiki/Transpose Transposes] this matrix.
	*/
	open fun transpose() : Matrix4
}