//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* A group of objects that receives a shared animation state. For an overview of the different elements of the three.js animation system see the "Animation System" article in the "Next Steps" section of the manual.
	*/
open external class AnimationObjectGroup(obj1: dynamic = definedExternally, obj2: dynamic = definedExternally, obj3: dynamic = definedExternally){

	/**
	* An object that contains some informations of this **AnimationObjectGroup** (total number, number in use, number of bindings per object)
	*/
	open var stats: dynamic  = definedExternally


	/**
	* The [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this **AnimationObjectGroup**. It gets automatically assigned and shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* Adds an arbitrary number of objects to this **AnimationObjectGroup**.
	*/
	open fun add(obj1: dynamic = definedExternally, obj2: dynamic = definedExternally, obj3: dynamic = definedExternally) : dynamic


	/**
	* Removes an arbitrary number of objects from this **AnimationObjectGroup**.
	*/
	open fun remove(obj1: dynamic = definedExternally, obj2: dynamic = definedExternally, obj3: dynamic = definedExternally) : dynamic


	/**
	* Deallocates all memory resources for the passed objects of this **AnimationObjectGroup**.
	*/
	open fun uncache(obj1: dynamic = definedExternally, obj2: dynamic = definedExternally, obj3: dynamic = definedExternally) : dynamic
}