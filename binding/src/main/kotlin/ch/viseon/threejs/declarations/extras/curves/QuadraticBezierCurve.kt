//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Create a smooth 2d quadratic bezier curve, defined by a startpoint, endpoint and a single control point.
	*/
open external class QuadraticBezierCurve(v0: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, v1: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, v2: ch.viseon.threejs.declarations.math.Vector2 = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* Used to check whether this or derived classes are QuadraticBezierCurves. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isQuadraticBezierCurve: Boolean  = definedExternally


	/**
	* The startpoint.
	*/
	open var v0: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* The control point.
	*/
	open var v1: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* The endpoint.
	*/
	open var v2: ch.viseon.threejs.declarations.math.Vector2  = definedExternally
}