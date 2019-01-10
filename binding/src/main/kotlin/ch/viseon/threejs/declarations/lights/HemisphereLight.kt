//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* A light source positioned directly above the scene, with color fading from the sky color to the ground color. This light cannot be used to cast shadows.
	*/
open external class HemisphereLight(skyColor: Int = definedExternally, groundColor: Int = definedExternally, intensity: Double = definedExternally): ch.viseon.threejs.declarations.lights.Light{

	/**
	* This is set to **undefined** in the constructor as hemisphere lights cannot cast shadows.
	*/
	override var castShadow: Boolean 


	/**
	* The light's sky color, as passed in the constructor. Default is a new [page:Color] set to white (0xffffff).
	*/
	override var color: ch.viseon.threejs.declarations.math.Color 


	/**
	* The light's ground color, as passed in the constructor. Default is a new [page:Color] set to white (0xffffff).
	*/
	open var groundColor: Double  = definedExternally


	/**
	* Used to check whether this or derived classes are hemisphere lights. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isHemisphereLight: Boolean  = definedExternally


	/**
	* This is set equal to [page:Object3D.DefaultUp] (0, 1, 0), so that the light shines from the top down.
	*/
	override var position: ch.viseon.threejs.declarations.math.Vector3 


	/**
	* Copies the value of [page:.color color], [page:.intensity intensity] and [page:.groundColor groundColor] from the [page:Light source] light into this one.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.lights.HemisphereLight = definedExternally) : ch.viseon.threejs.declarations.lights.HemisphereLight
}