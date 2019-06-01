@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* This helper displays the directional cone of a [page:PositionalAudio].
	*/
open external class PositionalAudioHelper(audio: ch.viseon.threejs.declarations.audio.PositionalAudio = definedExternally, range: Double = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* [page:PositionalAudio] to be visualized.
	*/
	open var audio: ch.viseon.threejs.declarations.audio.PositionalAudio  = definedExternally


	/**
	* The range of the directional cone.
	*/
	open var range: Double  = definedExternally


	/**
	* The amount of divisions of the inner part of the directional cone.
	*/
	open var divisionsInnerAngle: Double  = definedExternally


	/**
	* The amount of divisions of the outer part of the directional cone.
	*/
	open var divisionsOuterAngle: Double  = definedExternally


	/**
	* Disposes of the helper.
	*/
	open fun dispose() : dynamic


	/**
	* Updates the helper.
	*/
	open fun update() : dynamic
}