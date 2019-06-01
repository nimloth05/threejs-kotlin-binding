@file:JsModule("three")
package ch.viseon.threejs.declarations.audio

	/**
	* The [name] represents a virtual [link:https://developer.mozilla.org/de/docs/Web/API/AudioListener listener] of the all positional and non-positional audio effects in the scene. A three.js application usually creates a single instance of [name]. It is a mandatory construtor parameter for audios entities like [page:Audio Audio] and [page:PositionalAudio PositionalAudio]. In most cases, the listener object is a child of the camera. So the 3D transformation of the camera represents the 3D transformation of the listener.
	*/
open external class AudioListener(): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* The [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioContext AudioContext] of the [page:AudioListener listener] given in the constructor.
	*/
	open var context: dynamic  = definedExternally


	/**
	* A [link:https://developer.mozilla.org/en-US/docs/Web/API/GainNode GainNode] created using [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createGain AudioContext.createGain]().
	*/
	open var gain: dynamic  = definedExternally


	/**
	* Default is **null**.
	*/
	open var filter: dynamic  = definedExternally


	/**
	* Time delta value for audio entities. Use in context of [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/linearRampToValueAtTime AudioParam.linearRampToValueAtTimeDefault](). Default is **0**.
	*/
	open var timeDelta: Double  = definedExternally


	/**
	* Return the [page:AudioListener.gain gainNode].
	*/
	open fun getInput() : dynamic


	/**
	* Set the [page:AudioListener.filter filter] property to **null**.
	*/
	open fun removeFilter() : ch.viseon.threejs.declarations.audio.AudioListener


	/**
	* Returns the value of the [page:AudioListener.filter filter] property.
	*/
	open fun getFilter() : dynamic


	/**
	* Set the [page:AudioListener.filter filter] property to **value**.
	*/
	open fun setFilter(value: dynamic = definedExternally) : ch.viseon.threejs.declarations.audio.AudioListener


	/**
	* Return the volume.
	*/
	open fun getMasterVolume() : Double


	/**
	* Set the volume.
	*/
	open fun setMasterVolume(value: Double = definedExternally) : ch.viseon.threejs.declarations.audio.AudioListener
}