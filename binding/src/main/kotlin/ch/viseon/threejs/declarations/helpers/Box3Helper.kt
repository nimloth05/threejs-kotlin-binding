//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* Helper object to visualize a [page:Box3].
	*/
open external class Box3Helper(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally, color: ch.viseon.threejs.declarations.math.Color = definedExternally): ch.viseon.threejs.declarations.objects.LineSegments{

	/**
	* The Box3 being visualized.
	*/
	open var box: ch.viseon.threejs.declarations.math.Box3  = definedExternally


	/**
	* This overrides the method in the base [page:Object3D] class so that it also updates the wireframe box to the extent of the [page:Box3Helper.box .box] property.
	*/
	override fun updateMatrixWorld(force: Boolean) : Unit
}