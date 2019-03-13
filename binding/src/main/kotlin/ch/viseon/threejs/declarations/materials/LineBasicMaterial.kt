//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material for drawing wireframe-style geometries.
	*/
open external class LineBasicMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* [page:Color] of the material, by default set to white (0xffffff).
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* Used to check whether this or derived classes are line basic materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isLineBasicMaterial: Boolean  = definedExternally


	/**
	* Whether the material is affected by lights. Default is **false**.
	*/
	override var lights: Boolean 


	/**
	* Controls line thickness. Default is **1**. Due to limitations of the [link:https://www.khronos.org/registry/OpenGL/specs/gl/glspec46.core.pdf OpenGL Core Profile] with the [page:WebGLRenderer WebGL] renderer on most platforms linewidth will always be 1 regardless of the set value.
	*/
	open var linewidth: Double  = definedExternally


	/**
	* Define appearance of line ends. Possible values are 'butt', 'round' and 'square'. Default is 'round'. This corresponds to the [link:https://developer.mozilla.org/en/docs/Web/API/CanvasRenderingContext2D/lineCap 2D Canvas lineCap] property and it is ignored by the [page:WebGLRenderer WebGL] renderer.
	*/
	open var linecap: String  = definedExternally


	/**
	* Define appearance of line joints. Possible values are 'round', 'bevel' and 'miter'. Default is 'round'. This corresponds to the [link:https://developer.mozilla.org/en/docs/Web/API/CanvasRenderingContext2D/lineJoin 2D Canvas lineJoin] property and it is ignored by the [page:WebGLRenderer WebGL] renderer.
	*/
	open var linejoin: String  = definedExternally
}