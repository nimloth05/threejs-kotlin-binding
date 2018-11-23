//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* TODO
	*/
open external class Interpolations(){

	/**
	* t -- interpolation weight. p0, p1, p2, p3 -- the points defining the spline curve. Used internally by [page:SplineCurve SplineCurve].
	*/
	open fun CatmullRom(t: Double = definedExternally, p0: Double = definedExternally, p1: Double = definedExternally, p2: Double = definedExternally, p3: Double = definedExternally) : Double


	/**
	* t -- interpolation weight. p0, p1, p2 -- the starting, control and end points defining the curve. Used internally by [page:QuadraticBezierCurve3 QuadraticBezierCurve3], [page:QuadraticBezierCurve QuadraticBezierCurve] and [page:Font Font].
	*/
	open fun QuadraticBezier(t: Double = definedExternally, p0: Double = definedExternally, p1: Double = definedExternally, p2: Double = definedExternally) : Double


	/**
	* t -- interpolation weight. p0, p1, p2, p3 -- the starting, control(twice) and end points defining the curve. Used internally by [page:CubicBezierCurve3 CubicBezierCurve3], [page:CubicBezierCurve CubicBezierCurve] and [page:Font Font].
	*/
	open fun CubicBezier(t: Double = definedExternally, p0: Double = definedExternally, p1: Double = definedExternally, p2: Double = definedExternally, p3: Double = definedExternally) : Double
}