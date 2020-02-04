@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* A curve representing a 2d line segment.
	*/
open external class LineCurve(v1: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, v2: ch.viseon.threejs.declarations.math.Vector2 = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* The start point.
	*/
	open var v1: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* The end point
	*/
	open var v2: ch.viseon.threejs.declarations.math.Vector2  = definedExternally
}