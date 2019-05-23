//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* This holds a reference to a real property in the scene graph; used internally.
	*/
open external class PropertyBinding(rootNode: ch.viseon.threejs.declarations.core.Object3D = definedExternally){

	/**
	* 
	*/
	open var path: Double  = definedExternally


	/**
	* 
	*/
	open var parsedPath: Double  = definedExternally


	/**
	* 
	*/
	open var node: Double  = definedExternally


	/**
	* 
	*/
	open var rootNode: Double  = definedExternally


	/**
	* 
	*/
	open var BindingType: dynamic  = definedExternally


	/**
	* 
	*/
	open var Versioning: dynamic  = definedExternally


	/**
	* 
	*/
	open var GetterByBindingType: Array<dynamic>  = definedExternally


	/**
	* 
	*/
	open var SetterByBindingTypeAndVersioning: Array<dynamic>  = definedExternally


	/**
	* 
	*/
	open fun getValue(targetArray: Array<dynamic> = definedExternally, offset: Double = definedExternally) : dynamic


	/**
	* 
	*/
	open fun setValue(sourceArray: Array<dynamic> = definedExternally, offset: Double = definedExternally) : dynamic


	/**
	* Create getter / setter pair for a property in the scene graph. Used internally by [page:PropertyBinding.getValue getValue] and [page:PropertyBinding.setValue setValue].
	*/
	open fun bind() : dynamic


	/**
	* Unbind getter / setter pair for a property in the scene graph.
	*/
	open fun unbind() : dynamic


	/**
	* Create a new Composite PropertyBinding.
	*/
	open fun Composite() : dynamic


	/**
	* Create a new Composite PropertyBinding (if root is an [page:AnimationObjectGroup]) or PropertyBinding.
	*/
	open fun create() : dynamic


	/**
	* Matches strings in the following forms: -- nodeName.property -- nodeName.property[accessor] -- nodeName.material.property[accessor] -- uuid.property[accessor] -- uuid.objectName[objectIndex].propertyName[propertyIndex] -- parentName/nodeName.property -- parentName/parentName/nodeName.property[index] -- .bone[Armature.DEF_cog].position -- scene:helium_balloon_model:helium_balloon_model.position
	*/
	open fun parseTrackName() : dynamic


	/**
	* Find a node in a node tree or [page:Skeleton Skeleton].
	*/
	open fun findNode() : dynamic
}