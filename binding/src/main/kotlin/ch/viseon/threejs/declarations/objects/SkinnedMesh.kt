//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* A mesh that has a [page:Skeleton] with [page:Bone bones] that can then be used to animate the vertices of the geometry. The material must support skinning and have skinning enabled - see [page:MeshStandardMaterial.skinning].
	*/
open external class SkinnedMesh(geometry: ch.viseon.threejs.declarations.core.BufferGeometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.objects.Mesh{

	/**
	* Either "attached" or "detached". "attached" uses the [page:SkinnedMesh.matrixWorld] property for the base transform matrix of the bones. "detached" uses the [page:SkinnedMesh.bindMatrix]. Default is "attached".
	*/
	open var bindMode: String  = definedExternally


	/**
	* The base matrix that is used for the bound bone transforms.
	*/
	open var bindMatrix: ch.viseon.threejs.declarations.math.Matrix4  = definedExternally


	/**
	* The base matrix that is used for resetting the bound bone transforms.
	*/
	open var bindMatrixInverse: ch.viseon.threejs.declarations.math.Matrix4  = definedExternally


	/**
	* Used to check whether this or derived classes are skinned meshes. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isSkinnedMesh: Boolean  = definedExternally


	/**
	* [page:Skeleton] representing the bone hierarchy of the skinned mesh.
	*/
	open var skeleton: ch.viseon.threejs.declarations.objects.Skeleton  = definedExternally


	/**
	* [page:Skeleton skeleton] - [page:Skeleton] created from a [page:Bone Bones] tree. [page:Matrix4 bindMatrix] - [page:Matrix4] that represents the base transform of the skeleton. Bind a skeleton to the skinned mesh. The bindMatrix gets saved to .bindMatrix property and the .bindMatrixInverse gets calculated.
	*/
	open fun bind(skeleton: ch.viseon.threejs.declarations.objects.Skeleton = definedExternally, bindMatrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : dynamic


	/**
	* Returns a clone of this SkinnedMesh object and any descendants.
	*/
	override fun clone() : ch.viseon.threejs.declarations.objects.SkinnedMesh


	/**
	* Normalizes the skin weights.
	*/
	open fun normalizeSkinWeights() : dynamic


	/**
	* This method sets the skinned mesh in the rest pose (resets the pose).
	*/
	open fun pose() : dynamic


	/**
	* Updates the [page:Matrix4 MatrixWorld].
	*/
	override fun updateMatrixWorld(force: Boolean) : dynamic
}