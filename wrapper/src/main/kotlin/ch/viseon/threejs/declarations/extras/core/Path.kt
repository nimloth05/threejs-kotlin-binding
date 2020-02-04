@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* A 2D path representation. The class provides methods for creating paths and contours of 2D shapes similar to the 2D Canvas API.
	*/
open external class Path(points: Array<dynamic> = definedExternally): ch.viseon.threejs.declarations.extras.core.CurvePath{

	/**
	* The current offset of the path. Any new [page:Curve] added will start here.
	*/
	open var currentPoint: Array<dynamic>  = definedExternally


	/**
	* x, y -- The absolute center of the arc. radius -- The radius of the arc. startAngle -- The start angle in radians. endAngle -- The end angle in radians. clockwise -- Sweep the arc clockwise. Defaults to **false**. Adds an absolutely positioned [page:EllipseCurve EllipseCurve] to the path.
	*/
	open fun absarc(x: Double = definedExternally, y: Double = definedExternally, radius: Double = definedExternally, startAngle: Double = definedExternally, endAngle: Double = definedExternally, clockwise: Boolean = definedExternally) : Path


	/**
	* x, y -- The absolute center of the ellipse. xRadius -- The radius of the ellipse in the x axis. yRadius -- The radius of the ellipse in the y axis. startAngle -- The start angle in radians. endAngle -- The end angle in radians. clockwise -- Sweep the ellipse clockwise. Defaults to false. rotation -- The rotation angle of the ellipse in radians, counterclockwise from the positive X axis. Optional, defaults to 0. Adds an absolutely positioned [page:EllipseCurve EllipseCurve] to the path.
	*/
	open fun absellipse(x: Double = definedExternally, y: Double = definedExternally, xRadius: Double = definedExternally, yRadius: Double = definedExternally, startAngle: Double = definedExternally, endAngle: Double = definedExternally, clockwise: Boolean = definedExternally, rotation: Double = definedExternally) : Path


	/**
	* x, y -- The center of the arc offset from the last call. radius -- The radius of the arc. startAngle -- The start angle in radians. endAngle -- The end angle in radians. clockwise -- Sweep the arc clockwise. Defaults to **false**. Adds an [page:EllipseCurve EllipseCurve] to the path, positioned relative to [page:.currentPoint].
	*/
	open fun arc(x: Double = definedExternally, y: Double = definedExternally, radius: Double = definedExternally, startAngle: Double = definedExternally, endAngle: Double = definedExternally, clockwise: Boolean = definedExternally) : Path


	/**
	* This creates a bezier curve from [page:.currentPoint] with (cp1X, cp1Y) and (cp2X, cp2Y) as control points and updates [page:.currentPoint] to x and y.
	*/
	open fun bezierCurveTo(cp1X: Double = definedExternally, cp1Y: Double = definedExternally, cp2X: Double = definedExternally, cp2Y: Double = definedExternally, x: Double = definedExternally, y: Double = definedExternally) : Path


	/**
	* x, y -- The center of the ellipse offset from the last call. xRadius -- The radius of the ellipse in the x axis. yRadius -- The radius of the ellipse in the y axis. startAngle -- The start angle in radians. endAngle -- The end angle in radians. clockwise -- Sweep the ellipse clockwise. Defaults to **false**. rotation -- The rotation angle of the ellipse in radians, counterclockwise from the positive X axis. Optional, defaults to **0**. Adds an [page:EllipseCurve EllipseCurve] to the path, positioned relative to [page:.currentPoint].
	*/
	open fun ellipse(x: Double = definedExternally, y: Double = definedExternally, xRadius: Double = definedExternally, yRadius: Double = definedExternally, startAngle: Double = definedExternally, endAngle: Double = definedExternally, clockwise: Boolean = definedExternally, rotation: Double = definedExternally) : Path


	/**
	* Connects a [page:LineCurve] from [page:.currentPoint] to x, y onto the path.
	*/
	open fun lineTo(x: Double = definedExternally, y: Double = definedExternally) : Path


	/**
	* Move the [page:.currentPoint] to x, y.
	*/
	open fun moveTo(x: Double = definedExternally, y: Double = definedExternally) : Path


	/**
	* Creates a quadratic curve from [page:.currentPoint] with cpX and cpY as control point and updates [page:.currentPoint] to x and y.
	*/
	open fun quadraticCurveTo(cpX: Double = definedExternally, cpY: Double = definedExternally, x: Double = definedExternally, y: Double = definedExternally) : Path


	/**
	* points -- array of [page:Vector2 Vector2s]. Points are added to the [page:CurvePath.curves curves] array as [page:LineCurve LineCurves].
	*/
	open fun setFromPoints(vector2s: Array<dynamic> = definedExternally) : Path


	/**
	* points - An array of [page:Vector2 Vector2s] Connects a new [page:SplineCurve] onto the path.
	*/
	open fun splineThru(points: Array<dynamic> = definedExternally) : Path
}