//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* This material can receive shadows, but otherwise is completely transparent.
	*/
open external class ShadowMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.ShaderMaterial{

	/**
	* Used to check whether this or derived classes are shadow materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isShadowMaterial: Boolean  = definedExternally


	/**
	* Whether the material is affected by lights. Default is **true**.
	*/
	override var lights: Boolean 


	/**
	* Defines whether this material is transparent. Default is **true**.
	*/
	override var transparent: Boolean 
}