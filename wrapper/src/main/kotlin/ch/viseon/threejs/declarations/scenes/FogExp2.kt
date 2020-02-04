@file:JsModule("three")
package ch.viseon.threejs.declarations.scenes

	/**
	* This class contains the parameters that define exponential squared fog, which gives a clear view near the camera and a faster than exponentially densening fog farther from the camera.
	*/
open external class FogExp2(color: Int = definedExternally, density: Double = definedExternally){

	/**
	* Optional name of the object (doesn't need to be unique). Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* Fog color. Example: If set to black, far away objects will be rendered black.
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* Defines how fast the fog will grow dense.
Default is 0.00025.
	*/
	open var density: Double  = definedExternally


	/**
	* Returns a new FogExp2 instance with the same parameters as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.scenes.FogExp2


	/**
	* Return FogExp2 data in JSON format.
	*/
	open fun toJSON() : ch.viseon.threejs.declarations.scenes.FogExp2
}