//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A standard physically based material, using Metallic-Roughness workflow. Physically based rendering (PBR) has recently become the standard in many 3D applications, such as [link:https://blogs.unity3d.com/2014/10/29/physically-based-shading-in-unity-5-a-primer/ Unity], [link:https://docs.unrealengine.com/latest/INT/Engine/Rendering/Materials/PhysicallyBased/ Unreal] and [link:http://area.autodesk.com/blogs/the-3ds-max-blog/what039s-new-for-rendering-in-3ds-max-2017 3D Studio Max]. This approach differs from older approaches in that instead of using approximations for the way in which light interacts with a surface, a physically correct model is used. The idea is that, instead of tweaking materials to look good under specific lighting, a material can be created that will react 'correctly' under all lighting scenarios. In practice this gives a more accurate and realistic looking result than the [page:MeshLambertMaterial] or [page:MeshPhongMaterial], at the cost of being somewhat more computationally expensive. Shading is calculated in the same way as for the [page:MeshPhongMaterial], using a [link:https://en.wikipedia.org/wiki/Phong_shading Phong] shading model. This calculates shading per pixel (i.e. in the [link:https://en.wikipedia.org/wiki/Shader#Pixel_shaders fragment shader], AKA pixel shader) which gives more accurate results than the Gouraud model used by [page:MeshLambertMaterial], at the cost of some performance. Note that for best results you should always specify an [page:.envMap environment map] when using this material. For a non-technical introduction to the concept of PBR and how to set up a PBR material, check out these articles by the people at [link:https://www.marmoset.co marmoset]:
	*/
open external class MeshStandardMaterial(parameters: dynamic/*Object*/ = definedExternally): ch.viseon.threejs.declarations.materials.Material{

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
	* An object of the form: { 'STANDARD': '' }; This is used by the [page:WebGLRenderer] for selecting shaders.
	*/
	override var defines: dynamic/*Object*/ 


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
	* The environment map. Default is null. Note that in order for the material roughness property to correctly blur out the environment map, the shader must have access to mipmaps of the env texture. TextureCubes created with default settings are correctly configured; if adjusting texture parameters manually, ensure minFilter is set to one of the MipMap options, and that mip maps have not been otherwise forcibly disabled.
Note: only [link:https://threejs.org/docs/#api/textures/CubeTexture cube environment maps] are supported for MeshStandardMaterial. If you want to use an equirectangular map you will need to use the [link:https://github.com/mrdoob/three.js/blob/dev/examples/js/loaders/EquirectangularToCubeGenerator.js EquirectangularToCubeGenerator]. See this [link:https://threejs.org/examples/webgl_materials_envmaps_exr.html example] for details.
	*/
	open var envMap: ch.viseon.threejs.declarations.textures.CubeTexture  = definedExternally


	/**
	* Scales the effect of the environment map by multiplying its color.
	*/
	open var envMapIntensity: Double  = definedExternally


	/**
	* Used to check whether this or derived classes are mesh standard materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMeshStandardMaterial: Boolean  = definedExternally


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
	* How much the material is like a metal. Non-metallic materials such as wood or stone use 0.0, metallic use 1.0, with nothing (usually) in between. Default is 0.5. A value between 0.0 and 1.0 could be used for a rusty metal look. If metalnessMap is also provided, both values are multiplied.
	*/
	open var metalness: Double  = definedExternally


	/**
	* The blue channel of this texture is used to alter the metalness of the material.
	*/
	open var metalnessMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


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
	* The index of refraction (IOR) of air (approximately 1) divided by the index of refraction of the material. It is used with environment mapping modes [page:Textures THREE.CubeRefractionMapping] and [page:Textures THREE.EquirectangularRefractionMapping]. The refraction ratio should not exceed 1. Default is **0.98**.
	*/
	open var refractionRatio: Double  = definedExternally


	/**
	* How rough the material appears. 0.0 means a smooth mirror reflection, 1.0 means fully diffuse. Default is 0.5. If roughnessMap is also provided, both values are multiplied.
	*/
	open var roughness: Double  = definedExternally


	/**
	* The green channel of this texture is used to alter the roughness of the material.
	*/
	open var roughnessMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Define whether the material uses skinning. Default is false.
	*/
	open var skinning: Boolean  = definedExternally


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