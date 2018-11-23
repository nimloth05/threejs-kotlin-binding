//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* This helps with visualizing what a camera contains in its frustum. It visualizes the frustum of a camera using a [page:LineSegments].
	*/
open external class CameraHelper(camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally): ch.viseon.threejs.declarations.objects.LineSegments{

	/**
	* The camera being visualized.
	*/
	open var camera: ch.viseon.threejs.declarations.cameras.Camera  = definedExternally


	/**
	* This contains the points used to visualize the camera.
	*/
	open var pointMap: dynamic/*object*/  = definedExternally


	/**
	* Reference to the [page:Object3D.matrixWorld camera.matrixWorld].
	*/
	override var matrix: ch.viseon.threejs.declarations.math.Matrix4 


	/**
	* See [page:Object3D.matrixAutoUpdate]. Set to **false** here as the helper is using the camera's [page:Object3D.matrixWorld matrixWorld].
	*/
	override var matrixAutoUpdate: Boolean 


	/**
	* Updates the helper based on the projectionMatrix of the camera.
	*/
	open fun update() : dynamic/*null*/
}