@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* A polyhedron is a solid in three dimensions with flat faces. This class will take an array of vertices, project them onto a sphere, and then divide them up to the desired level of detail. This class is used by [page:DodecahedronGeometry], [page:IcosahedronGeometry], [page:OctahedronGeometry], and [page:TetrahedronGeometry] to generate their respective geometries.
	*/
open external class PolyhedronGeometry(vertices: Array<dynamic> = definedExternally, indices: Array<dynamic> = definedExternally, radius: Double = definedExternally, detail: Int = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic  = definedExternally
}