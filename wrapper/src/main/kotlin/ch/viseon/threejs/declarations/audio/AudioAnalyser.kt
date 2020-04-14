@file:JsModule("three")
package ch.viseon.threejs.declarations.audio

	/**
	* Create a AudioAnalyser object, which uses an [link:https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode AnalyserNode] to analyse audio data. This uses the [link:https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API Web Audio API].
	*/
open external class AudioAnalyser{

	/**
	* An [link:https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode AnalyserNode] used to analyze audio.
	*/
	open var analyser: dynamic  = definedExternally


	/**
	* A non-zero power of two up to 2048, representing the size of the FFT (Fast Fourier Transform) to be used to determine the frequency domain. See [link:https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/fftSize this page] for details.
	*/
	open var fftSize: Int  = definedExternally


	/**
	* A Uint8Array with size determined by [link:https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/frequencyBinCount analyser.frequencyBinCount] used to hold analysis data.
	*/
	open var data: org.khronos.webgl.Uint8Array  = definedExternally


	/**
	* Uses the Web Audio's [link:https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData getByteFrequencyData] method. See that page.
	*/
	open fun getFrequencyData() : org.khronos.webgl.Uint8Array


	/**
	* Get the average of the frequencies returned by the [page:AudioAnalyser.getFrequencyData getFrequencyData] method.
	*/
	open fun getAverageFrequency() : Double
}