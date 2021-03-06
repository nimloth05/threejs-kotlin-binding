@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* [name] is defined by a MatCap (or Lit Sphere) texture, which encodes the material color and shading. [name] does not respond to lights since the matcap image file encodes baked lighting. It will cast a shadow onto an object that receives shadows (and shadow clipping works), but it will not self-shadow or receive shadows.
	*/
open external class MeshMatcapMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* The alpha map is a grayscale texture that controls the opacity across the surface (black: fully transparent; white: fully opaque). Default is null. Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures, the [page:WebGLRenderer WebGL] renderer will use the green channel when sampling this texture due to the extra bit of precision provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha textures will also still work as expected.
	*/
	open var alphaMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


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
	* Define whether the material is rendered with flat shading. Default is false.
	*/
	open var flatShading: Boolean  = definedExternally


	/**
	* The color map. Default is null. The texture map color is modulated by the diffuse [page:.color].
	*/
	open var map: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* The matcap map. Default is null.
	*/
	open var matcap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Defines whether the material uses morphNormals. Set as true to pass morphNormal attributes from the geometry to the shader. Default is **false**.
	*/
	open var morphNormals: Boolean  = definedExternally


	/**
	* Define whether the material uses morphTargets. Default is false.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* The texture to create a normal map. The RGB values affect the surface normal for each pixel fragment and change the way the color is lit. Normal maps do not change the actual shape of the surface, only the lighting. In case the material has a normal map authored using the left handed convention, the y component of normalScale should be negated to compensate for the different handedness.
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
	* Define whether the material uses skinning. Default is false.
	*/
	open var skinning: Boolean  = definedExternally
}