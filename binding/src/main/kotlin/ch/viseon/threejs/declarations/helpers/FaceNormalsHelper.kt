//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* Renders [page:ArrowHelper arrows] to visualize an object's [page:Face3 face] normals. Requires that face normals have been specified on all [page:Face3 faces] or calculated with [page:Geometry.computeFaceNormals computeFaceNormals]. Note that this only works with the objects whose geometry is an instance of [page:Geometry]. For [page:BufferGeometry] use a [page:VertexNormalsHelper] instead.

	*/
open external class FaceNormalsHelper(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, size: Double = definedExternally, color: ch.viseon.threejs.declarations.math.Color = definedExternally, linewidth: Double = definedExternally): ch.viseon.threejs.declarations.objects.LineSegments{

	/**
	* See [page:Object3D.matrixAutoUpdate]. Set to **false** here as the helper is using the objects's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrixAutoUpdate: Boolean 


	/**
	* The object for which the face normals are being visualized.
	*/
	open var `object`: ch.viseon.threejs.declarations.core.Object3D  = definedExternally


	/**
	* Length of the arrows. Default is **1**.
	*/
	open var size: Double  = definedExternally


	/**
	* Updates the face normal preview based on movement of the object.
	*/
	open fun update() : dynamic/*null*/
}