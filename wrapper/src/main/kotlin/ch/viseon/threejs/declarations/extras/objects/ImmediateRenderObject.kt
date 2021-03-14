@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.objects

	/**
	* This experimental class provides a fast code path for rendering meshes with frequently updated geometry data. When the renderer encounters an instance of [name], it only takes care about the most primitive rendering operations (e.g. binding vertex attributes, determining correct shader program or perfoming the actual draw call). Features like view frustum culling, wireframe rendering or using multiple materials are not supported. Besides [name] can only be used to render triangles.
[name] does not work with instances of [page:BufferGeometry]. The raw geometry data have to be maintained as properties of the [name].
Using [name] makes only sense if you are updating your geometry data per frame. You can then benefit of a faster code path compared to the default mesh redering logic.
	*/
open external class ImmediateRenderObject(material: ch.viseon.threejs.declarations.materials.Material = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* The material of the [name]. Assigning multiple materials is not supported.
	*/
	open var material: Boolean  = definedExternally


	/**
	* Whether position data are defined or not. Default is **false**.
	*/
	open var hasPositions: Boolean  = definedExternally


	/**
	* Whether normal data are defined or not. Default is **false**.
	*/
	open var hasNormals: Boolean  = definedExternally


	/**
	* Whether color data are defined or not. Default is **false**.
	*/
	open var hasColors: Boolean  = definedExternally


	/**
	* Whether texture coordinates are defined or not. Default is **false**.
	*/
	open var hasUvs: Boolean  = definedExternally


	/**
	* The buffer holding position data. Default is **null**.
	*/
	open var positionArray: org.khronos.webgl.Float32Array  = definedExternally


	/**
	* The buffer holding normal data. Default is **null**.
	*/
	open var normalArray: org.khronos.webgl.Float32Array  = definedExternally


	/**
	* The buffer holding color data. Default is **null**.
	*/
	open var colorArray: org.khronos.webgl.Float32Array  = definedExternally


	/**
	* The buffer holding texture coordinates. Default is **null**.
	*/
	open var uvArray: org.khronos.webgl.Float32Array  = definedExternally


	/**
	* The number of primitives to be rendered. Default is **0**. This property will be set to **0** after each rendering so you usually set it in the implementatio of [page:.render]().
	*/
	open var count: Int  = definedExternally


	/**
	* renderCallback -- A function to render the generated geometry data.
This method needs to be implemented by the deriving class of [name]. You normally want to implement the vertex buffer update logic and execute **renderCallback** at the end of your implementation.
	*/
	open fun render(renderCallback: dynamic = definedExternally) : dynamic
}