//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.scenes

	/**
	* This class contains the parameters that define linear fog, i.e., that grows linearly denser with the distance.
	*/
open external class Fog(color: Int = definedExternally, near: Float = definedExternally, far: Float = definedExternally){

	/**
	* Optional name of the object (doesn't need to be unique). Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* Fog color. Example: If set to black, far away objects will be rendered black.
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* The minimum distance to start applying fog. Objects that are less than 'near' units from the active camera won't be affected by fog.
Default is 1.
	*/
	open var near: Float  = definedExternally


	/**
	* The maximum distance at which fog stops being calculated and applied. Objects that are more than 'far' units away from the active camera won't be affected by fog.
Default is 1000.
	*/
	open var far: Float  = definedExternally


	/**
	* Returns a new fog instance with the same parameters as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.scenes.Fog


	/**
	* Return fog data in JSON format.
	*/
	open fun toJSON() : ch.viseon.threejs.declarations.scenes.Fog
}