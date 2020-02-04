@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A loader for loading a [page:BufferGeometry]. This uses the [page:FileLoader] internally for loading files.
	*/
open external class BufferGeometryLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally): ch.viseon.threejs.declarations.loaders.Loader{

	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI].d [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:BufferGeometry]. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called when load errors.
Begin loading from url and call onLoad with the parsed response content.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : dynamic


	/**
	* [page:Object json] — The JSON structure to parse. Parse a JSON structure and return a [page:BufferGeometry].
	*/
	open fun parse(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry
}