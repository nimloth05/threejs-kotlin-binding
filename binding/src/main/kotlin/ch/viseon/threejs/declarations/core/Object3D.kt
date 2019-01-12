//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* This is the base class for most objects in three.js and provides a set of properties and methods for manipulating objects in 3D space. Note that this can be used for grouping objects via the [page:.add]( object ) method which adds the object as a child, however it is better to use [page:Group] for this.
	*/
open external class Object3D(){

	/**
	* Whether the object gets rendered into shadow map. Default is **false**.
	*/
	open var castShadow: Boolean  = definedExternally


	/**
	* Array with object's children. See [page:Group] for info on manually grouping objects.
	*/
	open var children: Array<Object3D>  = definedExternally


	/**
	* Custom depth material to be used when rendering to the depth map. Can only be used in context of meshes. When shadow-casting with a [page:DirectionalLight] or [page:SpotLight], if you are (a) modifying vertex positions in the vertex shader, (b) using a displacement map, (c) using an alpha map with alphaTest, or (d) using a transparent texture with alphaTest, you must specify a customDepthMaterial for proper shadows. Default is **undefined**.
	*/
	open var customDepthMaterial: ch.viseon.threejs.declarations.materials.Material  = definedExternally


	/**
	* Same as customDepthMaterial, but used with [page:PointLight]. Default is **undefined**.
	*/
	open var customDistanceMaterial: ch.viseon.threejs.declarations.materials.Material  = definedExternally


	/**
	* When this is set, it checks every frame if the object is in the frustum of the camera before rendering the object. Otherwise the object gets rendered every frame even if it isn't visible. Default is **true**.
	*/
	open var frustumCulled: Boolean  = definedExternally


	/**
	* readonly – Unique number for this object instance.
	*/
	open var id: Int  = definedExternally


	/**
	* Used to check whether this or derived classes are Object3Ds. Default is **true**. You should not change this, as it is used internally for optimisation.
	*/
	open var isObject3D: Boolean  = definedExternally


	/**
	* The layer membership of the object. The object is only visible if it has at least one layer in common with the [page:Camera] in use.
	*/
	open var layers: ch.viseon.threejs.declarations.core.Layers  = definedExternally


	/**
	* The local transform matrix.
	*/
	open var matrix: ch.viseon.threejs.declarations.math.Matrix4  = definedExternally


	/**
	* When this is set, it calculates the matrix of position, (rotation or quaternion) and scale every frame and also recalculates the matrixWorld property. Default is [page:Object3D.DefaultMatrixAutoUpdate] (true).
	*/
	open var matrixAutoUpdate: Boolean  = definedExternally


	/**
	* The global transform of the object. If the Object3D has no parent, then it's identical to the local transform [page:.matrix].
	*/
	open var matrixWorld: ch.viseon.threejs.declarations.math.Matrix4  = definedExternally


	/**
	* When this is set, it calculates the matrixWorld in that frame and resets this property to false. Default is **false**.
	*/
	open var matrixWorldNeedsUpdate: Boolean  = definedExternally


	/**
	* This is passed to the shader and used to calculate the position of the object.
	*/
	open var modelViewMatrix: ch.viseon.threejs.declarations.math.Matrix4  = definedExternally


	/**
	* Optional name of the object (doesn't need to be unique). Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* This is passed to the shader and used to calculate lighting for the object. It is the transpose of the inverse of the upper left 3x3 sub-matrix of this object's modelViewMatrix. The reason for this special matrix is that simply using the modelViewMatrix could result in a non-unit length of normals (on scaling) or in a non-perpendicular direction (on non-uniform scaling). On the other hand the translation part of the modelViewMatrix is not relevant for the calculation of normals. Thus a Matrix3 is sufficient.
	*/
	open var normalMatrix: ch.viseon.threejs.declarations.math.Matrix3  = definedExternally


	/**
	* An optional callback that is executed immediately after the Object3D is rendered. This function is called with the following parameters: renderer, scene, camera, geometry, material, group.
	*/
	open var onAfterRender: dynamic/*function*/  = definedExternally


	/**
	* An optional callback that is executed immediately before the Object3D is rendered. This function is called with the following parameters: renderer, scene, camera, geometry, material, group.
	*/
	open var onBeforeRender: dynamic/*function*/  = definedExternally


	/**
	* Object's parent in the [link:https://en.wikipedia.org/wiki/Scene_graph scene graph]. An object can have at most one parent.
	*/
	open var parent: ch.viseon.threejs.declarations.core.Object3D  = definedExternally


	/**
	* A [page:Vector3] representing the object's local position. Default is (0, 0, 0).
	*/
	open var position: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* Object's local rotation as a [page:Quaternion Quaternion].
	*/
	open var quaternion: ch.viseon.threejs.declarations.math.Quaternion  = definedExternally


	/**
	* Whether the material receives shadows. Default is **false**.
	*/
	open var receiveShadow: Boolean  = definedExternally


	/**
	* This value allows the default rendering order of [link:https://en.wikipedia.org/wiki/Scene_graph scene graph] objects to be overridden although opaque and transparent objects remain sorted independently. Sorting is from lowest to highest renderOrder. Default value is **0**.
	*/
	open var renderOrder: Double  = definedExternally


	/**
	* Object's local rotation (see [link:https://en.wikipedia.org/wiki/Euler_angles Euler angles]), in radians.
	*/
	open var rotation: ch.viseon.threejs.declarations.math.Euler  = definedExternally


	/**
	* The object's local scale. Default is [page:Vector3]( 1, 1, 1 ).
	*/
	open var scale: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* This is used by the [page:.lookAt lookAt] method, for example, to determine the orientation of the result. Default is [page:Object3D.DefaultUp] - that is, ( 0, 1, 0 ).
	*/
	open var up: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* An object that can be used to store custom data about the Object3D. It should not hold references to functions as these will not be cloned.
	*/
	open var userData: dynamic/*object*/  = definedExternally


	/**
	* [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this object instance. This gets automatically assigned, so this shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* Object gets rendered if **true**. Default is **true**.
	*/
	open var visible: Boolean  = definedExternally


	/**
	* The default [page:.up up] direction for objects, also used as the default position for [page:DirectionalLight], [page:HemisphereLight] and [page:Spotlight] (which creates lights shining from the top down). Set to ( 0, 1, 0 ) by default.
	*/
	open var DefaultUp: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* The default setting for [page:.matrixAutoUpdate matrixAutoUpdate] for newly created Object3Ds.
	*/
	open var DefaultMatrixAutoUpdate: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* Adds **object** as child of this object. An arbitrary number of objects may be added. Any current parent on an object passed in here will be removed, since an object can have at most one parent. See [page:Group] for info on manually grouping objects.
	*/
	open fun add(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : dynamic/*null*/


	/**
	* Applies the matrix transform to the object and updates the object's position, rotation and scale.
	*/
	open fun applyMatrix(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : dynamic/*null*/


	/**
	* Applies the rotation represented by the quaternion to the object.
	*/
	open fun applyQuaternion(quaternion: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* recursive -- if true, descendants of the object are also cloned. Default is true. Returns a clone of this object and optionally all descendants.
	*/
	open fun clone(recursive: Boolean = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* recursive -- if true, descendants of the object are also copied. Default is true. Copy the given object into this object.
	*/
	open fun copy(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, recursive: Boolean = definedExternally) : Object3D


	/**
	* id -- Unique number of the object instance Searches through the object's children and returns the first with a matching id. Note that ids are assigned in chronological order: 1, 2, 3, ..., incrementing by one for each new object.
	*/
	open fun getObjectById(id: Int = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* name -- String to match to the children's Object3D.name property. Searches through the object's children and returns the first with a matching name. Note that for most objects the name is an empty string by default. You will have to set it manually to make use of this method.
	*/
	open fun getObjectByName(name: String = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* name -- the property name to search for. value -- value of the given property. Searches through the object's children and returns the first with a property that matches the value given.
	*/
	open fun getObjectByProperty(name: String = definedExternally, value: Double = definedExternally) : ch.viseon.threejs.declarations.core.Object3D


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Returns a vector representing the position of the object in world space.
	*/
	open fun getWorldPosition(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Quaternion target] — the result will be copied into this Quaternion. Returns a quaternion representing the rotation of the object in world space.
	*/
	open fun getWorldQuaternion(target: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : ch.viseon.threejs.declarations.math.Quaternion


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Returns a vector of the scaling factors applied to the object for each axis in world space.
	*/
	open fun getWorldScale(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* [page:Vector3 target] — the result will be copied into this Vector3. Returns a vector representing the direction of object's positive z-axis in world space.
	*/
	open fun getWorldDirection(target: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* vector - A vector representing a position in local (object) space. Converts the vector from local space to world space.
	*/
	open fun localToWorld(vector: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3


	/**
	* vector - A vector representing a position in world space. Optionally, the [page:.x x], [page:.y y] and [page:.z z] components of the world space position. Rotates the object to face a point in world space. This method does not support objects having non-uniformly-scaled parent(s).
	*/
	open fun lookAt(vector: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, lookAt: dynamic/*null*/ = definedExternally, x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : dynamic/*null*/


	/**
	* Abstract (empty) method to get intersections between a casted ray and this object. Subclasses such as [page:Mesh], [page:Line], and [page:Points] implement this method in order to use raycasting.
	*/
	open fun raycast(raycaster: ch.viseon.threejs.declarations.core.Raycaster = definedExternally, intersects: Array<dynamic>/*Array*/ = definedExternally) : Array<dynamic>/*Array*/


	/**
	* Removes **object** as child of this object. An arbitrary number of objects may be removed.
	*/
	open fun remove(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : dynamic/*null*/


	/**
	* axis -- A normalized vector in object space. angle -- The angle in radians. Rotate an object along an axis in object space. The axis is assumed to be normalized.
	*/
	open fun rotateOnAxis(axis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, angle: Double = definedExternally) : Object3D


	/**
	* axis -- A normalized vector in world space. angle -- The angle in radians. Rotate an object along an axis in world space. The axis is assumed to be normalized. Method Assumes no rotated parent.
	*/
	open fun rotateOnWorldAxis(axis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, angle: Double = definedExternally) : Object3D


	/**
	* rad - the angle to rotate in radians. Rotates the object around x axis in local space.
	*/
	open fun rotateX(rad: Double = definedExternally) : Object3D


	/**
	* rad - the angle to rotate in radians. Rotates the object around y axis in local space.
	*/
	open fun rotateY(rad: Double = definedExternally) : Object3D


	/**
	* rad - the angle to rotate in radians. Rotates the object around z axis in local space.
	*/
	open fun rotateZ(rad: Double = definedExternally) : Object3D


	/**
	* axis -- A normalized vector in object space. angle -- angle in radians Calls [page:Quaternion.setFromAxisAngle setFromAxisAngle]( [page:Float axis], [page:Float angle] ) on the [page:.quaternion].
	*/
	open fun setRotationFromAxisAngle(axis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, angle: Double = definedExternally) : dynamic/*null*/


	/**
	* euler -- Euler angle specifying rotation amount. Calls [page:Quaternion.setRotationFromEuler setRotationFromEuler]( [page:Euler euler]) on the [page:.quaternion].
	*/
	open fun setRotationFromEuler(euler: ch.viseon.threejs.declarations.math.Euler = definedExternally) : dynamic/*null*/


	/**
	* m -- rotate the quaternion by the rotation component of the matrix. Calls [page:Quaternion.setFromRotationMatrix setFromRotationMatrix]( [page:Matrix4 m]) on the [page:.quaternion]. Note that this assumes that the upper 3x3 of m is a pure rotation matrix (i.e, unscaled).
	*/
	open fun setRotationFromMatrix(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : dynamic/*null*/


	/**
	* q -- normalized Quaternion. Copy the given quaternion into [page:.quaternion].
	*/
	open fun setRotationFromQuaternion(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : dynamic/*null*/


	/**
	* Convert the object to JSON format.
	*/
	open fun toJSON(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally) : dynamic/*null*/


	/**
	* axis -- A normalized vector in object space. distance -- The distance to translate. Translate an object by distance along an axis in object space. The axis is assumed to be normalized.
	*/
	open fun translateOnAxis(axis: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, distance: Double = definedExternally) : Object3D


	/**
	* Translates object along x axis in object space by **distance** units.
	*/
	open fun translateX(distance: Double = definedExternally) : Object3D


	/**
	* Translates object along y axis in object space by **distance** units.
	*/
	open fun translateY(distance: Double = definedExternally) : Object3D


	/**
	* Translates object along z axis in object space by **distance** units.
	*/
	open fun translateZ(distance: Double = definedExternally) : Object3D


	/**
	* callback - A function with as first argument an object3D object. Executes the callback on this object and all descendants.
	*/
	open fun traverse(callback: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* callback - A function with as first argument an object3D object. Like traverse, but the callback will only be executed for visible objects. Descendants of invisible objects are not traversed.
	*/
	open fun traverseVisible(callback: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* callback - A function with as first argument an object3D object. Executes the callback on all ancestors.
	*/
	open fun traverseAncestors(callback: dynamic/*Function*/ = definedExternally) : dynamic/*null*/


	/**
	* Update the local transform.
	*/
	open fun updateMatrix() : dynamic/*null*/


	/**
	* Update the global transform of the object and its children.
	*/
	open fun updateMatrixWorld(force: Boolean = definedExternally) : dynamic/*null*/


	/**
	* vector - A world vector. Updates the vector from world space to local space.
	*/
	open fun worldToLocal(vector: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3
}