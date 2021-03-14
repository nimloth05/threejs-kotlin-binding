@file:JsModule("three")
package ch.viseon.threejs.declarations.renderers.webxr

	/**
	* This class represents an abstraction of the WebXR Device API and is internally used by [page:WebGLRenderer]. [name] also provides a public interface that allows users to enable/disable XR and perform XR related tasks like for instance retrieving controllers.
	*/
open external class WebXRManager{

	/**
	* This flag notifies the renderer to be ready for XR rendering. Default is **false**. Set it to **true** if you are going to use XR in your app.
	*/
	open var enabled: Boolean  = definedExternally


	/**
	* Whether XR presentation is active or not. Default is **false**. This flag is read-only and automatically set by [name].
	*/
	open var isPresenting: Boolean  = definedExternally


	/**
	* [page:Integer index] — The index of the controller. Returns a [page:Group] representing the so called **target ray** space of the controller. Use this space for visualizing 3D objects that support the user in pointing tasks like UI interaction.
	*/
	open fun getController(index: Int = definedExternally) : ch.viseon.threejs.declarations.objects.Group


	/**
	* [page:Integer index] — The index of the controller. Returns a [page:Group] representing the so called **grip** space of the controller. Use this space if the user is going to hold other 3D objects like a lightsaber.
Note: If you want to show something in the user's hand AND offer a pointing ray at the same time, you'll want to attached the handheld object to the group returned by [page:.getControllerGrip]() and the ray to the group returned by [page:.getController](). The idea is to have two different groups in two different coordinate spaces for the same WebXR controller.
	*/
	open fun getControllerGrip(index: Int = definedExternally) : ch.viseon.threejs.declarations.objects.Group


	/**
	* [page:Float framebufferScaleFactor] — The framebuffer scale factor to set. Specifies the scaling factor to use when determining the size of the framebuffer when rendering to a XR device. The value is relative to the default XR device display resolution. Default is **1**. A value of **0.5** would specify a framebuffer with 50% of the display's native resolution.
Note: It is not possible to change the framebuffer scale factor while presenting XR content.
	*/
	open fun setFramebufferScaleFactor(framebufferScaleFactor: Double = definedExternally) : Unit


	/**
	* [page:String referenceSpaceType] — The reference space type to set. Can be used to configure a spatial relationship with the user's physical environment. Depending on how the user moves in 3D space, setting an appropriate reference space can improve tracking. Default is **local-floor**. Please check out the [link:https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceType MDN] for possible values and their use cases.
Note: It is not possible to change the reference space type while presenting XR content.
	*/
	open fun setReferenceSpaceType(referenceSpaceType: String = definedExternally) : Unit
}