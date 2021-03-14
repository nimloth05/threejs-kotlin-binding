@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* Class for loading a font in JSON format. Returns a [page:Font Font], which is an array of [page:Shape Shapes] representing the font. This uses the [page:FileLoader] internally for loading files. You can convert fonts online using [link:https://gero3.github.io/facetype.js/ facetype.js]
	*/
open external class FontLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally): ch.viseon.threejs.declarations.loaders.Loader{

	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Font font]. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called when load errors. Begin loading from url and pass the loaded [page:Texture texture] to onLoad.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : dynamic


	/**
	* [page:Object json] — The JSON structure to parse. Parse a JSON structure and return a [page:Font].
	*/
	open fun parse(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.extras.core.Font
}