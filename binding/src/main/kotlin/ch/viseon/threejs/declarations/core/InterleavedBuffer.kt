//Generated date 07.02.2019
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
	* Default is **false**.
	*/
	open var dynamic: Boolean  = definedExternally


	/**
	* Object containing offset and count.
	*/
	open var updateRange: dynamic  = definedExternally


	/**
	* A version number, incremented every time the needsUpdate property is set to true.
	*/
	open var version: Int  = definedExternally


	/**
	* Default is **true**.
	*/
	open var isInterleavedBuffer: Boolean  = definedExternally


	/**
	* Default is **false**. Setting this to true increments [page:InterleavedBuffer.version version].
	*/
	open var needsUpdate: Boolean  = definedExternally


	/**
	* array - must be a Typed Array.
	*/
	open fun setArray(array: Array<dynamic> = definedExternally) : ch.viseon.threejs.declarations.core.InterleavedBuffer


	/**
	* Set [page:InterleavedBuffer.dynamic dynamic] to value.
	*/
	open fun setDynamic(value: Boolean = definedExternally) : ch.viseon.threejs.declarations.core.InterleavedBuffer


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
	* Creates a clone of this [name].
	*/
	open fun clone() : ch.viseon.threejs.declarations.core.InterleavedBuffer
}