//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.animation

	/**
	* Buffered scene graph property that allows weighted accumulation; used internally.
	*/
open external class PropertyMixer(binding: ch.viseon.threejs.declarations.animation.PropertyBinding = definedExternally, typeName: String = definedExternally, valueSize: Float = definedExternally){

	/**
	* 
	*/
	open var binding: ch.viseon.threejs.declarations.animation.PropertyBinding  = definedExternally


	/**
	* Buffer with size [page:PropertyMixer valueSize] ** 4. This has the layout: [ incoming | accu0 | accu1 | orig ] Interpolators can use .buffer as their .result and the data then goes to 'incoming'. 'accu0' and 'accu1' are used frame-interleaved for the cumulative result and are compared to detect changes. 'orig' stores the original state of the property.
	*/
	open var buffer: Array<dynamic>/*TypedArray*/  = definedExternally


	/**
	* Default is **0**.
	*/
	open var cumulativeWeight: Float  = definedExternally


	/**
	* 
	*/
	open var valueSize: Float  = definedExternally


	/**
	* Default is **0**.
	*/
	open var referenceCount: Float  = definedExternally


	/**
	* Default is **0**.
	*/
	open var useCount: Float  = definedExternally


	/**
	* Accumulate data in [page:PropertyMixer.buffer buffer][accuIndex] 'incoming' region into 'accu[i]'. If weight is **0** this does nothing.
	*/
	open fun accumulate(accuIndex: Float = definedExternally, weight: Float = definedExternally) : dynamic/*null*/


	/**
	* Apply the state of [page:PropertyMixer.buffer buffer] 'accu[i]' to the binding when accus differ.
	*/
	open fun apply(accuIndex: Float = definedExternally) : dynamic/*null*/


	/**
	* Remember the state of the bound property and copy it to both accus.
	*/
	open fun saveOriginalState() : dynamic/*null*/


	/**
	* Apply the state previously taken via 'saveOriginalState' to the binding.
	*/
	open fun restoreOriginalState() : dynamic/*null*/
}