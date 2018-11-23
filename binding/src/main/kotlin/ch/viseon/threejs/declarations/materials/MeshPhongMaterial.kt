//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material for shiny surfaces with specular highlights. The material uses a non-physically based [link:https://en.wikipedia.org/wiki/Blinn-Phong_shading_model Blinn-Phong] model for calculating reflectance. Unlike the Lambertian model used in the [page:MeshLambertMaterial] this can simulate shiny surfaces with specular highlights (such as varnished wood). Shading is calculated using a [link:https://en.wikipedia.org/wiki/Phong_shading Phong] shading model. This calculates shading per pixel (i.e. in the [link:https://en.wikipedia.org/wiki/Shader#Pixel_shaders fragment shader], AKA pixel shader) which gives more accurate results than the Gouraud model used by [page:MeshLambertMaterial], at the cost of some performance. The [page:MeshStandardMaterial] and [page:MeshPhysicalMaterial] also use this shading model. Performance will generally be greater when using this material over the [page:MeshStandardMaterial] or [page:MeshPhysicalMaterial], at the cost of some graphical accuracy.
	*/
open external class MeshPhongMaterial(parameters: dynamic/*Object*/ = definedExternally): ch.viseon.threejs.declarations.materials.Material{

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
	* The texture to create a bump map. The black and white values map to the perceived depth in relation to the lights. Bump doesn't actually affect the geometry of the object, only the lighting. If a normal map is defined this will be ignored.
	*/
	open var bumpMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* How much the bump map affects the material. Typical ranges are 0-1. Default is 1.
	*/
	open var bumpScale: Double  = definedExternally


	/**
	* [page:Color] of the material, by default set to white (0xffffff).
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* How to combine the result of the surface's color with the environment map, if any. Options are [page:Materials THREE.Multiply] (default), [page:Materials THREE.MixOperation], [page:Materials THREE.AddOperation]. If mix is chosen, the [page:.reflectivity] is used to blend between the two colors.
	*/
	open var combine: Int  = definedExternally


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
	* Emissive (light) color of the material, essentially a solid color unaffected by other lighting. Default is black.
	*/
	open var emissive: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* Set emisssive (glow) map. Default is null. The emissive map color is modulated by the emissive color and the emissive intensity. If you have an emissive map, be sure to set the emissive color to something other than black.
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
	* Used to check whether this or derived classes are mesh Phong materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMeshPhongMaterial: Boolean  = definedExternally


	/**
	* The light map. Default is null. The lightMap requires a second set of UVs, and consequently will ignore the [page:Texture repeat] and [page:Texture offset] Texture properties.
	*/
	open var lightMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Intensity of the baked light. Default is 1.
	*/
	open var lightMapIntensity: Double  = definedExternally


	/**
	* The color map. Default is null. The texture map color is modulated by the diffuse [page:.color].
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
	* The texture to create a normal map. The RGB values affect the surface normal for each pixel fragment and change the way the color is lit. Normal maps do not change the actual shape of the surface, only the lighting.
	*/
	open var normalMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* The type of normal map. Options are [page:constant THREE.TangentSpaceNormalMap] (default), and [page:constant THREE.ObjectSpaceNormalMap].
	*/
	open var normalMapType: Int  = definedExternally


	/**
	* How much the normal map affects the material. Typical ranges are 0-1. Default is a [page:Vector2] set to (1,1).
	*/
	open var normalScale: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* How much the environment map affects the surface; also see [page:.combine]. The default value is 1 and the valid range is between 0 (no reflections) and 1 (full reflections).
	*/
	open var reflectivity: Double  = definedExternally


	/**
	* The index of refraction (IOR) of air (approximately 1) divided by the index of refraction of the material. It is used with environment mapping modes [page:Textures THREE.CubeRefractionMapping] and [page:Textures THREE.EquirectangularRefractionMapping]. The refraction ratio should not exceed 1. Default is **0.98**.
	*/
	open var refractionRatio: Double  = definedExternally


	/**
	* How shiny the [page:.specular] highlight is; a higher value gives a sharper highlight. Default is **30**.
	*/
	open var shininess: Double  = definedExternally


	/**
	* Define whether the material uses skinning. Default is false.
	*/
	open var skinning: Boolean  = definedExternally


	/**
	* Specular color of the material. Default is a [page:Color] set to **0x111111** (very dark grey). This defines how shiny the material is and the color of its shine.
	*/
	open var specular: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* The specular map value affects both how much the specular surface highlight contributes and how much of the environment map affects the surface. Default is null.
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