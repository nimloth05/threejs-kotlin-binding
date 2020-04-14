@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* The default material used by [page:Points].
	*/
open external class PointsMaterial: ch.viseon.threejs.declarations.materials.Material{

	/**
	* The alpha map is a grayscale texture that controls the opacity across the surface (black: fully transparent; white: fully opaque). Default is null. Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures, the [page:WebGLRenderer WebGL] renderer will use the green channel when sampling this texture due to the extra bit of precision provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha textures will also still work as expected.
	*/
	open var alphaMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* [page:Color] of the material, by default set to white (0xffffff).
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* Sets the color of the points using data from a [page:Texture].
	*/
	open var map: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Define whether the material uses morphTargets. Default is false.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* Sets the size of the points. Default is 1.0. Will be capped if it exceeds the hardware dependent parameter [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getParameter gl.ALIASED_POINT_SIZE_RANGE].
	*/
	open var size: Double  = definedExternally


	/**
	* Specify whether points' size is attenuated by the camera depth. (Perspective camera only.) Default is true.
	*/
	open var sizeAttenuation: Boolean  = definedExternally
}