@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A loader for loading an [page:Image]. This is used internally by the [page:CubeTextureLoader], [page:ObjectLoader] and [page:TextureLoader].
	*/
open external class ImageLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally){

	/**
	* If set, assigns the [link:https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes crossOrigin] attribute of the image to the value of **crossOrigin**, prior to starting the load. Default is **"anonymous"**.
	*/
	open var crossOrigin: String  = definedExternally


	/**
	* The [page:LoadingManager loadingManager] the loader is using. Default is [page:DefaultLoadingManager].
	*/
	open var manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager  = definedExternally


	/**
	* The base path from which files will be loaded. See [page:.setPath]. Default is **undefined**.
	*/
	open var path: String  = definedExternally


	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Image image]. [page:Function onProgress] — This callback function is currently not supported. [page:Function onError] — Will be called when load errors.
Begin loading from url and return the [page:Image image] object that will contain the data.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : org.w3c.dom.HTMLImageElement


	/**
	* Set the [page:.crossOrigin] attribute.
	*/
	open fun setCrossOrigin(value: String = definedExternally) : dynamic


	/**
	* Set the base path or URL from which to load files. This can be useful if you are loading many images from the same directory.
	*/
	open fun setPath(path: String = definedExternally) : ch.viseon.threejs.declarations.loaders.FileLoader
}