@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material for drawing wireframe-style geometries with dashed lines.
	*/
open external class LineDashedMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* [page:Color] of the material, by default set to white (0xffffff).
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* The size of the dash. This is both the gap with the stroke. Default is **3**.
	*/
	open var dashSize: Double  = definedExternally


	/**
	* The size of the gap. Default is **1**.
	*/
	open var gapSize: Double  = definedExternally


	/**
	* Used to check whether this or derived classes are line dashed materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isLineDashedMaterial: Boolean  = definedExternally


	/**
	* Whether the material is affected by lights. Default is **false**.
	*/
	override var lights: Boolean 


	/**
	* Controls line thickness. Default is **1**. Due to limitations of the [link:https://www.khronos.org/registry/OpenGL/specs/gl/glspec46.core.pdf OpenGL Core Profile] with the [page:WebGLRenderer WebGL] renderer on most platforms linewidth will always be 1 regardless of the set value.
	*/
	open var linewidth: Double  = definedExternally


	/**
	* The scale of the dashed part of a line. Default is **1**.
	*/
	open var scale: Double  = definedExternally
}