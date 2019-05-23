//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* An extension of the [page:MeshStandardMaterial] that allows for greater control over reflectivity. Note that for best results you should always specify an [page:.envMap environment map] when using this material.
	*/
open external class MeshPhysicalMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.MeshStandardMaterial{

	/**
	* ClearCoat level, from **0.0** to **1.0**. Default is **0.0**.
	*/
	open var clearCoat: Double  = definedExternally


	/**
	* How rough the clearCoat appears, from **0.0** to **1.0**. Default is **0.0**.
	*/
	open var clearCoatRoughness: Double  = definedExternally


	/**
	* Used to check whether this or derived classes are mesh physical materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMeshPhysicalMaterial: Boolean  = definedExternally


	/**
	* An object of the form: { 'PHYSICAL': '' }; This is used by the [page:WebGLRenderer] for selecting shaders.
	*/
	override var defines: dynamic 


	/**
	* Degree of reflectivity, from **0.0** to **1.0**. Default is **0.5**. This models the reflectivity of non-metallic materials. It has no effect when [page:MeshStandardMaterial.metalness metalness] is **1.0**
	*/
	open var reflectivity: Double  = definedExternally
}