//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.cameras

	/**
	* Camera that uses [link:https://en.wikipedia.org/wiki/Orthographic_projection orthographic projection]. In this projection mode, an object's size in the rendered image stays constant regardless of its distance from the camera. This can be useful for rendering 2D scenes and UI elements, amongst other things.
	*/
open external class OrthographicCamera(left: Double = definedExternally, right: Double = definedExternally, top: Double = definedExternally, bottom: Double = definedExternally, near: Double = definedExternally, far: Double = definedExternally): ch.viseon.threejs.declarations.cameras.Camera{

	/**
	* Camera frustum bottom plane.
	*/
	open var bottom: Double  = definedExternally


	/**
	* Camera frustum far plane. Default is **2000**. The valid range is between the current value of the [page:.near near] plane and infinity.
	*/
	open var far: Double  = definedExternally


	/**
	* Used to test whether this or derived classes are OrthographicCameras. Default is **true**. This should not be changed as it is used internally by the renderer for optimisation.
	*/
	open var isOrthographicCamera: Boolean  = definedExternally


	/**
	* Camera frustum left plane.
	*/
	open var left: Double  = definedExternally


	/**
	* Camera frustum near plane. Default is **0.1**. The valid range is between 0 and the current value of the [page:.far far] plane. Note that, unlike for the [page:PerspectiveCamera], **0** is a valid value for an OrthographicCamera's near plane.
	*/
	open var near: Double  = definedExternally


	/**
	* Camera frustum right plane.
	*/
	open var right: Double  = definedExternally


	/**
	* Camera frustum top plane.
	*/
	open var top: Double  = definedExternally


	/**
	* Set by [page:OrthographicCamera.setViewOffset setViewOffset]. Default is **null**.
	*/
	open var view: dynamic  = definedExternally


	/**
	* Gets or sets the zoom factor of the camera. Default is **1**.
	*/
	open var zoom: Double  = definedExternally


	/**
	* fullWidth — full width of multiview setup fullHeight — full height of multiview setup x — horizontal offset of subcamera y — vertical offset of subcamera width — width of subcamera height — height of subcamera Sets an offset in a larger [link:https://en.wikipedia.org/wiki/Viewing_frustum viewing frustum]. This is useful for multi-window or multi-monitor/multi-machine setups. For an example on how to use it see [page:PerspectiveCamera.setViewOffset PerspectiveCamera].
	*/
	open fun setViewOffset(fullWidth: Double = definedExternally, fullHeight: Double = definedExternally, x: Double = definedExternally, y: Double = definedExternally, width: Double = definedExternally, height: Double = definedExternally) : dynamic


	/**
	* Removes any offset set by the .setViewOffset method.
	*/
	open fun clearViewOffset() : dynamic


	/**
	* Updates the camera projection matrix. Must be called after any change of parameters.
	*/
	open fun updateProjectionMatrix() : dynamic


	/**
	* Return the camera's data in JSON format.
	*/
	open fun toJSON() : JSON
}