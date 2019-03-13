//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* The default material used by [page:Points].
	*/
open external class PointsMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* [page:Color] of the material, by default set to white (0xffffff).
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* Used to check whether this or derived classes are points materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isPointsMaterial: Boolean  = definedExternally


	/**
	* Sets the color of the points using data from a [page:Texture].
	*/
	open var map: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Define whether the material uses morphTargets. Default is false.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* Sets the size of the points. Default is 1.0.
	*/
	open var size: Double  = definedExternally


	/**
	* Specify whether points' size is attenuated by the camera depth. (Perspective camera only.) Default is true.
	*/
	open var sizeAttenuation: Boolean  = definedExternally
}