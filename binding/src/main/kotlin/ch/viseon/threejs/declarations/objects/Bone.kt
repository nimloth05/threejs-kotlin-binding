//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* A bone which is part of a [page:Skeleton]. The skeleton in turn is used by the [page:SkinnedMesh]. Bones are almost identical to a blank [page:Object3D].
	*/
open external class Bone(): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Used to check whether this or derived classes are bones. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isBone: Boolean  = definedExternally


	/**
	* Set to 'Bone', this can be used to find all Bones in a scene.
	*/
	open var type: String  = definedExternally
}