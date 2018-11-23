//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A point's [link:https://en.wikipedia.org/wiki/Cylindrical_coordinate_system cylindrical coordinates].
	*/
open external class Cylindrical(radius: Double = definedExternally, theta: Double = definedExternally, y: Double = definedExternally){
	open var radius: Double  = definedExternally

	open var theta: Double  = definedExternally

	open var y: Double  = definedExternally


	/**
	* Returns a new cylindrical with the same [page:.radius radius], [page:.theta theta] and [page:.y y] properties as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Cylindrical


	/**
	* Copies the values of the passed Cylindrical's [page:.radius radius], [page:.theta theta] and [page:.y y] properties to this cylindrical.
	*/
	open fun copy(other: ch.viseon.threejs.declarations.math.Cylindrical = definedExternally) : ch.viseon.threejs.declarations.math.Cylindrical


	/**
	* Sets values of this cylindrical's [page:.radius radius], [page:.theta theta] and [page:.y y] properties.
	*/
	open fun set(radius: Double = definedExternally, theta: Double = definedExternally, y: Double = definedExternally) : ch.viseon.threejs.declarations.math.Cylindrical


	/**
	* Sets values of this cylindrical's [page:.radius radius], [page:.theta theta] and [page:.y y] properties from the [page:Vector3 Vector3].
	*/
	open fun setFromVector3(vec3: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Cylindrical


	/**
	* Sets values of this cylindrical's [page:.radius radius], [page:.theta theta] and [page:.y y] properties from Cartesian coordinates.
	*/
	open fun setFromCartesianCoords(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.math.Cylindrical
}