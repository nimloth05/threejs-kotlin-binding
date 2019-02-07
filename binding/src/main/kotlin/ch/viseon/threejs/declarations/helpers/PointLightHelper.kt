//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* This displays a helper object consisting of a spherical [page:Mesh] for visualizing a [page:PointLight].
	*/
open external class PointLightHelper(light: ch.viseon.threejs.declarations.lights.PointLight = definedExternally, sphereSize: Double = definedExternally, color: Int = definedExternally): ch.viseon.threejs.declarations.objects.Mesh{

	/**
	* The [page:PointLight] that is being visualized.
	*/
	open var light: ch.viseon.threejs.declarations.lights.PointLight  = definedExternally


	/**
	* Reference to the pointLight's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrix: ch.viseon.threejs.declarations.math.Matrix4 


	/**
	* See [page:Object3D.matrixAutoUpdate]. Set to **false** here as the helper is using the pointLight's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrixAutoUpdate: Boolean 


	/**
	* The color parameter passed in the constructor. Default is **undefined**. If this is changed, the helper's color will update the next time [page:.update update] is called.
	*/
	open var color: Int  = definedExternally


	/**
	* Dispose of the pointLightHelper.
	*/
	open fun dispose() : dynamic


	/**
	* Updates the helper to match the position of the [page:.light].
	*/
	open fun update() : dynamic
}