@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* A class for generating a dodecahedron geometries.
	*/
open external class DodecahedronBufferGeometry(radius: Double = definedExternally, detail: Int = definedExternally): ch.viseon.threejs.declarations.geometries.PolyhedronBufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	override var parameters: dynamic 
}