//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.animation.tracks

	/**
	* A Track of quaternion keyframe values.
	*/
open external class QuaternionKeyframeTrack(name: String = definedExternally, times: Array<dynamic>/*Array*/ = definedExternally, values: Array<dynamic>/*Array*/ = definedExternally): ch.viseon.threejs.declarations.animation.KeyframeTrack{

	/**
	* The default interpolation type to use, [page:Animation InterpolateLinear].
	*/
	override var DefaultInterpolation: Int 


	/**
	* String 'quaternion'.
	*/
	open var ValueTypeName: String  = definedExternally


	/**
	* Returns a new [page:QuaternionLinearInterpolant QuaternionLinearInterpolant] based on the [page:KeyframeTrack.values values], [page:KeyframeTrack.times times] and [page:KeyframeTrack.valueSize valueSize] of the keyframes.
	*/
	override fun InterpolantFactoryMethodLinear() : dynamic/*null*/
}