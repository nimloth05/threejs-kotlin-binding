@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Create a smooth 2d spline curve from a series of points. Internally this uses [page:Interpolations.CatmullRom] to create the curve.
	*/
open external class SplineCurve(points: Array<dynamic> = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* The array of [page:Vector2] points that define the curve.
	*/
	open var points: Array<dynamic>  = definedExternally
}