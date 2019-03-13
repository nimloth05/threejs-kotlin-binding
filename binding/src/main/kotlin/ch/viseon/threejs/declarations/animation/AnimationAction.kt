//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* AnimationActions schedule the performance of the animations which are stored in [page:AnimationClip AnimationClips]. Note: Most of AnimationAction's methods can be chained. For an overview of the different elements of the three.js animation system see the "Animation System" article in the "Next Steps" section of the manual.
	*/
open external class AnimationAction(mixer: ch.viseon.threejs.declarations.animation.AnimationMixer = definedExternally, clip: ch.viseon.threejs.declarations.animation.AnimationClip = definedExternally, localRoot: ch.viseon.threejs.declarations.core.Object3D = definedExternally){

	/**
	* If **clampWhenFinished** is set to true the animation will automatically be [page:.paused paused] on its last frame. If **clampWhenFinished** is set to false, [page:.enabled enabled] will automatically be switched to false when the last loop of the action has finished, so that this action has no further impact. Default is false. Note: **clampWhenFinished** has no impact if the action is interrupted (it has only an effect if its last loop has really finished).
	*/
	open var clampWhenFinished: Boolean  = definedExternally


	/**
	* Setting **enabled** to **false** disables this action, so that it has no impact. Default is **true**. When the action is re-enabled, the animation continues from its current [page:.time time] (setting **enabled** to **false** doesn't reset the action). Note: Setting **enabled** to **true** doesn’t automatically restart the animation. Setting **enabled** to **true** will only restart the animation immediately if the following condition is fulfilled: [page:.paused paused] is **false**, this action has not been deactivated in the meantime (by executing a [page:.stop stop] or [page:.reset reset] command), and neither [page:.weight weight] nor [page:.timeScale timeScale] is 0.
	*/
	open var enabled: Boolean  = definedExternally


	/**
	* The looping mode (can be changed with [page:.setLoop setLoop]). Default is [page:Animation THREE.LoopRepeat] (with an infinite number of [page:.repetitions repetitions]) Must be one of these constants: [page:Animation THREE.LoopOnce] - playing the clip once, [page:Animation THREE.LoopRepeat] - playing the clip with the choosen number of **repetitions**, each time jumping from the end of the clip directly to its beginning, [page:Animation THREE.LoopPingPong] - playing the clip with the choosen number of **repetitions**, alternately playing forward and backward.
	*/
	open var loop: Double  = definedExternally


	/**
	* Setting **paused** to **true** pauses the execution of the action by setting the effective time scale to 0. Default is **false**.
	*/
	open var paused: Boolean  = definedExternally


	/**
	* The number of repetitions of the performed [page:AnimationClip] over the course of this action. Can be set via [page:.setLoop setLoop]. Default is **Infinity**. Setting this number has no effect, if the [page:.loop loop mode] is set to [page:Animation THREE.LoopOnce].
	*/
	open var repetitions: Double  = definedExternally


	/**
	* The local time of this action (in seconds, starting with 0). The value gets clamped or wrapped to 0...clip.duration (according to the loop state). It can be scaled relativly to the global mixer time by changing [page:.timeScale timeScale] (using [page:.setEffectiveTimeScale setEffectiveTimeScale] or [page:.setDuration setDuration]).
	*/
	open var time: Double  = definedExternally


	/**
	* Scaling factor for the [page:.time time]. A value of 0 causes the animation to pause. Negative values cause the animation to play backwards. Default is 1. Properties/methods concerning **timeScale** (respectively **time**) are: [page:.getEffectiveTimeScale getEffectiveTimeScale], [page:.halt halt], [page:.paused paused], [page:.setDuration setDuration], [page:.setEffectiveTimeScale setEffectiveTimeScale], [page:.stopWarping stopWarping], [page:.syncWith syncWith], [page:.warp warp].
	*/
	open var timeScale: Double  = definedExternally


	/**
	* The degree of influence of this action (in the interval [0, 1]). Values between 0 (no impact) and 1 (full impact) can be used to blend between several actions. Default is 1. Properties/methods concerning **weight** are: [page:.crossFadeFrom crossFadeFrom], [page:.crossFadeTo crossFadeTo], [page:.enabled enabled], [page:.fadeIn fadeIn], [page:.fadeOut fadeOut], [page:.getEffectiveWeight getEffectiveWeight], [page:.setEffectiveWeight setEffectiveWeight], [page:.stopFading stopFading].
	*/
	open var weight: Double  = definedExternally


	/**
	* Enables smooth interpolation without separate clips for start, loop and end. Default is **true**.
	*/
	open var zeroSlopeAtEnd: Boolean  = definedExternally


	/**
	* Enables smooth interpolation without separate clips for start, loop and end. Default is **true**.
	*/
	open var zeroSlopeAtStart: Boolean  = definedExternally


	/**
	* Causes this action to [page:.fadeIn fade in], fading out another action simultaneously, within the passed time interval. This method can be chained. If warpBoolean is true, additional [page:.warp warping] (gradually changes of the time scales) will be applied. Note: Like with **fadeIn** / **fadeOut**, the fading starts/ends with a weight of 1.
	*/
	open fun crossFadeFrom(fadeOutAction: ch.viseon.threejs.declarations.animation.AnimationAction = definedExternally, durationInSeconds: Double = definedExternally, warpBoolean: Boolean = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Causes this action to [page:.fadeOut fade out], fading in another action simultaneously, within the passed time interval. This method can be chained. If warpBoolean is true, additional [page:.warp warping] (gradually changes of the time scales) will be applied. Note: Like with **fadeIn** / **fadeOut**, the fading starts/ends with a weight of 1.
	*/
	open fun crossFadeTo(fadeInAction: ch.viseon.threejs.declarations.animation.AnimationAction = definedExternally, durationInSeconds: Double = definedExternally, warpBoolean: Boolean = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Increases the [page:.weight weight] of this action gradually from 0 to 1, within the passed time interval. This method can be chained.
	*/
	open fun fadeIn(durationInSeconds: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Decreases the [page:.weight weight] of this action gradually from 1 to 0, within the passed time interval. This method can be chained.
	*/
	open fun fadeOut(durationInSeconds: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Returns the effective time scale (considering the current states of warping and [page:.paused paused]).
	*/
	open fun getEffectiveTimeScale() : Double


	/**
	* Returns the effective weight (considering the current states of fading and [page:.enabled enabled]).
	*/
	open fun getEffectiveWeight() : Double


	/**
	* Returns the clip which holds the animation data for this action.
	*/
	open fun getClip() : ch.viseon.threejs.declarations.animation.AnimationClip


	/**
	* Returns the mixer which is responsible for playing this action.
	*/
	open fun getMixer() : ch.viseon.threejs.declarations.animation.AnimationMixer


	/**
	* Returns the root object on which this action is performed.
	*/
	open fun getRoot() : ch.viseon.threejs.declarations.core.Object3D


	/**
	* Decelerates this animation's speed to 0 by decreasing [page:.timeScale timeScale] gradually (starting from its current value), within the passed time interval. This method can be chained.
	*/
	open fun halt(durationInSeconds: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Returns true if the action’s [page:.time time] is currently running. In addition to being activated in the mixer (see [page:.isScheduled isScheduled]) the following conditions must be fulfilled: [page:.paused paused] is equal to false, [page:.enabled enabled] is equal to true, [page:.timeScale timeScale] is different from 0, and there is no scheduling for a delayed start ([page:.startAt startAt]). Note: **isRunning** being true doesn’t necessarily mean that the animation can actually be seen. This is only the case, if [page:.weight weight] is additionally set to a non-zero value.
	*/
	open fun isRunning() : Boolean


	/**
	* Returns true, if this action is activated in the mixer. Note: This doesn’t necessarily mean that the animation is actually running (compare the additional conditions for [page:.isRunning isRunning]).
	*/
	open fun isScheduled() : Boolean


	/**
	* Tells the mixer to activate the action. This method can be chained. Note: Activating this action doesn’t necessarily mean that the animation starts immediately: If the action had already finished before (by reaching the end of its last loop), or if a time for a delayed start has been set (via [page:.startAt startAt]), a [page:.reset reset] must be executed first. Some other settings ([page:.paused paused]=true, [page:.enabled enabled]=false, [page:.weight weight]=0, [page:.timeScale timeScale]=0) can prevent the animation from playing, too.
	*/
	open fun play() : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Resets the action. This method can be chained. This method sets [page:.paused paused] to false, [page:.enabled enabled] to true, [page:.time time] to 0, interrupts any scheduled fading and warping, and removes the internal loop count and scheduling for delayed starting. Note: .**reset** is always called by [page:.stop stop], but .**reset** doesn’t call .**stop** itself. This means: If you want both, resetting and stopping, don’t call .**reset**; call .**stop** instead.
	*/
	open fun reset() : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Sets the duration for a single loop of this action (by adjusting [page:.timeScale timeScale] and stopping any scheduled warping). This method can be chained.
	*/
	open fun setDuration(durationInSeconds: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Sets the [page:.timeScale timeScale] and stops any scheduled warping. This method can be chained. If [page:.paused paused] is false, the effective time scale (an internal property) will also be set to this value; otherwise the effective time scale (directly affecting the animation at this moment) will be set to 0. Note: .**paused** will not be switched to **true** automatically, if .**timeScale** is set to 0 by this method.
	*/
	open fun setEffectiveTimeScale(timeScale: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Sets the [page:.weight weight] and stops any scheduled fading. This method can be chained. If [page:.enabled enabled] is true, the effective weight (an internal property) will also be set to this value; otherwise the effective weight (directly affecting the animation at this moment) will be set to 0. Note: .**enabled** will not be switched to **false** automatically, if .**weight** is set to 0 by this method.
	*/
	open fun setEffectiveWeight(weight: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Sets the [page:.loop loop mode] and the number of [page:.repetitions repetitions]. This method can be chained.
	*/
	open fun setLoop(loopMode: Double = definedExternally, repetitions: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Defines the time for a delayed start (usually passed as [page:AnimationMixer.time] + deltaTimeInSeconds). This method can be chained. Note: The animation will only start at the given time, if .**startAt** is chained with [page:.play play], or if the action has already been activated in the mixer (by a previous call of .**play**, without stopping or resetting it in the meantime).
	*/
	open fun startAt(startTimeInSeconds: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Tells the mixer to deactivate this action. This method can be chained. The action will be immediately stopped and completely [page:.reset reset]. Note: You can stop all active actions on the same mixer in one go via [page:AnimationMixer.stopAllAction mixer.stopAllAction].
	*/
	open fun stop() : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Stops any scheduled [page:.fadeIn fading] which is applied to this action. This method can be chained.
	*/
	open fun stopFading() : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Stops any scheduled [page:.warp warping] which is applied to this action. This method can be chained.
	*/
	open fun stopWarping() : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Synchronizes this action with the passed other action. This method can be chained. Synchronizing is done by setting this action’s [page:.time time] and [page:.timeScale timeScale] values to the corresponding values of the other action (stopping any scheduled warping). Note: Future changes of the other action's **time** and **timeScale** will not be detected.
	*/
	open fun syncWith(otherAction: ch.viseon.threejs.declarations.animation.AnimationAction = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Changes the playback speed, within the passed time interval, by modifying [page:.timeScale timeScale] gradually from **startTimeScale** to **endTimeScale**. This method can be chained.
	*/
	open fun warp(startTimeScale: Double = definedExternally, endTimeScale: Double = definedExternally, durationInSeconds: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction
}