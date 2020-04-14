@file:JsModule("three")
package ch.viseon.threejs.declarations.lights.shadows

	/**
	* This is used internally by [page:DirectionalLight DirectionalLights] for calculating shadows. Unlike the other shadow classes, this uses an [page:OrthographicCamera] to calculate the shadows, rather than a [page:PerspectiveCamera]. This is because light rays from a [page:DirectionalLight] are parallel.
	*/
open external class DirectionalLightShadow: ch.viseon.threejs.declarations.lights.shadows.LightShadow{

	/**
	* The light's view of the world. This is used to generate a depth map of the scene; objects behind other objects from the light's perspective will be in shadow. The default is an [page:OrthographicCamera] with [page:OrthographicCamera.left left] and [page:OrthographicCamera.bottom bottom] set to -5, [page:OrthographicCamera.right right] and [page:OrthographicCamera.top top] set to 5, the [page:OrthographicCamera.near near] clipping plane at 0.5 and the [page:OrthographicCamera.far far] clipping plane at 500.
	*/
	override var camera: ch.viseon.threejs.declarations.cameras.Camera 
}