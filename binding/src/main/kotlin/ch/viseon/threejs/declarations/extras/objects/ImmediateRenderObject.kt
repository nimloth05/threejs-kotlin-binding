//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.objects

	/**
	* base class for immediate rendering objects.
	*/
open external class ImmediateRenderObject(): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* renderCallback -- A function to render the generated object.
This function needs to be overridden to start the creation of the object and should call renderCallback when finished.
	*/
	open fun render(renderCallback: dynamic/*Function*/ = definedExternally) : dynamic/*null*/
}