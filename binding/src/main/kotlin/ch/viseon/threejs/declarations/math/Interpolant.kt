//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* Abstract base class of interpolants over parametric samples. The parameter domain is one dimensional, typically the time or a path along a curve defined by the data. The sample values can have any dimensionality and derived classes may apply special interpretations to the data. This class provides the interval seek in a Template Method, deferring the actual interpolation to derived classes. Time complexity is **O(1)** for linear access crossing at most two points and **O(log N)** for random access, where **N** is the number of positions. References: [link:http://www.oodesign.com/template-method-pattern.html http://www.oodesign.com/template-method-pattern.html]
	*/
open external class Interpolant(){

	/**
	* 
	*/
	open var parameterPositions: dynamic/*null*/  = definedExternally


	/**
	* 
	*/
	open var resultBuffer: dynamic/*null*/  = definedExternally


	/**
	* 
	*/
	open var sampleValues: dynamic/*null*/  = definedExternally


	/**
	* Optional, subclass-specific settings structure.
	*/
	open var settings: dynamic/*Object*/  = definedExternally


	/**
	* 
	*/
	open var valueSize: dynamic/*null*/  = definedExternally


	/**
	* Evaluate the interpolant at position **t**.
	*/
	open fun evaluate(t: Float = definedExternally) : dynamic/*null*/
}