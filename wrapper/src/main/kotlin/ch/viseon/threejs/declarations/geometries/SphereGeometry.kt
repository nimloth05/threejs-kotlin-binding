@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* A class for generating sphere geometries.
	*/
open external class SphereGeometry(radius: Double = definedExternally, widthSegments: Int = definedExternally, heightSegments: Int = definedExternally, phiStart: Double = definedExternally, phiLength: Double = definedExternally, thetaStart: Double = definedExternally, thetaLength: Double = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic  = definedExternally
}