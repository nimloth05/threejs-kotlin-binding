//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* JavaScript events for custom objects. [link:https://github.com/mrdoob/eventdispatcher.js Eventdispatcher on GitHub]
	*/
open external class EventDispatcher(){

	/**
	* type - The type of event to listen to. listener - The function that gets called when the event is fired.
Adds a listener to an event type.
	*/
	open fun addEventListener(type: String = definedExternally, listener: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* type - The type of event to listen to. listener - The function that gets called when the event is fired.
Checks if listener is added to an event type.
	*/
	open fun hasEventListener(type: String = definedExternally, listener: dynamic/*Function*/ = definedExternally) : Boolean


	/**
	* type - The type of the listener that gets removed. listener - The listener function that gets removed.
Removes a listener from an event type.
	*/
	open fun removeEventListener(type: String = definedExternally, listener: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* event - The event that gets fired.
Fire an event type.
	*/
	open fun dispatchEvent(event: dynamic/*object*/ = definedExternally) : dynamic/*null*/
}