//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Create a smooth 2d cubic bezier curve, defined by a start point, endpoint and two control points.
	*/
open external class CubicBezierCurve(v0: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, v1: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, v2: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, v3: ch.viseon.threejs.declarations.math.Vector2 = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* Used to check whether this or derived classes are CubicBezierCurves. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isCubicBezierCurve: Boolean  = definedExternally


	/**
	* The starting point.
	*/
	open var v0: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* The first control point.
	*/
	open var v1: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* The second control point.
	*/
	open var v2: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* The ending point.
	*/
	open var v3: ch.viseon.threejs.declarations.math.Vector2  = definedExternally
}