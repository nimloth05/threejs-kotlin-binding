//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* Uniforms are global [link:https://www.opengl.org/documentation/glsl/ GLSL] variables. They are passed to shader programs.
	*/
open external class Uniform(value: dynamic/*Object*/ = definedExternally){

	/**
	* Current value of the uniform.
	*/
	open var value: dynamic/*Object*/  = definedExternally


	/**
	* Returns a clone of this uniform. If the uniform's value property is an [page:Object] with a clone() method, this is used, otherwise the value is copied by assignment. Array values are shared between cloned [page:Uniform]s. See [example:webgldeferred_animation WebGL deferred animation] for an example of this method in use.
	*/
	open fun clone() : ch.viseon.threejs.declarations.core.Uniform
}