//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* An abstract base class extending [page:Curve]. A CurvePath is simply an array of connected curves, but retains the api of a curve.
	*/
open external class CurvePath(): ch.viseon.threejs.declarations.extras.core.Curve{

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
	* Adds together the lengths of the curves in the [page:.curves] array.
	*/
	open fun getCurveLengths() : Double
}