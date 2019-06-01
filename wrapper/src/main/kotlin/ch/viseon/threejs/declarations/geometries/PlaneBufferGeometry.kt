@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* This is the [page:BufferGeometry] port of [page:PlaneGeometry].
	*/
open external class PlaneBufferGeometry(width: Double = definedExternally, height: Double = definedExternally, widthSegments: Int = definedExternally, heightSegments: Int = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic  = definedExternally
}