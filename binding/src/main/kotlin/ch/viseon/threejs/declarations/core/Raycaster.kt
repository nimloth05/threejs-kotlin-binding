//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* This class is designed to assist with [link:https://en.wikipedia.org/wiki/Ray_casting raycasting]. Raycasting is used for mouse picking (working out what objects in the 3d space the mouse is over) amongst other things.
	*/
open external class Raycaster(origin: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, direction: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, near: Double = definedExternally, far: Double = definedExternally){

	/**
	* The far factor of the raycaster. This value indicates which objects can be discarded based on the distance. This value shouldn't be negative and should be larger than the near property.
	*/
	open var far: Double  = definedExternally


	/**
	* The precision factor of the raycaster when intersecting [page:Line] objects.
	*/
	open var linePrecision: Double  = definedExternally


	/**
	* The near factor of the raycaster. This value indicates which objects can be discarded based on the distance. This value shouldn't be negative and should be smaller than the far property.
	*/
	open var near: Double  = definedExternally


	/**
	* An object with the following properties: { Mesh: {}, Line: {}, LOD: {}, Points: { threshold: 1 }, Sprite: {} }
	*/
	open var params: dynamic  = definedExternally


	/**
	* The [Page:Ray] used for the raycasting.
	*/
	open var ray: ch.viseon.threejs.declarations.math.Ray  = definedExternally


	/**
	* [page:Vector3 origin] — The origin vector where the ray casts from. [page:Vector3 direction] — The normalized direction vector that gives direction to the ray.
Updates the ray with a new origin and direction.
	*/
	open fun set(origin: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, direction: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : dynamic


	/**
	* [page:Vector2 coords] — 2D coordinates of the mouse, in normalized device coordinates (NDC)---X and Y components should be between -1 and 1. [page:Camera camera] — camera from which the ray should originate
Updates the ray with a new origin and direction.
	*/
	open fun setFromCamera(coords: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally) : dynamic


	/**
	* [page:Object3D object] — The object to check for intersection with the ray. [page:Boolean recursive] — If true, it also checks all descendants. Otherwise it only checks intersection with the object. Default is false. [page:Array optionalTarget] — (optional) target to set the result. Otherwise a new [page:Array] is instantiated. If set, you must clear this array prior to each call (i.e., array.length = 0;).
Checks all intersection between the ray and the object with or without the descendants. Intersections are returned sorted by distance, closest first. An array of intersections is returned...
	*/
	open fun intersectObject(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, recursive: Boolean = definedExternally, optionalTarget: Array<dynamic> = definedExternally) : Array<ch.viseon.threejs.declarations.Intersection>


	/**
	* [page:Array objects] — The objects to check for intersection with the ray. [page:Boolean recursive] — If true, it also checks all descendants of the objects. Otherwise it only checks intersection with the objects. Default is false. [page:Array optionalTarget] — (optional) target to set the result. Otherwise a new [page:Array] is instantiated. If set, you must clear this array prior to each call (i.e., array.length = 0;).
Checks all intersection between the ray and the objects with or without the descendants. Intersections are returned sorted by distance, closest first. Intersections are of the same form as those returned by [page:.intersectObject].
	*/
	open fun intersectObjects(objects: Array<dynamic> = definedExternally, recursive: Boolean = definedExternally, optionalTarget: Array<dynamic> = definedExternally) : Array<ch.viseon.threejs.declarations.Intersection>
}