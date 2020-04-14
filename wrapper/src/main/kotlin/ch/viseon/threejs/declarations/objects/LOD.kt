@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* Level of Detail - show meshes with more or less geometry based on distance from the camera. Every level is associated with an object, and rendering can be switched between them at the distances specified. Typically you would create, say, three meshes, one for far away (low detail), one for mid range (medium detail) and one for close up (high detail).
	*/
open external class LOD(): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Whether the LOD object is updated automatically by the renderer per frame or not. If set to false, you have to call [page:LOD.update]() in the render loop by yourself. Default is true.
	*/
	open var autoUpdate: Boolean  = definedExternally


	/**
	* An array of [page:object level] objects Each level is an object with two properties: [page:Object3D object] - The [page:Object3D] to display at this level. [page:Float distance] - The distance at which to display this level of detail.
	*/
	open var levels: Array<dynamic>  = definedExternally


	/**
	* [page:Object3D object] - The [page:Object3D] to display at this level. [page:Float distance] - The distance at which to display this level of detail. Adds a mesh that will display at a certain distance and greater. Typically the further away the distance, the lower the detail on the mesh.
	*/
	open fun addLevel(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, distance: Double = definedExternally) : LOD


	/**
	* Returns a clone of this LOD object and its associated distance specific objects.
	*/
	open fun clone() : ch.viseon.threejs.declarations.objects.LOD


	/**
	* Get the currently active LOD level. As index of the levels array.
	*/
	open fun getCurrentLevel() : Int


	/**
	* Get a reference to the first [page:Object3D] (mesh) that is greater than [page:Float distance].
	*/
	open fun getObjectForDistance(distance: Double = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* Get intersections between a casted [page:Ray] and this LOD. [page:Raycaster.intersectObject] will call this method.
	*/
	override fun raycast(raycaster: ch.viseon.threejs.declarations.core.Raycaster, intersects: Array<dynamic>) : Array<dynamic>


	/**
	* Create a JSON structure with details of this LOD object.
	*/
	open fun toJSON() : dynamic


	/**
	* Set the visibility of each [page:levels level]'s [page:Object3D object] based on distance from the [page:Camera camera].
	*/
	open fun update(camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally) : dynamic
}