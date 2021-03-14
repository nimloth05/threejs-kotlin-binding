@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* Class representing triangular [link:https://en.wikipedia.org/wiki/Polygon_mesh polygon mesh] based objects. Also serves as a base for other classes such as [page:SkinnedMesh].
	*/
open external class Mesh(geometry: ch.viseon.threejs.declarations.core.BufferGeometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	constructor(geometry: ch.viseon.threejs.declarations.core.BufferGeometry? = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally)
	/**
	* An instance of [page:BufferGeometry] (or derived classes), defining the object's structure.
	*/
	open var geometry: ch.viseon.threejs.declarations.core.BufferGeometry  = definedExternally


	/**
	* An instance of material derived from the [page:Material] base class or an array of materials, defining the object's appearance. Default is a [page:MeshBasicMaterial].
	*/
	open var material: ch.viseon.threejs.declarations.materials.Material  = definedExternally


	/**
	* An array of weights typically from 0-1 that specify how much of the morph is applied. Undefined by default, but reset to a blank array by [page:Mesh.updateMorphTargets updateMorphTargets].
	*/
	open var morphTargetInfluences: Array<dynamic>  = definedExternally


	/**
	* A dictionary of morphTargets based on the morphTarget.name property. Undefined by default, but rebuilt [page:Mesh.updateMorphTargets updateMorphTargets].
	*/
	open var morphTargetDictionary: dynamic  = definedExternally


	/**
	* Returns a clone of this [name] object and its descendants.
	*/
	open fun clone() : ch.viseon.threejs.declarations.objects.Mesh


	/**
	* Get intersections between a casted ray and this mesh. [page:Raycaster.intersectObject] will call this method, but the results are not ordered.
	*/
	override fun raycast(raycaster: ch.viseon.threejs.declarations.core.Raycaster, intersects: Array<dynamic>) : dynamic


	/**
	* Updates the morphTargets to have no influence on the object. Resets the [page:Mesh.morphTargetInfluences morphTargetInfluences] and [page:Mesh.morphTargetDictionary morphTargetDictionary] properties.
	*/
	open fun updateMorphTargets() : dynamic
}