@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

import kotlin.js.Promise

/**
	* Base class for implementing loaders.
	*/
open external class Loader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS. Default is **anonymous**.
	*/
	open var crossOrigin: String  = definedExternally


	/**
	* Whether the XMLHttpRequest uses credentials. See [page:.setWithCredentials]. Default is **false**.
	*/
	open var withCredentials: Boolean  = definedExternally


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
	* The [link:https://developer.mozilla.org/en-US/docs/Glossary/Request_header request header] used in HTTP request. See [page:.setRequestHeader]. Default is empty object.
	*/
	open var requestHeader: dynamic  = definedExternally


	/**
	* This method needs to be implement by all concrete loaders. It holds the logic for loading the asset from the backend.
	*/
	open fun load() : Unit


	/**
	* [page:String url] — A string containing the path/URL of the file to be loaded. [page:Function onProgress] — (optional) A function to be called while the loading is in progress. The argument will be the XMLHttpRequest instance, that contains .[page:Integer total] and .[page:Integer loaded] bytes.
This method is equivalent to [page:.load], but returns a [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise Promise].
[page:Function onLoad] is handled by [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise/resolve Promise.resolve] and [page:Function onError] is handled by [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise/reject Promise.reject].
	*/
	open fun loadAsync(url: String = definedExternally, onProgress: dynamic = definedExternally) : Promise<dynamic>


	/**
	* This method needs to be implement by all concrete loaders. It holds the logic for parsing the asset into three.js entities.
	*/
	open fun parse() : Unit


	/**
	* [page:String crossOrigin] — The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS.
	*/
	open fun setCrossOrigin(crossOrigin: String = definedExternally) : ch.viseon.threejs.declarations.loaders.Loader


	/**
	* Whether the XMLHttpRequest uses credentials such as cookies, authorization headers or TLS client certificates. See [link:https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/withCredentials XMLHttpRequest.withCredentials]. Note that this has no effect if you are loading files locally or from the same domain.
	*/
	open fun setWithCredentials(value: Boolean = definedExternally) : ch.viseon.threejs.declarations.loaders.Loader


	/**
	* [page:String path] — Set the base path for the asset.
	*/
	open fun setPath(path: String = definedExternally) : ch.viseon.threejs.declarations.loaders.Loader


	/**
	* [page:String resourcePath] — Set the base path for dependent resources like textures.
	*/
	open fun setResourcePath(resourcePath: String = definedExternally) : ch.viseon.threejs.declarations.loaders.Loader


	/**
	* [page:Object requestHeader] - key: The name of the header whose value is to be set. value: The value to set as the body of the header. Set the [link:https://developer.mozilla.org/en-US/docs/Glossary/Request_header request header] used in HTTP request.
	*/
	open fun setRequestHeader(requestHeader: dynamic = definedExternally) : ch.viseon.threejs.declarations.loaders.Loader
}
