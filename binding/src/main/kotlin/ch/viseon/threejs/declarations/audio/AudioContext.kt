//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.audio

	/**
	* This contains methods for setting up an [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioContext AudioContext]. Used internally by the [page:AudioListener AudioListener] and [page:AudioLoader AudioLoader] classes. This uses the [link:https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API Web Audio API].
	*/
open external class AudioContext(){

	/**
	* Return the value of the variable **context** in the outer scope, if defined, otherwise set it to a new [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioContext AudioContext].
	*/
	open fun getContext() : dynamic/*AudioContext*/


	/**
	* Set the variable **context** in the outer scope to **value**.
	*/
	open fun setContext(value: dynamic/*AudioConetxt*/ = definedExternally) : dynamic/*AudioContext*/
}