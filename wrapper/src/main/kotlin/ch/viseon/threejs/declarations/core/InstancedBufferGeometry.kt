@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* An instanced version of [page:BufferGeometry].
	*/
open external class InstancedBufferGeometry: ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* Default is **Infinity**.
	*/
	open var instanceCount: Double  = definedExternally
}