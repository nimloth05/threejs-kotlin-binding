@file:JsModule("three")
package ch.viseon.threejs.declarations.scenes

	/**
	* Scenes allow you to set up what and where is to be rendered by three.js. This is where you place objects, lights and cameras.
	*/
open external class Scene: ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Default is true. If set, then the renderer checks every frame if the scene and its objects needs matrix updates. When it isn't, then you have to maintain all matrices in the scene yourself.
	*/
	open var autoUpdate: Boolean  = definedExternally


	/**
	* If not null, sets the background used when rendering the scene, and is always rendered first. Can be set to a [page:Color] which sets the clear color, a [page:Texture] covering the canvas, a cubemap as a [page:CubeTexture] or [page:WebGLCubeRenderTarget] or an equirectangular as a [page:Texture] . Default is null.
	*/
	open var background: dynamic  = definedExternally


	/**
	* If not null, this texture is set as the environment map for all physical materials in the scene. However, it's not possible to overwrite an existing texture assigned to [page:MeshStandardMaterial.envMap]. Default is null.
	*/
	open var environment: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* A [page:Fog fog] instance defining the type of fog that affects everything rendered in the scene. Default is null.
	*/
	open var fog: ch.viseon.threejs.declarations.scenes.Fog  = definedExternally


	/**
	* If not null, it will force everything in the scene to be rendered with that material. Default is null.
	*/
	open var overrideMaterial: ch.viseon.threejs.declarations.materials.Material  = definedExternally


	/**
	* meta -- object containing metadata such as textures or images for the scene. Convert the scene to three.js [link:https://github.com/mrdoob/three.js/wiki/JSON-Object-Scene-format-4 JSON Object/Scene format].
	*/
	override fun toJSON(meta: dynamic) : dynamic
}