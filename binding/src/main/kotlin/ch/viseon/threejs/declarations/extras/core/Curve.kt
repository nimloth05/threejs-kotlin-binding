//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* An abstract base class for creating a [name] object that contains methods for interpolation. For an array of [name]s see [page:CurvePath].
	*/
open external class Curve(){

	/**
	* This value determines the amount of divisions when calculating the cumulative segment lengths of a curve via [page:.getLengths]. To ensure precision when using methods like [page:.getSpacedPoints], it is recommended to increase [page:.arcLengthDivisions] if the curve is very large. Default is 200.
	*/
	open var arcLengthDivisions: Int  = definedExternally


	/**
	* [page:Float t] - A position on the curve. Must be in the range [ 0, 1 ]. [page:Vector optionalTarget] — (optional) If specified, the result will be copied into this Vector, otherwise a new Vector will be created. Returns a vector for a given position on the curve.
	*/
	open fun getPoint(t: Double = definedExternally, optionalTarget: dynamic = definedExternally) : dynamic


	/**
	* [page:Float u] - A position on the curve according to the arc length. Must be in the range [ 0, 1 ]. [page:Vector optionalTarget] — (optional) If specified, the result will be copied into this Vector, otherwise a new Vector will be created. Returns a vector for a given position on the curve according to the arc length.
	*/
	open fun getPointAt(u: Double = definedExternally, optionalTarget: dynamic = definedExternally) : dynamic


	/**
	* divisions -- number of pieces to divide the curve into. Default is **5**. Returns a set of divisions + 1 points using getPoint( t ).
	*/
	open fun getPoints(divisions: Int = definedExternally) : Array<dynamic>


	/**
	* divisions -- number of pieces to divide the curve into. Default is **5**. Returns a set of divisions + 1 equi-spaced points using getPointAt( u ).
	*/
	open fun getSpacedPoints(divisions: Int = definedExternally) : Array<dynamic>


	/**
	* Get total curve arc length.
	*/
	open fun getLength() : Double


	/**
	* Get list of cumulative segment lengths.
	*/
	open fun getLengths(divisions: Int = definedExternally) : Array<dynamic>


	/**
	* Update the cumlative segment distance cache.
	*/
	open fun updateArcLengths() : dynamic


	/**
	* Given u in the range ( 0 .. 1 ), returns [page:Float t] also in the range ( 0 .. 1 ). u and t can then be used to give you points which are equidistant from the ends of the curve, using [page:.getPoint].
	*/
	open fun getUtoTmapping(u: Double = definedExternally, distance: Double = definedExternally) : Double


	/**
	* Returns a unit vector tangent at t. If the derived curve does not implement its tangent derivation, two points a small delta apart will be used to find its gradient which seems to give a reasonable approximation.
	*/
	open fun getTangent(t: Double = definedExternally) : dynamic


	/**
	* Returns tangent at a point which is equidistant to the ends of the curve from the point given in [page:.getTangent].
	*/
	open fun getTangentAt(u: Double = definedExternally) : dynamic


	/**
	* Generates the Frenet Frames. Used in geometries like [page:TubeGeometry] or [page:ExtrudeGeometry].
	*/
	open fun computeFrenetFrames(segments: Int = definedExternally, closed: Boolean = definedExternally) : dynamic


	/**
	* Creates a clone of this instance.
	*/
	open fun clone() : ch.viseon.threejs.declarations.extras.core.Curve


	/**
	* Copies another [name] object to this instance.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.extras.core.Curve = definedExternally) : ch.viseon.threejs.declarations.extras.core.Curve


	/**
	* Returns a JSON object representation of this instance.
	*/
	open fun toJSON() : dynamic


	/**
	* Copies the data from the given JSON object to this instance.
	*/
	open fun fromJSON(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.extras.core.Curve
}