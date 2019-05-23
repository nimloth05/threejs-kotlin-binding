//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* A simple caching system, used internally by [page:FileLoader].
	*/
open external class Cache(){

	/**
	* Whether caching is enabled. Default is **false**.
	*/
	open var enabled: Boolean  = definedExternally


	/**
	* An [page:Object object] that holds cached files.
	*/
	open var files: dynamic  = definedExternally


	/**
	* [page:String key] — the [page:String key] to reference the cached file by. [page:Object file] — The file to be cached. Adds a cache entry with a key to reference the file. If this key already holds a file, it is overwritten.
	*/
	open fun add(key: String = definedExternally) : dynamic


	/**
	* [page:String key] — A string key Get the value of [page:String key]. If the key does not exist **undefined** is returned.
	*/
	open fun get(key: String = definedExternally) : dynamic


	/**
	* [page:String key] — A string key that references a cached file. Remove the cached file associated with the key.
	*/
	open fun remove(key: String = definedExternally) : dynamic


	/**
	* Remove all values from the cache.
	*/
	open fun clear() : dynamic
}