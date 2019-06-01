@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* Helper object to assist with visualizing a [page:DirectionalLight]'s effect on the scene. This consists of plane and a line representing the light's position and direction.
	*/
open external class DirectionalLightHelper(light: ch.viseon.threejs.declarations.lights.DirectionalLight = definedExternally, size: Double = definedExternally, color: Int = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Contains the line mesh showing the location of the directional light.
	*/
	open var lightPlane: ch.viseon.threejs.declarations.objects.Line  = definedExternally


	/**
	* Reference to the [page:DirectionalLight directionalLight] being visualized.
	*/
	open var light: ch.viseon.threejs.declarations.lights.DirectionalLight  = definedExternally


	/**
	* Reference to the light's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrix: ch.viseon.threejs.declarations.math.Matrix4 


	/**
	* See [page:Object3D.matrixAutoUpdate]. Set to **false** here as the helper is using the light's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrixAutoUpdate: Boolean 


	/**
	* The color parameter passed in the constructor. Default is **undefined**. If this is changed, the helper's color will update the next time [page:.update update] is called.
	*/
	open var color: Int  = definedExternally


	/**
	* Dispose of the directionalLightHelper.
	*/
	open fun dispose() : dynamic


	/**
	* Updates the helper to match the position and direction of the [page:.light directionalLight] being visualized.
	*/
	open fun update() : dynamic
}