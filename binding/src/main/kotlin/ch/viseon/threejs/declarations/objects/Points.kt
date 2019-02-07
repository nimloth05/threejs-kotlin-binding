//Generated date 07.02.2019
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
	* Used to check whether this or derived classes are points. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isPoints: Boolean  = definedExternally


	/**
	* An instance of [page:Material], defining the object's appearance. Default is a [page:PointsMaterial] with a random color.
	*/
	open var material: ch.viseon.threejs.declarations.materials.Material  = definedExternally


	/**
	* Get intersections between a casted ray and this Points. [page:Raycaster.intersectObject] will call this method.
	*/
	override fun raycast(raycaster: ch.viseon.threejs.declarations.core.Raycaster, intersects: Array<dynamic>) : dynamic


	/**
	* Returns a clone of this Points object and its descendants.
	*/
	open fun clone() : ch.viseon.threejs.declarations.objects.Points
}