//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* Class representing triangular [link:https://en.wikipedia.org/wiki/Polygon_mesh polygon mesh] based objects. Also serves as a base for other classes such as [page:SkinnedMesh].
	*/
open external class Mesh(geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Determines how the mesh triangles are constructed from the vertices. See the draw mode [page:DrawModes constants] for all possible values. Default is [page:DrawModes TrianglesDrawMode].
	*/
	open var drawMode: Int  = definedExternally


	/**
	* Used to check whether this or derived classes are meshes. Default is **true**. You should not change this, as it is used internally for optimisation.
	*/
	open var isMesh: Boolean  = definedExternally


	/**
	* An instance of [page:Geometry] or [page:BufferGeometry] (or derived classes), defining the object's structure. It's recommended to always use a [page:BufferGeometry] if possible for best performance.
	*/
	open var geometry: ch.viseon.threejs.declarations.core.Geometry  = definedExternally


	/**
	* An instance of material derived from the [page:Material] base class or an array of materials, defining the object's appearance. Default is a [page:MeshBasicMaterial] with a random color.
	*/
	open var material: ch.viseon.threejs.declarations.materials.Material  = definedExternally


	/**
	* An array of weights typically from 0-1 that specify how much of the morph is applied. Undefined by default, but reset to a blank array by [page:Mesh.updateMorphTargets updateMorphTargets].
	*/
	open var morphTargetInfluences: Array<dynamic>/*Array*/  = definedExternally


	/**
	* A dictionary of morphTargets based on the morphTarget.name property. Undefined by default, but rebuilt [page:Mesh.updateMorphTargets updateMorphTargets].
	*/
	open var morphTargetDictionary: dynamic/*Object*/  = definedExternally


	/**
	* Set the value of [page:.drawMode drawMode].
	*/
	open fun setDrawMode(value: Int = definedExternally) : dynamic/*null*/


	/**
	* Returns a clone of this [name] object and its descendants.
	*/
	open fun clone() : ch.viseon.threejs.declarations.objects.Mesh


	/**
	* Get intersections between a casted ray and this mesh. [page:Raycaster.intersectObject] will call this method.
	*/
	override fun raycast(raycaster: ch.viseon.threejs.declarations.core.Raycaster, intersects: Array<dynamic>/*Array*/) : dynamic/*null*/


	/**
	* Updates the morphTargets to have no influence on the object. Resets the [page:Mesh.morphTargetInfluences morphTargetInfluences] and [page:Mesh.morphTargetDictionary morphTargetDictionary] properties.
	*/
	open fun updateMorphTargets() : dynamic/*null*/
}