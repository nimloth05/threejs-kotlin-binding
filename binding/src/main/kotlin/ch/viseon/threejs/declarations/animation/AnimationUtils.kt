//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* An object with various functions to assist with animations, used internally.
	*/
open external class AnimationUtils(){

	/**
	* This is the same as Array.prototype.slice, but also works on typed arrays.
	*/
	open fun arraySlice() : Array<dynamic>/*Array*/


	/**
	* Converts an array to a specific type.
	*/
	open fun convertArray() : Array<dynamic>/*Array*/


	/**
	* Used for parsing AOS keyframe formats.
	*/
	open fun flattenJSON() : Array<dynamic>/*Array*/


	/**
	* Returns an array by which times and values can be sorted.
	*/
	open fun getKeyframeOrder() : Array<dynamic>/*Array*/


	/**
	* Returns **true** if the object is a typed array.
	*/
	open fun isTypedArray() : Boolean


	/**
	* Sorts the array previously returned by [page:AnimationUtils.getKeyframeOrder getKeyframeOrder].
	*/
	open fun sortedArray() : Array<dynamic>/*Array*/
}