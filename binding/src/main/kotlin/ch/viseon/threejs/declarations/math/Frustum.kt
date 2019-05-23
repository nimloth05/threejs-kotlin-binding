//Generated date 23.05.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* [link:http://en.wikipedia.org/wiki/Frustum Frustums] are used to determine what is inside the camera's field of view. They help speed up the rendering process - object which lie outside a camera's frustum can safely be excluded from rendering. This class is mainly intended for use internally by a renderer for calculating a [page:Camera camera] or [page:LightShadow.camera shadowCamera]'s frustum.
	*/
open external class Frustum(p0: ch.viseon.threejs.declarations.math.Plane = definedExternally, p1: ch.viseon.threejs.declarations.math.Plane = definedExternally, p2: ch.viseon.threejs.declarations.math.Plane = definedExternally, p3: ch.viseon.threejs.declarations.math.Plane = definedExternally, p4: ch.viseon.threejs.declarations.math.Plane = definedExternally, p5: ch.viseon.threejs.declarations.math.Plane = definedExternally){

	/**
	* Array of 6 [page:Plane planes].
	*/
	open var planes: Array<dynamic>  = definedExternally


	/**
	* Return a new Frustum with the same parameters as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Frustum


	/**
	* [page:Vector3 point] - [page:Vector3] to test. Checks to see if the frustum contains the [page:Vector3 point].
	*/
	open fun containsPoint(point: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : Boolean


	/**
	* [page:Frustum frustum] - The frustum to copy Copies the properties of the passed [page:Frustum frustum] into this one.
	*/
	open fun copy(frustum: ch.viseon.threejs.declarations.math.Frustum = definedExternally) : ch.viseon.threejs.declarations.math.Frustum


	/**
	* [page:Box3 box] - [page:Box3] to check for intersection. Return true if [page:Box3 box] intersects with this frustum.
	*/
	open fun intersectsBox(box: ch.viseon.threejs.declarations.math.Box3 = definedExternally) : Boolean


	/**
	* Checks whether the [page:Object3D object]'s [page:Geometry.boundingSphere bounding sphere] is intersecting the Frustum. Note that the object must have a [page:Geometry] or [page:BufferGeometry] so that the bounding sphere can be calculated.
	*/
	open fun intersectsObject(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : Boolean


	/**
	* [page:Sphere sphere] - [page:Sphere] to check for intersection. Return true if [page:Sphere sphere] intersects with this frustum.
	*/
	open fun intersectsSphere(sphere: ch.viseon.threejs.declarations.math.Sphere = definedExternally) : Boolean


	/**
	* Checks whether the [page:Sprite sprite] is intersecting the Frustum.
	*/
	open fun intersectsSprite(sprite: ch.viseon.threejs.declarations.objects.Sprite = definedExternally) : Boolean


	/**
	* Sets the current frustum from the passed planes. No plane order is implicitely implied.
	*/
	open fun set(p0: ch.viseon.threejs.declarations.math.Plane = definedExternally, p1: ch.viseon.threejs.declarations.math.Plane = definedExternally, p2: ch.viseon.threejs.declarations.math.Plane = definedExternally, p3: ch.viseon.threejs.declarations.math.Plane = definedExternally, p4: ch.viseon.threejs.declarations.math.Plane = definedExternally, p5: ch.viseon.threejs.declarations.math.Plane = definedExternally) : ch.viseon.threejs.declarations.math.Frustum


	/**
	* [page:Matrix4 matrix] - [page:Matrix4] used to set the [page:.planes planes] This is used by the [page:WebGLRenderer] to set up the Frustum from a [page:Camera Camera]'s [page:Camera.projectionMatrix projectionMatrix] and [page:Camera.matrixWorldInverse matrixWorldInverse].
	*/
	open fun setFromMatrix(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : ch.viseon.threejs.declarations.math.Frustum
}