@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* This class works just like [page:ShaderMaterial], except that definitions of built-in uniforms and attributes are not automatically prepended to the GLSL shader code.
	*/
open external class RawShaderMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.ShaderMaterial{

	/**
	* Used to check whether this or derived classes are raw shader materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isRawShaderMaterial: Boolean  = definedExternally
}