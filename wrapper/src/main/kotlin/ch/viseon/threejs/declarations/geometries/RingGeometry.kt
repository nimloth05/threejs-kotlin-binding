@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* A class for generating a two-dimensional ring geometry.
	*/
open external class RingGeometry(innerRadius: Double = definedExternally, outerRadius: Double = definedExternally, thetaSegments: Int = definedExternally, phiSegments: Int = definedExternally, thetaStart: Double = definedExternally, thetaLength: Double = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic  = definedExternally
}