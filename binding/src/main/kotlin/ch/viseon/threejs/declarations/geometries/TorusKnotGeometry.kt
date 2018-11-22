//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* Creates a torus knot, the particular shape of which is defined by a pair of coprime integers, p and q. If p and q are not coprime, the result will be a torus link.
	*/
open external class TorusKnotGeometry(radius: Float = definedExternally, tube: Float = definedExternally, tubularSegments: Int = definedExternally, radialSegments: Int = definedExternally, p: Int = definedExternally, q: Int = definedExternally): ch.viseon.threejs.declarations.core.Geometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic/*object*/  = definedExternally
}