//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* This light globally illuminates all objects in the scene equally. This light cannot be used to cast shadows as it does not have a direction.
	*/
open external class AmbientLight(color: Int = definedExternally, intensity: Float = definedExternally): ch.viseon.threejs.declarations.lights.Light{

	/**
	* This is set to **undefined** in the constructor as ambient lights cannot cast shadows.
	*/
	override var castShadow: Boolean 


	/**
	* Used to check whether this or derived classes are ambient lights. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isAmbientLight: Boolean  = definedExternally
}