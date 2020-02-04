@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* A helper object to assist with visualizing a [page:Skeleton Skeleton]. The helper is renderered using a [page:LineBasicMaterial LineBasicMaterial].
	*/
open external class SkeletonHelper(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally): ch.viseon.threejs.declarations.objects.LineSegments{

	/**
	* The list of bones that the helper renders as [page:Line Lines].
	*/
	open var bones: Array<dynamic>  = definedExternally


	/**
	* The object passed in the constructor.
	*/
	open var root: ch.viseon.threejs.declarations.core.Object3D  = definedExternally
}