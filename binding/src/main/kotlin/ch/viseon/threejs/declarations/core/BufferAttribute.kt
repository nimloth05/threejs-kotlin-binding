//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* This class stores data for an attribute (such as vertex positions, face indices, normals, colors, UVs, and any custom attributes ) associated with a [page:BufferGeometry], which allows for more efficient passing of data to the GPU. See that page for details and a usage example. Data is stored as vectors of any length (defined by [page:BufferAttribute.itemSize itemSize]), and in general in the methods outlined below if passing in an index, this is automatically multiplied by the vector length.
	*/
open external class BufferAttribute(array: Array<dynamic>/*TypedArray*/ = definedExternally, itemSize: Int = definedExternally, normalized: Boolean = definedExternally){

	/**
	* The [page:TypedArray array] holding data stored in the buffer.
	*/
	open var array: Array<dynamic>/*TypedArray*/  = definedExternally


	/**
	* Stores the [page:BufferAttribute.array array]'s length divided by the [page:BufferAttribute.itemSize itemSize]. If the buffer is storing a 3-component vector (such as a position, normal, or color), then this will count the number of such vectors stored.
	*/
	open var count: Int  = definedExternally


	/**
	* Whether the buffer is dynamic or not. Default is **false**. If false, the GPU is informed that contents of the buffer are likely to be used often and not change often. This corresponds to the [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData gl.STATIC_DRAW] flag. if true, the GPU is informed that contents of the buffer are likely to be used often and change often. This corresponds to the [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData gl.DYNAMIC_DRAW] flag.
	*/
	open var dynamic: Boolean  = definedExternally


	/**
	* Used to check whether this or derived classes are BufferAttributes. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isBufferAttribute: Boolean  = definedExternally


	/**
	* The length of vectors that are being stored in the [page:BufferAttribute.array array].
	*/
	open var itemSize: Int  = definedExternally


	/**
	* Optional name for this attribute instance. Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* Flag to indicate that this attribute has changed and should be re-sent to the GPU. Set this to true when you modify the value of the array. Setting this to true also increments the [page:BufferAttribute.version version].
	*/
	open var needsUpdate: Boolean  = definedExternally


	/**
	* Indicates how the underlying data in the buffer maps to the values in the GLSL shader code. See the constructor above for details.
	*/
	open var normalized: Boolean  = definedExternally


	/**
	* A callback function that is executed after the Renderer has transferred the attribute array data to the GPU.
	*/
	open var onUploadCallback: dynamic/*Function*/  = definedExternally


	/**
	* Object containing: [page:Integer offset]: Default is **0**. Position at which to start update. [page:Integer count]: Default is **-1**, which means don't use update ranges. This can be used to only update some components of stored vectors (for example, just the component related to color).
	*/
	open var updateRange: dynamic/*Object*/  = definedExternally


	/**
	* A version number, incremented every time the [page:BufferAttribute.needsUpdate needsUpdate] property is set to true.
	*/
	open var version: Int  = definedExternally


	/**
	* Return a copy of this bufferAttribute.
	*/
	open fun clone() : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copies another BufferAttribute to this BufferAttribute.
	*/
	open fun copy(bufferAttribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy the array given here (which can be a normal array or TypedArray) into [page:BufferAttribute.array array]. See [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set TypedArray.set] for notes on requirements if copying a TypedArray.
	*/
	open fun copyArray() : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy a vector from bufferAttribute[index2] to [page:BufferAttribute.array array][index1].
	*/
	open fun copyAt(index1: Int = definedExternally, bufferAttribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally, index2: Int = definedExternally) : dynamic/*null*/


	/**
	* Copy an array representing RGB color values into [page:BufferAttribute.array array].
	*/
	open fun copyColorsArray(colors: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy an array representing [page:Vector2]s into [page:BufferAttribute.array array].
	*/
	open fun copyVector2sArray(vectors: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy an array representing [page:Vector3]s into [page:BufferAttribute.array array].
	*/
	open fun copyVector3sArray(vectors: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy an array representing [page:Vector4]s into [page:BufferAttribute.array array].
	*/
	open fun copyVector4sArray(vectors: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Returns the x component of the vector at the given index.
	*/
	open fun getX(index: Int = definedExternally) : Double


	/**
	* Returns the y component of the vector at the given index.
	*/
	open fun getY(index: Int = definedExternally) : Double


	/**
	* Returns the z component of the vector at the given index.
	*/
	open fun getZ(index: Int = definedExternally) : Double


	/**
	* Returns the w component of the vector at the given index.
	*/
	open fun getW(index: Int = definedExternally) : Double


	/**
	* Sets the value of the onUploadCallback property. In the [example:webgl_buffergeometry WebGL / Buffergeometry] this is used to free memory after the buffer has been transferred to the GPU.
	*/
	open fun onUpload(callback: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* value -- an [page:Array] or [page:TypedArray] from which to copy values. offset -- (optional) index of the [page:BufferAttribute.array array] at which to start copying. Calls [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set TypedArray.set]( [page:Array value], [page:Integer offset] ) on the [page:BufferAttribute.array array]. In particular, see that page for requirements on [page:Array value] being a [page:TypedArray].
	*/
	open fun set(value: Array<dynamic>/*Array*/ = definedExternally, offset: Int = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* [page:BufferAttribute.array array] to the TypedArray passed in here. After setting the array, [page:BufferAttribute.needsUpdate needsUpdate] should be set to true.
	*/
	open fun setArray(array: Array<dynamic>/*TypedArray*/ = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Set [page:BufferAttribute.dynamic dynamic] to value.
	*/
	open fun setDynamic(value: Boolean = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the x component of the vector at the given index.
	*/
	open fun setX(index: Int = definedExternally, x: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the y component of the vector at the given index.
	*/
	open fun setY(index: Int = definedExternally, y: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the z component of the vector at the given index.
	*/
	open fun setZ(index: Int = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the w component of the vector at the given index.
	*/
	open fun setW(index: Int = definedExternally, w: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the x and y components of the vector at the given index.
	*/
	open fun setXY(index: Int = definedExternally, x: Double = definedExternally, y: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the x, y and z components of the vector at the given index.
	*/
	open fun setXYZ(index: Int = definedExternally, x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the x, y, z and w components of the vector at the given index.
	*/
	open fun setXYZW(index: Int = definedExternally, x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute
}