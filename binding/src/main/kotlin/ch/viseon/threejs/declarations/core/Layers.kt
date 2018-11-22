//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* A [page:Layers] object assigns an [page:Object3D] to 1 or more of 32 layers numbered 0 to 31 - internally the layers are stored as a [link:https://en.wikipedia.org/wiki/Mask_(computing) bit mask], and by default all Object3Ds are a member of layer 0. This can be used to control visibility - an object must share a layer with a [page:Camera camera] to be visible when that camera's view is renderered. All classes that inherit from [page:Object3D] have an [page:Object3D.layers] property which is an instance of this class.
	*/
open external class Layers(){

	/**
	* A bit mask storing which of the 32 layers this layers object is currently a member of.
	*/
	open var mask: Int  = definedExternally


	/**
	* layer - an integer from 0 to 31. Remove membership of this **layer**.
	*/
	open fun disable(layer: Int = definedExternally) : dynamic/*null*/


	/**
	* layer - an integer from 0 to 31. Add membership of this **layer**.
	*/
	open fun enable(layer: Int = definedExternally) : dynamic/*null*/


	/**
	* layer - an integer from 0 to 31. Set membership to **layer**, and remove membership all other layers.
	*/
	open fun set(layer: Int = definedExternally) : dynamic/*null*/


	/**
	* layers - a Layers object Returns true if this and the passed **layers** object are members of the same set of layers.
	*/
	open fun test(layers: ch.viseon.threejs.declarations.core.Layers = definedExternally) : Boolean


	/**
	* layer - an integer from 0 to 31. Toggle membership of **layer**.
	*/
	open fun toggle(layer: Int = definedExternally) : dynamic/*null*/
}