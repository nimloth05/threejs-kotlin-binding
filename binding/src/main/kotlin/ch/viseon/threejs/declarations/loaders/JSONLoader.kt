//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A loader for loading objects in JSON format. This uses the [page:FileLoader] internally for loading files.
	*/
open external class JSONLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* If set, assigns the [link:https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes crossOrigin] attribute of the image to the value of **crossOrigin**, prior to starting the load. Default is **"anonymous"**.
	*/
	open var crossOrigin: String  = definedExternally


	/**
	* The [page:LoadingManager loadingManager] the loader is using. Default is [page:DefaultLoadingManager].
	*/
	open var manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager  = definedExternally


	/**
	* Whether the XMLHttpRequest uses credentials. Default is **false**.
	*/
	open var withCredentials: String  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI].. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded text response. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called when load errors.
Begin loading from url and pass the JSON to onLoad.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic/*Function*/ = definedExternally, onProgress: dynamic/*Function*/ = definedExternally, onError: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* [page:String json] — JSON object to parse. [page:String path] — Base path for resources if no resource path is defined. Parse a JSON structure and return an [page:object] containing the parsed [page:Geometry geometry] and [page:Array materials].
	*/
	open fun parse(json: dynamic/*Object*/ = definedExternally, path: String = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* Set the [page:.crossOrigin] attribute.
	*/
	open fun setCrossOrigin(value: String = definedExternally) : ch.viseon.threejs.declarations.loaders.JSONLoader


	/**
	* Set the base path for the original file.
	*/
	open fun setPath(value: String = definedExternally) : ch.viseon.threejs.declarations.loaders.JSONLoader


	/**
	* Set the base path for dependent resources like textures.
	*/
	open fun setResourcePath(value: String = definedExternally) : ch.viseon.threejs.declarations.loaders.JSONLoader
}