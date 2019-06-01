@file:JsModule("three")
package ch.viseon.threejs.declarations.math.interpolants

	/**
	* 
	*/
open external class QuaternionLinearInterpolant(): ch.viseon.threejs.declarations.math.Interpolant{

	/**
	* 
	*/
	override var parameterPositions: dynamic 


	/**
	* 
	*/
	override var resultBuffer: dynamic 


	/**
	* 
	*/
	override var sampleValues: dynamic 


	/**
	* 
	*/
	override var settings: dynamic 


	/**
	* 
	*/
	override var valueSize: dynamic 


	/**
	* Evaluate the interpolant at position **t**.
	*/
	override fun evaluate(t: Double) : dynamic
}