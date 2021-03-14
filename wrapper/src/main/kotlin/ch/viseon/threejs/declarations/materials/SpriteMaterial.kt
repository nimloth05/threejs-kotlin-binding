@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material for a use with a [page:Sprite].
	*/
open external class SpriteMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* The alpha map is a grayscale texture that controls the opacity across the surface (black: fully transparent; white: fully opaque). Default is null. Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures, the [page:WebGLRenderer WebGL] renderer will use the green channel when sampling this texture due to the extra bit of precision provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha textures will also still work as expected.
	*/
	open var alphaMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* [page:Color] of the material, by default set to white (0xffffff). The [page:.map] is mutiplied by the color.
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* The texture map. Default is null.
	*/
	open var map: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* The rotation of the sprite in radians. Default is 0.
	*/
	open var rotation: Double  = definedExternally


	/**
	* Whether the size of the sprite is attenuated by the camera depth. (Perspective camera only.) Default is **true**.
	*/
	open var sizeAttenuation: Boolean  = definedExternally
}