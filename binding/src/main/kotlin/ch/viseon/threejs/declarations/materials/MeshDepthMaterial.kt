//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material for drawing geometry by depth. Depth is based off of the camera near and far plane. White is nearest, black is farthest.
	*/
open external class MeshDepthMaterial(parameters: dynamic/*Object*/ = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* The alpha map is a grayscale texture that controls the opacity across the surface (black: fully transparent; white: fully opaque). Default is null. Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures, the [page:WebGLRenderer WebGL] renderer will use the green channel when sampling this texture due to the extra bit of precision provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha textures will also still work as expected.
	*/
	open var alphaMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Encoding for depth packing. Default is [page:Textures BasicDepthPacking].
	*/
	open var depthPacking: Int  = definedExternally


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
	* Whether the material is affected by fog. Default is **false**.
	*/
	override var fog: Boolean 


	/**
	* Used to check whether this or derived classes are mesh depth materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMeshDepthMaterial: Boolean  = definedExternally


	/**
	* Whether the material is affected by lights. Default is **false**.
	*/
	override var lights: Boolean 


	/**
	* The color map. Default is null.
	*/
	open var map: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Define whether the material uses morphTargets. Default is false.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* Define whether the material uses skinning. Default is false.
	*/
	open var skinning: Boolean  = definedExternally


	/**
	* Render geometry as wireframe. Default is false (i.e. render as smooth shaded).
	*/
	open var wireframe: Boolean  = definedExternally


	/**
	* Controls wireframe thickness. Default is 1. Due to limitations of the [link:https://www.khronos.org/registry/OpenGL/specs/gl/glspec46.core.pdf OpenGL Core Profile] with the [page:WebGLRenderer WebGL] renderer on most platforms linewidth will always be 1 regardless of the set value.
	*/
	open var wireframeLinewidth: Double  = definedExternally
}