//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.lights.shadows

	/**
	* This is used internally by [page:SpotLight SpotLights] for calculating shadows.
	*/
open external class SpotLightShadow(): ch.viseon.threejs.declarations.lights.shadows.LightShadow{

	/**
	* The light's view of the world. This is used to generate a depth map of the scene; objects behind other objects from the light's perspective will be in shadow. The default is a [page:PerspectiveCamera] with [page:PerspectiveCamera.near near] clipping plane at 0.5. The [page:PerspectiveCamera.fov fov] will track the [page:SpotLight.angle angle] property of the owning [page:SpotLight SpotLight] via the [page:SpotLightShadow.update update] method. Similarly, the [page:PerspectiveCamera.aspect aspect] property will track the aspect of the [page:LightShadow.mapSize mapSize]. If the [page:SpotLight.distance distance] property of the light is set, the [page:PerspectiveCamera.far far] clipping plane will track that, otherwise it defaults to 500.
	*/
	override var camera: ch.viseon.threejs.declarations.cameras.Camera 


	/**
	* Used to check whether this or derived classes are spot light shadows. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isSpotLightShadow: Boolean  = definedExternally


	/**
	* Updates the internal perspective [page:.camera camera] based on the passed in [page:SpotLight light].
	*/
	open fun update(light: ch.viseon.threejs.declarations.lights.SpotLight = definedExternally) : ch.viseon.threejs.declarations.lights.shadows.SpotLightShadow
}