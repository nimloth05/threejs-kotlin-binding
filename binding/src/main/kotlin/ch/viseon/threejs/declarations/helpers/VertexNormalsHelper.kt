//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* Renders [page:ArrowHelper arrows] to visualize an object's vertex normal vectors. Requires that normals have been specified in a [page:BufferAttribute custom attribute] or have been calculated using [page:Geometry.computeVertexNormals computeVertexNormals]. Unlike [page:FaceNormalsHelper], this works with [page:BufferGeometry].
	*/
open external class VertexNormalsHelper(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, size: Double = definedExternally, color: Int = definedExternally, linewidth: Double = definedExternally): ch.viseon.threejs.declarations.objects.Line{

	/**
	* See [page:Object3D.matrixAutoUpdate]. Set to **false** here as the helper is using the objects's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrixAutoUpdate: Boolean 


	/**
	* The object for which the vertex normals are being visualized.
	*/
	open var `object`: ch.viseon.threejs.declarations.core.Object3D  = definedExternally


	/**
	* Length of the arrows. Default is **1**.
	*/
	open var size: Double  = definedExternally


	/**
	* Updates the vertex normal preview based on movement of the object.
	*/
	open fun update() : dynamic
}