@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* Light probes are an alternative way of adding light to a 3D scene. HemisphereLightProbe is the light estimation data of a single hemisphere light in the scene. For more information about light probes, go to [page:LightProbe].
	*/
open external class HemisphereLightProbe(skyColor: ch.viseon.threejs.declarations.math.Color = definedExternally, groundColor: ch.viseon.threejs.declarations.math.Color = definedExternally, intensity: Double = definedExternally): ch.viseon.threejs.declarations.lights.LightProbe{
}