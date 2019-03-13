//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material that maps the normal vectors to RGB colors.
	*/
open external class MeshNormalMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* Whether the material is affected by fog. Default is **false**.
	*/
	override var fog: Boolean 


	/**
	* Used to check whether this or derived classes are mesh normal materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMeshNormalMaterial: Boolean  = definedExternally


	/**
	* Whether the material is affected by lights. Default is **false**.
	*/
	override var lights: Boolean 


	/**
	* Define whether the material uses morphTargets. Default is false.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* Render geometry as wireframe. Default is false (i.e. render as smooth shaded).
	*/
	open var wireframe: Boolean  = definedExternally


	/**
	* Controls wireframe thickness. Default is 1. Due to limitations of the [link:https://www.khronos.org/registry/OpenGL/specs/gl/glspec46.core.pdf OpenGL Core Profile] with the [page:WebGLRenderer WebGL] renderer on most platforms linewidth will always be 1 regardless of the set value.
	*/
	open var wireframeLinewidth: Double  = definedExternally
}