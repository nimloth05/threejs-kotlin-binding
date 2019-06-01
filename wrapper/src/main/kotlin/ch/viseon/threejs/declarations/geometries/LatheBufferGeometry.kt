@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* This is the [page:BufferGeometry] port of [page:LatheGeometry].
	*/
open external class LatheBufferGeometry(points: Array<dynamic> = definedExternally, segments: Int = definedExternally, phiStart: Double = definedExternally, phiLength: Double = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic  = definedExternally
}