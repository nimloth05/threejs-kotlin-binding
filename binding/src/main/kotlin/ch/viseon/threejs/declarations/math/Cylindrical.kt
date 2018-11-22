//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A point's [link:https://en.wikipedia.org/wiki/Cylindrical_coordinate_system cylindrical coordinates].
	*/
open external class Cylindrical(radius: Float = definedExternally, theta: Float = definedExternally, y: Float = definedExternally){
	open var radius: Float  = definedExternally

	open var theta: Float  = definedExternally

	open var y: Float  = definedExternally


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
	open fun set(radius: Float = definedExternally, theta: Float = definedExternally, y: Float = definedExternally) : ch.viseon.threejs.declarations.math.Cylindrical


	/**
	* Sets values of this cylindrical's [page:.radius radius], [page:.theta theta] and [page:.y y] properties from the [page:Vector3 Vector3].
	*/
	open fun setFromVector3(vec3: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Cylindrical


	/**
	* Sets values of this cylindrical's [page:.radius radius], [page:.theta theta] and [page:.y y] properties from Cartesian coordinates.
	*/
	open fun setFromCartesianCoords(x: Float = definedExternally, y: Float = definedExternally, z: Float = definedExternally) : ch.viseon.threejs.declarations.math.Cylindrical
}