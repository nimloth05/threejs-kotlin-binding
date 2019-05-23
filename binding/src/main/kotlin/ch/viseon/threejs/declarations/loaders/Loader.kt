//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* Base class for implementing loaders.
	*/
open external class Loader(){

	/**
	* Will be called when load starts.
The default is a function with empty body.
	*/
	open var onLoadStart: dynamic  = definedExternally


	/**
	* Will be called while load progresses.
The default is a function with empty body.
	*/
	open var onLoadProgress: dynamic  = definedExternally


	/**
	* Will be called when load completes.
The default is a function with empty body.
	*/
	open var onLoadComplete: dynamic  = definedExternally


	/**
	* The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS. Default is **"anonymous"**.
	*/
	open var crossOrigin: String  = definedExternally


	/**
	* [page:Object m] — The parameters to create the material. [page:String texturePath] — The base path of the textures.
Creates the Material based on the parameters m.
	*/
	open fun createMaterial(m: dynamic = definedExternally, texturePath: String = definedExternally) : ch.viseon.threejs.declarations.materials.Material


	/**
	* [page:Array materials] — an array of parameters to create materials. [page:String texturePath] — The base path of the textures.
Creates an array of [page:Material] based on the array of parameters m. The index of the parameters decide the correct index of the materials.
	*/
	open fun initMaterials(materials: Array<dynamic> = definedExternally, texturePath: String = definedExternally) : Array<dynamic>


	/**
	* [page:Object regex] — A regular expression. [page:Loader loader] — The loader.
Registers a loader with the given regular expression.
	*/
	open fun add(regex: dynamic = definedExternally, loader: ch.viseon.threejs.declarations.loaders.Loader = definedExternally) : dynamic


	/**
	* [page:String file] — The file path.
Can be used to retrieve the registered loader for the given file path.
	*/
	open fun get(file: String = definedExternally) : dynamic
}