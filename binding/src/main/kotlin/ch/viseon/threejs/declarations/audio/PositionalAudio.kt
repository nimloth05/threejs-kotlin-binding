//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.audio

	/**
	* Create a positional audio object. This uses the [link:https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API Web Audio API].
	*/
open external class PositionalAudio(listener: ch.viseon.threejs.declarations.audio.AudioListener = definedExternally): ch.viseon.threejs.declarations.audio.Audio{

	/**
	* The PositionalAudio's [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode PannerNode].
	*/
	open var panner: dynamic  = definedExternally


	/**
	* Returns the [page:PositionalAudio.panner panner].
	*/
	override fun getOutput() : dynamic


	/**
	* Returns the value of [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/refDistance panner.refDistance].
	*/
	open fun getRefDistance() : Double


	/**
	* Sets the value of [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/refDistance panner.refDistance].
	*/
	open fun setRefDistance(value: Double = definedExternally) : ch.viseon.threejs.declarations.audio.PositionalAudio


	/**
	* Returns the value of [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/rolloffFactor panner.rolloffFactor].
	*/
	open fun getRolloffFactor() : Double


	/**
	* Sets the value of [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/rolloffFactor panner.rolloffFactor].
	*/
	open fun setRolloffFactor(value: Double = definedExternally) : ch.viseon.threejs.declarations.audio.PositionalAudio


	/**
	* Returns the value of [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/distanceModel panner.distanceModel].
	*/
	open fun getDistanceModel() : String


	/**
	* Sets the value of [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/distanceModel panner.distanceModel].
	*/
	open fun setDistanceModel(value: String = definedExternally) : ch.viseon.threejs.declarations.audio.PositionalAudio


	/**
	* Returns the value of [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/maxDistance panner.maxDistance].
	*/
	open fun getMaxDistance() : Double


	/**
	* Sets the value of [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/maxDistance panner.maxDistance].
	*/
	open fun setMaxDistance(value: Double = definedExternally) : ch.viseon.threejs.declarations.audio.PositionalAudio


	/**
	* This method can be used in order to transform an omnidirectional sound into a [link:https://developer.mozilla.org/en-US/docs/Web/API/PannerNode directional sound].
	*/
	open fun setDirectionalCone(coneInnerAngle: Double = definedExternally, coneOuterAngle: Double = definedExternally, coneOuterGain: Double = definedExternally) : ch.viseon.threejs.declarations.audio.PositionalAudio
}