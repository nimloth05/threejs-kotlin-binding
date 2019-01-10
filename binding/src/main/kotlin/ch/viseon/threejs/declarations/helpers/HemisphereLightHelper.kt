//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* Creates a visual aid consisting of a spherical [page:Mesh] for a [page:HemisphereLight HemisphereLight].
	*/
open external class HemisphereLightHelper(light: ch.viseon.threejs.declarations.lights.HemisphereLight = definedExternally, sphereSize: Double = definedExternally, color: Int = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Reference to the HemisphereLight being visualized.
	*/
	open var light: ch.viseon.threejs.declarations.lights.HemisphereLight  = definedExternally


	/**
	* Reference to the hemisphereLight's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrix: ch.viseon.threejs.declarations.math.Matrix4 


	/**
	* See [page:Object3D.matrixAutoUpdate]. Set to **false** here as the helper is using the hemisphereLight's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrixAutoUpdate: Boolean 


	/**
	* The color parameter passed in the constructor. Default is **undefined**. If this is changed, the helper's color will update the next time [page:.update update] is called.
	*/
	open var color: Int  = definedExternally


	/**
	* Dispose of the hemisphereLightHelper.
	*/
	open fun dispose() : dynamic/*null*/


	/**
	* Updates the helper to match the position and direction of the [page:.light].
	*/
	open fun update() : dynamic/*null*/
}