//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* Triangular face used in [page:Geometry]. These are created automatically for all standard geometry types, however if you are building a custom geometry you will have to create them manually.
	*/
open external class Face3(a: Int = definedExternally, b: Int = definedExternally, c: Int = definedExternally, normal: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, color: ch.viseon.threejs.declarations.math.Color = definedExternally, materialIndex: Int = definedExternally){

	/**
	* Vertex A index.
	*/
	open var a: Int  = definedExternally


	/**
	* Vertex B index.
	*/
	open var b: Int  = definedExternally


	/**
	* Vertex C index.
	*/
	open var c: Int  = definedExternally


	/**
	* Face normal - vector showing the direction of the Face3. If calculated automatically (using [page:Geometry.computeFaceNormals]), this is the normalized cross product of two edges of the triangle. Default is **(0, 0, 0)**.
	*/
	open var normal: ch.viseon.threejs.declarations.math.Vector3  = definedExternally


	/**
	* Face color - for this to be used a material's [page:Material.vertexColors vertexColors] property must be set to [page:Materials THREE.FaceColors].
	*/
	open var color: ch.viseon.threejs.declarations.math.Color  = definedExternally


	/**
	* Array of 3 [page:Vector3 vertex normals].
	*/
	open var vertexNormals: Array<dynamic>  = definedExternally


	/**
	* Array of 3 vertex colors - for these to be used a material's [page:Material.vertexColors vertexColors] property must be set to [page:Materials THREE.VertexColors].
	*/
	open var vertexColors: Array<dynamic>  = definedExternally


	/**
	* Material index (points to an index in the associated array of materials). Default is **0**.
	*/
	open var materialIndex: Int  = definedExternally


	/**
	* Creates a new clone of the Face3 object.
	*/
	open fun clone() : ch.viseon.threejs.declarations.core.Face3


	/**
	* Copy the parameters of another Face3 into this.
	*/
	open fun copy(face3: ch.viseon.threejs.declarations.core.Face3 = definedExternally) : ch.viseon.threejs.declarations.core.Face3
}