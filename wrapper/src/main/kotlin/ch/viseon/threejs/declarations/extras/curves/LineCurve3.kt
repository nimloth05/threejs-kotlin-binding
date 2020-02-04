@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* A curve representing a 3d line segment.
	*/
open external class LineCurve3(v1: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, v2: ch.viseon.threejs.declarations.math.Vector3 = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* The start point.
	*/
	open var v1: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* The end point.
	*/
	open var v2: ch.viseon.threejs.declarations.math.Vector3  = definedExternally
}