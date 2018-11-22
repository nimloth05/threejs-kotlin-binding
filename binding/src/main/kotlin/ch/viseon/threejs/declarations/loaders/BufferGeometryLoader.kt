//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A loader for loading a [page:BufferGeometry]. This uses the [page:FileLoader] internally for loading files.
	*/
open external class BufferGeometryLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* The [page:LoadingManager loadingManager] the loader is using. Default is [page:DefaultLoadingManager].
	*/
	open var manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI].d [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:BufferGeometry]. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called when load errors.
Begin loading from url and call onLoad with the parsed response content.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic/*Function*/ = definedExternally, onProgress: dynamic/*Function*/ = definedExternally, onError: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* [page:Object json] — The JSON structure to parse. Parse a JSON structure and return a [page:BufferGeometry].
	*/
	open fun parse(json: dynamic/*Object*/ = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* [page:String path] — Base path of the file to load. Sets the base path or URL from which to load files. This can be useful if you are loading many geometries from the same directory.
	*/
	open fun setPath(path: String = definedExternally) : ch.viseon.threejs.declarations.loaders.BufferGeometryLoader
}