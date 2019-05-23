//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.cameras

	/**
	* Camera that uses [link:https://en.wikipedia.org/wiki/Perspective_(graphical) perspective projection]. This projection mode is designed to mimic the way the human eye sees. It is the most common projection mode used for rendering a 3D scene.
	*/
open external class PerspectiveCamera(fov: Double = definedExternally, aspect: Double = definedExternally, near: Double = definedExternally, far: Double = definedExternally): ch.viseon.threejs.declarations.cameras.Camera{

	/**
	* Camera frustum aspect ratio, usually the canvas width / canvas height. Default is **1** (square canvas).
	*/
	open var aspect: Double  = definedExternally


	/**
	* Camera frustum far plane. Default is **2000**. The valid range is between the current value of the [page:.near near] plane and infinity.
	*/
	open var far: Double  = definedExternally


	/**
	* Film size used for the larger axis. Default is 35 (millimeters). This parameter does not influence the projection matrix unless .filmOffset is set to a nonzero value.
	*/
	open var filmGauge: Double  = definedExternally


	/**
	* Horizontal off-center offset in the same unit as .filmGauge. Default is **0**.
	*/
	open var filmOffset: Double  = definedExternally


	/**
	* Object distance used for stereoscopy and depth-of-field effects. This parameter does not influence the projection matrix unless a [page:StereoCamera] is being used. Default is **10**.
	*/
	open var focus: Double  = definedExternally


	/**
	* Camera frustum vertical field of view, from bottom to top of view, in degrees. Default is **50**.
	*/
	open var fov: Double  = definedExternally


	/**
	* Used to test whether this or derived classes are PerspectiveCameras. Default is **true**. This should not be changed as it is used internally by the renderer for optimisation.
	*/
	open var isPerspectiveCamera: Boolean  = definedExternally


	/**
	* Camera frustum near plane. Default is **0.1**. The valid range is greater than 0 and less than the current value of the [page:.far far] plane. Note that, unlike for the [page:OrthographicCamera], **0** is not a valid value for a PerspectiveCamera's near plane.
	*/
	open var near: Double  = definedExternally


	/**
	* Frustum window specification or null. This is set using the [page:PerspectiveCamera.setViewOffset .setViewOffset] method and cleared using [page:PerspectiveCamera.clearViewOffset .clearViewOffset].
	*/
	open var view: dynamic  = definedExternally


	/**
	* Gets or sets the zoom factor of the camera. Default is **1**.
	*/
	open var zoom: Double  = definedExternally


	/**
	* Removes any offset set by the [page:PerspectiveCamera.setViewOffset .setViewOffset] method.
	*/
	open fun clearViewOffset() : dynamic


	/**
	* Returns the current vertical field of view angle in degrees considering .zoom.
	*/
	open fun getEffectiveFOV() : Double


	/**
	* Returns the height of the image on the film. If .aspect is less than or equal to one (portrait format), the result equals .filmGauge.
	*/
	open fun getFilmHeight() : Double


	/**
	* Returns the width of the image on the film. If .aspect is greater than or equal to one (landscape format), the result equals .filmGauge.
	*/
	open fun getFilmWidth() : Double


	/**
	* Returns the focal length of the current .fov in respect to .filmGauge.
	*/
	open fun getFocalLength() : Double


	/**
	* Sets the FOV by focal length in respect to the current [page:PerspectiveCamera.filmGauge .filmGauge]. By default, the focal length is specified for a 35mm (full frame) camera.
	*/
	open fun setFocalLength(focalLength: Double = definedExternally) : dynamic


	/**
	* fullWidth — full width of multiview setup fullHeight — full height of multiview setup x — horizontal offset of subcamera y — vertical offset of subcamera width — width of subcamera height — height of subcamera
Sets an offset in a larger frustum. This is useful for multi-window or multi-monitor/multi-machine setups.
For example, if you have 3x2 monitors and each monitor is 1920x1080 and the monitors are in grid like this:
	*/
	open fun setViewOffset(fullWidth: Double = definedExternally, fullHeight: Double = definedExternally, x: Double = definedExternally, y: Double = definedExternally, width: Double = definedExternally, height: Double = definedExternally) : dynamic


	/**
	* Updates the camera projection matrix. Must be called after any change of parameters.
	*/
	open fun updateProjectionMatrix() : dynamic


	/**
	* Return camera data in JSON format.
	*/
	open fun toJSON() : JSON
}