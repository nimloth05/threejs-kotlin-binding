//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* An 3D arrow object for visualizing directions.
	*/
open external class ArrowHelper(dir: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, origin: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, length: Float = definedExternally, hex: Float = definedExternally, headLength: Float = definedExternally, headWidth: Float = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Contains the line part of the arrowHelper.
	*/
	open var line: ch.viseon.threejs.declarations.objects.Line  = definedExternally


	/**
	* Contains the cone part of the arrowHelper.
	*/
	open var cone: ch.viseon.threejs.declarations.objects.Mesh  = definedExternally


	/**
	* hex -- The hexadecimal value of the color. Sets the color of the arrowHelper.
	*/
	open fun setColor(hex: Float = definedExternally) : dynamic/*null*/


	/**
	* length -- The desired length. headLength -- The length of the head of the arrow. headWidth -- The length of the width of the arrow. Sets the length of the arrowhelper.
	*/
	open fun setLength(length: Float = definedExternally, headLength: Float = definedExternally, headWidth: Float = definedExternally) : dynamic/*null*/


	/**
	* dir -- The desired direction. Must be a unit vector. Sets the direction of the arrowhelper.
	*/
	open fun setDirection(dir: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : dynamic/*null*/
}