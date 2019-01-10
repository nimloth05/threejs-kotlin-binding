//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Create a smooth 2d spline curve from a series of points. Internally this uses [page:Interpolations.CatmullRom] to create the curve.
	*/
open external class SplineCurve(points: Array<dynamic>/*Array*/ = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* Used to check whether this or derived classes are SplineCurves. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isSplineCurve: Boolean  = definedExternally


	/**
	* The array of [page:Vector2] points that define the curve.
	*/
	open var points: Array<dynamic>/*Array*/  = definedExternally
}