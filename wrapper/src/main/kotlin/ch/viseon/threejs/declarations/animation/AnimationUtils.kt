@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* An object with various functions to assist with animations, used internally.
	*/
open external class AnimationUtils{

	/**
	* This is the same as Array.prototype.slice, but also works on typed arrays.
	*/
	open fun arraySlice() : Array<dynamic>


	/**
	* Converts an array to a specific type.
	*/
	open fun convertArray() : Array<dynamic>


	/**
	* Used for parsing AOS keyframe formats.
	*/
	open fun flattenJSON() : Array<dynamic>


	/**
	* Returns an array by which times and values can be sorted.
	*/
	open fun getKeyframeOrder() : Array<dynamic>


	/**
	* Returns **true** if the object is a typed array.
	*/
	open fun isTypedArray() : Boolean


	/**
	* Sorts the array previously returned by [page:AnimationUtils.getKeyframeOrder getKeyframeOrder].
	*/
	open fun sortedArray() : Array<dynamic>


	/**
	* Creates a new clip, containing only the segment of the original clip between the given frames.
	*/
	open fun subclip(clip: ch.viseon.threejs.declarations.animation.AnimationClip = definedExternally, name: String = definedExternally, startFrame: Double = definedExternally, endFrame: Double = definedExternally, fps: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationClip
}