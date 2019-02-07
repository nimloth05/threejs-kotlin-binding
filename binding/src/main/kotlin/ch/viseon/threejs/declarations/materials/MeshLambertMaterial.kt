//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material for non-shiny surfaces, without specular highlights. The material uses a non-physically based [link:https://en.wikipedia.org/wiki/Lambertian_reflectance Lambertian] model for calculating reflectance. This can simulate some surfaces (such as untreated wood or stone) well, but cannot simulate shiny surfaces with specular highlights (such as varnished wood). Shading is calculated using a [link:https://en.wikipedia.org/wiki/Gouraud_shading Gouraud] shading model. This calculates shading per vertex (i.e. in the [link:https://en.wikipedia.org/wiki/Shader#Vertex_shaders vertex shader]) and interpolates the results over the polygon's faces. Due to the simplicity of the reflectance and illumination models, performance will be greater when using this material over the [page:MeshPhongMaterial], [page:MeshStandardMaterial] or [page:MeshPhysicalMaterial], at the cost of some graphical accuracy.
	*/
open external class MeshLambertMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* The alpha map is a grayscale texture that controls the opacity across the surface (black: fully transparent; white: fully opaque). Default is null. Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures, the [page:WebGLRenderer WebGL] renderer will use the green channel when sampling this texture due to the extra bit of precision provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha textures will also still work as expected.
	*/
	open var alphaMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* The red channel of this texture is used as the ambient occlusion map. Default is null. The aoMap requires a second set of UVs, and consequently will ignore the [page:Texture repeat] and [page:Texture offset] Texture properties.
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
	* Emissive (light) color of the material, essentially a solid color unaffected by other lighting. Default is black.
	*/
	open var emissive: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* Set emissive (glow) map. Default is null. The emissive map color is modulated by the emissive color and the emissive intensity. If you have an emissive map, be sure to set the emissive color to something other than black.
	*/
	open var emissiveMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Intensity of the emissive light. Modulates the emissive color. Default is 1.
	*/
	open var emissiveIntensity: Double  = definedExternally


	/**
	* The environment map. Default is null.
	*/
	open var envMap: ch.viseon.threejs.declarations.textures.CubeTexture  = definedExternally


	/**
	* Used to check whether this or derived classes are mesh Lambert materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMeshLambertMaterial: Boolean  = definedExternally


	/**
	* The light map. Default is null. The lightMap requires a second set of UVs, and consequently will ignore the [page:Texture repeat] and [page:Texture offset] Texture properties.
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
	* Defines whether the material uses morphNormals. Set as true to pass morphNormal attributes from the [page:Geometry] to the shader. Default is **false**.
	*/
	open var morphNormals: Boolean  = definedExternally


	/**
	* Define whether the material uses morphTargets. Default is false.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* How much the environment map affects the surface; also see [page:.combine].
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