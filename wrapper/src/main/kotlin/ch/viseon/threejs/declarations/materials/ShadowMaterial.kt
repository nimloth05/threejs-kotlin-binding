@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* This material can receive shadows, but otherwise is completely transparent.
	*/
open external class ShadowMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* Defines whether this material is transparent. Default is **true**.
	*/
	override var transparent: Boolean 
}