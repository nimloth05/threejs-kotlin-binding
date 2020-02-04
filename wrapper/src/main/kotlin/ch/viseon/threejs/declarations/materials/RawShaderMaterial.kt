@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* This class works just like [page:ShaderMaterial], except that definitions of built-in uniforms and attributes are not automatically prepended to the GLSL shader code.
	*/
open external class RawShaderMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.ShaderMaterial{
}