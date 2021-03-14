@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* Light probes are an alternative way of adding light to a 3D scene. Unlike classical light sources (e.g. directional, point or spot lights), light probes do not emit light. Instead they store information about light passing through 3D space. During rendering, the light that hits a 3D object is approximated by using the data from the light probe.
Light probes are usually created from (radiance) environment maps. The class [page:LightProbeGenerator] can be used to create light probes from instances of [page:CubeTexture] or [page:WebGLCubeRenderTarget]. However, light estimation data could also be provided in other forms e.g. by WebXR. This enables the rendering of augmented reality content that reacts to real world lighting.
The current probe implementation in three.js supports so-called diffuse light probes. This type of light probe is functionally equivalent to an irradiance environment map.
	*/
open external class LightProbe(sh: ch.viseon.threejs.declarations.math.SphericalHarmonics3 = definedExternally, intensity: Double = definedExternally): ch.viseon.threejs.declarations.lights.Light{

	/**
	* A light probe uses spherical harmonics to encode lighting information.
	*/
	open var sh: ch.viseon.threejs.declarations.math.SphericalHarmonics3  = definedExternally
}