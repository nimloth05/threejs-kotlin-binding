//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* Helper object to visualize a [page:Plane].
	*/
open external class PlaneHelper(plane: ch.viseon.threejs.declarations.math.Plane = definedExternally, size: Double = definedExternally, hex: ch.viseon.threejs.declarations.math.Color = definedExternally): ch.viseon.threejs.declarations.objects.LineSegments{

	/**
	* The [page:Plane plane] being visualized.
	*/
	open var plane: ch.viseon.threejs.declarations.math.Plane  = definedExternally


	/**
	* The side lengths of plane helper.
	*/
	open var size: Double  = definedExternally


	/**
	* This overrides the method in the base [page:Object3D] class so that it also updates the helper object according to the [page:PlaneHelper.plane .plane] and [page:PlaneHelper.size .size] properties.
	*/
	override fun updateMatrixWorld(force: Boolean) : Unit
}