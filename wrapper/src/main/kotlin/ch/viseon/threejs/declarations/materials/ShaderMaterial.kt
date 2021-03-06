@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material rendered with custom shaders. A shader is a small program written in [link:https://www.khronos.org/files/opengles_shading_language.pdf GLSL] that runs on the GPU. You may want to use a custom shader if you need to:
	*/
open external class ShaderMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* Defines whether this material supports clipping; true to let the renderer pass the clippingPlanes uniform. Default is false.
	*/
	open var clipping: Boolean  = definedExternally


	/**
	* When the rendered geometry doesn't include these attributes but the material does, these default values will be passed to the shaders. This avoids errors when buffer data is missing. this.defaultAttributeValues = { 'color': [ 1, 1, 1 ], 'uv': [ 0, 0 ], 'uv2': [ 0, 0 ] };
	*/
	open var defaultAttributeValues: dynamic  = definedExternally


	/**
	* Defines custom constants using **#define** directives within the GLSL code for both the vertex shader and the fragment shader; each key/value pair yields another directive: defines: { FOO: 15, BAR: true } yields the lines #define FOO 15 #define BAR true in the GLSL code.
	*/
	override var defines: dynamic 


	/**
	* An object with the following properties: this.extensions = { derivatives: false, // set to use derivatives fragDepth: false, // set to use fragment depth values drawBuffers: false, // set to use draw buffers shaderTextureLOD: false // set to use shader texture LOD };
	*/
	open var extensions: dynamic  = definedExternally


	/**
	* Define whether the material color is affected by global fog settings; true to pass fog uniforms to the shader. Default is false.
	*/
	override var fog: Boolean 


	/**
	* Fragment shader GLSL code. This is the actual code for the shader. In the example above, the **vertexShader** and **fragmentShader** code is extracted from the DOM; it could be passed as a string directly or loaded via AJAX instead.
	*/
	open var fragmentShader: String  = definedExternally


	/**
	* Defines the GLSL version of custom shader code. Only relevant for WebGL 2 in order to define whether to specify GLSL 3.0 or not. Valid values are **THREE.GLSL1** or **THREE.GLSL3**. Default is **null**.
	*/
	open var glslVersion: String  = definedExternally


	/**
	* If set, this calls [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindAttribLocation gl.bindAttribLocation] to bind a generic vertex index to an attribute variable. Default is undefined.
	*/
	open var index0AttributeName: String  = definedExternally


	/**
	* Defines whether this material uses lighting; true to pass uniform data related to lighting to this shader. Default is false.
	*/
	open var lights: Boolean  = definedExternally


	/**
	* Controls wireframe thickness. Default is 1. Due to limitations of the [link:https://www.khronos.org/registry/OpenGL/specs/gl/glspec46.core.pdf OpenGL Core Profile] with the [page:WebGLRenderer WebGL] renderer on most platforms linewidth will always be 1 regardless of the set value.
	*/
	open var linewidth: Double  = definedExternally


	/**
	* When set to true, morph target attributes are available in the vertex shader. Default is **false**.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* When set to true, morph normal attributes are available in the vertex shader. Default is **false**.
	*/
	open var morphNormals: Boolean  = definedExternally


	/**
	* Define whether the material is rendered with flat shading. Default is false.
	*/
	open var flatShading: Boolean  = definedExternally


	/**
	* Define whether the material uses skinning; true to pass skinning attributes to the shader. Default is false.
	*/
	open var skinning: Boolean  = definedExternally


	/**
	* An object of the form: { "uniform1": { value: 1.0 }, "uniform2": { value: 2 } } specifying the uniforms to be passed to the shader code; keys are uniform names, values are definitions of the form { value: 1.0 } where **value** is the value of the uniform. Names must match the name of the uniform, as defined in the GLSL code. Note that uniforms are refreshed on every frame, so updating the value of the uniform will immediately update the value available to the GLSL code.
	*/
	open var uniforms: dynamic  = definedExternally


	/**
	* Can be used to force a uniform update while changing uniforms in [page:Object3D.onBeforeRender](). Default is **false**.
	*/
	open var uniformsNeedUpdate: Boolean  = definedExternally


	/**
	* Defines whether vertex coloring is used. Default is **false**.
	*/
	override var vertexColors: Boolean 


	/**
	* Vertex shader GLSL code. This is the actual code for the shader. In the example above, the **vertexShader** and **fragmentShader** code is extracted from the DOM; it could be passed as a string directly or loaded via AJAX instead.
	*/
	open var vertexShader: String  = definedExternally


	/**
	* Render geometry as wireframe (using GL_LINES instead of GL_TRIANGLES). Default is false (i.e. render as flat polygons).
	*/
	open var wireframe: Boolean  = definedExternally


	/**
	* Controls wireframe thickness. Default is 1. Due to limitations of the [link:https://www.khronos.org/registry/OpenGL/specs/gl/glspec46.core.pdf OpenGL Core Profile] with the [page:WebGLRenderer WebGL] renderer on most platforms linewidth will always be 1 regardless of the set value.
	*/
	open var wireframeLinewidth: Double  = definedExternally


	/**
	* Generates a shallow copy of this material. Note that the vertexShader and fragmentShader are copied by reference, as are the definitions of the **attributes**; this means that clones of the material will share the same compiled [page:WebGLProgram]. However, the **uniforms** are copied by value, which allows you to have different sets of uniforms for different copies of the material.
	*/
	open fun clone(`this`: ch.viseon.threejs.declarations.materials.ShaderMaterial = definedExternally) : ch.viseon.threejs.declarations.materials.ShaderMaterial
}