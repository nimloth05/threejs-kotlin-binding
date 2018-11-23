//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* Class for loading [page:AnimationClip AnimationClips] in JSON format. This uses the [page:FileLoader] internally for loading files.
	*/
open external class AnimationLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* The [page:LoadingManager loadingManager] the loader is using. Default is [page:DefaultLoadingManager].
	*/
	open var manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Animation animation]. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called if load errors. Begin loading from url and pass the loaded animation to onLoad.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic/*Function*/ = definedExternally, onProgress: dynamic/*Function*/ = definedExternally, onError: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* [page:JSON json] — required [page:Function onLoad] — Will be called when parsing completes. Parse the JSON object and pass the result to onLoad. Individual clips in the object will be parsed with [page:AnimationClip.parse].
	*/
	open fun parse(json: JSON = definedExternally, onLoad: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* [page:String path] — Base path of the file to load. Sets the base path or URL from which to load files. This can be useful if you are loading many animations from the same directory.
	*/
	open fun setPath(path: String = definedExternally) : ch.viseon.threejs.declarations.loaders.AnimationLoader
}