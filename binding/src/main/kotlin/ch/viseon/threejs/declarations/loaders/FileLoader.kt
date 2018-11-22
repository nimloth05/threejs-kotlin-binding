//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A low level class for loading resources with XMLHttpRequest, used internaly by most loaders. It can also be used directly to load any file type that does not have a loader.
	*/
open external class FileLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* The [page:LoadingManager loadingManager] the loader is using. Default is [page:DefaultLoadingManager].
	*/
	open var manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager  = definedExternally


	/**
	* The expected [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types mimeType]. See [page:.setMimeType]. Default is **undefined**.
	*/
	open var mimeType: String  = definedExternally


	/**
	* The base path from which files will be loaded. See [page:.setPath]. Default is **undefined**.
	*/
	open var path: String  = definedExternally


	/**
	* The [link:https://developer.mozilla.org/en-US/docs/Glossary/Request_header request header] used in HTTP request. See [page:.setRequestHeader]. Default is **undefined**.
	*/
	open var requestHeader: dynamic/*object*/  = definedExternally


	/**
	* The expected response type. See [page:.setResponseType]. Default is **undefined**.
	*/
	open var responseType: String  = definedExternally


	/**
	* Whether the XMLHttpRequest uses credentials. See [page:.setWithCredentials]. Default is **undefined**.
	*/
	open var withCredentials: String  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] (optional) — Will be called when loading completes. The argument will be the loaded response. [page:Function onProgress] (optional) — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] (optional) — Will be called if an error occurs. Load the URL and pass the response to the onLoad function.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic/*Function*/ = definedExternally, onProgress: dynamic/*Function*/ = definedExternally, onError: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* Set the expected [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types mimeType] of the file being loaded. Note that in many cases this will be determined automatically, so by default it is **undefined**.
	*/
	open fun setMimeType(mimeType: String = definedExternally) : ch.viseon.threejs.declarations.loaders.FileLoader


	/**
	* Set the base path or URL from which to load files. This can be useful if you are loading many models from the same directory.
	*/
	open fun setPath(path: String = definedExternally) : ch.viseon.threejs.declarations.loaders.FileLoader


	/**
	* [page:object requestHeader] - key: The name of the header whose value is to be set. value: The value to set as the body of the header. Set the [link:https://developer.mozilla.org/en-US/docs/Glossary/Request_header request header] used in HTTP request.
	*/
	open fun setRequestHeader(requestHeader: dynamic/*object*/ = definedExternally) : ch.viseon.threejs.declarations.loaders.FileLoader


	/**
	* Change the response type. Valid values are: [page:String text] or empty string (default) - returns the data as [page:String string]. [page:String arraybuffer] - loads the data into a [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer ArrayBuffer] and returns that. [page:String blob] - returns the data as a [link:https://developer.mozilla.org/en/docs/Web/API/Blob Blob]. [page:String document] - parses the file using the [link:https://developer.mozilla.org/en-US/docs/Web/API/DOMParser DOMParser]. [page:String json] - parses the file using [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse JSON.parse].
	*/
	open fun setResponseType(responseType: String = definedExternally) : ch.viseon.threejs.declarations.loaders.FileLoader


	/**
	* Whether the XMLHttpRequest uses credentials such as cookies, authorization headers or TLS client certificates. See [link:https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/withCredentials XMLHttpRequest.withCredentials]. Note that this has no effect if you are loading files locally or from the same domain.
	*/
	open fun setWithCredentials(value: Boolean = definedExternally) : ch.viseon.threejs.declarations.loaders.FileLoader
}