//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.lights.shadows

	/**
	* This is used internally by [page:PointLight PointLights] for calculating shadows, and also serves as a base class for the other shadow classes.
	*/
open external class LightShadow(camera: ch.viseon.threejs.declarations.cameras.Camera = definedExternally){

	/**
	* The light's view of the world. This is used to generate a depth map of the scene; objects behind other objects from the light's perspective will be in shadow.
	*/
	open var camera: ch.viseon.threejs.declarations.cameras.Camera  = definedExternally


	/**
	* Shadow map bias, how much to add or subtract from the normalized depth when deciding whether a surface is in shadow. The default is 0. Very tiny adjustments here (in the order of 0.0001) may help reduce artefacts in shadows
	*/
	open var bias: Float  = definedExternally


	/**
	* The depth map generated using the internal camera; a location beyond a pixel's depth is in shadow. Computed internally during rendering.
	*/
	open var map: ch.viseon.threejs.declarations.renderers.WebGLRenderTarget  = definedExternally


	/**
	* A [Page:Vector2] defining the width and height of the shadow map. Higher values give better quality shadows at the cost of computation time. Values must be powers of 2, up to the [page:WebGLRenderer.capabilities].maxTextureSize for a given device, although the width and height don't have to be the same (so, for example, (512, 1024) is valid). The default is **( 512, 512 )**.
	*/
	open var mapSize: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* Model to shadow camera space, to compute location and depth in shadow map. Stored in a [page:Matrix4 Matrix4]. This is computed internally during rendering.
	*/
	open var matrix: ch.viseon.threejs.declarations.math.Matrix4  = definedExternally


	/**
	* Setting this to values greater than 1 will blur the edges of the shadow. High values will cause unwanted banding effects in the shadows - a greater [page:.mapSize mapSize] will allow for a higher value to be used here before these effects become visible. Note that this has no effect if the [page:WebGLRenderer.shadowMap.type] is set to [page:Renderer BasicShadowMap].
	*/
	open var radius: Float  = definedExternally


	/**
	* Copies value of all the properties from the [page:LightShadow source] to this SpotLight.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.lights.shadows.LightShadow = definedExternally) : ch.viseon.threejs.declarations.lights.shadows.LightShadow


	/**
	* Creates a new LightShadow with the same properties as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.lights.shadows.LightShadow


	/**
	* Serialize this LightShadow.
	*/
	open fun toJSON() : dynamic/*Object*/
}