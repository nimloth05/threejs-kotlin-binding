@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* The AnimationMixer is a player for animations on a particular object in the scene. When multiple objects in the scene are animated independently, one AnimationMixer may be used for each object. For an overview of the different elements of the three.js animation system see the "Animation System" article in the "Next Steps" section of the manual.
	*/
open external class AnimationMixer(rootObject: ch.viseon.threejs.declarations.core.Object3D = definedExternally){

	/**
	* The global mixer time (in seconds; starting with 0 on the mixer's creation).
	*/
	open var time: Double  = definedExternally


	/**
	* A scaling factor for the global [page:.time mixer time]. Note: Setting the mixer's timeScale to 0 and later back to 1 is a possibility to pause/unpause all actions that are controlled by this mixer.
	*/
	open var timeScale: Double  = definedExternally


	/**
	* Returns an [page:AnimationAction] for the passed clip, optionally using a root object different from the mixer's default root. The first parameter can be either an [page:AnimationClip] object or the name of an AnimationClip. If an action fitting the clip and root parameters doesn't yet exist, it will be created by this method. Calling this method several times with the same clip and root parameters always returns the same clip instance.
	*/
	open fun clipAction(clip: ch.viseon.threejs.declarations.animation.AnimationClip = definedExternally, optionalRoot: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Returns an existing [page:AnimationAction] for the passed clip, optionally using a root object different from the mixer's default root. The first parameter can be either an [page:AnimationClip] object or the name of an AnimationClip.
	*/
	open fun existingAction(clip: ch.viseon.threejs.declarations.animation.AnimationClip = definedExternally, optionalRoot: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationAction


	/**
	* Returns this mixer's root object.
	*/
	open fun getRoot() : ch.viseon.threejs.declarations.core.Object3D


	/**
	* Deactivates all previously scheduled actions on this mixer.
	*/
	open fun stopAllAction() : ch.viseon.threejs.declarations.animation.AnimationMixer


	/**
	* Advances the global mixer time and updates the animation. This is usually done in the render loop, passing [page:Clock.getDelta clock.getDelta] scaled by the mixer's [page:.timeScale timeScale]).
	*/
	open fun update(deltaTimeInSeconds: Double = definedExternally) : ch.viseon.threejs.declarations.animation.AnimationMixer


	/**
	* Deallocates all memory resources for a clip.
	*/
	open fun uncacheClip(clip: ch.viseon.threejs.declarations.animation.AnimationClip = definedExternally) : dynamic


	/**
	* Deallocates all memory resources for a root object.
	*/
	open fun uncacheRoot(root: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : dynamic


	/**
	* Deallocates all memory resources for an action.
	*/
	open fun uncacheAction(clip: ch.viseon.threejs.declarations.animation.AnimationClip = definedExternally, optionalRoot: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : dynamic
}