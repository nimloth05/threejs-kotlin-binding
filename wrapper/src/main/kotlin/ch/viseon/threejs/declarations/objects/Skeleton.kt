@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* Use an array of [page:Bone bones] to create a skeleton that can be used by a [page:SkinnedMesh].
	*/
open external class Skeleton(bones: Array<dynamic> = definedExternally, boneInverses: Array<dynamic> = definedExternally){

	/**
	* The array of [page:bone bones]. Note this is a copy of the original array, not a reference, so you can modify the original array without effecting this one.
	*/
	open var bones: Array<dynamic>  = definedExternally


	/**
	* An array of [page:Matrix4 Matrix4s] that represent the inverse of the [page:Matrix4 matrixWorld] of the individual bones.
	*/
	open var boneInverses: Array<dynamic>  = definedExternally


	/**
	* The array buffer holding the bone data when using a vertex texture.
	*/
	open var boneMatrices: org.khronos.webgl.Float32Array  = definedExternally


	/**
	* The [page:DataTexture] holding the bone data when using a vertex texture.
	*/
	open var boneTexture: ch.viseon.threejs.declarations.textures.DataTexture  = definedExternally


	/**
	* The size of the [page:.boneTexture].
	*/
	open var boneTextureSize: Int  = definedExternally


	/**
	* Returns a clone of this Skeleton object.
	*/
	open fun clone() : ch.viseon.threejs.declarations.objects.Skeleton


	/**
	* Generates the [page:.boneInverses boneInverses] array if not provided in the constructor.
	*/
	open fun calculateInverses() : dynamic


	/**
	* Returns the skeleton to the base pose.
	*/
	open fun pose() : dynamic


	/**
	* Updates the [page:Float32Array boneMatrices] and [page:DataTexture boneTexture] after changing the bones. This is called automatically by the [page:WebGLRenderer] if the skeleton is used with a [page:SkinnedMesh].
	*/
	open fun update() : dynamic


	/**
	* name -- String to match to the Bone's .name property. Searches through the skeleton's bone array and returns the first with a matching name.
	*/
	open fun getBoneByName(name: String = definedExternally) : ch.viseon.threejs.declarations.objects.Bone


	/**
	* Can be used if an instance of [name] becomes obsolete in an application. The method will free internal resources.
	*/
	open fun dispose() : dynamic
}