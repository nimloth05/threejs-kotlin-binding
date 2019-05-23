//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* This is the [page:BufferGeometry] port of [page:BoxGeometry].
	*/
open external class BoxBufferGeometry(width: Double = definedExternally, height: Double = definedExternally, depth: Double = definedExternally, widthSegments: Int = definedExternally, heightSegments: Int = definedExternally, depthSegments: Int = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
Using the above example: geometry.parameters; // {width: 1, height: 1, depth: 1, widthSegments: undefined, heightSegments: undefined, depthSegments: undefined} cube.geometry.parameters; // as above cube.geometry.parameters.width; // === 1 cube.geometry.parameters.widthSegments; // === undefined.
	*/
	open var parameters: dynamic  = definedExternally
}