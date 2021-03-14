@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* "Interleaved" means that multiple attributes, possibly of different types, (e.g., position, normal, uv, color) are packed into a single array buffer. An introduction into interleaved arrays can be found here: [link:https://blog.tojicode.com/2011/05/interleaved-array-basics.html Interleaved array basics]
	*/
open external class InterleavedBuffer(array: Array<dynamic> = definedExternally, stride: Int = definedExternally){

	/**
	* A typed array with a shared buffer. Stores the geometry data.
	*/
	open var array: Array<dynamic>  = definedExternally


	/**
	* The number of typed-array elements per vertex.
	*/
	open var stride: Int  = definedExternally


	/**
	* Gives the total number of elements in the array.
	*/
	open var count: Int  = definedExternally


	/**
	* Object containing offset and count.
	*/
	open var updateRange: dynamic  = definedExternally


	/**
	* [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this instance. This gets automatically assigned, so this shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* A version number, incremented every time the needsUpdate property is set to true.
	*/
	open var version: Int  = definedExternally


	/**
	* Default is **false**. Setting this to true increments [page:InterleavedBuffer.version version].
	*/
	open var needsUpdate: Boolean  = definedExternally


	/**
	* Defines the intended usage pattern of the data store for optimization purposes. Corresponds to the **usage** parameter of [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData WebGLRenderingContext.bufferData]().
	*/
	open var usage: Int  = definedExternally


	/**
	* Copies another [name] to this [name].
	*/
	open fun copy(source: ch.viseon.threejs.declarations.core.InterleavedBuffer = definedExternally) : ch.viseon.threejs.declarations.core.InterleavedBuffer


	/**
	* Copies data from attribute[index2] to [page:InterleavedBuffer.array array][index1].
	*/
	open fun copyAt(index1: Int = definedExternally, attribute: ch.viseon.threejs.declarations.core.InterleavedBuffer = definedExternally, index2: Int = definedExternally) : ch.viseon.threejs.declarations.core.InterleavedBuffer


	/**
	* value - The source (typed) array. offset - The offset into the target array at which to begin writing values from the source array. Default is **0**. Stores multiple values in the buffer, reading input values from a specified array.
	*/
	open fun set(value: Array<dynamic> = definedExternally, offset: Int = definedExternally) : ch.viseon.threejs.declarations.core.InterleavedBuffer


	/**
	* data - This object holds shared array buffers required for properly cloning geometries with interleaved attributes. Creates a clone of this [name].
	*/
	open fun clone(data: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.InterleavedBuffer


	/**
	* Set [page:InterleavedBuffer.usage usage] to value.
	*/
	open fun setUsage(value: Int = definedExternally) : ch.viseon.threejs.declarations.core.InterleavedBuffer


	/**
	* data - This object holds shared array buffers required for properly serializing geometries with interleaved attributes. Serializes this [name].
	*/
	open fun toJSON(data: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.InterleavedBuffer
}