//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.textures

	/**
	* Creates a three-dimensional texture. This type of texture can only be used with a WebGL 2 rendering context.
	*/
open external class DataTexture3D(data: Array<dynamic> = definedExternally, width: Double = definedExternally, height: Double = definedExternally, depth: Double = definedExternally): ch.viseon.threejs.declarations.textures.Texture{

	/**
	* This defines how the texture is wrapped in the depth direction. The default is [page:Textures THREE.ClampToEdgeWrapping], where the edge is clamped to the outer edge texels. The other two choices are [page:Textures THREE.RepeatWrapping] and [page:Textures THREE.MirroredRepeatWrapping]. See the [page:Textures texture constants] page for details.
	*/
	open var wrapR: Double  = definedExternally
}