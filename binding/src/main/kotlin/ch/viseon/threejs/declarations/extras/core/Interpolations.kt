//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* TODO
	*/
open external class Interpolations(){

	/**
	* t -- interpolation weight. p0, p1, p2, p3 -- the points defining the spline curve. Used internally by [page:SplineCurve SplineCurve].
	*/
	open fun CatmullRom(t: Float = definedExternally, p0: Float = definedExternally, p1: Float = definedExternally, p2: Float = definedExternally, p3: Float = definedExternally) : Float


	/**
	* t -- interpolation weight. p0, p1, p2 -- the starting, control and end points defining the curve. Used internally by [page:QuadraticBezierCurve3 QuadraticBezierCurve3], [page:QuadraticBezierCurve QuadraticBezierCurve] and [page:Font Font].
	*/
	open fun QuadraticBezier(t: Float = definedExternally, p0: Float = definedExternally, p1: Float = definedExternally, p2: Float = definedExternally) : Float


	/**
	* t -- interpolation weight. p0, p1, p2, p3 -- the starting, control(twice) and end points defining the curve. Used internally by [page:CubicBezierCurve3 CubicBezierCurve3], [page:CubicBezierCurve CubicBezierCurve] and [page:Font Font].
	*/
	open fun CubicBezier(t: Float = definedExternally, p0: Float = definedExternally, p1: Float = definedExternally, p2: Float = definedExternally, p3: Float = definedExternally) : Float
}