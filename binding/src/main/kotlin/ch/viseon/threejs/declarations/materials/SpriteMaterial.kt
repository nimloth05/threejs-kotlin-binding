//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material for a use with a [page:Sprite].
	*/
open external class SpriteMaterial(parameters: dynamic/*Object*/ = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* [page:Color] of the material, by default set to white (0xffffff). The [page:.map] is mutiplied by the color.
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* Whether or not this material affected by the scene's fog. Default is false
	*/
	override var fog: Boolean 


	/**
	* Whether the material is affected by lights. Default is **false**.
	*/
	override var lights: Boolean 


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