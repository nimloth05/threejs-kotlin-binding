//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* Abstract base class for materials. Materials describe the appearance of [page:Object objects]. They are defined in a (mostly) renderer-independent way, so you don't have to rewrite materials if you decide to use a different renderer. The following properties and methods are inherited by all other material types (although they may have different defaults).
	*/
open external class Material(){

	/**
	* Sets the alpha value to be used when running an alpha test. The material will not be renderered if the opacity is lower than this value. Default is **0**.
	*/
	open var alphaTest: Double  = definedExternally


	/**
	* Blending destination. Default is [page:CustomBlendingEquation OneMinusSrcAlphaFactor]. See the destination factors [page:CustomBlendingEquation constants] for all possible values. The material's [page:Constant blending] must be set to [page:Materials CustomBlending] for this to have any effect.
	*/
	open var blendDst: Int  = definedExternally


	/**
	* The transparency of the [page:.blendDst]. Default is **null**.
	*/
	open var blendDstAlpha: Int  = definedExternally


	/**
	* Blending equation to use when applying blending. Default is [page:CustomBlendingEquation AddEquation]. See the blending equation [page:CustomBlendingEquation constants] for all possible values. The material's [page:Constant blending] must be set to [page:Materials CustomBlending] for this to have any effect.
	*/
	open var blendEquation: Int  = definedExternally


	/**
	* The tranparency of the [page:.blendEquation]. Default is **null**.
	*/
	open var blendEquationAlpha: Int  = definedExternally


	/**
	* Which blending to use when displaying objects with this material. This must be set to [page:Materials CustomBlending] to use custom [page:Constant blendSrc], [page:Constant blendDst] or [page:Constant blendEquation]. See the blending mode [page:Materials constants] for all possible values. Default is [page:Materials NormalBlending].
	*/
	open var blending: Int  = definedExternally


	/**
	* Blending source. Default is [page:CustomBlendingEquation SrcAlphaFactor]. See the source factors [page:CustomBlendingEquation constants] for all possible values. The material's [page:Constant blending] must be set to [page:Materials CustomBlending] for this to have any effect.
	*/
	open var blendSrc: Int  = definedExternally


	/**
	* The tranparency of the [page:.blendSrc]. Default is **null**.
	*/
	open var blendSrcAlpha: Int  = definedExternally


	/**
	* Changes the behavior of clipping planes so that only their intersection is clipped, rather than their union. Default is **false**.
	*/
	open var clipIntersection: Boolean  = definedExternally


	/**
	* User-defined clipping planes specified as THREE.Plane objects in world space. These planes apply to the objects this material is attached to. Points in space whose signed distance to the plane is negative are clipped (not rendered). This requires [page:WebGLRenderer.localClippingEnabled] to be **true**. See the [example:webgl_clipping_intersection WebGL / clipping /intersection] example. Default is **null**.
	*/
	open var clippingPlanes: Array<dynamic>  = definedExternally


	/**
	* Defines whether to clip shadows according to the clipping planes specified on this material. Default is **false**.
	*/
	open var clipShadows: Boolean  = definedExternally


	/**
	* Whether to render the material's color. This can be used in conjunction with a mesh's [page:Integer renderOrder] property to create invisible objects that occlude other objects. Default is **true**.
	*/
	open var colorWrite: Boolean  = definedExternally


	/**
	* Custom defines to be injected into the shader. These are passed in form of an object literal, with key/value pairs. { MY_CUSTOM_DEFINE: '' , PI2: Math.PI ** 2 }. The pairs are defined in both vertex and fragment shaders. Default is **undefined**.
	*/
	open var defines: dynamic  = definedExternally


	/**
	* Which depth function to use. Default is [page:Materials LessEqualDepth]. See the depth mode [page:Materials constants] for all possible values.
	*/
	open var depthFunc: Int  = definedExternally


	/**
	* Whether to have depth test enabled when rendering this material. Default is **true**.
	*/
	open var depthTest: Boolean  = definedExternally


	/**
	* Whether rendering this material has any effect on the depth buffer. Default is **true**. When drawing 2D overlays it can be useful to disable the depth writing in order to layer several things together without creating z-index artifacts.
	*/
	open var depthWrite: Boolean  = definedExternally


	/**
	* Define whether the material is rendered with flat shading. Default is false.
	*/
	open var flatShading: Boolean  = definedExternally


	/**
	* Whether the material is affected by fog. Default is **true**.
	*/
	open var fog: Boolean  = definedExternally


	/**
	* Unique number for this material instance.
	*/
	open var id: Int  = definedExternally


	/**
	* Used to check whether this or derived classes are materials. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMaterial: Boolean  = definedExternally


	/**
	* Whether the material is affected by lights. Default is **true**.
	*/
	open var lights: Boolean  = definedExternally


	/**
	* Optional name of the object (doesn't need to be unique). Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* Specifies that the material needs to be recompiled. This property is automatically set to **true** when instancing a new material.
	*/
	open var needsUpdate: Boolean  = definedExternally


	/**
	* Float in the range of **0.0** - **1.0** indicating how transparent the material is. A value of **0.0** indicates fully transparent, **1.0** is fully opaque. If the material's [page:Boolean transparent] property is not set to **true**, the material will remain fully opaque and this value will only affect its color. Default is **1.0**.
	*/
	open var opacity: Double  = definedExternally


	/**
	* Whether to use polygon offset. Default is **false**. This corresponds to the **GL_POLYGON_OFFSET_FILL** WebGL feature.
	*/
	open var polygonOffset: Boolean  = definedExternally


	/**
	* Sets the polygon offset factor. Default is **0**.
	*/
	open var polygonOffsetFactor: Int  = definedExternally


	/**
	* Sets the polygon offset units. Default is **0**.
	*/
	open var polygonOffsetUnits: Int  = definedExternally


	/**
	* Override the renderer's default precision for this material. Can be "**highp**", "**mediump**" or "**lowp**". Default is **null**.
	*/
	open var precision: String  = definedExternally


	/**
	* Whether to premultiply the alpha (transparency) value. See [Example:webgl_materials_transparency WebGL / Materials / Transparency] for an example of the difference. Default is **false**.
	*/
	open var premultipliedAlpha: Boolean  = definedExternally


	/**
	* Whether to apply dithering to the color to remove the appearance of banding. Default is **false**.
	*/
	open var dithering: Boolean  = definedExternally


	/**
	* Defines which side of faces cast shadows. When set, can be [page:Materials THREE.FrontSide], [page:Materials THREE.BackSide], or [page:Materials THREE.DoubleSide]. Default is **null**. If **null**, the side casting shadows is determined as follows:
	*/
	open var shadowSide: Int  = definedExternally


	/**
	* Defines which side of faces will be rendered - front, back or both. Default is [page:Materials THREE.FrontSide]. Other options are [page:Materials THREE.BackSide] and [page:Materials THREE.DoubleSide].
	*/
	open var side: Int  = definedExternally


	/**
	* Defines whether this material is transparent. This has an effect on rendering as transparent objects need special treatment and are rendered after non-transparent objects. When set to true, the extent to which the material is transparent is controlled by setting it's [page:Float opacity] property. Default is **false**.
	*/
	open var transparent: Boolean  = definedExternally


	/**
	* Value is the string 'Material'. This shouldn't be changed, and can be used to find all objects of this type in a scene.
	*/
	open var type: String  = definedExternally


	/**
	* [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this material instance. This gets automatically assigned, so this shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* Defines whether vertex coloring is used. Default is [page:Materials THREE.NoColors]. Other options are [page:Materials THREE.VertexColors] and [page:Materials THREE.FaceColors].
	*/
	open var vertexColors: Int  = definedExternally


	/**
	* Defines whether precomputed vertex tangents, which must be provided in a vec4 "tangent" attribute, are used. When disabled, tangents are derived automatically. Using precomputed tangents will give more accurate normal map details in some cases, such as with mirrored UVs. Default is false.
	*/
	open var vertexTangents: Boolean  = definedExternally


	/**
	* Defines whether this material is visible. Default is **true**.
	*/
	open var visible: Boolean  = definedExternally


	/**
	* An object that can be used to store custom data about the Material. It should not hold references to functions as these will not be cloned.
	*/
	open var userData: dynamic  = definedExternally


	/**
	* Return a new material with the same parameters as this material.
	*/
	open fun clone() : ch.viseon.threejs.declarations.materials.Material


	/**
	* Copy the parameters from the passed material into this material.
	*/
	open fun copy(material: ch.viseon.threejs.declarations.materials.Material = definedExternally) : ch.viseon.threejs.declarations.materials.Material


	/**
	* This disposes the material. Textures of a material don't get disposed. These needs to be disposed by [page:Texture Texture].
	*/
	open fun dispose() : dynamic


	/**
	* An optional callback that is executed immediately before the shader program is compiled. This function is called with the shader source code as a parameter. Useful for the modification of built-in materials.
	*/
	open fun onBeforeCompile(shader: dynamic = definedExternally, renderer: ch.viseon.threejs.declarations.renderers.WebGLRenderer = definedExternally) : dynamic


	/**
	* values -- a container with parameters. Sets the properties based on the **values**.
	*/
	open fun setValues(values: dynamic = definedExternally) : dynamic


	/**
	* meta -- object containing metadata such as textures or images for the material. Convert the material to three.js JSON format.
	*/
	open fun toJSON(meta: dynamic = definedExternally) : dynamic
}