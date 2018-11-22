//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A point's [link:https://en.wikipedia.org/wiki/Spherical_coordinate_system spherical coordinates].
	*/
open external class Spherical(radius: Float = definedExternally, phi: Float = definedExternally, theta: Float = definedExternally){
	open var radius: Float  = definedExternally

	open var phi: Float  = definedExternally

	open var theta: Float  = definedExternally


	/**
	* Returns a new plane with the same [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Copies the values of the passed Spherical's [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties to this spherical.
	*/
	open fun copy(s: ch.viseon.threejs.declarations.math.Spherical = definedExternally) : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Restricts the polar angle [page:.phi phi] to be between 0.000001 and pi - 0.000001.
	*/
	open fun makeSafe() : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Sets values of this spherical's [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties.
	*/
	open fun set(radius: Float = definedExternally, phi: Float = definedExternally, theta: Float = definedExternally) : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Sets values of this spherical's [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties from the [page:Vector3 Vector3].
	*/
	open fun setFromVector3(vec3: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Sets values of this spherical's [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties from Cartesian coordinates.
	*/
	open fun setFromCartesianCoords(x: Float = definedExternally, y: Float = definedExternally, z: Float = definedExternally) : ch.viseon.threejs.declarations.math.Spherical
}