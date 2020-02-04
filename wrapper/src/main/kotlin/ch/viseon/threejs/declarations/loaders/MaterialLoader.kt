@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A loader for loading a [page:Material] in JSON format. This uses the [page:FileLoader] internally for loading files.
	*/
open external class MaterialLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally): ch.viseon.threejs.declarations.loaders.Loader{

	/**
	* Object holding any textures used by the material. See [page:.setTextures].
	*/
	open var textures: dynamic  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Material]. [page:Function onProgress] — Will be called while load progresses. The argument will be the progress event. [page:Function onError] — Will be called when load errors. Begin loading from url.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : dynamic


	/**
	* [page:Object json] — The json object containing the parameters of the Material. Parse a JSON structure and create a new [page:Material] of the type [page:String json.type] with parameters defined in the json object.
	*/
	open fun parse(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.materials.Material


	/**
	* [page:Object textures] — object containing any textures used by the material.
	*/
	open fun setTextures(textures: dynamic = definedExternally) : ch.viseon.threejs.declarations.loaders.MaterialLoader
}