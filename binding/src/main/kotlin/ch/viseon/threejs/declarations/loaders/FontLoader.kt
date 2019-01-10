//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* Class for loading a font in JSON format. Returns a [page:Font Font], which is an array of [page:Shape Shape]s representing the font. This uses the [page:FileLoader] internally for loading files. You can convert fonts online using [link:https://gero3.github.io/facetype.js/ facetype.js]
	*/
open external class FontLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* The [page:LoadingManager loadingManager] the loader is using. Default is [page:DefaultLoadingManager].
	*/
	open var manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager  = definedExternally


	/**
	* The base path from which fonts will be loaded. See [page:.setPath]. Default is **undefined**.
	*/
	open var path: String  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Texture texture]. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called when load errors. Begin loading from url and pass the loaded [page:Texture texture] to onLoad.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic/*Function*/ = definedExternally, onProgress: dynamic/*Function*/ = definedExternally, onError: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* [page:Object json] — The JSON structure to parse. Parse a JSON structure and return a [page:Font].
	*/
	open fun parse(json: dynamic/*Object*/ = definedExternally) : ch.viseon.threejs.declarations.extras.core.Font


	/**
	* Set the base path or URL from which to load fonts. This can be useful if you are loading many fonts from the same directory.
	*/
	open fun setPath(path: String = definedExternally) : ch.viseon.threejs.declarations.loaders.FontLoader
}