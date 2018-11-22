//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* A 2D path representation. The class provides methods for creating paths and contours of 2D shapes similar to the 2D Canvas API.
	*/
open external class Path(points: Array<dynamic>/*Array*/ = definedExternally): ch.viseon.threejs.declarations.extras.core.CurvePath{

	/**
	* The current offset of the path. Any new [page:Curve] added will start here.
	*/
	open var currentPoint: Array<dynamic>/*array*/  = definedExternally


	/**
	* x, y -- The absolute center of the arc. radius -- The radius of the arc. startAngle -- The start angle in radians. endAngle -- The end angle in radians. clockwise -- Sweep the arc clockwise. Defaults to **false**. Adds an absolutely positioned [page:EllipseCurve EllipseCurve] to the path.
	*/
	open fun absarc(x: Float = definedExternally, y: Float = definedExternally, radius: Float = definedExternally, startAngle: Float = definedExternally, endAngle: Float = definedExternally, clockwise: Float = definedExternally) : dynamic/*null*/


	/**
	* x, y -- The absolute center of the ellipse. xRadius -- The radius of the ellipse in the x axis. yRadius -- The radius of the ellipse in the y axis. startAngle -- The start angle in radians. endAngle -- The end angle in radians. clockwise -- Sweep the ellipse clockwise. Defaults to false. rotation -- The rotation angle of the ellipse in radians, counterclockwise from the positive X axis. Optional, defaults to 0. Adds an absolutely positioned [page:EllipseCurve EllipseCurve] to the path.
	*/
	open fun absellipse(x: Float = definedExternally, y: Float = definedExternally, xRadius: Float = definedExternally, yRadius: Float = definedExternally, startAngle: Float = definedExternally, endAngle: Float = definedExternally, clockwise: Float = definedExternally, rotation: Float = definedExternally) : dynamic/*null*/


	/**
	* x, y -- The center of the arc offset from the last call. radius -- The radius of the arc. startAngle -- The start angle in radians. endAngle -- The end angle in radians. clockwise -- Sweep the arc clockwise. Defaults to **false**. Adds an [page:EllipseCurve EllipseCurve] to the path, positioned relative to [page:.currentPoint].
	*/
	open fun arc(x: Float = definedExternally, y: Float = definedExternally, radius: Float = definedExternally, startAngle: Float = definedExternally, endAngle: Float = definedExternally, clockwise: Float = definedExternally) : dynamic/*null*/


	/**
	* This creates a bezier curve from [page:.currentPoint] with (cp1X, cp1Y) and (cp2X, cp2Y) as control points and updates [page:.currentPoint] to x and y.
	*/
	open fun bezierCurveTo(cp1X: Float = definedExternally, cp1Y: Float = definedExternally, cp2X: Float = definedExternally, cp2Y: Float = definedExternally, x: Float = definedExternally, y: Float = definedExternally) : dynamic/*null*/


	/**
	* x, y -- The center of the ellipse offset from the last call. xRadius -- The radius of the ellipse in the x axis. yRadius -- The radius of the ellipse in the y axis. startAngle -- The start angle in radians. endAngle -- The end angle in radians. clockwise -- Sweep the ellipse clockwise. Defaults to **false**. rotation -- The rotation angle of the ellipse in radians, counterclockwise from the positive X axis. Optional, defaults to **0**. Adds an [page:EllipseCurve EllipseCurve] to the path, positioned relative to [page:.currentPoint].
	*/
	open fun ellipse(x: Float = definedExternally, y: Float = definedExternally, xRadius: Float = definedExternally, yRadius: Float = definedExternally, startAngle: Float = definedExternally, endAngle: Float = definedExternally, clockwise: Float = definedExternally, rotation: Float = definedExternally) : dynamic/*null*/


	/**
	* Connects a [page:LineCurve] from [page:.currentPoint] to x, y onto the path.
	*/
	open fun lineTo(x: Float = definedExternally, y: Float = definedExternally) : dynamic/*null*/


	/**
	* Move the [page:.currentPoint] to x, y.
	*/
	open fun moveTo(x: Float = definedExternally, y: Float = definedExternally) : dynamic/*null*/


	/**
	* Creates a quadratic curve from [page:.currentPoint] with cpX and cpY as control point and updates [page:.currentPoint] to x and y.
	*/
	open fun quadraticCurveTo(cpX: Float = definedExternally, cpY: Float = definedExternally, x: Float = definedExternally, y: Float = definedExternally) : dynamic/*null*/


	/**
	* points -- array of [page:Vector2 Vector2s]. Points are added to the [page:CurvePath.curves curves] array as [page:LineCurve LineCurves].
	*/
	open fun setFromPoints(vector2s: Array<dynamic>/*Array*/ = definedExternally) : dynamic/*null*/


	/**
	* points - An array of [page:Vector2 Vector2s] Connects a new [page:SplineCurve] onto the path.
	*/
	open fun splineThru(points: Array<dynamic>/*Array*/ = definedExternally) : dynamic/*null*/
}