@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* Base class for implementing loaders.
	*/
open external class Loader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS. Default is **anonymous**.
	*/
	open var crossOrigin: String  = definedExternally


	/**
	* The [page:LoadingManager loadingManager] the loader is using. Default is [page:DefaultLoadingManager].
	*/
	open var manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager  = definedExternally


	/**
	* The base path from which the asset will be loaded. Default is the empty string.
	*/
	open var path: String  = definedExternally


	/**
	* The base path from which additional resources like textures will be loaded. Default is the empty string.
	*/
	open var resourcePath: String  = definedExternally


	/**
	* This method needs to be implement by all concrete loaders. It holds the logic for loading the asset from the backend.
	*/
	open fun load() : Unit


	/**
	* This method needs to be implement by all concrete loaders. It holds the logic for parsing the asset into three.js entities.
	*/
	open fun parse() : Unit


	/**
	* [page:String crossOrigin] — The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS.
	*/
	open fun setCrossOrigin(crossOrigin: String = definedExternally) : ch.viseon.threejs.declarations.loaders.Loader


	/**
	* [page:String path] — Set the base path for the asset.
	*/
	open fun setPath(path: String = definedExternally) : ch.viseon.threejs.declarations.loaders.Loader


	/**
	* [page:String resourcePath] — Set the base path for dependent resources like textures.
	*/
	open fun setResourcePath(resourcePath: String = definedExternally) : ch.viseon.threejs.declarations.loaders.Loader
}