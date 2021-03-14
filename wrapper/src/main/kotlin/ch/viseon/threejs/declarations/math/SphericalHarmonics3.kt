@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* Represents a third-order spherical harmonics (SH). Light probes use this class to encode lighting information.
	*/
open external class SphericalHarmonics3{

	/**
	* An array holding the (9) SH coefficients. A single coefficient is represented as an instance of [page:Vector3].
	*/
	open var coefficients: Array<dynamic>  = definedExternally


	/**
	* [page:SphericalHarmonics3 sh] - The SH to add. Adds the given SH to this instance.
	*/
	open fun add(sh: ch.viseon.threejs.declarations.math.SphericalHarmonics3 = definedExternally) : ch.viseon.threejs.declarations.math.SphericalHarmonics3


	/**
	* [page:SphericalHarmonics3 sh] - The SH to add. [page:Number scale] - The scale factor. A convenience method for performing [page:.add]() and [page:.scale]() at once.
	*/
	open fun addScaledSH(sh: ch.viseon.threejs.declarations.math.SphericalHarmonics3 = definedExternally, scale: Double = definedExternally) : ch.viseon.threejs.declarations.math.SphericalHarmonics3


	/**
	* Returns a new instance of [name] with equal coefficients.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.SphericalHarmonics3


	/**
	* [page:SphericalHarmonics3 sh] - The SH to copy. Copies the given SH to this instance.
	*/
	open fun copy(sh: ch.viseon.threejs.declarations.math.SphericalHarmonics3 = definedExternally) : ch.viseon.threejs.declarations.math.SphericalHarmonics3


	/**
	* [page:SphericalHarmonics3 sh] - The SH to compare with. Returns true if the given SH and this instance have equal coefficients.
	*/
	open fun equals(sh: ch.viseon.threejs.declarations.math.SphericalHarmonics3 = definedExternally) : Boolean


	/**
	* [page:Array array] - The array holding the numbers of the SH coefficients. [page:Number offset] - (optional) The array offset. Sets the coefficients of this instance from the given array.
	*/
	open fun fromArray(array: Array<dynamic> = definedExternally, offset: Double = definedExternally) : ch.viseon.threejs.declarations.math.SphericalHarmonics3


	/**
	* [page:Vector3 normal] - The normal vector (assumed to be unit length). [page:Vector3 target] - The result vector. Returns the radiance in the direction of the given normal.
	*/
	open fun getAt(normal: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 normal] - The normal vector (assumed to be unit length). [page:Vector3 target] - The result vector. Returns the irradiance (radiance convolved with cosine lobe) in the direction of the given normal.
	*/
	open fun getIrradianceAt(normal: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:SphericalHarmonics3 sh] - The SH to interpolate with. [page:Number alpha] - The alpha factor. Linear interpolates between the given SH and this instance by the given alpha factor.
	*/
	open fun lerp(sh: ch.viseon.threejs.declarations.math.SphericalHarmonics3 = definedExternally, alpha: Double = definedExternally) : ch.viseon.threejs.declarations.math.SphericalHarmonics3


	/**
	* [page:Number scale] - The scale factor. Scales this SH by the given scale factor.
	*/
	open fun scale(scale: Double = definedExternally) : ch.viseon.threejs.declarations.math.SphericalHarmonics3


	/**
	* [page:Array coefficients] - An array of SH coefficients. Sets the given SH coefficients to this instance.
	*/
	open fun set(coefficients: Array<dynamic> = definedExternally) : ch.viseon.threejs.declarations.math.SphericalHarmonics3


	/**
	* [page:Array array] - (optional) The target array. [page:Number offset] - (optional) The array offset. Returns an array with the coefficients, or copies them into the provided array. The coefficients are represented as numbers.
	*/
	open fun toArray(array: Array<dynamic> = definedExternally, offset: Double = definedExternally) : Array<dynamic>


	/**
	* Sets all SH coefficients to 0.
	*/
	open fun zero() : ch.viseon.threejs.declarations.math.SphericalHarmonics3
	companion object {

	/**
	* [page:Vector3 normal] - The normal vector (assumed to be unit length). [page:Array shBasis] - The resulting SH basis. Computes the SH basis for the given normal vector.
	*/
	open fun getBasisAt(normal: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, shBasis: Array<dynamic> = definedExternally) : Unit
	
}
}