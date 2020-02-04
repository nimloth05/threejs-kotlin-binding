@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Create a smooth 3d quadratic bezier curve, defined by a startpoint, endpoint and a single control point.
	*/
open external class QuadraticBezierCurve3(v0: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, v1: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, v2: ch.viseon.threejs.declarations.math.Vector3 = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* The startpoint.
	*/
	open var v0: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* The control point.
	*/
	open var v1: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* The endpoint.
	*/
	open var v2: ch.viseon.threejs.declarations.math.Vector3  = definedExternally
}