@file:JsModule("three")
package ch.viseon.threejs.declarations.animation.tracks

	/**
	* A Track of boolean keyframe values.
	*/
open external class BooleanKeyframeTrack(name: String = definedExternally, times: Array<dynamic> = definedExternally, values: Array<dynamic> = definedExternally): ch.viseon.threejs.declarations.animation.KeyframeTrack{

	/**
	* The default interpolation type to use, [page:Animation InterpolateDiscrete].
	*/
	override var DefaultInterpolation: Int 


	/**
	* A normal Array (no Float32Array in this case, unlike **ValueBufferType** of [page:KeyframeTrack]).
	*/
	open var _bufferData: Array<dynamic>  = definedExternally


	/**
	* String 'bool'.
	*/
	open var ValueTypeName: String  = definedExternally


	/**
	* The value of this method here is 'undefined', as it does not make sense for discrete properties.
	*/
	override fun InterpolantFactoryMethodLinear() : dynamic


	/**
	* The value of this method here is 'undefined', as it does not make sense for discrete properties.
	*/
	override fun InterpolantFactoryMethodSmooth() : dynamic
}