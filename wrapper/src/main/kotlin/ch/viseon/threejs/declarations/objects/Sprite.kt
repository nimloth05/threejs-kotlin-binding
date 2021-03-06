@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* A sprite is a plane that always faces towards the camera, generally with a partially transparent texture applied. Sprites do not cast shadows, setting castShadow = true will have no effect.
	*/
open external class Sprite(material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* An instance of [page:SpriteMaterial], defining the object's appearance. Default is a white [page:SpriteMaterial].
	*/
	open var material: ch.viseon.threejs.declarations.materials.SpriteMaterial  = definedExternally


	/**
	* The sprite's anchor point, and the point around which the sprite rotates. A value of (0.5, 0.5) corresponds to the midpoint of the sprite. A value of (0, 0) corresponds to the lower left corner of the sprite. The default is (0.5, 0.5).
	*/
	open var center: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* Returns a clone of this Sprite object and any descendants.
	*/
	open fun clone() : ch.viseon.threejs.declarations.objects.Sprite


	/**
	* Copies the properties of the passed sprite to this one.
	*/
	open fun copy(sprite: ch.viseon.threejs.declarations.objects.Sprite = definedExternally) : ch.viseon.threejs.declarations.objects.Sprite


	/**
	* Get intersections between a casted ray and this sprite. [page:Raycaster.intersectObject]() will call this method. The raycaster must be initialized by calling [page:Raycaster.setFromCamera]() before raycasting against sprites.
	*/
	override fun raycast(raycaster: ch.viseon.threejs.declarations.core.Raycaster, intersects: Array<dynamic>) : dynamic
}