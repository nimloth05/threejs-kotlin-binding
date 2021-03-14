@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* [name] is a geometry class for a rectangular cuboid with a given 'width', 'height', and 'depth'. On creation, the cuboid is centred on the origin, with each edge parallel to one of the axes.
	*/
open external class BoxGeometry(width: Double = definedExternally, height: Double = definedExternally, depth: Double = definedExternally, widthSegments: Int = definedExternally, heightSegments: Int = definedExternally, depthSegments: Int = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
Using the above example: geometry.parameters; // {width: 1, height: 1, depth: 1, widthSegments: undefined, heightSegments: undefined, depthSegments: undefined} cube.geometry.parameters; // as above cube.geometry.parameters.width; // === 1 cube.geometry.parameters.widthSegments; // === undefined.
	*/
	open var parameters: dynamic  = definedExternally
}