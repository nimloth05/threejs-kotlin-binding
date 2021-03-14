@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* An abstract base class extending [page:Curve]. A CurvePath is simply an array of connected curves, but retains the api of a curve.
	*/
open external class CurvePath: ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* The array of [page:Curve Curves].
	*/
	open var curves: Array<dynamic>  = definedExternally


	/**
	* Whether or not to automatically close the path.
	*/
	open var autoClose: Boolean  = definedExternally


	/**
	* Add a curve to the [page:.curves] array.
	*/
	open fun add(curve: ch.viseon.threejs.declarations.extras.core.Curve = definedExternally) : dynamic


	/**
	* Adds a [page:LineCurve lineCurve] to close the path.
	*/
	open fun closePath() : dynamic


	/**
	* Get list of cumulative curve lengths of the curves in the [page:.curves] array.
	*/
	open fun getCurveLengths() : Array<dynamic>


	/**
	* [page:Float t] - A position on the curve. Must be in the range [ 0, 1 ]. Returns a vector for a given position on the curve path.
	*/
	open fun getPoint(t: Double = definedExternally) : dynamic


	/**
	* divisions -- number of pieces to divide the curve into. Default is **12**. Returns an array of points representing a sequence of curves. The **division** parameter defines the number of pieces each curve is divided into. However, for optimization and quality purposes, the actual sampling resolution for each curve depends on its type. For example, for a [page:LineCurve], the returned number of points is always just 2.
	*/
	override fun getPoints(divisions: Int) : Array<dynamic>


	/**
	* divisions -- number of pieces to divide the curve into. Default is **40**. Returns a set of divisions + 1 equi-spaced points using getPointAt( u ).
	*/
	override fun getSpacedPoints(divisions: Int) : Array<dynamic>
}