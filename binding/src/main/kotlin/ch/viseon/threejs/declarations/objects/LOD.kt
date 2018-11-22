//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* Level of Detail - show meshes with more or less geometry based on distance from the camera. Every level is associated with an object, and rendering can be switched between them at the distances specified. Typically you would create, say, three meshes, one for far away (low detail), one for mid range (medium detail) and one for close up (high detail).
	*/
open external class LOD(): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* An array of [page:object level] objects Each level is an object with two properties: [page:Object3D object] - The [page:Object3D] to display at this level. [page:Float distance] - The distance at which to display this level of detail.
	*/
	open var levels: Array<dynamic>/*array*/  = definedExternally


	/**
	* [page:Object3D object] - The [page:Object3D] to display at this level. [page:Float distance] - The distance at which to display this level of detail. Adds a mesh that will display at a certain distance and greater. Typically the further away the distance, the lower the detail on the mesh.
	*/
	open fun addLevel(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, distance: Float = definedExternally) : dynamic/*null*/


	/**
	* Returns a clone of this LOD object and its associated distance specific objects.
	*/
	open fun clone() : ch.viseon.threejs.declarations.objects.LOD


	/**
	* Get a reference to the first [page:Object3D] (mesh) that is greater than [page:Float distance].
	*/
	open fun getObjectForDistance(distance: Float = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* Get intersections between a casted [page:Ray] and this LOD. [page:Raycaster.intersectObject] will call this method.
	*/
	override fun raycast(raycaster: ch.viseon.threejs.declarations.core.Raycaster, intersects: Array<dynamic>/*Array*/) : Array<dynamic>/*Array*/


	/**
	* Create a JSON structure with details of this LOD object.
	*/
	open fun toJSON() : dynamic/*null*/


	/**
	* Set the visibility of each [page:levels level]'s [page:Object3D object] based on distance from the [page:Camera camera]. This needs to be called in the render loop for levels of detail to be updated dynamically.
	*/
	open fun update(camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally) : dynamic/*null*/
}