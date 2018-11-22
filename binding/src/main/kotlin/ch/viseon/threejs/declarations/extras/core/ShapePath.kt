//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.core

	/**
	* This class is used to convert a series of shapes to an array of [page:Path]s, for example an SVG shape to a path (see the example below). It is used internally by [page:Font] to convert a font in JSON format to a series of paths.
	*/
open external class ShapePath(): ch.viseon.threejs.declarations.extras.core.CurvePath{

	/**
	* Array of [page:Path]s.
	*/
	open var subPaths: Array<dynamic>/*array*/  = definedExternally


	/**
	* The current [page:Path] that is being generated.
	*/
	open var currentPath: Array<dynamic>/*array*/  = definedExternally


	/**
	* Starts a new [page:Path] and calls [page:Path.moveTo]( x, y ) on that [page:Path]. Also points [page:ShapePath.currentPath currentPath] to that [page:Path].
	*/
	open fun moveTo(x: Float = definedExternally, y: Float = definedExternally) : dynamic/*null*/


	/**
	* This creates a line from the [page:ShapePath.currentPath currentPath]'s offset to X and Y and updates the offset to X and Y.
	*/
	open fun lineTo(x: Float = definedExternally, y: Float = definedExternally) : dynamic/*null*/


	/**
	* This creates a quadratic curve from the [page:ShapePath.currentPath currentPath]'s offset to x and y with cpX and cpY as control point and updates the [page:ShapePath.currentPath currentPath]'s offset to x and y.
	*/
	open fun quadraticCurveTo(cpX: Float = definedExternally, cpY: Float = definedExternally, x: Float = definedExternally, y: Float = definedExternally) : dynamic/*null*/


	/**
	* This creates a bezier curve from the [page:ShapePath.currentPath currentPath]'s offset to x and y with cp1X, cp1Y and cp1X, cp1Y as control points and updates the [page:ShapePath.currentPath currentPath]'s offset to x and y.
	*/
	open fun bezierCurveTo(cp1X: Float = definedExternally, cp1Y: Float = definedExternally, cp2X: Float = definedExternally, cp2Y: Float = definedExternally, x: Float = definedExternally, y: Float = definedExternally) : dynamic/*null*/


	/**
	* points - An array of [page:Vector2]s
Connects a new [page:SplineCurve] onto the [page:ShapePath.currentPath currentPath].
	*/
	open fun splineThru(points: Array<dynamic>/*Array*/ = definedExternally) : dynamic/*null*/


	/**
	* isCCW -- Changes how solids and holes are generated noHoles -- Whether or not to generate holes
Converts the [page:ShapePath.subPaths subPaths] array into an array of Shapes. By default solid shapes are defined clockwise (CW) and holes are defined counterclockwise (CCW). If isCCW is set to true, then those are flipped. If the parameter noHoles is set to true then all paths are set as solid shapes and isCCW is ignored.
	*/
	open fun toShapes(isCCW: Boolean = definedExternally, noHoles: Boolean = definedExternally) : Array<dynamic>/*Array*/
}