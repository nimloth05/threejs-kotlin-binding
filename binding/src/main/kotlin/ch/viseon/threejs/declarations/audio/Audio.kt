//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.audio

	/**
	* Create a non-positional ( global ) audio object. This uses the [link:https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API Web Audio API].
	*/
open external class Audio(listener: ch.viseon.threejs.declarations.audio.AudioListener = definedExternally): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Whether to start playback automatically. Default is **false**.
	*/
	open var autoplay: Boolean  = definedExternally


	/**
	* The [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioContext AudioContext] of the [page:AudioListener listener] given in the constructor.
	*/
	open var context: dynamic/*AudioContext*/  = definedExternally


	/**
	* Represents an array of [link:https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode BiquadFilterNodes]. Can be used to apply a variety of low-order filters to create more complex sound effects. Filters are set via [page:Audio.setFilter] or [page:Audio.setFilters].
	*/
	open var filters: Array<dynamic>/*Array*/  = definedExternally


	/**
	* A [link:https://developer.mozilla.org/en-US/docs/Web/API/GainNode GainNode] created using [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createGain AudioContext.createGain]().
	*/
	open var gain: dynamic/*GainNode*/  = definedExternally


	/**
	* Whether playback can be controlled using the [page:Audio.play play](), [page:Audio.pause pause]() etc. methods. Default is **true**.
	*/
	open var hasPlaybackControl: Boolean  = definedExternally


	/**
	* Whether the audio is currently playing.
	*/
	open var isPlaying: Boolean  = definedExternally


	/**
	* A reference to the listener object of this audio.
	*/
	open var listener: ch.viseon.threejs.declarations.audio.AudioListener  = definedExternally


	/**
	* Speed of playback. Default is **1**.
	*/
	open var playbackRate: Double  = definedExternally


	/**
	* The time at which the sound should begin to play. Same as the **when** paramter of [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/start AudioBufferSourceNode.start](). Default is **0**.
	*/
	open var startTime: Double  = definedExternally


	/**
	* An offset to the time within the audio buffer that playback should begin. Same as the **offset** paramter of [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/start AudioBufferSourceNode.start](). Default is **0**.
	*/
	open var offset: Double  = definedExternally


	/**
	* An [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode AudioBufferSourceNode] created using [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createBufferSource AudioContext.createBufferSource]().
	*/
	open var source: String  = definedExternally


	/**
	* Type of the audio source. Default is string 'empty'.
	*/
	open var sourceType: String  = definedExternally


	/**
	* String denoting the type, set to 'Audio'.
	*/
	open var type: String  = definedExternally


	/**
	* Connect to the [page:Audio.source]. This is used internally on initialisation and when setting / removing filters.
	*/
	open fun connect() : ch.viseon.threejs.declarations.audio.Audio


	/**
	* Disconnect from the [page:Audio.source]. This is used internally when setting / removing filters.
	*/
	open fun disconnect() : ch.viseon.threejs.declarations.audio.Audio


	/**
	* Returns the first element of the [page:Audio.filters filters] array.
	*/
	open fun getFilter() : dynamic/*BiquadFilterNode*/


	/**
	* Returns the [page:Audio.filters filters] array.
	*/
	open fun getFilters() : Array<dynamic>/*Array*/


	/**
	* Return the value of [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/loop source.loop] (whether playback should loop).
	*/
	open fun getLoop() : Boolean


	/**
	* Return the [page:Audio.gain gainNode].
	*/
	open fun getOutput() : dynamic/*GainNode*/


	/**
	* Return the value of [page:Audio.playbackRate playbackRate].
	*/
	open fun getPlaybackRate() : Double


	/**
	* Return the current volume.
	*/
	open fun getVolume() : Double


	/**
	* If [page:Audio.hasPlaybackControl hasPlaybackControl] is true, starts playback.
	*/
	open fun play() : ch.viseon.threejs.declarations.audio.Audio


	/**
	* If [page:Audio.hasPlaybackControl hasPlaybackControl] is true, pauses playback.
	*/
	open fun pause() : ch.viseon.threejs.declarations.audio.Audio


	/**
	* Called automatically when playback finished. Sets If [page:Audio.isPlaying isPlaying] to false.
	*/
	open fun onEnded() : dynamic/*null*/


	/**
	* Setup the [page:Audio.source source] to the audioBuffer, and sets [page:Audio.sourceType sourceType] to 'buffer'. If [page:Audio.autoplay autoplay], also starts playback.
	*/
	open fun setBuffer() : ch.viseon.threejs.declarations.audio.Audio


	/**
	* Applies a single [link:https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode BiquadFilterNode] to the audio.
	*/
	open fun setFilter() : ch.viseon.threejs.declarations.audio.Audio


	/**
	* value - arrays of filters. Applies an array of [link:https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode BiquadFilterNodes] to the audio.
	*/
	open fun setFilters(value: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.audio.Audio


	/**
	* Set [link:https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/loop source.loop] to **value** (whether playback should loop).
	*/
	open fun setLoop(value: Boolean = definedExternally) : ch.viseon.threejs.declarations.audio.Audio


	/**
	* Applies the given object of type [link:https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement HTMLMediaElement] as the source of this audio. Also sets [page:Audio.hasPlaybackControl hasPlaybackControl] to false.
	*/
	open fun setMediaElementSource() : ch.viseon.threejs.declarations.audio.Audio


	/**
	* Setup the [page:Audio.source source] to the audioBuffer, and sets [page:Audio.sourceType sourceType] to 'audioNode'. Also sets [page:Audio.hasPlaybackControl hasPlaybackControl] to false.
	*/
	open fun setNodeSource() : ch.viseon.threejs.declarations.audio.Audio


	/**
	* If [page:Audio.hasPlaybackControl hasPlaybackControl] is enabled, set the [page:Audio.playbackRate playbackRate] to **value**.
	*/
	open fun setPlaybackRate(value: Double = definedExternally) : ch.viseon.threejs.declarations.audio.Audio


	/**
	* Set the volume.
	*/
	open fun setVolume(value: Double = definedExternally) : ch.viseon.threejs.declarations.audio.Audio


	/**
	* If [page:Audio.hasPlaybackControl hasPlaybackControl] is enabled, stops playback, resets [page:Audio.startTime startTime] to **0** and sets [page:Audio.isPlaying isPlaying] to false.
	*/
	open fun stop() : ch.viseon.threejs.declarations.audio.Audio
}