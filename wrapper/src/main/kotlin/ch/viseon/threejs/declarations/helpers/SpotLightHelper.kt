@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* This displays a cone shaped helper object for a [page:SpotLight].
	*/
open external class SpotLightHelper(light: ch.viseon.threejs.declarations.lights.SpotLight = definedExternally, color: Int = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* [page:LineSegments] used to visualize the light.
	*/
	open var cone: ch.viseon.threejs.declarations.objects.LineSegments  = definedExternally


	/**
	* Reference to the [page:SpotLight] being visualized.
	*/
	open var light: ch.viseon.threejs.declarations.lights.SpotLight  = definedExternally


	/**
	* Reference to the spotLight's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrix: ch.viseon.threejs.declarations.math.Matrix4 


	/**
	* See [page:Object3D.matrixAutoUpdate]. Set to **false** here as the helper is using the spotLight's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrixAutoUpdate: Boolean 


	/**
	* The color parameter passed in the constructor. Default is **undefined**. If this is changed, the helper's color will update the next time [page:.update update] is called.
	*/
	open var color: Int  = definedExternally


	/**
	* Disposes of the light helper.
	*/
	open fun dispose() : dynamic


	/**
	* Updates the light helper.
	*/
	open fun update() : dynamic
}