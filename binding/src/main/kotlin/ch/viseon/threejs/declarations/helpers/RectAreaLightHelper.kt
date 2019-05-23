//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* Creates a visual aid for a [page:RectAreaLight].
	*/
open external class RectAreaLightHelper(light: ch.viseon.threejs.declarations.lights.RectAreaLight = definedExternally, color: Int = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Reference to the RectAreaLight being visualized.
	*/
	open var light: ch.viseon.threejs.declarations.lights.RectAreaLight  = definedExternally


	/**
	* The color parameter passed in the constructor. Default is **undefined**. If this is changed, the helper's color will update the next time [page:.update update] is called.
	*/
	open var color: Int  = definedExternally


	/**
	* Dispose of the rectAreaLightHelper.
	*/
	open fun dispose() : dynamic


	/**
	* Updates the helper to match the position and direction of the [page:.light].
	*/
	open fun update() : dynamic
}