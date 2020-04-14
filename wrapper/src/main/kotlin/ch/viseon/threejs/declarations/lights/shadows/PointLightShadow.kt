@file:JsModule("three")
package ch.viseon.threejs.declarations.lights.shadows

	/**
	* This is used internally by [page:PointLight PointLights] for calculating shadows.
	*/
open external class PointLightShadow: ch.viseon.threejs.declarations.lights.shadows.LightShadow{

	/**
	* Update the matrices for the camera and shadow, used internally by the renderer. light -- the light for which the shadow is being rendered. viewportIndex -- calculates the matrix for this viewport
	*/
	open fun updateMatrices(light: ch.viseon.threejs.declarations.lights.Light = definedExternally, viewportIndex: Double = definedExternally) : dynamic
}