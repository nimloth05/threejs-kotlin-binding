//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders.managers

	/**
	* Handles and keeps track of loaded and pending data. A default global instance of this class is created and used by loaders if not supplied manually - see [page:DefaultLoadingManager]. In general that should be sufficient, however there are times when it can be useful to have seperate loaders - for example if you want to show seperate loading bars for objects and textures.
	*/
open external class LoadingManager(onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally){

	/**
	* This function will be called when loading starts. The arguments are: [page:String url] — The url of the item just loaded. [page:Integer itemsLoaded] — the number of items already loaded so far. [page:Iteger itemsTotal] — the total amount of items to be loaded. By default this is undefined.
	*/
	open var onStart: dynamic  = definedExternally


	/**
	* This function will be called when all loading is completed. By default this is undefined, unless passed in the constructor.
	*/
	open var onLoad: dynamic  = definedExternally


	/**
	* This function will be called when an item is complete. The arguments are: [page:String url] — The url of the item just loaded. [page:Integer itemsLoaded] — the number of items already loaded so far. [page:Iteger itemsTotal] — the total amount of items to be loaded. By default this is undefined, unless passed in the constructor.
	*/
	open var onProgress: dynamic  = definedExternally


	/**
	* This function will be called when any item errors, with the argument: [page:String url] — The url of the item that errored. By default this is undefined, unless passed in the constructor.
	*/
	open var onError: dynamic  = definedExternally


	/**
	* [page:Function callback] — URL modifier callback. Called with [page:String url] argument, and must return [page:String resolvedURL]. If provided, the callback will be passed each resource URL before a request is sent. The callback may return the original URL, or a new URL to override loading behavior. This behavior can be used to load assets from .ZIP files, drag-and-drop APIs, and Data URIs.
	*/
	open fun setURLModifier(callback: dynamic = definedExternally) : dynamic


	/**
	* [page:String url] — the url to load Given a URL, uses the URL modifier callback (if any) and returns a resolved URL. If no URL modifier is set, returns the original URL.
Note: The following methods are designed to be called internally by loaders. You shouldn't call them directly.
	*/
	open fun resolveURL(url: String = definedExternally) : String


	/**
	* [page:String url] — the url to load This should be called by any loader using the manager when the loader starts loading an url.
	*/
	open fun itemStart(url: String = definedExternally) : dynamic


	/**
	* [page:String url] — the loaded url This should be called by any loader using the manager when the loader ended loading an url.
	*/
	open fun itemEnd(url: String = definedExternally) : dynamic


	/**
	* [page:String url] — the loaded url This should be called by any loader using the manager when the loader errors loading an url.
	*/
	open fun itemError(url: String = definedExternally) : dynamic
}