@file:JsModule("three")
package ch.viseon.threejs.declarations.cameras

	/**
	* Dual [page:PerspectiveCamera PerspectiveCamera]s used for effects such as [link:https://en.wikipedia.org/wiki/Anaglyph_3D 3D Anaglyph] or [link:https://en.wikipedia.org/wiki/parallax_barrier Parallax Barrier].
	*/
open external class StereoCamera{

	/**
	* Default is **1**.
	*/
	open var aspect: Double  = definedExternally


	/**
	* Default is **0.064**.
	*/
	open var eyeSep: Double  = definedExternally


	/**
	* Left camera. This is added to [page:Layers layer 1] - objects to be rendered by the left camera must also be added to this layer.
	*/
	open var cameraL: ch.viseon.threejs.declarations.cameras.PerspectiveCamera  = definedExternally


	/**
	* Right camera.This is added to [page:Layers layer 2] - objects to be rendered by the right camera must also be added to this layer.
	*/
	open var cameraR: ch.viseon.threejs.declarations.cameras.PerspectiveCamera  = definedExternally


	/**
	* Update the stereo cameras based on the camera passed in.
	*/
	open fun update(camera: ch.viseon.threejs.declarations.cameras.PerspectiveCamera = definedExternally) : dynamic
}