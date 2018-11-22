//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* This class is used internally to convert from [page:Geometry] to [page:BufferGeometry].
	*/
open external class DirectGeometry(){

	/**
	* Unique number for this [name] instance.
	*/
	open var id: Int  = definedExternally


	/**
	* Optional name. Default is the empty string.
	*/
	open var name: String  = definedExternally


	/**
	* String 'DirectGeometry'.
	*/
	open var type: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Initialiased as an empty array, this is populated by [page:.fromGeometry]().
	*/
	open var vertices: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Initialiased as an empty array, this is populated by [page:.fromGeometry]().
	*/
	open var normals: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Initialiased as an empty array, this is populated by [page:.fromGeometry]().
	*/
	open var colors: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Initialiased as an empty array, this is populated by [page:.fromGeometry]().
	*/
	open var uvs: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Initialiased as an empty array, this is populated by [page:.fromGeometry]().
	*/
	open var uvs2: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Initialiased as an empty array, this is populated by [page:.fromGeometry]().
	*/
	open var groups: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Initialiased as an empty array, this is populated by [page:.fromGeometry]().
	*/
	open var morphTargets: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Initialiased as an empty array, this is populated by [page:.fromGeometry]().
	*/
	open var skinWeights: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Initialiased as an empty array, this is populated by [page:.fromGeometry]().
	*/
	open var skinIndices: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Bounding box for the bufferGeometry, which can be calculated with [page:.computeBoundingBox](). Default is **null**.
	*/
	open var boundingBox: ch.viseon.threejs.declarations.math.Box3  = definedExternally


	/**
	* Bounding sphere for the bufferGeometry, which can be calculated with [page:.computeBoundingSphere](). Default is **null**.
	*/
	open var boundingSphere: ch.viseon.threejs.declarations.math.Sphere  = definedExternally


	/**
	* Default is false.
	*/
	open var verticesNeedUpdate: Boolean  = definedExternally


	/**
	* Default is false.
	*/
	open var normalsNeedUpdate: Boolean  = definedExternally


	/**
	* Default is false.
	*/
	open var colorsNeedUpdate: Boolean  = definedExternally


	/**
	* Default is false.
	*/
	open var uvsNeedUpdate: Boolean  = definedExternally


	/**
	* Default is false.
	*/
	open var groupsNeedUpdate: Boolean  = definedExternally


	/**
	* Compute the parts of the geometry that have different materialIndex. See [page:BufferGeometry.groups].
	*/
	open var computeGroups: dynamic/*null*/  = definedExternally


	/**
	* Pass in a [page:Geometry] instance for conversion.
	*/
	open var fromGeometry: dynamic/*null*/  = definedExternally
}