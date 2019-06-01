@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A loader for loading an [page:Image] as an [link:https://developer.mozilla.org/de/docs/Web/API/ImageBitmap ImageBitmap]. An ImageBitmap provides an asynchronous and resource efficient pathway to prepare textures for rendering in WebGL. Unlike [page:FileLoader], [name] does not avoid multiple concurrent requests to the same URL.
Note that [page:Texture.flipY] and [page:Texture.premultiplyAlpha] with [link:https://developer.mozilla.org/de/docs/Web/API/ImageBitmap ImageBitmap] are ignored. [link:https://developer.mozilla.org/de/docs/Web/API/ImageBitmap ImageBitmap] needs these configuration on bitmap creation unlike regular images need them on uploading to GPU. You need to set the equivalent options via [page:ImageBitmapLoader.setOptions] instead. Refer to [link:https://www.khronos.org/registry/webgl/specs/latest/1.0/#6.10 WebGL specification] for the detail.
	*/
open external class ImageBitmapLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* The [page:LoadingManager loadingManager] the loader is using. Default is [page:DefaultLoadingManager].
	*/
	open var manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager  = definedExternally


	/**
	* An optional object that sets options for the internally used [link:https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap createImageBitmap] factory method. Default is **undefined**.
	*/
	open var options: String  = definedExternally


	/**
	* The base path from which files will be loaded. See [page:.setPath]. Default is **undefined**.
	*/
	open var path: String  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Image image]. [page:Function onProgress] — This callback function is currently not supported. [page:Function onError] — Will be called when load errors.
Begin loading from url and return the [page:ImageBitmap image] object that will contain the data.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : dynamic


	/**
	* This method exists for compatibility reasons and implements no logic. It ensures that [name] has a similar interface like [page:ImageLoader].
	*/
	open fun setCrossOrigin() : ch.viseon.threejs.declarations.loaders.ImageBitmapLoader


	/**
	* Sets the options object for [link:https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap createImageBitmap].
	*/
	open fun setOptions(options: dynamic = definedExternally) : ch.viseon.threejs.declarations.loaders.ImageBitmapLoader


	/**
	* Sets the base path or URL from which to load files. This can be useful if you are loading many images from the same directory.
	*/
	open fun setPath(path: String = definedExternally) : ch.viseon.threejs.declarations.loaders.ImageBitmapLoader
}