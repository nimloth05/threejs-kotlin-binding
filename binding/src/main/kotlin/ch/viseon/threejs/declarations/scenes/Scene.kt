//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.scenes

	/**
	* Scenes allow you to set up what and where is to be rendered by three.js. This is where you place objects, lights and cameras.
	*/
open external class Scene(): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* A [page:Fog fog] instance defining the type of fog that affects everything rendered in the scene. Default is null.
	*/
	open var fog: ch.viseon.threejs.declarations.scenes.Fog  = definedExternally


	/**
	* If not null, it will force everything in the scene to be rendered with that material. Default is null.
	*/
	open var overrideMaterial: ch.viseon.threejs.declarations.materials.Material  = definedExternally


	/**
	* Default is true. If set, then the renderer checks every frame if the scene and its objects needs matrix updates. When it isn't, then you have to maintain all matrices in the scene yourself.
	*/
	open var autoUpdate: Boolean  = definedExternally


	/**
	* If not null, sets the background used when rendering the scene, and is always rendered first. Can be set to a [page:Color] which sets the clear color, a [page:Texture] covering the canvas, or a [page:CubeTexture]. Default is null.
	*/
	open var background: dynamic/*Object*/  = definedExternally


	/**
	* Return the scene data in JSON format.
	*/
	open fun toJSON() : JSON
}