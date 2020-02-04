@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* A class for displaying points. The points are rendered by the [page:WebGLRenderer] using [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements gl.POINTS].
	*/
open external class Points(geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* An instance of [page:Geometry] or [page:BufferGeometry] (or derived classes), defining the object's structure. Its recommended to always use a [page:BufferGeometry] if possible for best performance.
	*/
	open var geometry: ch.viseon.threejs.declarations.core.Geometry  = definedExternally


	/**
	* An instance of [page:Material], defining the object's appearance. Default is a [page:PointsMaterial].
	*/
	open var material: ch.viseon.threejs.declarations.materials.Material  = definedExternally


	/**
	* An array of weights typically from 0-1 that specify how much of the morph is applied. Undefined by default, but reset to a blank array by [page:Points.updateMorphTargets updateMorphTargets].
	*/
	open var morphTargetInfluences: Array<dynamic>  = definedExternally


	/**
	* A dictionary of morphTargets based on the morphTarget.name property. Undefined by default, but rebuilt [page:Points.updateMorphTargets updateMorphTargets].
	*/
	open var morphTargetDictionary: dynamic  = definedExternally


	/**
	* Get intersections between a casted ray and this Points. [page:Raycaster.intersectObject] will call this method.
	*/
	override fun raycast(raycaster: ch.viseon.threejs.declarations.core.Raycaster, intersects: Array<dynamic>) : dynamic


	/**
	* Returns a clone of this Points object and its descendants.
	*/
	open fun clone() : ch.viseon.threejs.declarations.objects.Points


	/**
	* Updates the morphTargets to have no influence on the object. Resets the [page:Points.morphTargetInfluences morphTargetInfluences] and [page:Points.morphTargetDictionary morphTargetDictionary] properties.
	*/
	open fun updateMorphTargets() : dynamic
}