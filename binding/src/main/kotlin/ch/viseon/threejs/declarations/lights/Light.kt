//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* Abstract base class for lights - all other light types inherit the properties and methods described here.
	*/
open external class Light(color: Int = definedExternally, intensity: Float = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Color of the light. Defaults to a new [page:Color] set to white, if not passed in the constructor.
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* The light's intensity, or strength. In [page:WebGLRenderer.physicallyCorrectLights physically correct] mode, the product of [page:.color color] ** intensity is interpreted as luminous intensity measured in candela. Default - **1.0**.
	*/
	open var intensity: Float  = definedExternally


	/**
	* Used to check whether this or derived classes are lights. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isLight: Boolean  = definedExternally


	/**
	* Copies the value of [page:.color color] and [page:.intensity intensity] from the [page:Light source] light into this one.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.lights.Light = definedExternally) : ch.viseon.threejs.declarations.lights.Light


	/**
	* Return Light data in JSON format.
	*/
	open fun toJSON(meta: String = definedExternally) : JSON
}