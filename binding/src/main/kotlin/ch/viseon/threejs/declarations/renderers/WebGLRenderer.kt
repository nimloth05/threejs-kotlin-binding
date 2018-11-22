//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.renderers

	/**
	* The WebGL renderer displays your beautifully crafted scenes using [link:https://en.wikipedia.org/wiki/WebGL WebGL].
	*/
open external class WebGLRenderer(parameters: dynamic/*Object*/ = definedExternally){

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
	* An object containing details about the capabilities of the current [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext RenderingContext]. - [page:Boolean floatFragmentTextures]: whether the context supports the [link:https://developer.mozilla.org/en-US/docs/Web/API/OES_texture_float OES_texture_float] extension. According to [link:https://webglstats.com/ WebGLStats], as of February 2016 over 95% of WebGL enabled devices support this. - [page:Boolean floatVertexTextures]: **true** if [page:Boolean floatFragmentTextures] and [page:Boolean vertexTextures] are both true. - [page:Method getMaxAnisotropy](): Returns the maximum available anisotropy. - [page:Method getMaxPrecision](): Returns the maximum available precision for vertex and fragment shaders. - [page:Boolean logarithmicDepthBuffer]: **true** if the [page:parameter logarithmicDepthBuffer] was set to true in the constructor and the context supports the [link:https://developer.mozilla.org/en-US/docs/Web/API/EXT_frag_depth EXT_frag_depth] extension. According to [link:https://webglstats.com/ WebGLStats], as of February 2016 around 66% of WebGL enabled devices support this. - [page:Integer maxAttributes]: The value of **gl.MAX_VERTEX_ATTRIBS**. - [page:Integer maxCubemapSize]: The value of **gl.MAX_CUBE_MAP_TEXTURE_SIZE**. Maximum height ** width of cube map textures that a shader can use. - [page:Integer maxFragmentUniforms]: The value of **gl.MAX_FRAGMENT_UNIFORM_VECTORS**. The number of uniforms that can be used by a fragment shader. - [page:Integer maxTextureSize]: The value of **gl.MAX_TEXTURE_SIZE**. Maximum height ** width of a texture that a shader use. - [page:Integer maxTextures]: The value of **gl.MAX_TEXTURE_IMAGE_UNITS**. The maximum number of textures that can be used by a shader. - [page:Integer maxVaryings]: The value of **gl.MAX_VARYING_VECTORS**. The number of varying vectors that can used by shaders. - [page:Integer maxVertexTextures]: The value of **gl.MAX_VERTEX_TEXTURE_IMAGE_UNITS**. The number of textures that can be used in a vertex shader. - [page:Integer maxVertexUniforms]: The value of **gl.MAX_VERTEX_UNIFORM_VECTORS**. The maximum number of uniforms that can be used in a vertex shader. - [page:String precision]: The shader precision currently being used by the renderer. - [page:Boolean vertexTextures]: **true** if [property:Integer maxVertexTextures] is greater than 0 (i.e. vertext textures can be used).
	*/
	open var capabilities: dynamic/*Object*/  = definedExternally


	/**
	* User-defined clipping planes specified as THREE.Plane objects in world space. These planes apply globally. Points in space whose dot product with the plane is negative are cut away. Default is [].
	*/
	open var clippingPlanes: Array<dynamic>/*Array*/  = definedExternally


	/**
	* The renderer obtains a [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext RenderingContext] context from its [page:WebGLRenderer.domElement domElement] by default, using [link:https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext HTMLCanvasElement.getContext](). You can create this manually, however it must correspond to the [page:WebGLRenderer.domElement domElement] in order to render to the screen.
	*/
	open var context: org.khronos.webgl.WebGLRenderingContext  = definedExternally


	/**
	* A [link:https://developer.mozilla.org/en-US/docs/Web/HTML/Element/canvas canvas] where the renderer draws its output. This is automatically created by the renderer in the constructor (if not provided already); you just need to add it to your page like so: document.body.appendChild( renderer.domElement );
	*/
	open var domElement: org.w3c.dom.Element  = definedExternally


	/**
	* A wrapper for the [page:WebGLRenderer.extensions.get .extensions.get] method, used to check whether various WebGL extensions are supported.
	*/
	open var extensions: dynamic/*Object*/  = definedExternally


	/**
	* Default is **2**.
	*/
	open var gammaFactor: Float  = definedExternally


	/**
	* If set, then it expects that all textures and colors are premultiplied gamma. Default is **false**.
	*/
	open var gammaInput: Boolean  = definedExternally


	/**
	* If set, then it expects that all textures and colors need to be outputted in premultiplied gamma. Default is **false**.
	*/
	open var gammaOutput: Boolean  = definedExternally


	/**
	* An object with a series of statistical information about the graphics board memory and the rendering process. Useful for debugging or just for the sake of curiosity. The object contains the following fields:

	*/
	open var info: dynamic/*Object*/  = definedExternally


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
	open var properties: dynamic/*Object*/  = definedExternally


	/**
	* Used internally to handle ordering of scene object rendering.
	*/
	open var renderLists: dynamic/*WebGLRenderLists*/  = definedExternally


	/**
	* This contains the reference to the shadow map, if used.
	*/
	open var shadowMap: dynamic/*WebGLShadowMap*/  = definedExternally


	/**
	* Defines whether the renderer should sort objects. Default is **true**. Note: Sorting is used to attempt to properly render objects that have some degree of transparency. By definition, sorting objects may not work in all cases. Depending on the needs of application, it may be neccessary to turn off sorting and use other methods to deal with transparency rendering e.g. manually determining each object's rendering order.
	*/
	open var sortObjects: Boolean  = definedExternally


	/**
	* Contains functions for setting various properties of the [page:WebGLRenderer.context] state.
	*/
	open var state: dynamic/*Object*/  = definedExternally


	/**
	* Default is [page:Renderer LinearToneMapping]. See the [page:Renderer Renderer constants] for other choices.
	*/
	open var toneMapping: Int  = definedExternally


	/**
	* Exposure level of tone mapping. Default is **1**.
	*/
	open var toneMappingExposure: Float  = definedExternally


	/**
	* Tone mapping white point. Default is **1**.
	*/
	open var toneMappingWhitePoint: Float  = definedExternally


	/**
	* Attempt to allocate a texture unit for use by a shader. Will warn if trying to allocate more texture units than the GPU supports. This is mainly used internally. See [page:WebGLRenderer.capabilities capabilities.maxTextures].
	*/
	open fun allocTextureUnit() : Int


	/**
	* Tells the renderer to clear its color, depth or stencil drawing buffer(s). This method initializes the color buffer to the current clear color value. Arguments default to **true**.
	*/
	open fun clear(color: Boolean = definedExternally, depth: Boolean = definedExternally, stencil: Boolean = definedExternally) : dynamic/*null*/


	/**
	* Clear the color buffer. Equivalent to calling [page:WebGLRenderer.clear .clear]( true, false, false ).
	*/
	open fun clearColor() : dynamic/*null*/


	/**
	* Clear the depth buffer. Equivalent to calling [page:WebGLRenderer.clear .clear]( false, true, false ).
	*/
	open fun clearDepth() : dynamic/*null*/


	/**
	* Clear the stencil buffers. Equivalent to calling [page:WebGLRenderer.clear .clear]( false, false, true ).
	*/
	open fun clearStencil() : dynamic/*null*/


	/**
	* Compiles all materials in the scene with the camera. This is useful to precompile shaders before the first rendering.
	*/
	open fun compile(scene: ch.viseon.threejs.declarations.scenes.Scene = definedExternally, camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally) : dynamic/*null*/


	/**
	* Copies pixels from the current WebGLFramebuffer into a 2D texture. Enables access to [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexImage2D WebGLRenderingContext.copyTexImage2D].
	*/
	open fun copyFramebufferToTexture(position: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, texture: ch.viseon.threejs.declarations.textures.Texture = definedExternally, level: Float = definedExternally) : dynamic/*null*/


	/**
	* Copies all pixels of a texture to an existing texture starting from the given position. Enables access to [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D WebGLRenderingContext.texSubImage2D].
	*/
	open fun copyTextureToTexture(position: ch.viseon.threejs.declarations.math.Vector2 = definedExternally, srcTexture: ch.viseon.threejs.declarations.textures.Texture = definedExternally, dstTexture: ch.viseon.threejs.declarations.textures.Texture = definedExternally, level: Float = definedExternally) : dynamic/*null*/


	/**
	* Dispose of the current rendering context.
	*/
	open fun dispose() : dynamic/*null*/


	/**
	* Simulate loss of the WebGL context. This requires support for the [link:https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_lose_context WEBGL_lose_context] extensions. According to [link:https://webglstats.com/ WebGLStats], as of February 2016 90% of WebGL enabled devices support this.
	*/
	open fun forceContextLoss() : dynamic/*null*/


	/**
	* Returns a [page:Float float] with the current clear alpha. Ranges from 0 to 1.
	*/
	open fun getClearAlpha() : Float


	/**
	* Returns a [page:Color THREE.Color] instance with the current clear color.
	*/
	open fun getClearColor() : ch.viseon.threejs.declarations.math.Color


	/**
	* Return the current WebGL context.
	*/
	open fun getContext() : org.khronos.webgl.WebGLRenderingContext


	/**
	* Returns an object that describes the attributes set on the WebGL context when it was created.
	*/
	open fun getContextAttributes() : org.khronos.webgl.WebGLContextAttributes


	/**
	* Returns the current RenderTarget, if any.
	*/
	open fun getRenderTarget() : dynamic/*RenderTarget*/


	/**
	* Returns the current viewport.
	*/
	open fun getCurrentViewport() : dynamic/*RenderTarget*/


	/**
	* Returns an object containing the width and height of the renderer's drawing buffer, in pixels.
	*/
	open fun getDrawingBufferSize() : dynamic/*Object*/


	/**
	* Returns current device pixel ratio used.
	*/
	open fun getPixelRatio() : Float


	/**
	* Returns an object containing the width and height of the renderer's output canvas, in pixels.
	*/
	open fun getSize() : dynamic/*Object*/


	/**
	* Reset the GL state to default. Called internally if the WebGL context is lost.
	*/
	open fun resetGLState() : dynamic/*null*/


	/**
	* Reads the pixel data from the renderTarget into the buffer you pass in. This is a wrapper around [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels WebGLRenderingContext.readPixels](). See the [example:webgl_interactive_cubes_gpu interactive / cubes / gpu] example.
	*/
	open fun readRenderTargetPixels(renderTarget: ch.viseon.threejs.declarations.renderers.WebGLRenderTarget = definedExternally, x: Float = definedExternally, y: Float = definedExternally, width: Float = definedExternally, height: Float = definedExternally) : dynamic/*null*/


	/**
	* Render a [page:Scene scene] using a [page:Camera camera]. The render is done to the [page:WebGLRenderTarget renderTarget] (if specified) or to the canvas as usual. If [page:Boolean forceClear] is **true**, the depth, stencil and color buffers will be cleared before rendering even if the renderer's [page:WebGLRenderer.autoClear autoClear] property is false. Even with forceClear set to true you can prevent certain buffers being cleared by setting either the [page:WebGLRenderer.autoClearColor autoClearColor], [page:WebGLRenderer.autoClearStencil autoClearStencil] or [page:WebGLRenderer.autoClearDepth autoClearDepth] properties to false.
	*/
	open fun render(scene: ch.viseon.threejs.declarations.scenes.Scene = definedExternally, camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally, renderTarget: ch.viseon.threejs.declarations.renderers.WebGLRenderTarget = definedExternally, forceClear: Boolean = definedExternally) : dynamic/*null*/


	/**
	* Render a buffer geometry group using the camera and with the specified material.
	*/
	open fun renderBufferDirect(camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally, fog: ch.viseon.threejs.declarations.scenes.Fog = definedExternally, geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally, `object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, group: dynamic/*Object*/ = definedExternally) : dynamic/*null*/


	/**
	* object - an instance of [page:Object3D] program - an instance of shaderProgram shading - an instance of Material Render an immediate buffer. Gets called by renderImmediateObject.
	*/
	open fun renderBufferImmediate(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, program: dynamic/*shaderprogram*/ = definedExternally, shading: ch.viseon.threejs.declarations.materials.Material = definedExternally) : dynamic/*null*/


	/**
	* [page:Function callback] — The function will be called every available frame. If `null` is passed it will stop any already ongoing animation.
A build in function that can be used instead of [link:https://developer.mozilla.org/en-US/docs/Web/API/window/requestAnimationFrame requestAnimationFrame]. For WebVR projects this function must be used.
	*/
	open fun setAnimationLoop(callback: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* Sets the clear alpha. Valid input is a float between **0.0** and **1.0**.
	*/
	open fun setClearAlpha(alpha: Float = definedExternally) : dynamic/*null*/


	/**
	* Sets the clear color and opacity.
	*/
	open fun setClearColor(color: ch.viseon.threejs.declarations.math.Color = definedExternally, alpha: Float = definedExternally) : dynamic/*null*/


	/**
	* Sets device pixel ratio. This is usually used for HiDPI device to prevent bluring output canvas.
	*/
	open fun setPixelRatio(value: Float = definedExternally) : dynamic/*null*/


	/**
	* renderTarget -- The [page:WebGLRenderTarget renderTarget] that needs to be activated (optional). This method sets the active rendertarget. If the parameter is omitted the canvas is set as the active rendertarget.
	*/
	open fun setRenderTarget(renderTarget: ch.viseon.threejs.declarations.renderers.WebGLRenderTarget = definedExternally) : dynamic/*null*/


	/**
	* Sets the scissor area from (x, y) to (x + width, y + height)
	*/
	open fun setScissor(x: Int = definedExternally, y: Int = definedExternally, width: Int = definedExternally, height: Int = definedExternally) : dynamic/*null*/


	/**
	* Enable or disable the scissor test. When this is enabled, only the pixels within the defined scissor area will be affected by further renderer actions.
	*/
	open fun setScissorTest(boolean: Boolean = definedExternally) : dynamic/*null*/


	/**
	* Resizes the output canvas to (width, height) with device pixel ratio taken into account, and also sets the viewport to fit that size, starting in (0, 0). Setting [page:Boolean updateStyle] to false prevents any style changes to the output canvas.
	*/
	open fun setSize(width: Int = definedExternally, height: Int = definedExternally, updateStyle: Boolean = definedExternally) : dynamic/*null*/


	/**
	* texture -- The [page:Texture texture] that needs to be set. slot -- The number indicating which slot should be used by the texture. This method sets the correct texture to the correct slot for the WebGL shader. The slot number can be found as a value of the uniform of the sampler. Note: This method replaces the older [method:null setTexture] method.
	*/
	open fun setTexture2D(texture: ch.viseon.threejs.declarations.textures.Texture = definedExternally, slot: Float = definedExternally) : dynamic/*null*/


	/**
	* texture -- The [page:CubeTexture cubeTexture] that needs to be set. slot -- The number indicating which slot should be used by the texture. This method sets the correct texture to the correct slot for the WebGL shader. The slot number can be found as a value of the uniform of the sampler.
	*/
	open fun setTextureCube(cubeTexture: ch.viseon.threejs.declarations.textures.CubeTexture = definedExternally, slot: Float = definedExternally) : dynamic/*null*/


	/**
	* Sets the viewport to render from (x, y) to (x + width, y + height).
	*/
	open fun setViewport(x: Int = definedExternally, y: Int = definedExternally, width: Int = definedExternally, height: Int = definedExternally) : dynamic/*null*/
}