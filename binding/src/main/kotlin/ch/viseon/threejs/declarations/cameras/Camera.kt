//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.cameras

	/**
	* Abstract base class for cameras. This class should always be inherited when you build a new camera.
	*/
open external class Camera(): ch.viseon.threejs.declarations.core.Object3D{

	/**
	* Used to check whether this or derived classes are cameras. Default is **true**. You should not change this, as it used internally by the renderer for optimisation.
	*/
	open var isCamera: Boolean  = definedExternally


	/**
	* The [page:Layers layers] that the camera is a member of. This is an inherited property from [page:Object3D]. Objects must share at least one layer with the camera to be seen when the camera's viewpoint is rendered.
	*/
	override var layers: ch.viseon.threejs.declarations.core.Layers 


	/**
	* This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera.
	*/
	open var matrixWorldInverse: ch.viseon.threejs.declarations.math.Matrix4  = definedExternally


	/**
	* This is the matrix which contains the projection.
	*/
	open var projectionMatrix: ch.viseon.threejs.declarations.math.Matrix4  = definedExternally


	/**
	* The inverse of projectionMatrix.
	*/
	open var projectionMatrixInverse: ch.viseon.threejs.declarations.math.Matrix4  = definedExternally


	/**
	* Return a new camera with the same properties as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.cameras.Camera


	/**
	* Copy the properties from the source camera into this one.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.cameras.Camera = definedExternally, recursive: Boolean = definedExternally) : ch.viseon.threejs.declarations.cameras.Camera


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Returns a [page:Vector3] representing the world space direction in which the camera is looking. (Note: A camera looks down its local, negative z-axis).
	*/
	override fun getWorldDirection(target: ch.viseon.threejs.declarations.math.Vector3) : ch.viseon.threejs.declarations.math.Vector3
}