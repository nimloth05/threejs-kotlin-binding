//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* An extension of the [page:MeshPhongMaterial] with toon shading.
	*/
open external class MeshToonMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.MeshPhongMaterial{

	/**
	* Gradient map for the toon shading. Default is **null**.
	*/
	open var gradientMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Used to check whether this or derived classes are mesh toon materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMeshToonMaterial: Boolean  = definedExternally


	/**
	* An object of the form: { 'TOON': '' }; This is used by the [page:WebGLRenderer] for selecting shaders.
	*/
	override var defines: dynamic 
}