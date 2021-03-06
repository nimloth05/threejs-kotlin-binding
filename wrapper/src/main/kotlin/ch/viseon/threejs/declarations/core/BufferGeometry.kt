@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* A representation of mesh, line, or point geometry. Includes vertex positions, face indices, normals, colors, UVs, and custom attributes within buffers, reducing the cost of passing all this data to the GPU.
To read and edit data in BufferGeometry attributes, see [page:BufferAttribute] documentation.
	*/
open external class BufferGeometry{

	/**
	* This hashmap has as id the name of the attribute to be set and as value the [page:BufferAttribute buffer] to set it to. Rather than accessing this property directly, use [page:.setAttribute] and [page:.getAttribute] to access attributes of this geometry.
	*/
	open var attributes: dynamic  = definedExternally


	/**
	* Bounding box for the bufferGeometry, which can be calculated with [page:.computeBoundingBox](). Default is **null**.
	*/
	open var boundingBox: ch.viseon.threejs.declarations.math.Box3  = definedExternally


	/**
	* Bounding sphere for the bufferGeometry, which can be calculated with [page:.computeBoundingSphere](). Default is **null**.
	*/
	open var boundingSphere: ch.viseon.threejs.declarations.math.Sphere  = definedExternally


	/**
	* Determines the part of the geometry to render. This should not be set directly, instead use [page:.setDrawRange]. Default is { start: 0, count: Infinity } For non-indexed BufferGeometry, count is the number of vertices to render. For indexed BufferGeometry, count is the number of indices to render.
	*/
	open var drawRange: dynamic  = definedExternally


	/**
	* Split the geometry into groups, each of which will be rendered in a separate WebGL draw call. This allows an array of materials to be used with the bufferGeometry. Each group is an object of the form: { start: Integer, count: Integer, materialIndex: Integer } where start specifies the first element in this draw call – the first vertex for non-indexed geometry, otherwise the first triangle index. Count specifies how many vertices (or indices) are included, and materialIndex specifies the material array index to use. Use [page:.addGroup] to add groups, rather than modifying this array directly.
	*/
	open var groups: Array<dynamic>  = definedExternally


	/**
	* Unique number for this bufferGeometry instance.
	*/
	open var id: Int  = definedExternally


	/**
	* Allows for vertices to be re-used across multiple triangles; this is called using "indexed triangles". Each triangle is associated with the indices of three vertices. This attribute therefore stores the index of each vertex for each triangular face. If this attribute is not set, the [page:WebGLRenderer renderer] assumes that each three contiguous positions represent a single triangle. Default is **null**.
	*/
	open var index: ch.viseon.threejs.declarations.core.BufferAttribute  = definedExternally


	/**
	* Hashmap of [page:BufferAttribute]s holding details of the geometry's morph targets.
	*/
	open var morphAttributes: dynamic  = definedExternally


	/**
	* Used to control the morph target behavior; when set to true, the morph target data is treated as relative offsets, rather than as absolute positions/normals. Default is **false**.
	*/
	open var morphTargetsRelative: Boolean  = definedExternally


	/**
	* Optional name for this bufferGeometry instance. Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* An object that can be used to store custom data about the BufferGeometry. It should not hold references to functions as these will not be cloned.
	*/
	open var userData: dynamic  = definedExternally


	/**
	* [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this object instance. This gets automatically assigned and shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* Sets an attribute to this geometry. Use this rather than the attributes property, because an internal hashmap of [page:.attributes] is maintained to speed up iterating over attributes.
	*/
	open fun setAttribute(name: String = definedExternally, attribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Adds a group to this geometry; see the [page:BufferGeometry.groups groups] property for details.
	*/
	open fun addGroup(start: Int = definedExternally, count: Int = definedExternally, materialIndex: Int = definedExternally) : dynamic


	/**
	* Bakes matrix transform directly into vertex coordinates.
	*/
	open fun applyMatrix4(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : dynamic


	/**
	* Center the geometry based on the bounding box.
	*/
	open fun center() : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Creates a clone of this BufferGeometry.
	*/
	open fun clone() : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Copies another BufferGeometry to this BufferGeometry.
	*/
	open fun copy(bufferGeometry: ch.viseon.threejs.declarations.core.BufferGeometry = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Clears all groups.
	*/
	open fun clearGroups() : dynamic


	/**
	* Computes bounding box of the geometry, updating [page:.boundingBox] attribute. Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are **null**.
	*/
	open fun computeBoundingBox() : dynamic


	/**
	* Computes bounding sphere of the geometry, updating [page:.boundingSphere] attribute. Bounding spheres aren't computed by default. They need to be explicitly computed, otherwise they are **null**.
	*/
	open fun computeBoundingSphere() : dynamic


	/**
	* Calculates and adds a tangent attribute to this geometry. The computation is only supported for indexed geometries and if position, normal, and uv attributes are defined.
	*/
	open fun computeTangents() : dynamic


	/**
	* Computes vertex normals by averaging face normals.
	*/
	open fun computeVertexNormals() : dynamic


	/**
	* Disposes the object from memory. You need to call this when you want the BufferGeometry removed while the application is running.
	*/
	open fun dispose() : dynamic


	/**
	* Returns the [page:BufferAttribute attribute] with the specified name.
	*/
	open fun getAttribute(name: String = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Return the [page:.index] buffer.
	*/
	open fun getIndex() : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Returns **true** if the attribute with the specified name exists.
	*/
	open fun hasAttribute(name: String = definedExternally) : Boolean


	/**
	* vector - A world vector to look at. Rotates the geometry to face a point in space. This is typically done as a one time operation, and not during a loop. Use [page:Object3D.lookAt] for typical real-time mesh usage.
	*/
	open fun lookAt(vector: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Merge in another BufferGeometry with an optional offset of where to start merging in.
	*/
	open fun merge(bufferGeometry: ch.viseon.threejs.declarations.core.BufferGeometry = definedExternally, offset: Int = definedExternally) : dynamic


	/**
	* Every normal vector in a geometry will have a magnitude of 1. This will correct lighting on the geometry surfaces.
	*/
	open fun normalizeNormals() : dynamic


	/**
	* Deletes the [page:BufferAttribute attribute] with the specified name.
	*/
	open fun deleteAttribute(name: String = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Rotate the geometry about the X axis. This is typically done as a one time operation, and not during a loop. Use [page:Object3D.rotation] for typical real-time mesh rotation.
	*/
	open fun rotateX(radians: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Rotate the geometry about the Y axis. This is typically done as a one time operation, and not during a loop. Use [page:Object3D.rotation] for typical real-time mesh rotation.
	*/
	open fun rotateY(radians: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Rotate the geometry about the Z axis. This is typically done as a one time operation, and not during a loop. Use [page:Object3D.rotation] for typical real-time mesh rotation.
	*/
	open fun rotateZ(radians: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Scale the geometry data. This is typically done as a one time operation, and not during a loop. Use [page:Object3D.scale] for typical real-time mesh scaling.
	*/
	open fun scale(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Set the [page:.index] buffer.
	*/
	open fun setIndex(index: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Set the [page:.drawRange] property. For non-indexed BufferGeometry, count is the number of vertices to render. For indexed BufferGeometry, count is the number of indices to render.
	*/
	open fun setDrawRange(start: Int = definedExternally, count: Int = definedExternally) : dynamic


	/**
	* Sets the attributes for this BufferGeometry from an array of points.
	*/
	open fun setFromPoints(points: Array<dynamic> = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Convert the buffer geometry to three.js [link:https://github.com/mrdoob/three.js/wiki/JSON-Object-Scene-format-4 JSON Object/Scene format].
	*/
	open fun toJSON() : dynamic


	/**
	* Return a non-index version of an indexed BufferGeometry.
	*/
	open fun toNonIndexed() : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Translate the geometry. This is typically done as a one time operation, and not during a loop. Use [page:Object3D.position] for typical real-time mesh translation.
	*/
	open fun translate(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry
}