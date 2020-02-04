@file:JsModule("three")
package ch.viseon.threejs.declarations.extras

	/**
	* This class generates a Prefiltered, Mipmapped Radiance Environment Map (PMREM) from a cubeMap environment texture. This allows different levels of blur to be quickly accessed based on material roughness. It is packed into a special CubeUV format that allows us to perform custom interpolation so that we can support nonlinear formats such as RGBE. Unlike a traditional mipmap chain, it only goes down to the LOD_MIN level (above), and then creates extra even more filtered 'mips' at the same LOD_MIN resolution, associated with higher roughness levels. In this way we maintain resolution to smoothly interpolate diffuse lighting while limiting sampling computation.
	*/
open external class PMREMGenerator(renderer: ch.viseon.threejs.declarations.renderers.WebGLRenderer = definedExternally){

	/**
	* [page:Scene scene] - The given scene. [page:Number sigma] - (optional) Specifies a blur radius in radians to be applied to the scene before PMREM generation. Default is **0**. [page:Number near] - (optional) The near plane value. Default is **0.1**. [page:Number far] - (optional) The far plane value. Default is **100**. Generates a PMREM from a supplied Scene, which can be faster than using an image if networking bandwidth is low. Optional near and far planes ensure the scene is rendered in its entirety (the cubeCamera is placed at the origin).
	*/
	open fun fromScene(scene: ch.viseon.threejs.declarations.scenes.Scene = definedExternally, sigma: Double = definedExternally, near: Double = definedExternally, far: Double = definedExternally) : ch.viseon.threejs.declarations.renderers.WebGLRenderTarget


	/**
	* [page:Texture equirectangular] - The equirectangular texture. Generates a PMREM from an equirectangular texture, which can be either LDR (RGBFormat) or HDR (RGBEFormat). The ideal input image size is 1k (1024 x 512), as this matches best with the 256 x 256 cubemap output.
	*/
	open fun fromEquirectangular(equirectangular: ch.viseon.threejs.declarations.textures.Texture = definedExternally) : ch.viseon.threejs.declarations.renderers.WebGLRenderTarget


	/**
	* [page:CubeTexture cubemap] - The cubemap texture. Generates a PMREM from an cubemap texture, which can be either LDR (RGBFormat) or HDR (RGBEFormat). The ideal input cube size is 256 x 256, as this matches best with the 256 x 256 cubemap output.
	*/
	open fun fromCubemap(cubemap: ch.viseon.threejs.declarations.textures.CubeTexture = definedExternally) : ch.viseon.threejs.declarations.renderers.WebGLRenderTarget


	/**
	* Pre-compiles the cubemap shader. You can get faster start-up by invoking this method during your texture's network fetch for increased concurrency.
	*/
	open fun compileCubemapShader() : Unit


	/**
	* Pre-compiles the equirectangular shader. You can get faster start-up by invoking this method during your texture's network fetch for increased concurrency.
	*/
	open fun compileEquirectangularShader() : Unit


	/**
	* Disposes of the PMREMGenerator's internal memory. Note that PMREMGenerator is a static class, so you should not need more than one PMREMGenerator object. If you do, calling dispose() on one of them will cause any others to also become unusable.
	*/
	open fun dispose() : Unit
}