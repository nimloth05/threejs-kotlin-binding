//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* A polyhedron is a solid in three dimensions with flat faces. This class will take an array of vertices, project them onto a sphere, and then divide them up to the desired level of detail.
	*/
open external class PolyhedronGeometry(vertices: Array<dynamic>/*Array*/ = definedExternally, indices: Array<dynamic>/*Array*/ = definedExternally, radius: Double = definedExternally, detail: Int = definedExternally): ch.viseon.threejs.declarations.core.Geometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic/*Object*/  = definedExternally
}