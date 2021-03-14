@file:JsModule("three")
package ch.viseon.threejs.declarations.objects

	/**
	* A special version of [page:Mesh] with instanced rendering support. Use [name] if you have to render a large number of objects with the same geometry and material but with different world transformations. The usage of [name] will help you to reduce the number of draw calls and thus improve the overall rendering performance in your application.
The current implementation requires that materials are not shared between [name] and other 3D objects.
	*/
open external class InstancedMesh(geometry: ch.viseon.threejs.declarations.core.BufferGeometry = definedExternally, material: ch.viseon.threejs.declarations.materials.Material = definedExternally, count: Int = definedExternally): ch.viseon.threejs.declarations.objects.Mesh{

	/**
	* The number of instances. The **count** value passed into the constructor represents the maximum number of instances of this mesh. You can change the number of instances at runtime to an integer value in the range [0, count].
If you need more instances than the original count value, you have to create a new [name].
	*/
	open var count: Int  = definedExternally


	/**
	* Represents the colors of all instances. **null** by default. You have to set its [page:BufferAttribute.needsUpdate needsUpdate] flag to true if you modify instanced data via [page:.setColorAt]().
	*/
	open var instanceColor: ch.viseon.threejs.declarations.core.BufferAttribute  = definedExternally


	/**
	* Represents the local transformation of all instances. You have to set its [page:BufferAttribute.needsUpdate needsUpdate] flag to true if you modify instanced data via [page:.setMatrixAt]().
	*/
	open var instanceMatrix: ch.viseon.threejs.declarations.core.BufferAttribute  = definedExternally


	/**
	* Frees the internal resources of this instance.
	*/
	open fun dispose() : dynamic


	/**
	* [page:Integer index]: The index of an instance. Values have to be in the range [0, count].
[page:Color color]: This color object will be set to the color of the defined instance.
Get the color of the defined instance.
	*/
	open fun getColorAt(index: Int = definedExternally, color: ch.viseon.threejs.declarations.math.Color = definedExternally) : dynamic


	/**
	* [page:Integer index]: The index of an instance. Values have to be in the range [0, count].
[page:Matrix4 matrix]: This 4x4 matrix will be set to the local transformation matrix of the defined instance.
Get the local transformation matrix of the defined instance.
	*/
	open fun getMatrixAt(index: Int = definedExternally, matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : dynamic


	/**
	* [page:Integer index]: The index of an instance. Values have to be in the range [0, count].
[page:Color color]: The color of a single instance.
Sets the given color to the defined instance. Make sure you set [page:.instanceColor][page:BufferAttribute.needsUpdate .needsUpdate] to true after updating all the colors.
	*/
	open fun setColorAt(index: Int = definedExternally, color: ch.viseon.threejs.declarations.math.Color = definedExternally) : dynamic


	/**
	* [page:Integer index]: The index of an instance. Values have to be in the range [0, count].
[page:Matrix4 matrix]: A 4x4 matrix representing the local transformation of a single instance.
Sets the given local transformation matrix to the defined instance. Make sure you set [page:.instanceMatrix][page:BufferAttribute.needsUpdate .needsUpdate] to true after updating all the matrices.
	*/
	open fun setMatrixAt(index: Int = definedExternally, matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : dynamic
}