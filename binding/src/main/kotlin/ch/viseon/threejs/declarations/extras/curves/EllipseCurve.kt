//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Creates a 2d curve in the shape of an ellipse. Setting the [page:Number xRadius] equal to the [page:Number yRadius] will result in a circle.
	*/
open external class EllipseCurve(aX: Float = definedExternally, aY: Float = definedExternally, xRadius: Float = definedExternally, yRadius: Float = definedExternally, aStartAngle: Float = definedExternally, aEndAngle: Float = definedExternally, aClockwise: Boolean = definedExternally, aRotation: Float = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* Used to check whether this or derived classes are EllipseCurves. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isEllipseCurve: Boolean  = definedExternally


	/**
	* The X center of the ellipse.
	*/
	open var aX: Float  = definedExternally


	/**
	* The Y center of the ellipse.
	*/
	open var aY: Float  = definedExternally


	/**
	* The radius of the ellipse in the x direction.
	*/
	open var xRadius: Float  = definedExternally


	/**
	* The radius of the ellipse in the y direction.
	*/
	open var yRadius: Float  = definedExternally


	/**
	* The start angle of the curve in radians starting from the middle right side.
	*/
	open var aStartAngle: Float  = definedExternally


	/**
	* The end angle of the curve in radians starting from the middle right side.
	*/
	open var aEndAngle: Float  = definedExternally


	/**
	* Whether the ellipse is drawn clockwise.
	*/
	open var aClockwise: Boolean  = definedExternally


	/**
	* The rotation angle of the ellipse in radians, counterclockwise from the positive X axis (optional). Default is **0**.
	*/
	open var aRotation: Float  = definedExternally
}