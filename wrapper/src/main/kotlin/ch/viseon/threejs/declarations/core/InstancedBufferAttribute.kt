@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* An instanced version of [page:BufferAttribute].
	*/
open external class InstancedBufferAttribute(array: Array<dynamic> = definedExternally, itemSize: Int = definedExternally, normalized: Boolean = definedExternally, meshPerAttribute: Double = definedExternally): ch.viseon.threejs.declarations.core.BufferAttribute{

	/**
	* Defines how often a value of this buffer attribute should be repeated. A value of one means that each value of the instanced attribute is used for a single instance. A value of two means that each value is used for two consecutive instances (and so on). Default is **1**.
	*/
	open var meshPerAttribute: Double  = definedExternally
}