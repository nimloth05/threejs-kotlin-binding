@file:JsModule("three")
package ch.viseon.threejs.declarations.renderers.shaders

	/**
	* Provides utility functions for managing uniforms.
	*/
open external class UniformsUtils(){

	/**
	* src -- An object representing uniform definitions. Clones the given uniform definitions by performing a deep-copy. That means if the [page:Uniform.value value] of a uniform refers to an object like a [page:Vector3] or [page:Texture], the cloned uniform will refer to a new object reference.
	*/
	open fun clone(src: dynamic = definedExternally) : dynamic


	/**
	* uniforms -- An array of objects containing uniform definitions. Merges the given uniform definitions into a single object. Since the method internally uses [page:.clone](), it performs a deep-copy when producing the merged uniform definitions.
	*/
	open fun merge(uniforms: Array<dynamic> = definedExternally) : dynamic
}