//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* Class for loading an [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer AudioBuffer]. This uses the [page:FileLoader] internally for loading files.
	*/
open external class AudioLoader(context: String = definedExternally, manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* The [page:LoadingManager loadingManager] the loader is using. Default is [page:DefaultLoadingManager].
	*/
	open var manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded text response. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called when load errors.
Begin loading from url and pass the loaded [page:String AudioBuffer] to onLoad.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : dynamic


	/**
	* [page:String path] — Base path of the file to load. Sets the base path or URL from which to load files. This can be useful if you are loading many audios from the same directory.
	*/
	open fun setPath(path: String = definedExternally) : ch.viseon.threejs.declarations.loaders.AudioLoader
}