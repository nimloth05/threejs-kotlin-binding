@file:JsModule("three")
package ch.viseon.threejs.declarations.core

import org.khronos.webgl.WebGLBuffer

/**
	* This buffer attribute class does not construct a VBO. Instead, it uses whatever VBO is passed in constructor and can later be altered via the **buffer** property. It is required to pass additional params alongside the VBO. Those are: the GL context, the GL data type, the number of components per vertex, the number of bytes per component, and the number of vertices. The most common use case for this class is when some kind of GPGPU calculation interferes or even produces the VBOs in question.
	*/
open external class GLBufferAttribute(buffer: WebGLBuffer = definedExternally, type: Long = definedExternally, itemSize: Int = definedExternally, elementSize: Int = definedExternally, count: Int = definedExternally){

	/**
	* The current WebGLBuffer instance.
	*/
	open var buffer: WebGLBuffer  = definedExternally


	/**
	* The expected number of vertices in VBO.
	*/
	open var count: Int  = definedExternally


	/**
	* How many values make up each item (vertex).
	*/
	open var itemSize: Int  = definedExternally


	/**
	* Stores the corresponding size in bytes for the current **type** property value.
See above (constructor) for a list of known type sizes.
	*/
	open var elementSize: Int  = definedExternally


	/**
	* A WebGL Data Type describing the underlying VBO contents.
Set this property together with **elementSize**. The recommended way is using the **setType** method.
	*/
	open var type: Long  = definedExternally


	/**
	* Read-only. Always **true**.
	*/
	open var isGLBufferAttribute: Boolean  = definedExternally


	/**
	* Sets the **buffer** property.
	*/
	open fun setBuffer() : dynamic


	/**
	* Sets the both **type** and **elementSize** properties.
	*/
	open fun setType() : dynamic


	/**
	* Sets the **itemSize** property.
	*/
	open fun setItemSize() : dynamic


	/**
	* Sets the **count** property.
	*/
	open fun setCount() : dynamic


	/**
	* A version number, incremented every time the needsUpdate property is set to true.
	*/
	open var version: Int  = definedExternally


	/**
	* Default is **false**. Setting this to true increments [page:GLBufferAttribute.version version].
	*/
	open var needsUpdate: Boolean  = definedExternally
}
