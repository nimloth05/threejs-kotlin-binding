@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material for drawing geometries in a simple shaded (flat or wireframe) way. This material is not affected by lights.
	*/
open external class MeshBasicMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* The alpha map is a grayscale texture that controls the opacity across the surface (black: fully transparent; white: fully opaque). Default is null. Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures, the [page:WebGLRenderer WebGL] renderer will use the green channel when sampling this texture due to the extra bit of precision provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha textures will also still work as expected.
	*/
	open var alphaMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* The red channel of this texture is used as the ambient occlusion map. Default is null. The aoMap requires a second set of UVs.
	*/
	open var aoMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Intensity of the ambient occlusion effect. Default is 1. Zero is no occlusion effect.
	*/
	open var aoMapIntensity: Double  = definedExternally


	/**
	* [page:Color] of the material, by default set to white (0xffffff).
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* How to combine the result of the surface's color with the environment map, if any. Options are [page:Materials THREE.Multiply] (default), [page:Materials THREE.MixOperation], [page:Materials THREE.AddOperation]. If mix is chosen, the [page:.reflectivity] is used to blend between the two colors.
	*/
	open var combine: Int  = definedExternally


	/**
	* The environment map. Default is null.
	*/
	open var envMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* The light map. Default is null. The lightMap requires a second set of UVs.
	*/
	open var lightMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Intensity of the baked light. Default is 1.
	*/
	open var lightMapIntensity: Double  = definedExternally


	/**
	* The color map. Default is null.
	*/
	open var map: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Define whether the material uses morphTargets. Default is false.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* How much the environment map affects the surface; also see [page:.combine]. The default value is 1 and the valid range is between 0 (no reflections) and 1 (full reflections).
	*/
	open var reflectivity: Double  = definedExternally


	/**
	* The index of refraction (IOR) of air (approximately 1) divided by the index of refraction of the material. It is used with environment mapping modes [page:Textures THREE.CubeRefractionMapping] and [page:Textures THREE.EquirectangularRefractionMapping]. The refraction ratio should not exceed 1. Default is **0.98**.
	*/
	open var refractionRatio: Double  = definedExternally


	/**
	* Define whether the material uses skinning. Default is false.
	*/
	open var skinning: Boolean  = definedExternally


	/**
	* Specular map used by the material. Default is null.
	*/
	open var specularMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Render geometry as wireframe. Default is **false** (i.e. render as flat polygons).
	*/
	open var wireframe: Boolean  = definedExternally


	/**
	* Define appearance of line ends. Possible values are "butt", "round" and "square". Default is 'round'. This corresponds to the [link:https://developer.mozilla.org/en/docs/Web/API/CanvasRenderingContext2D/lineCap 2D Canvas lineCap] property and it is ignored by the [page:WebGLRenderer WebGL] renderer.
	*/
	open var wireframeLinecap: String  = definedExternally


	/**
	* Define appearance of line joints. Possible values are "round", "bevel" and "miter". Default is 'round'. This corresponds to the [link:https://developer.mozilla.org/en/docs/Web/API/CanvasRenderingContext2D/lineJoin 2D Canvas lineJoin] property and it is ignored by the [page:WebGLRenderer WebGL] renderer.
	*/
	open var wireframeLinejoin: String  = definedExternally


	/**
	* Controls wireframe thickness. Default is 1. Due to limitations of the [link:https://www.khronos.org/registry/OpenGL/specs/gl/glspec46.core.pdf OpenGL Core Profile] with the [page:WebGLRenderer WebGL] renderer on most platforms linewidth will always be 1 regardless of the set value.
	*/
	open var wireframeLinewidth: Double  = definedExternally
}