@file:JsModule("three")
package ch.viseon.threejs.declarations.renderers

	/**
	* The WebGL renderer displays your beautifully crafted scenes using [link:https://en.wikipedia.org/wiki/WebGL WebGL].
	*/
open external class WebGLRenderer(parameters: dynamic = definedExternally){

	/**
	* Defines whether the renderer should automatically clear its output before rendering a frame.
	*/
	open var autoClear: Boolean  = definedExternally


	/**
	* If [page:.autoClear autoClear] is true, defines whether the renderer should clear the color buffer. Default is **true**.
	*/
	open var autoClearColor: Boolean  = definedExternally


	/**
	* If [page:.autoClear autoClear] is true, defines whether the renderer should clear the depth buffer. Default is **true**.
	*/
	open var autoClearDepth: Boolean  = definedExternally


	/**
	* If [page:.autoClear autoClear] is true, defines whether the renderer should clear the stencil buffer. Default is **true**.
	*/
	open var autoClearStencil: Boolean  = definedExternally


	/**
	* An object containing details about the capabilities of the current [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext RenderingContext]. - [page:Boolean floatFragmentTextures]: whether the context supports the [link:https://developer.mozilla.org/en-US/docs/Web/API/OES_texture_float OES_texture_float] extension. According to [link:https://webglstats.com/ WebGLStats], as of February 2016 over 95% of WebGL enabled devices support this. - [page:Boolean floatVertexTextures]: **true** if [page:Boolean floatFragmentTextures] and [page:Boolean vertexTextures] are both true. - [page:Method getMaxAnisotropy](): Returns the maximum available anisotropy. - [page:Method getMaxPrecision](): Returns the maximum available precision for vertex and fragment shaders. - [page:Boolean isWebGL2]: **true** if the context in use is a WebGL2RenderingContext object. - [page:Boolean logarithmicDepthBuffer]: **true** if the [page:parameter logarithmicDepthBuffer] was set to true in the constructor and the context supports the [link:https://developer.mozilla.org/en-US/docs/Web/API/EXT_frag_depth EXT_frag_depth] extension. According to [link:https://webglstats.com/ WebGLStats], as of February 2016 around 66% of WebGL enabled devices support this. - [page:Integer maxAttributes]: The value of **gl.MAX_VERTEX_ATTRIBS**. - [page:Integer maxCubemapSize]: The value of **gl.MAX_CUBE_MAP_TEXTURE_SIZE**. Maximum height ** width of cube map textures that a shader can use. - [page:Integer maxFragmentUniforms]: The value of **gl.MAX_FRAGMENT_UNIFORM_VECTORS**. The number of uniforms that can be used by a fragment shader. - [page:Integer maxTextureSize]: The value of **gl.MAX_TEXTURE_SIZE**. Maximum height ** width of a texture that a shader use. - [page:Integer maxTextures]: The value of **gl.MAX_TEXTURE_IMAGE_UNITS**. The maximum number of textures that can be used by a shader. - [page:Integer maxVaryings]: The value of **gl.MAX_VARYING_VECTORS**. The number of varying vectors that can used by shaders. - [page:Integer maxVertexTextures]: The value of **gl.MAX_VERTEX_TEXTURE_IMAGE_UNITS**. The number of textures that can be used in a vertex shader. - [page:Integer maxVertexUniforms]: The value of **gl.MAX_VERTEX_UNIFORM_VECTORS**. The maximum number of uniforms that can be used in a vertex shader. - [page:String precision]: The shader precision currently being used by the renderer. - [page:Boolean vertexTextures]: **true** if [property:Integer maxVertexTextures] is greater than 0 (i.e. vertext textures can be used).
	*/
	open var capabilities: dynamic  = definedExternally


	/**
	* User-defined clipping planes specified as THREE.Plane objects in world space. These planes apply globally. Points in space whose dot product with the plane is negative are cut away. Default is [].
	*/
	open var clippingPlanes: Array<dynamic>  = definedExternally


	/**
	* A [link:https://developer.mozilla.org/en-US/docs/Web/HTML/Element/canvas canvas] where the renderer draws its output. This is automatically created by the renderer in the constructor (if not provided already); you just need to add it to your page like so: document.body.appendChild( renderer.domElement );
	*/
	open var domElement: org.w3c.dom.Element  = definedExternally


	/**
	* A wrapper for the [page:WebGLRenderer.extensions.get .extensions.get] method, used to check whether various WebGL extensions are supported.
	*/
	open var extensions: dynamic  = definedExternally


	/**
	* Default is **2**.
	*/
	open var gammaFactor: Double  = definedExternally


	/**
	* Defines the output encoding of the renderer. Default is [page:Textures THREE.LinearEncoding].
If a render target has been set using [page:WebGLRenderer.setRenderTarget .setRenderTarget] then renderTarget.texture.encoding will be used instead.
See the [page:Textures texture constants] page for details of other formats.
	*/
	open var outputEncoding: Double  = definedExternally


	/**
	* An object with a series of statistical information about the graphics board memory and the rendering process. Useful for debugging or just for the sake of curiosity. The object contains the following fields:

	*/
	open var info: dynamic  = definedExternally


	/**
	* Defines whether the renderer respects object-level clipping planes. Default is **false**.
	*/
	open var localClippingEnabled: Boolean  = definedExternally


	/**
	* Default is 8. The maximum number of MorphTargets allowed in a shader. Keep in mind that the standard materials only allow 8 MorphTargets.
	*/
	open var maxMorphTargets: Int  = definedExternally


	/**
	* Default is 4. The maximum number of MorphNormals allowed in a shader. Keep in mind that the standard materials only allow 4 MorphNormals.
	*/
	open var maxMorphNormals: Int  = definedExternally


	/**
	* Whether to use physically correct lighting mode. Default is **false**. See the [example:webgl_lights_physical lights / physical] example.
	*/
	open var physicallyCorrectLights: Boolean  = definedExternally


	/**
	* Used internally by the renderer to keep track of various sub object properties.
	*/
	open var properties: dynamic  = definedExternally


	/**
	* Used internally to handle ordering of scene object rendering.
	*/
	open var renderLists: dynamic  = definedExternally


	/**
	* This contains the reference to the shadow map, if used.
	*/
	open var shadowMap: dynamic  = definedExternally


	/**
	* Defines whether the renderer should sort objects. Default is **true**. Note: Sorting is used to attempt to properly render objects that have some degree of transparency. By definition, sorting objects may not work in all cases. Depending on the needs of application, it may be necessary to turn off sorting and use other methods to deal with transparency rendering e.g. manually determining each object's rendering order.
	*/
	open var sortObjects: Boolean  = definedExternally


	/**
	* Contains functions for setting various properties of the [page:WebGLRenderer.context] state.
	*/
	open var state: dynamic  = definedExternally


	/**
	* Default is [page:Renderer NoToneMapping]. See the [page:Renderer Renderer constants] for other choices.
	*/
	open var toneMapping: Int  = definedExternally


	/**
	* Exposure level of tone mapping. Default is **1**.
	*/
	open var toneMappingExposure: Double  = definedExternally


	/**
	* Provides access to the WebXR related [page:WebXRManager interface] of the renderer.
	*/
	open var xr: ch.viseon.threejs.declarations.renderers.webxr.WebXRManager  = definedExternally


	/**
	* Tells the renderer to clear its color, depth or stencil drawing buffer(s). This method initializes the color buffer to the current clear color value. Arguments default to **true**.
	*/
	open fun clear(color: Boolean = definedExternally, depth: Boolean = definedExternally, stencil: Boolean = definedExternally) : dynamic


	/**
	* Clear the color buffer. Equivalent to calling [page:WebGLRenderer.clear .clear]( true, false, false ).
	*/
	open fun clearColor() : dynamic


	/**
	* Clear the depth buffer. Equivalent to calling [page:WebGLRenderer.clear .clear]( false, true, false ).
	*/
	open fun clearDepth() : dynamic


	/**
	* Clear the stencil buffers. Equivalent to calling [page:WebGLRenderer.clear .clear]( false, false, true ).
	*/
	open fun clearStencil() : dynamic


	/**
	* Compiles all materials in the scene with the camera. This is useful to precompile shaders before the first rendering.
	*/
	open fun compile(scene: ch.viseon.threejs.declarations.core.Object3D = definedExternally, camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally) : dynamic


	/**
	* Copies pixels from the current WebGLFramebuffer into a 2D texture. Enables access to [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexImage2D WebGLRenderingContext.copyTexImage2D].
	*/
	open fun copyFramebufferToTexture(position: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, texture: ch.viseon.threejs.declarations.textures.Texture = definedExternally, level: Double = definedExternally) : dynamic


	/**
	* Copies all pixels of a texture to an existing texture starting from the given position. Enables access to [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D WebGLRenderingContext.texSubImage2D].
	*/
	open fun copyTextureToTexture(position: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, srcTexture: ch.viseon.threejs.declarations.textures.Texture = definedExternally, dstTexture: ch.viseon.threejs.declarations.textures.Texture = definedExternally, level: Double = definedExternally) : dynamic


	/**
	* Copies the pixels of a texture in the bounds '[page:Box3 sourceBox]' in the desination texture starting from the given position. Enables access to [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D WebGL2RenderingContext.texSubImage3D].
	*/
	open fun copyTextureToTexture3D(sourceBox: ch.viseon.threejs.declarations.math.Box3 = definedExternally, position: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, srcTexture: ch.viseon.threejs.declarations.textures.Texture = definedExternally, dstTexture: ch.viseon.threejs.declarations.textures.Texture = definedExternally, level: Double = definedExternally) : dynamic


	/**
	* Dispose of the current rendering context.
	*/
	open fun dispose() : dynamic


	/**
	* Simulate loss of the WebGL context. This requires support for the [link:https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_lose_context WEBGL_lose_context] extensions. According to [link:https://webglstats.com/ WebGLStats], as of February 2016 90% of WebGL enabled devices support this.
	*/
	open fun forceContextLoss() : dynamic


	/**
	* Returns a [page:Float float] with the current clear alpha. Ranges from 0 to 1.
	*/
	open fun getClearAlpha() : Double


	/**
	* Returns a [page:Color THREE.Color] instance with the current clear color.
	*/
	open fun getClearColor(target: ch.viseon.threejs.declarations.math.Color = definedExternally) : ch.viseon.threejs.declarations.math.Color


	/**
	* Return the current WebGL context.
	*/
	open fun getContext() : org.khronos.webgl.WebGLRenderingContext


	/**
	* Returns an object that describes the attributes set on the WebGL context when it was created.
	*/
	open fun getContextAttributes() : org.khronos.webgl.WebGLContextAttributes


	/**
	* Returns the current active cube face.
	*/
	open fun getActiveCubeFace() : Int


	/**
	* Returns the current active mipmap level.
	*/
	open fun getActiveMipmapLevel() : Int


	/**
	* Returns the current [page:RenderTarget RenderTarget] if there are; returns **null** otherwise.
	*/
	open fun getRenderTarget() : dynamic


	/**
	* [page:Vector4 target] — the result will be copied into this Vector4. Returns the current viewport.
	*/
	open fun getCurrentViewport(target: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : ch.viseon.threejs.declarations.math.Vector4


	/**
	* [page:Vector2 target] — the result will be copied into this Vector2. Returns the width and height of the renderer's drawing buffer, in pixels.
	*/
	open fun getDrawingBufferSize(target: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Vector2


	/**
	* Returns current device pixel ratio used.
	*/
	open fun getPixelRatio() : Double


	/**
	* [page:Vector4 target] — the result will be copied into this Vector4. Returns the scissor region.
	*/
	open fun getScissor(target: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : ch.viseon.threejs.declarations.math.Vector4


	/**
	* Returns **true** if scissor test is enabled; returns **false** otherwise.
	*/
	open fun getScissorTest() : Boolean


	/**
	* [page:Vector2 target] — the result will be copied into this Vector2. Returns the width and height of the renderer's output canvas, in pixels.
	*/
	open fun getSize(target: ch.viseon.threejs.declarations.math.Vector2 = definedExternally) : ch.viseon.threejs.declarations.math.Vector2


	/**
	* [page:Vector4 target] — the result will be copied into this Vector4. Returns the viewport.
	*/
	open fun getViewport(target: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : ch.viseon.threejs.declarations.math.Vector4


	/**
	* Initializes the given texture. Useful for preloading a texture rather than waiting until first render (which can cause noticeable lags due to decode and GPU upload overhead).
	*/
	open fun initTexture(texture: ch.viseon.threejs.declarations.textures.Texture = definedExternally) : dynamic


	/**
	* Reset the GL state to default. Called internally if the WebGL context is lost.
	*/
	open fun resetGLState() : dynamic


	/**
	* buffer - Uint8Array is the only destination type supported in all cases, other types are renderTarget and platform dependent. See [link:https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.12 WebGL spec] for details.
Reads the pixel data from the renderTarget into the buffer you pass in. This is a wrapper around [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels WebGLRenderingContext.readPixels]().
See the [example:webgl_interactive_cubes_gpu interactive / cubes / gpu] example.
For reading out a [page:WebGLCubeRenderTarget WebGLCubeRenderTarget] use the optional parameter activeCubeFaceIndex to determine which face should be read.
	*/
	open fun readRenderTargetPixels(renderTarget: ch.viseon.threejs.declarations.renderers.WebGLRenderTarget = definedExternally, x: Double = definedExternally, y: Double = definedExternally, width: Double = definedExternally, height: Double = definedExternally, buffer: Array<dynamic> = definedExternally, activeCubeFaceIndex: Int = definedExternally) : dynamic


	/**
	* Render a [page:Scene scene] or another type of [page:Object3D object] using a [page:Camera camera]. The render is done to a previously specified [page:WebGLRenderTarget renderTarget] set by calling [page:WebGLRenderer.setRenderTarget .setRenderTarget] or to the canvas as usual. By default render buffers are cleared before rendering but you can prevent this by setting the property [page:WebGLRenderer.autoClear autoClear] to false. If you want to prevent only certain buffers being cleared you can set either the [page:WebGLRenderer.autoClearColor autoClearColor], [page:WebGLRenderer.autoClearStencil autoClearStencil] or [page:WebGLRenderer.autoClearDepth autoClearDepth] properties to false. To forcibly clear one ore more buffers call [page:WebGLRenderer.clear .clear].
	*/
	open fun render(scene: ch.viseon.threejs.declarations.core.Object3D = definedExternally, camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally) : dynamic


	/**
	* Render a buffer geometry group using the camera and with the specified material.
	*/
	open fun renderBufferDirect(camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally, fog: ch.viseon.threejs.declarations.scenes.Fog = definedExternally, geometry: ch.viseon.threejs.declarations.core.BufferGeometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally, `object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, group: dynamic = definedExternally) : dynamic


	/**
	* object - an instance of [page:Object3D] program - an instance of [page:WebGLProgram] Renders an instance of [page:ImmediateRenderObject]. Gets called by renderObjectImmediate().
	*/
	open fun renderBufferImmediate(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, program:  org.khronos.webgl.WebGLProgram = definedExternally) : dynamic


	/**
	* Can be used to reset the internal WebGL state. This method is mostly relevant for applications which share a single WebGL context across multiple WebGL libraries.
	*/
	open fun resetState() : dynamic


	/**
	* [page:Function callback] — The function will be called every available frame. If `null` is passed it will stop any already ongoing animation.
A built in function that can be used instead of [link:https://developer.mozilla.org/en-US/docs/Web/API/window/requestAnimationFrame requestAnimationFrame]. For WebXR projects this function must be used.
	*/
	open fun setAnimationLoop(callback: dynamic = definedExternally) : dynamic


	/**
	* Sets the clear alpha. Valid input is a float between **0.0** and **1.0**.
	*/
	open fun setClearAlpha(alpha: Double = definedExternally) : dynamic


	/**
	* Sets the clear color and opacity.
	*/
	open fun setClearColor(color: ch.viseon.threejs.declarations.math.Color = definedExternally, alpha: Double = definedExternally) : dynamic


	/**
	* Sets the given WebGLFramebuffer. This method can only be used if no render target is set via [page:WebGLRenderer.setRenderTarget .setRenderTarget]().
	*/
	open fun setFramebuffer(value: org.khronos.webgl.WebGLFramebuffer = definedExternally) : dynamic


	/**
	* Sets device pixel ratio. This is usually used for HiDPI device to prevent bluring output canvas.
	*/
	open fun setPixelRatio(value: Double = definedExternally) : dynamic


	/**
	* renderTarget -- The [page:WebGLRenderTarget renderTarget] that needs to be activated. When **null** is given, the canvas is set as the active render target instead. activeCubeFace -- Specifies the active cube side (PX 0, NX 1, PY 2, NY 3, PZ 4, NZ 5) of [page:WebGLCubeRenderTarget] (optional). activeMipmapLevel -- Specifies the active mipmap level (optional). This method sets the active rendertarget.
	*/
	open fun setRenderTarget(renderTarget: ch.viseon.threejs.declarations.renderers.WebGLRenderTarget = definedExternally, activeCubeFace: Int = definedExternally, activeMipmapLevel: Int = definedExternally) : dynamic


	/**
	* The x, y, width, and height parameters of the scissor region. Optionally, a 4-component vector specifying the parameters of the region. Sets the scissor region from (x, y) to (x + width, y + height). (x, y) is the lower-left corner of the scissor region.
	*/
	open fun setScissor(x: Int = definedExternally, y: Int = definedExternally, width: Int = definedExternally, height: Int = definedExternally, setScissor: dynamic = definedExternally, vector: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : dynamic


	/**
	* Enable or disable the scissor test. When this is enabled, only the pixels within the defined scissor area will be affected by further renderer actions.
	*/
	open fun setScissorTest(boolean: Boolean = definedExternally) : dynamic


	/**
	* Sets the custom opaque sort function for the WebGLRenderLists. Pass null to use the default painterSortStable function.
	*/
	open fun setOpaqueSort(method: dynamic = definedExternally) : dynamic


	/**
	* Sets the custom transparent sort function for the WebGLRenderLists. Pass null to use the default reversePainterSortStable function.
	*/
	open fun setTransparentSort(method: dynamic = definedExternally) : dynamic


	/**
	* Resizes the output canvas to (width, height) with device pixel ratio taken into account, and also sets the viewport to fit that size, starting in (0, 0). Setting [page:Boolean updateStyle] to false prevents any style changes to the output canvas.
	*/
	open fun setSize(width: Int = definedExternally, height: Int = definedExternally, updateStyle: Boolean = definedExternally) : dynamic


	/**
	* The x, y, width, and height parameters of the viewport. Optionally, a 4-component vector specifying the parameters of a viewport. Sets the viewport to render from (x, y) to (x + width, y + height). (x, y) is the lower-left corner of the region.
	*/
	open fun setViewport(x: Int = definedExternally, y: Int = definedExternally, width: Int = definedExternally, height: Int = definedExternally, setViewport: dynamic = definedExternally, vector: ch.viseon.threejs.declarations.math.Vector4 = definedExternally) : dynamic
}