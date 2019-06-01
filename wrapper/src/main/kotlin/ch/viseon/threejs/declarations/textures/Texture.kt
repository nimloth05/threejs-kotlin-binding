@file:JsModule("three")
package ch.viseon.threejs.declarations.textures

	/**
	* Create a texture to apply to a surface or as a reflection or refraction map.
	*/
open external class Texture(image: dynamic = definedExternally, mapping: Int = definedExternally, wrapS: Int = definedExternally, wrapT: Int = definedExternally, magFilter: Int = definedExternally, minFilter: Int = definedExternally, format: Int = definedExternally, anisotropy: Double = definedExternally, encoding: Int = definedExternally){

	/**
	* Readonly - unique number for this texture instance.
	*/
	open var id: Int  = definedExternally


	/**
	* [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this object instance. This gets automatically assigned, so this shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* Optional name of the object (doesn't need to be unique). Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* An image object, typically created using the [page:TextureLoader.load] method. This can be any image (e.g., PNG, JPG, GIF, DDS) or video (e.g., MP4, OGG/OGV) type supported by three.js. To use video as a texture you need to have a playing HTML5 video element as a source for your texture image and continuously update this texture as long as video is playing - the [page:VideoTexture VideoTexture] class handles this automatically.
	*/
	open var image: dynamic  = definedExternally


	/**
	* Used to check whether this or derived classes are Textures. Default is **true**. You should not change this, as it is used internally for optimisation.
	*/
	open var isTexture: Boolean  = definedExternally


	/**
	* Array of user-specified mipmaps (optional).
	*/
	open var mipmaps: Array<dynamic>  = definedExternally


	/**
	* How the image is applied to the object. An object type of [page:Textures THREE.UVMapping] is the default, where the U,V coordinates are used to apply the map. See the [page:Textures texture constants] page for other mapping types.
	*/
	open var mapping: Int  = definedExternally


	/**
	* This defines how the texture is wrapped horizontally and corresponds to **U** in UV mapping. The default is [page:Textures THREE.ClampToEdgeWrapping], where the edge is clamped to the outer edge texels. The other two choices are [page:Textures THREE.RepeatWrapping] and [page:Textures THREE.MirroredRepeatWrapping]. See the [page:Textures texture constants] page for details.
	*/
	open var wrapS: Int  = definedExternally


	/**
	* This defines how the texture is wrapped vertically and corresponds to **V** in UV mapping. The same choices are available as for [property:number wrapS]. NOTE: tiling of images in textures only functions if image dimensions are powers of two (2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, ...) in terms of pixels. Individual dimensions need not be equal, but each must be a power of two. This is a limitation of WebGL, not three.js.
	*/
	open var wrapT: Int  = definedExternally


	/**
	* How the texture is sampled when a texel covers more than one pixel. The default is [page:Textures THREE.LinearFilter], which takes the four closest texels and bilinearly interpolates among them. The other option is [page:Textures THREE.NearestFilter], which uses the value of the closest texel. See the [page:Textures texture constants] page for details.
	*/
	open var magFilter: Int  = definedExternally


	/**
	* How the texture is sampled when a texel covers less than one pixel. The default is [page:Textures THREE.LinearMipMapLinearFilter], which uses mipmapping and a trilinear filter. See the [page:Textures texture constants] page for all possible choices.
	*/
	open var minFilter: Int  = definedExternally


	/**
	* The number of samples taken along the axis through the pixel that has the highest density of texels. By default, this value is 1. A higher value gives a less blurry result than a basic mipmap, at the cost of more texture samples being used. Use [page:WebGLRenderer.getMaxAnisotropy renderer.getMaxAnisotropy]() to find the maximum valid anisotropy value for the GPU; this value is usually a power of 2.
	*/
	open var anisotropy: Double  = definedExternally


	/**
	* The default is [page:Textures THREE.RGBAFormat], although the [page:TextureLoader TextureLoader] will automatically set this to [page:Textures THREE.RGBFormat] for JPG images. See the [page:Textures texture constants] page for details of other formats.
	*/
	open var format: Int  = definedExternally


	/**
	* This must correspond to the [page:Texture.format .format]. The default is [page:Textures THREE.UnsignedByteType], which will be used for most texture formats. See the [page:Textures texture constants] page for details of other formats.
	*/
	open var type: Double  = definedExternally


	/**
	* How much a single repetition of the texture is offset from the beginning, in each direction U and V. Typical range is **0.0** to **1.0**. _Note:_ The offset property is a convenience modifier and only affects the Texture's application to the first set of UVs on a model. If the Texture is used as a map requiring additional UV sets (e.g. the aoMap or lightMap of most stock materials), those UVs must be manually assigned to achieve the desired offset.
	*/
	open var offset: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* How many times the texture is repeated across the surface, in each direction U and V. If repeat is set greater than 1 in either direction, the corresponding Wrap parameter should also be set to [page:Textures THREE.RepeatWrapping] or [page:Textures THREE.MirroredRepeatWrapping] to achieve the desired tiling effect. _Note:_ The repeat property is a convenience modifier and only affects the Texture's application to the first set of UVs on a model. If the Texture is used as a map requiring additional UV sets (e.g. the aoMap or lightMap of most stock materials), those UVs must be manually assigned to achieve the desired repetiton.
	*/
	open var repeat: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* How much the texture is rotated around the center point, in radians. Positive values are counter-clockwise. Default is **0**.
	*/
	open var rotation: Double  = definedExternally


	/**
	* The point around which rotation occurs. A value of (0.5, 0.5) corresponds to the center of the texture. Default is (0, 0), the lower left.
	*/
	open var center: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* Whether to update the texture's uv-transform [page:Texture.matrix .matrix] from the texture properties [page:Texture.offset .offset], [page:Texture.repeat .repeat], [page:Texture.rotation .rotation], and [page:Texture.center .center]. True by default. Set this to false if you are specifying the uv-transform matrix directly.
	*/
	open var matrixAutoUpdate: Boolean  = definedExternally


	/**
	* The uv-transform matrix for the texture. Updated by the renderer from the texture properties [page:Texture.offset .offset], [page:Texture.repeat .repeat], [page:Texture.rotation .rotation], and [page:Texture.center .center] when the texture's [page:Texture.matrixAutoUpdate .matrixAutoUpdate] property is true. When [page:Texture.matrixAutoUpdate .matrixAutoUpdate] property is false, this matrix may be set manually. Default is the identity matrix.
	*/
	open var matrix: ch.viseon.threejs.declarations.math.Matrix3  = definedExternally


	/**
	* Whether to generate mipmaps (if possible) for a texture. True by default. Set this to false if you are creating mipmaps manually.
	*/
	open var generateMipmaps: Boolean  = definedExternally


	/**
	* If set to **true**, the alpha channel, if present, is multiplied into the color channels when the texture is uploaded to the GPU. Defaut is **false**. Note that this property has no effect for [link:https://developer.mozilla.org/de/docs/Web/API/ImageBitmap ImageBitmap]. You need to configure on bitmap creation instead. See [page:ImageBitmapLoader].
	*/
	open var premultiplyAlpha: Boolean  = definedExternally


	/**
	* If set to **true**, the texture is flipped along the vertical axis when uploaded to the GPU. Default is **true**. Note that this property has no effect for [link:https://developer.mozilla.org/de/docs/Web/API/ImageBitmap ImageBitmap]. You need to configure on bitmap creation instead. See [page:ImageBitmapLoader].
	*/
	open var flipY: Boolean  = definedExternally


	/**
	* 4 by default. Specifies the alignment requirements for the start of each pixel row in memory. The allowable values are 1 (byte-alignment), 2 (rows aligned to even-numbered bytes), 4 (word-alignment), and 8 (rows start on double-word boundaries). See [link:http://www.khronos.org/opengles/sdk/docs/man/xhtml/glPixelStorei.xml glPixelStorei] for more information.
	*/
	open var unpackAlignment: Double  = definedExternally


	/**
	* [page:Textures THREE.LinearEncoding] is the default. See the [page:Textures texture constants] page for details of other formats. Note that if this value is changed on a texture after the material has been used, it is necessary to trigger a Material.needsUpdate for this value to be realized in the shader.
	*/
	open var encoding: Int  = definedExternally


	/**
	* This starts at **0** and counts how many times [property:Boolean needsUpdate] is set to **true**.
	*/
	open var version: Int  = definedExternally


	/**
	* A callback function, called when the texture is updated (e.g., when needsUpdate has been set to true and then the texture is used).
	*/
	open var onUpdate: dynamic  = definedExternally


	/**
	* Set this to **true** to trigger an update next time the texture is used. Particularly important for setting the wrap mode.
	*/
	open var needsUpdate: Boolean  = definedExternally


	/**
	* Update the texture's uv-transform [page:Texture.matrix .matrix] from the texture properties [page:Texture.offset .offset], [page:Texture.repeat .repeat], [page:Texture.rotation .rotation], and [page:Texture.center .center].
	*/
	open fun updateMatrix() : dynamic


	/**
	* Make copy of the texture. Note this is not a "deep copy", the image is shared.
	*/
	open fun clone() : ch.viseon.threejs.declarations.textures.Texture


	/**
	* meta -- optional object containing metadata. Convert the texture to three.js [link:https://github.com/mrdoob/three.js/wiki/JSON-Object-Scene-format-4 JSON Object/Scene format].
	*/
	open fun toJSON(meta: dynamic = definedExternally) : dynamic


	/**
	* Call [page:EventDispatcher EventDispatcher].dispatchEvent with a 'dispose' event type.
	*/
	open fun dispose() : dynamic


	/**
	* Transform the uv based on the value of this texture's [page:Texture.offset .offset], [page:Texture.repeat .repeat], [page:Texture.wrapS .wrapS], [page:Texture.wrapT .wrapT] and [page:Texture.flipY .flipY] properties.
	*/
	open fun transformUv(uv: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Vector2
}