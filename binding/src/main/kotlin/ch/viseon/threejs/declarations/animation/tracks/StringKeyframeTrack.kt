//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.animation.tracks

	/**
	* A Track of string keyframe values.
	*/
open external class StringKeyframeTrack(name: String = definedExternally, times: Array<dynamic>/*Array*/ = definedExternally, values: Array<dynamic>/*Array*/ = definedExternally): ch.viseon.threejs.declarations.animation.KeyframeTrack{

	/**
	* The default interpolation type to use, [page:Animation InterpolateDiscrete].
	*/
	override var DefaultInterpolation: Int 


	/**
	* A normal Array (no Float32Array in this case, unlike **ValueBufferType** of [page:KeyframeTrack]).
	*/
	open var _bufferData: Array<dynamic>/*Array*/  = definedExternally


	/**
	* String 'string'.
	*/
	open var ValueTypeName: String  = definedExternally


	/**
	* The value of this method here is 'undefined', as it does not make sense for discrete properties.
	*/
	override fun InterpolantFactoryMethodLinear() : dynamic/*null*/


	/**
	* The value of this method here is 'undefined', as it does not make sense for discrete properties.
	*/
	override fun InterpolantFactoryMethodSmooth() : dynamic/*null*/
}