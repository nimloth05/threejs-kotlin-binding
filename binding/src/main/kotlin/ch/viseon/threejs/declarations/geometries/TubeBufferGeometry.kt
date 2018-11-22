//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* Creates a tube that extrudes along a 3d curve.
	*/
open external class TubeBufferGeometry(path: ch.viseon.threejs.declarations.extras.core.Curve = definedExternally, tubularSegments: Int = definedExternally, radius: Float = definedExternally, radialSegments: Int = definedExternally, closed: Boolean = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic/*Object*/  = definedExternally


	/**
	* An array of [page:Vector3] tangents
	*/
	open var tangents: Array<dynamic>/*Array*/  = definedExternally


	/**
	* An array of [page:Vector3] normals
	*/
	open var normals: Array<dynamic>/*Array*/  = definedExternally


	/**
	* An array of [page:Vector3] binormals
	*/
	open var binormals: Array<dynamic>/*Array*/  = definedExternally
}