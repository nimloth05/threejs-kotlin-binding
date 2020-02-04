@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* Class for loading a [page:CubeTexture CubeTexture]. This uses the [page:ImageLoader] internally for loading files.
	*/
open external class CubeTextureLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally): ch.viseon.threejs.declarations.loaders.Loader{

	/**
	* [page:String urls] — array of 6 urls to images, one for each side of the CubeTexture. The urls should be specified in the following order: pos-x, neg-x, pos-y, neg-y, pos-z, neg-z. They can also be [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URIs]. Note that, by convention, cube maps are specified in a coordinate system in which positive-x is to the right when looking up the positive-z axis -- in other words, using a left-handed coordinate system. Since three.js uses a right-handed coordinate system, environment maps used in three.js will have pos-x and neg-x swapped. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Texture texture]. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called when load errors.
Begin loading from url and pass the loaded [page:CubeTexture texture] to onLoad.
	*/
	open fun load(urls: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : ch.viseon.threejs.declarations.textures.CubeTexture
}