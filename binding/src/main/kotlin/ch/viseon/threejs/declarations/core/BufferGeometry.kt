//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* An efficient representation of mesh, line, or point geometry. Includes vertex positions, face indices, normals, colors, UVs, and custom attributes within buffers, reducing the cost of passing all this data to the GPU.
To read and edit data in BufferGeometry attributes, see [page:BufferAttribute] documentation.
For a less efficient but easier-to-use representation of geometry, see [page:Geometry].
	*/
open external class BufferGeometry(){

	/**
	* This hashmap has as id the name of the attribute to be set and as value the [page:BufferAttribute buffer] to set it to. Rather than accessing this property directly, use [page:.addAttribute] and [page:.getAttribute] to access attributes of this geometry.
	*/
	open var attributes: dynamic/*Object*/  = definedExternally


	/**
	* Bounding box for the bufferGeometry, which can be calculated with [page:.computeBoundingBox](). Default is **null**.
	*/
	open var boundingBox: ch.viseon.threejs.declarations.math.Box3  = definedExternally


	/**
	* Bounding sphere for the bufferGeometry, which can be calculated with [page:.computeBoundingSphere](). Default is **null**.
	*/
	open var boundingSphere: ch.viseon.threejs.declarations.math.Sphere  = definedExternally


	/**
	* Used to determine what part of the geometry should be rendered. This should not be set directly, instead use [page:.setDrawRange]. Default is { start: 0, count: Infinity }
	*/
	open var drawRange: dynamic/*Object*/  = definedExternally


	/**
	* Split the geometry into groups, each of which will be rendered in a separate WebGL draw call. This allows an array of materials to be used with the bufferGeometry. Each group is an object of the form: { start: Integer, count: Integer, materialIndex: Integer } where start specifies the first element in this draw call – the first vertex for non-indexed geometry, otherwise the first triangle index. Count specifies how many vertices (or indices) are included, and materialIndex specifies the material array index to use. Use [page:.addGroup] to add groups, rather than modifying this array directly.
	*/
	open var groups: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Unique number for this bufferGeometry instance.
	*/
	open var id: Int  = definedExternally


	/**
	* Allows for vertices to be re-used across multiple triangles; this is called using "indexed triangles" and works much the same as it does in [page:Geometry]: each triangle is associated with the indices of three vertices. This attribute therefore stores the index of each vertex for each triangular face. If this attribute is not set, the [page:WebGLRenderer renderer] assumes that each three contiguous positions represent a single triangle. Default is **null**.
	*/
	open var index: ch.viseon.threejs.declarations.core.BufferAttribute  = definedExternally


	/**
	* Used to check whether this or derived classes are BufferGeometries. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isBufferGeometry: Boolean  = definedExternally


	/**
	* Hashmap of [page:BufferAttribute]s holding details of the geometry's [page:Geometry.morphTargets morphTargets].
	*/
	open var morphAttributes: dynamic/*Object*/  = definedExternally


	/**
	* Optional name for this bufferGeometry instance. Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* An object that can be used to store custom data about the BufferGeometry. It should not hold references to functions as these will not be cloned.
	*/
	open var userData: dynamic/*Object*/  = definedExternally


	/**
	* [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this object instance. This gets automatically assigned and shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* Adds an attribute to this geometry. Use this rather than the attributes property, because an internal hashmap of [page:.attributes] is maintained to speed up iterating over attributes.
	*/
	open fun addAttribute(name: String = definedExternally, attribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Adds a group to this geometry; see the [page:BufferGeometry.groups groups] property for details.
	*/
	open fun addGroup(start: Int = definedExternally, count: Int = definedExternally, materialIndex: Int = definedExternally) : dynamic/*null*/


	/**
	* Bakes matrix transform directly into vertex coordinates.
	*/
	open fun applyMatrix(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : dynamic/*null*/


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
	open fun clearGroups() : dynamic/*null*/


	/**
	* Computes bounding box of the geometry, updating [page:.boundingBox] attribute. Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are **null**.
	*/
	open fun computeBoundingBox() : dynamic/*null*/


	/**
	* Computes bounding sphere of the geometry, updating [page:.boundingSphere] attribute. Bounding spheres aren't computed by default. They need to be explicitly computed, otherwise they are **null**.
	*/
	open fun computeBoundingSphere() : dynamic/*null*/


	/**
	* Computes vertex normals by averaging face normals.
	*/
	open fun computeVertexNormals() : dynamic/*null*/


	/**
	* Disposes the object from memory. You need to call this when you want the BufferGeometry removed while the application is running.
	*/
	open fun dispose() : dynamic/*null*/


	/**
	* Populates this BufferGeometry with data from a [page:DirectGeometry] object containing faces. Not implemented for a line geometry. Note: [page:DirectGeometry] is mainly used as an intermediary object for converting between [page:Geometry] and BufferGeometry.
	*/
	open fun fromDirectGeometry(Geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Populates this BufferGeometry with data from a [page:Geometry] object containing faces. Not implemented for a line geometry.
	*/
	open fun fromGeometry(Geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Returns the [page:BufferAttribute attribute] with the specified name.
	*/
	open fun getAttribute(name: String = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Return the [page:.index] buffer.
	*/
	open fun getIndex() : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* vector - A world vector to look at. Rotates the geometry to face a point in space. This is typically done as a one time operation, and not during a loop. Use [page:Object3D.lookAt] for typical real-time mesh usage.
	*/
	open fun lookAt(vector: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Merge in another BufferGeometry with an optional offset of where to start merging in.
	*/
	open fun merge(bufferGeometry: ch.viseon.threejs.declarations.core.BufferGeometry = definedExternally, offset: Int = definedExternally) : dynamic/*null*/


	/**
	* Every normal vector in a geometry will have a magnitude of 1. This will correct lighting on the geometry surfaces.
	*/
	open fun normalizeNormals() : dynamic/*null*/


	/**
	* Removes the [page:BufferAttribute attribute] with the specified name.
	*/
	open fun removeAttribute(name: String = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


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
	open fun setIndex(index: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally) : dynamic/*null*/


	/**
	* Set the [page:.drawRange] buffer. See that property for details.
	*/
	open fun setDrawRange(start: Int = definedExternally, count: Int = definedExternally) : dynamic/*null*/


	/**
	* Sets the attributes for this BufferGeometry from an [page:Object3D].
	*/
	open fun setFromObject(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Sets the attributes for this BufferGeometry from an array of points.
	*/
	open fun setFromPoints(points: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Returns a JSON object representation of the BufferGeometry.
	*/
	open fun toJSON() : dynamic/*Object*/


	/**
	* Return a non-index version of an indexed BufferGeometry.
	*/
	open fun toNonIndexed() : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Translate the geometry. This is typically done as a one time operation, and not during a loop. Use [page:Object3D.position] for typical real-time mesh translation.
	*/
	open fun translate(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry


	/**
	* Updates the attributes for this BufferGeometry from an [page:Object3D].
	*/
	open fun updateFromObject(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : ch.viseon.threejs.declarations.core.BufferGeometry
}