@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material for drawing wireframe-style geometries with dashed lines.
	*/
open external class LineDashedMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.LineBasicMaterial{

	/**
	* The size of the dash. This is both the gap with the stroke. Default is **3**.
	*/
	open var dashSize: Double  = definedExternally


	/**
	* The size of the gap. Default is **1**.
	*/
	open var gapSize: Double  = definedExternally


	/**
	* The scale of the dashed part of a line. Default is **1**.
	*/
	open var scale: Double  = definedExternally
}