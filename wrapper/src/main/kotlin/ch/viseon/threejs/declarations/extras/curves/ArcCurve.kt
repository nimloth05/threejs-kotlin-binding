@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Alias for [page:EllipseCurve]
	*/
open external class ArcCurve(): ch.viseon.threejs.declarations.extras.curves.EllipseCurve{

	/**
	* Used to check whether this or derived classes are ArcCurves. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isArcCurve: Boolean  = definedExternally
}