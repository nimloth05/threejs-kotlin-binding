@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* An 3D arrow object for visualizing directions.
	*/
open external class ArrowHelper(dir: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, origin: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, length: Double = definedExternally, hex: Double = definedExternally, headLength: Double = definedExternally, headWidth: Double = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Contains the line part of the arrowHelper.
	*/
	open var line: ch.viseon.threejs.declarations.objects.Line  = definedExternally


	/**
	* Contains the cone part of the arrowHelper.
	*/
	open var cone: ch.viseon.threejs.declarations.objects.Mesh  = definedExternally


	/**
	* color -- The desired color. Sets the color of the arrowHelper.
	*/
	open fun setColor(color: ch.viseon.threejs.declarations.math.Color = definedExternally) : dynamic


	/**
	* length -- The desired length. headLength -- The length of the head of the arrow. headWidth -- The width of the head of the arrow. Sets the length of the arrowhelper.
	*/
	open fun setLength(length: Double = definedExternally, headLength: Double = definedExternally, headWidth: Double = definedExternally) : dynamic


	/**
	* dir -- The desired direction. Must be a unit vector. Sets the direction of the arrowhelper.
	*/
	open fun setDirection(dir: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : dynamic
}