@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* [name] is internally used for implementing shadow mapping with [page:PointLight]s. Can also be used to customize the shadow casting of an object by assigning an instance of [name] to [page:Object3D.customDistanceMaterial]. The following examples demonstrates this approach in order to ensure transparent parts of objects do no cast shadows.
	*/
open external class MeshDistanceMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* The alpha map is a grayscale texture that controls the opacity across the surface (black: fully transparent; white: fully opaque). Default is null. Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures, the [page:WebGLRenderer WebGL] renderer will use the green channel when sampling this texture due to the extra bit of precision provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha textures will also still work as expected.
	*/
	open var alphaMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* The displacement map affects the position of the mesh's vertices. Unlike other maps which only affect the light and shade of the material the displaced vertices can cast shadows, block other objects, and otherwise act as real geometry. The displacement texture is an image where the value of each pixel (white being the highest) is mapped against, and repositions, the vertices of the mesh.
	*/
	open var displacementMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* How much the displacement map affects the mesh (where black is no displacement, and white is maximum displacement). Without a displacement map set, this value is not applied. Default is 1.
	*/
	open var displacementScale: Double  = definedExternally


	/**
	* The offset of the displacement map's values on the mesh's vertices. Without a displacement map set, this value is not applied. Default is 0.
	*/
	open var displacementBias: Double  = definedExternally


	/**
	* The far value of the point light's internal shadow camera.
	*/
	open var farDistance: Double  = definedExternally


	/**
	* Whether the material is affected by fog. Default is **false**.
	*/
	override var fog: Boolean 


	/**
	* The color map. Default is null.
	*/
	open var map: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Define whether the material uses morphTargets. Default is false.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* The near value of the point light's internal shadow camera.
	*/
	open var nearDistance: Double  = definedExternally


	/**
	* The position of the point light in world space.
	*/
	open var referencePosition: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* Define whether the material uses skinning. Default is false.
	*/
	open var skinning: Boolean  = definedExternally
}