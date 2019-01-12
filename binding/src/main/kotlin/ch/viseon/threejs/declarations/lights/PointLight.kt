//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* A light that gets emitted from a single point in all directions. A common use case for this is to replicate the light emitted from a bare lightbulb. This light can cast shadows - see [page:LightShadow] page for details.
	*/
open external class PointLight(color: Int = definedExternally, intensity: Double = definedExternally, distance: Double = definedExternally, decay: Double = definedExternally): ch.viseon.threejs.declarations.lights.Light{

	/**
	* The amount the light dims along the distance of the light In [page:WebGLRenderer.physicallyCorrectLights physically correct] mode, decay = 2 leads to physically realistic light falloff. Default is **1**.
	*/
	open var decay: Double  = definedExternally


	/**
	* Default mode — When distance is zero, light does not attenuate. When distance is non-zero, light will attenuate linearly from maximum intensity at the light's position down to zero at this distance from the light.
[page:WebGLRenderer.physicallyCorrectLights Physically correct] mode — When distance is zero, light will attenuate according to inverse-square law to infinite distance. When distance is non-zero, light will attenuate according to inverse-square law until near the distance cutoff, where it will then attenuate quickly and smoothly to 0. Inherently, cutoffs are not physically correct.
Default is **0.0**.
	*/
	open var distance: Double  = definedExternally


	/**
	* Used to check whether this or derived classes are point lights. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isPointLight: Boolean  = definedExternally


	/**
	* The light's power. In [page:WebGLRenderer.physicallyCorrectLights physically correct] mode, the luminous power of the light measured in lumens. Default is **4Math.PI**. This is directly related to the [page:.intensity intensity] in the ratio power = intensity ** 4π and changing this will also change the intensity.
	*/
	open var power: Double  = definedExternally


	/**
	* A [page:LightShadow] used to calculate shadows for this light. The lightShadow's [page:LightShadow.camera camera] is set to a [page:PerspectiveCamera] with [page:PerspectiveCamera.fov fov] of 90, [page:PerspectiveCamera.aspect aspect] of 1, [page:PerspectiveCamera.near near] clipping plane at 0.5 and [page:PerspectiveCamera.far far] clipping plane at 500.
	*/
	open var shadow: ch.viseon.threejs.declarations.lights.shadows.LightShadow  = definedExternally


	/**
	* Copies value of all the properties from the [page:PointLight source] to this PointLight.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.lights.PointLight = definedExternally) : ch.viseon.threejs.declarations.lights.PointLight
}