//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* An AnimationClip is a reusable set of keyframe tracks which represent an animation. For an overview of the different elements of the three.js animation system see the "Animation System" article in the "Next Steps" section of the manual.
	*/
open external class AnimationClip(name: String = definedExternally, duration: Double = definedExternally, tracks: Array<dynamic>/*Array*/ = definedExternally){

	/**
	* The duration of this clip (in seconds). This can be calculated from the [page:.tracks tracks] array via [page:.resetDuration resetDuration].
	*/
	open var duration: Double  = definedExternally


	/**
	* A name for this clip. A certain clip can be searched via [page:.findByName findByName].
	*/
	open var name: String  = definedExternally


	/**
	* An array containing a [page:KeyframeTrack] for each property that are animated by this clip.
	*/
	open var tracks: Array<dynamic>/*Array*/  = definedExternally


	/**
	* The [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this clip instance. It gets automatically assigned and shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* Optimizes each track by removing equivalent sequential keys (which are common in morph target sequences).
	*/
	open fun optimize() : AnimationClip


	/**
	* Sets the [page:.duration duration] of the clip to the duration of its longest [page:KeyframeTrack].
	*/
	open fun resetDuration() : AnimationClip


	/**
	* Trims all tracks to the clip's duration.
	*/
	open fun trim() : AnimationClip


	/**
	* Performs minimal validation on each track in the clip. Returns true if all tracks are valid.
	*/
	open fun validate() : Boolean
	companion object {

	/**
	* Returns an array of new AnimationClips created from the [page:Geometry.morphTargets morph target sequences] of a geometry, trying to sort morph target names into animation-group-based patterns like "Walk_001, Walk_002, Run_001, Run_002 ..." This method is called by the [page:JSONLoader] internally, and it uses [page:.CreateFromMorphTargetSequence CreateFromMorphTargetSequence].
	*/
	open fun CreateClipsFromMorphTargetSequences(name: String = definedExternally, morphTargetSequence: Array<dynamic>/*Array*/ = definedExternally, fps: Double = definedExternally, noLoop: Boolean = definedExternally) : Array<dynamic>/*Array*/


	/**
	* Returns a new AnimationClip from the passed [page:Geometry.morphTargets morph targets array] of a geometry, taking a name and the number of frames per second. Note: The fps parameter is required, but the animation speed can be overridden in an **AnimationAction** via [page:AnimationAction.setDuration animationAction.setDuration].
	*/
	open fun CreateFromMorphTargetSequence(name: String = definedExternally, morphTargetSequence: Array<dynamic>/*Array*/ = definedExternally, fps: Double = definedExternally, noLoop: Boolean = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationClip


	/**
	* Searches for an AnimationClip by name, taking as its first parameter either an array of AnimationClips, or a mesh or geometry that contains an array named "animations".
	*/
	open fun findByName(objectOrClipArray: dynamic/*Object*/ = definedExternally, name: String = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationClip


	/**
	* Parses a JSON representation of a clip and returns an AnimationClip.
	*/
	open fun parse(json: dynamic/*Object*/ = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationClip


	/**
	* Parses the animation.hierarchy format and returns an AnimationClip.
	*/
	open fun parseAnimation(animation: dynamic/*Object*/ = definedExternally, bones: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationClip


	/**
	* Takes an AnimationClip and returns a JSON object.
	*/
	open fun toJSON(clip: ch.viseon.threejs.declarations.animation.AnimationClip = definedExternally) : dynamic/*Object*/
	
}
}