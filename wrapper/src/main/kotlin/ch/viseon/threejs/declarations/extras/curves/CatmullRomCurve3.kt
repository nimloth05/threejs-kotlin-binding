@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Create a smooth 3d spline curve from a series of points using the [link:https://en.wikipedia.org/wiki/Centripetal_Catmull-Rom_spline Catmull-Rom] algorithm.
	*/
open external class CatmullRomCurve3(points: Array<dynamic> = definedExternally, closed: Boolean = definedExternally, curveType: String = definedExternally, tension: Double = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* The array of [page:Vector3] points that define the curve. It needs at least two entries.
	*/
	open var points: Array<dynamic>  = definedExternally


	/**
	* The curve will loop back onto itself when this is true.
	*/
	open var closed: Boolean  = definedExternally


	/**
	* Possible values are **centripetal**, **chordal** and **catmullrom**.
	*/
	open var curveType: String  = definedExternally


	/**
	* When [page:.curveType] is **catmullrom**, defines catmullrom's tension.
	*/
	open var tension: Double  = definedExternally
}