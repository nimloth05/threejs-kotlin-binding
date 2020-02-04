@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* Class for loading a [page:Texture texture]. This uses the [page:ImageLoader] internally for loading files.
	*/
open external class TextureLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally): ch.viseon.threejs.declarations.loaders.Loader{

	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Texture texture]. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called when load errors. Begin loading from the given URL and pass the fully loaded [page:Texture texture] to onLoad. The method also returns a new texture object which can directly be used for material creation. If you do it this way, the texture may pop up in your scene once the respective loading process is finished.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : ch.viseon.threejs.declarations.textures.Texture
}