@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A loader for loading a JSON resource in the [link:https://github.com/mrdoob/three.js/wiki/JSON-Object-Scene-format-4 JSON Object/Scene format]. This uses the [page:FileLoader] internally for loading files.
	*/
open external class ObjectLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally): ch.viseon.threejs.declarations.loaders.Loader{

	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:Object3D object]. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called when load errors.
Begin loading from url and call onLoad with the parsed response content.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : dynamic


	/**
	* [page:Object json] — required. The JSON source to parse. [page:Function onLoad] — Will be called when parsed completes. The argument will be the parsed [page:Object3D object]. Parse a JSON structure and return a threejs object. This is used internally by [page:.load], but can also be used directly to parse a previously loaded JSON structure.
	*/
	open fun parse(json: dynamic = definedExternally, onLoad: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* [page:Object json] — required. The JSON source to parse. This is used [page:.parse] to parse any [page:Geometry geometries] or [page:BufferGeometry buffer geometries] in the JSON structure.
	*/
	open fun parseGeometries(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* [page:Object json] — required. The JSON source to parse. This is used [page:.parse] to parse any materials in the JSON structure using [page:MaterialLoader].
	*/
	open fun parseMaterials(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* [page:Object json] — required. The JSON source to parse. This is used [page:.parse] to parse any animations in the JSON structure, using [page:AnimationClip.parse].
	*/
	open fun parseAnimations(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* [page:Object json] — required. The JSON source to parse. This is used [page:.parse] to parse any images in the JSON structure, using [page:ImageLoader].
	*/
	open fun parseImages(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* [page:Object json] — required. The JSON source to parse. This is used [page:.parse] to parse any textures in the JSON structure.
	*/
	open fun parseTextures(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* [page:Object json] — required. The JSON source to parse. This is used [page:.parse] to parse any objects in the JSON structure. Objects can be of the following types:
	*/
	open fun parseObject(json: dynamic = definedExternally) : ch.viseon.threejs.declarations.core.Object3D
}