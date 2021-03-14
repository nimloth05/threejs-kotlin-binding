@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* Light probes are an alternative way of adding light to a 3D scene. AmbientLightProbe is the light estimation data of a single ambient light in the scene. For more information about light probes, go to [page:LightProbe].
	*/
open external class AmbientLightProbe(color: ch.viseon.threejs.declarations.math.Color = definedExternally, intensity: Double = definedExternally): ch.viseon.threejs.declarations.lights.LightProbe{
}