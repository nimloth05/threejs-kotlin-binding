//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* A class for generating text as a single geometry. It is constructed by providing a string of text, and a hash of parameters consisting of a loaded [page:Font] and settings for the geometry's parent [page:ExtrudeGeometry]. See the [page:Font], [page:FontLoader] and [page:Creating_Text] pages for additional details.
	*/
open external class TextGeometry(text: String = definedExternally, parameters: dynamic/*Object*/ = definedExternally): ch.viseon.threejs.declarations.geometries.ExtrudeGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	override var parameters: dynamic/*Object*/ 
}