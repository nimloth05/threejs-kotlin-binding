@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* A class for generating cylinder geometries
	*/
open external class CylinderGeometry(radiusTop: Double = definedExternally, radiusBottom: Double = definedExternally, height: Double = definedExternally, radialSegments: Int = definedExternally, heightSegments: Int = definedExternally, openEnded: Boolean = definedExternally, thetaStart: Double = definedExternally, thetaLength: Double = definedExternally): ch.viseon.threejs.declarations.core.Geometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic  = definedExternally
}