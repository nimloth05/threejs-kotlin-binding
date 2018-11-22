//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* This holds a reference to a real property in the scene graph; used internally.
	*/
open external class PropertyBinding(rootNode: ch.viseon.threejs.declarations.core.Object3D = definedExternally){

	/**
	* 
	*/
	open var path: Float  = definedExternally


	/**
	* 
	*/
	open var parsedPath: Float  = definedExternally


	/**
	* 
	*/
	open var node: Float  = definedExternally


	/**
	* 
	*/
	open var rootNode: Float  = definedExternally


	/**
	* 
	*/
	open var BindingType: dynamic/*Object*/  = definedExternally


	/**
	* 
	*/
	open var Versioning: dynamic/*Object*/  = definedExternally


	/**
	* 
	*/
	open var GetterByBindingType: Array<dynamic>/*Array*/  = definedExternally


	/**
	* 
	*/
	open var SetterByBindingTypeAndVersioning: Array<dynamic>/*Array*/  = definedExternally


	/**
	* 
	*/
	open fun getValue(targetArray: Array<dynamic>/*Array*/ = definedExternally, offset: Float = definedExternally) : dynamic/*null*/


	/**
	* 
	*/
	open fun setValue(sourceArray: Array<dynamic>/*Array*/ = definedExternally, offset: Float = definedExternally) : dynamic/*null*/


	/**
	* Create getter / setter pair for a property in the scene graph. Used internally by [page:PropertyBinding.getValue getValue] and [page:PropertyBinding.setValue setValue].
	*/
	open fun bind() : dynamic/*null*/


	/**
	* Unbind getter / setter pair for a property in the scene graph.
	*/
	open fun unbind() : dynamic/*null*/


	/**
	* Create a new Composite PropertyBinding.
	*/
	open fun Composite() : dynamic/*Constructor*/


	/**
	* Create a new Composite PropertyBinding (if root is an [page:AnimationObjectGroup]) or PropertyBinding.
	*/
	open fun create() : dynamic/*Constructor*/


	/**
	* Matches strings in the following forms: -- nodeName.property -- nodeName.property[accessor] -- nodeName.material.property[accessor] -- uuid.property[accessor] -- uuid.objectName[objectIndex].propertyName[propertyIndex] -- parentName/nodeName.property -- parentName/parentName/nodeName.property[index] -- .bone[Armature.DEF_cog].position -- scene:helium_balloon_model:helium_balloon_model.position
	*/
	open fun parseTrackName() : dynamic/*Constructor*/


	/**
	* Find a node in a node tree or [page:Skeleton Skeleton].
	*/
	open fun findNode() : dynamic/*Constructor*/
}