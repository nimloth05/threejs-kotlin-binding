@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* A KeyframeTrack is a timed sequence of [link:https://en.wikipedia.org/wiki/Key_frame keyframes], which are composed of lists of times and related values, and which are used to animate a specific property of an object.
For an overview of the different elements of the three.js animation system see the "Animation System" article in the "Next Steps" section of the manual.
In contrast to the animation hierarchy of the [link:https://github.com/mrdoob/three.js/wiki/JSON-Model-format-3 JSON model format] a **KeyframeTrack** doesn't store its single keyframes as objects in a "keys" array (holding the times and the values for each frame together in one place).
Instead of this there are always two arrays in a **KeyframeTrack**: the [page:.times times] array stores the time values for all keyframes of this track in sequential order, and the [page:.values values] array contains the corresponding changing values of the animated property.
A single value, belonging to a certain point of time, can not only be a simple number, but (for example) a vector (if a position is animated) or a quaternion (if a rotation is animated). For this reason the values array (which is a flat array, too) might be three or four times as long as the times array.
Corresponding to the different possible types of animated values there are several subclasses of **KeyframeTrack**, inheriting the most properties and methods:
	*/
open external class KeyframeTrack(name: String = definedExternally, times: Array<dynamic> = definedExternally, values: Array<dynamic> = definedExternally, interpolation: Int = definedExternally){

	/**
	* The track's name can refer to morph targets or [page:SkinnedMesh bones] or possibly other values within an animated object. See [page:PropertyBinding.parseTrackName] for the forms of strings that can be parsed for property binding:
The name can specify the node either using its name or its uuid (although it needs to be in the subtree of the scene graph node passed into the mixer). Or, if the track name starts with a dot, the track applies to the root node that was passed into the mixer.
Usually after the node a property will be specified directly. But you can also specify a subproperty, such as .rotation[x], if you just want to drive the X component of the rotation via a float track.
You can also specify bones or multimaterials by using an object name, for example: .bones[R_hand].scale; the red channel of the diffuse color of the fourth material in a materials array - as a further example - can be accessed with .materials[3].diffuse[r].
PropertyBinding will also resolve morph target names, for example: .morphTargetInfluences[run].
Note: The track's name does not necessarily have to be unique. Multiple tracks can drive the same property. The result should be based on a weighted blend between the multiple tracks according to the weights of their respective actions.
	*/
	open var name: String  = definedExternally


	/**
	* A [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array Float32Array], converted from the times array which is passed in the constructor.
	*/
	open var times: org.khronos.webgl.Float32Array  = definedExternally


	/**
	* A [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array Float32Array], converted from the values array which is passed in the constructor.
	*/
	open var values: org.khronos.webgl.Float32Array  = definedExternally


	/**
	* The default interpolation type: [page:Animation InterpolateLinear].
	*/
	open var DefaultInterpolation: Int  = definedExternally


	/**
	* [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array Float32Array], the type of the buffer internally used for the times.
	*/
	open var TimeBufferType: Int  = definedExternally


	/**
	* [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array Float32Array], the type of the buffer internally used for the values.
	*/
	open var ValueBufferType: Int  = definedExternally


	/**
	* Returns a copy of this track.
	*/
	open fun clone() : ch.viseon.threejs.declarations.animation.KeyframeTrack


	/**
	* Creates a [page:LinearInterpolant LinearInterpolant], [page:CubicInterpolant CubicInterpolant] or [page:DiscreteInterpolant DiscreteInterpolant], depending on the value of the interpolation parameter passed in the constructor.
	*/
	open fun createInterpolant() : dynamic


	/**
	* Returns the interpolation type.
	*/
	open fun getInterpolation() : dynamic


	/**
	* Returns the size of each value (that is the length of the [page:.values values] array divided by the length of the [page:.times times] array).
	*/
	open fun getValueSize() : Double


	/**
	* Creates a new [page:DiscreteInterpolant DiscreteInterpolant] from the [page:KeyframeTrack.times times] and [page:KeyframeTrack.times values]. A Float32Array can be passed which will receive the results. Otherwise a new array with the appropriate size will be created automatically.
	*/
	open fun InterpolantFactoryMethodDiscrete() : ch.viseon.threejs.declarations.math.interpolants.DiscreteInterpolant


	/**
	* Creates a new [page:LinearInterpolant LinearInterpolant] from the [page:KeyframeTrack.times times] and [page:KeyframeTrack.times values]. A Float32Array can be passed which will receive the results. Otherwise a new array with the appropriate size will be created automatically.
	*/
	open fun InterpolantFactoryMethodLinear() : dynamic


	/**
	* Create a new [page:CubicInterpolant CubicInterpolant] from the [page:KeyframeTrack.times times] and [page:KeyframeTrack.times values]. A Float32Array can be passed which will receive the results. Otherwise a new array with the appropriate size will be created automatically.
	*/
	open fun InterpolantFactoryMethodSmooth() : dynamic


	/**
	* Removes equivalent sequential keys, which are common in morph target sequences.
	*/
	open fun optimize() : KeyframeTrack


	/**
	* Scales all keyframe times by a factor. Note: This is useful, for example, for conversions to a certain rate of frames per seconds (as it is done internally by [page:AnimationClip.CreateFromMorphTargetSequence animationClip.CreateFromMorphTargetSequence]).
	*/
	open fun scale() : KeyframeTrack


	/**
	* Sets the interpolation type. See [page:Animation Animation Constants] for choices.
	*/
	open fun setInterpolation(interpolationType: Int = definedExternally) : KeyframeTrack


	/**
	* Moves all keyframes either forward or backward in time.
	*/
	open fun shift(timeOffsetInSeconds: Double = definedExternally) : KeyframeTrack


	/**
	* Removes keyframes before **startTime** and after **endTime**, without changing any values within the range [**startTime**, **endTime**].
	*/
	open fun trim(startTimeInSeconds: Double = definedExternally, endTimeInSeconds: Double = definedExternally) : KeyframeTrack


	/**
	* Performs minimal validation on the tracks. Returns true if valid.
This method logs errors to the console, if a track is empty, if the [page:.valueSize value size] is not valid, if an item in the [page:.times times] or [page:.values values] array is not a valid number or if the items in the **times** array are out of order.
	*/
	open fun validate() : Boolean
	companion object {

	/**
	* Converts the track to JSON.
	*/
	open fun toJSON(track: ch.viseon.threejs.declarations.animation.KeyframeTrack = definedExternally) : JSON
	
}
}