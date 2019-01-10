//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* An object with several loader utility functions.
	*/
open external class LoaderUtils(){

	/**
	* [page:TypedArray array] — A stream of bytes as a typed array.
The function takes a stream of bytes as input and returns a string representation.
	*/
	open fun decodeText(array: Array<dynamic>/*TypedArray*/ = definedExternally) : String


	/**
	* [page:String url] — The url to extract the base url from.
Extract the base from the URL.
	*/
	open fun extractUrlBase(url: String = definedExternally) : String
}