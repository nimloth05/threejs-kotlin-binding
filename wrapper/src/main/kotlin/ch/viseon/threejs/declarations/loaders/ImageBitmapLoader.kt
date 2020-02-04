@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A loader for loading an [page:Image] as an [link:https://developer.mozilla.org/de/docs/Web/API/ImageBitmap ImageBitmap]. An ImageBitmap provides an asynchronous and resource efficient pathway to prepare textures for rendering in WebGL. Unlike [page:FileLoader], [name] does not avoid multiple concurrent requests to the same URL.
Note that [page:Texture.flipY] and [page:Texture.premultiplyAlpha] with [link:https://developer.mozilla.org/de/docs/Web/API/ImageBitmap ImageBitmap] are ignored. [link:https://developer.mozilla.org/de/docs/Web/API/ImageBitmap ImageBitmap] needs these configuration on bitmap creation unlike regular images need them on uploading to GPU. You need to set the equivalent options via [page:ImageBitmapLoader.setOptions] instead. Refer to [link:https://www.khronos.org/registry/webgl/specs/latest/1.0/#6.10 WebGL specification] for the detail.
	*/
open external class ImageBitmapLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally): ch.viseon.threejs.declarations.loaders.Loader{

	/**
	* An optional object that sets options for the internally used [link:https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap createImageBitmap] factory method. Default is **undefined**.
	*/
	open var options: String  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Image image]. [page:Function onProgress] — This callback function is currently not supported. [page:Function onError] — Will be called when load errors.
Begin loading from url and return the [page:ImageBitmap image] object that will contain the data.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : dynamic


	/**
	* Sets the options object for [link:https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap createImageBitmap].
	*/
	open fun setOptions(options: dynamic = definedExternally) : ch.viseon.threejs.declarations.loaders.ImageBitmapLoader
}