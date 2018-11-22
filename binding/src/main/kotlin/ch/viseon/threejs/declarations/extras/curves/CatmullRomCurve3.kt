//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Create a smooth 3d spline curve from a series of points using the [link:https://en.wikipedia.org/wiki/Centripetal_Catmull-Rom_spline Catmull-Rom] algorithm.
	*/
open external class CatmullRomCurve3(points: Array<dynamic>/*Array*/ = definedExternally, closed: Boolean = definedExternally, curveType: String = definedExternally, tension: Float = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* Used to check whether this or derived classes are CatmullRomCurve3s. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isCatmullRomCurve3: Boolean  = definedExternally


	/**
	* The array of [page:Vector3] points that define the curve. It needs at least two entries.
	*/
	open var points: Array<dynamic>/*Array*/  = definedExternally


	/**
	* The curve will loop back onto itself when this is true.
	*/
	open var closed: Boolean  = definedExternally


	/**
	* Possible values are **centripetal**, **chordal** and **catmullrom**.
	*/
	open var curveType: String  = definedExternally


	/**
	* When [page:.type] is **catmullrom**, defines catmullrom's tension.
	*/
	open var tension: Float  = definedExternally
}