@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* 
	*/
open external class InterleavedBufferAttribute(interleavedBuffer: ch.viseon.threejs.declarations.core.InterleavedBuffer = definedExternally, itemSize: Int = definedExternally, offset: Int = definedExternally, normalized: Boolean = definedExternally){

	/**
	* The [page:InterleavedBuffer InterleavedBuffer] instance passed in the constructor.
	*/
	open var data: ch.viseon.threejs.declarations.core.InterleavedBuffer  = definedExternally


	/**
	* The value of [page:InterleavedBufferAttribute.data data].array.
	*/
	open var array: Array<dynamic>  = definedExternally


	/**
	* The value of [page:InterleavedBufferAttribute.data data].count. If the buffer is storing a 3-component item (such as a position, normal, or color), then this will count the number of such items stored.
	*/
	open var count: Int  = definedExternally


	/**
	* How many values make up each item.
	*/
	open var itemSize: Int  = definedExternally


	/**
	* Optional name for this attribute instance. Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* Default is **false**. Setting this to **true** will send the entire interleaved buffer (not just the specific attribute data) to the GPU again.
	*/
	open var needsUpdate: Boolean  = definedExternally


	/**
	* Default is **false**.
	*/
	open var normalized: Boolean  = definedExternally


	/**
	* The offset in the underlying array buffer where an item starts.
	*/
	open var offset: Int  = definedExternally


	/**
	* Applies matrix [page:Matrix4 m] to every Vector3 element of this InterleavedBufferAttribute.
	*/
	open fun applyMatrix4(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : InterleavedBufferAttribute


	/**
	* Returns the x component of the item at the given index.
	*/
	open fun getX(index: Int = definedExternally) : Double


	/**
	* Returns the y component of the item at the given index.
	*/
	open fun getY(index: Int = definedExternally) : Double


	/**
	* Returns the z component of the item at the given index.
	*/
	open fun getZ(index: Int = definedExternally) : Double


	/**
	* Returns the w component of the item at the given index.
	*/
	open fun getW(index: Int = definedExternally) : Double


	/**
	* Sets the x component of the item at the given index.
	*/
	open fun setX(index: Int = definedExternally, x: Double = definedExternally) : dynamic


	/**
	* Sets the y component of the item at the given index.
	*/
	open fun setY(index: Int = definedExternally, y: Double = definedExternally) : dynamic


	/**
	* Sets the z component of the item at the given index.
	*/
	open fun setZ(index: Int = definedExternally, z: Double = definedExternally) : dynamic


	/**
	* Sets the w component of the item at the given index.
	*/
	open fun setW(index: Int = definedExternally, w: Double = definedExternally) : dynamic


	/**
	* Sets the x and y components of the item at the given index.
	*/
	open fun setXY(index: Int = definedExternally, x: Double = definedExternally, y: Double = definedExternally) : dynamic


	/**
	* Sets the x, y and z components of the item at the given index.
	*/
	open fun setXYZ(index: Int = definedExternally, x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : dynamic


	/**
	* Sets the x, y, z and w components of the item at the given index.
	*/
	open fun setXYZW(index: Int = definedExternally, x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally) : dynamic
}