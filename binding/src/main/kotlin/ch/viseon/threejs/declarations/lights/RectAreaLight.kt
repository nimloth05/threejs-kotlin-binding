//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* RectAreaLight emits light uniformly across the face a rectangular plane. This light type can be used to simulate light sources such as bright windows or strip lighting. Important Notes:
	*/
open external class RectAreaLight(color: Int = definedExternally, intensity: Double = definedExternally, width: Double = definedExternally, height: Double = definedExternally): ch.viseon.threejs.declarations.lights.Light{

	/**
	* Used to check whether this or derived classes are RectAreaLights. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isRectAreaLight: Boolean  = definedExternally


	/**
	* Copies value of all the properties from the [page:RectAreaLight source] to this RectAreaLight.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.lights.RectAreaLight = definedExternally) : ch.viseon.threejs.declarations.lights.RectAreaLight
}