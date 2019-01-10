//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Creates a 2d curve in the shape of an ellipse. Setting the [page:Number xRadius] equal to the [page:Number yRadius] will result in a circle.
	*/
open external class EllipseCurve(aX: Double = definedExternally, aY: Double = definedExternally, xRadius: Double = definedExternally, yRadius: Double = definedExternally, aStartAngle: Double = definedExternally, aEndAngle: Double = definedExternally, aClockwise: Boolean = definedExternally, aRotation: Double = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* Used to check whether this or derived classes are EllipseCurves. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isEllipseCurve: Boolean  = definedExternally


	/**
	* The X center of the ellipse.
	*/
	open var aX: Double  = definedExternally


	/**
	* The Y center of the ellipse.
	*/
	open var aY: Double  = definedExternally


	/**
	* The radius of the ellipse in the x direction.
	*/
	open var xRadius: Double  = definedExternally


	/**
	* The radius of the ellipse in the y direction.
	*/
	open var yRadius: Double  = definedExternally


	/**
	* The start angle of the curve in radians starting from the middle right side.
	*/
	open var aStartAngle: Double  = definedExternally


	/**
	* The end angle of the curve in radians starting from the middle right side.
	*/
	open var aEndAngle: Double  = definedExternally


	/**
	* Whether the ellipse is drawn clockwise.
	*/
	open var aClockwise: Boolean  = definedExternally


	/**
	* The rotation angle of the ellipse in radians, counterclockwise from the positive X axis (optional). Default is **0**.
	*/
	open var aRotation: Double  = definedExternally
}