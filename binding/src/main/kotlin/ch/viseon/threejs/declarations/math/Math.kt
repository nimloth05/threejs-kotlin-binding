//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* An object with several math utility functions.
	*/
open external class Math(){

	/**
	* [page:Float value] — Value to be clamped. [page:Float min] — Minimum value. [page:Float max] — Maximum value. Clamps the [page:Float value] to be between [page:Float min] and [page:Float max].
	*/
	open fun clamp(value: Double = definedExternally, min: Double = definedExternally, max: Double = definedExternally) : Double


	/**
	* Converts degrees to radians.
	*/
	open fun degToRad(degrees: Double = definedExternally) : Double


	/**
	* [page:Integer n], [page:Integer m] - Integers Computes the Euclidean modulo of [page:Integer m] % [page:Integer n], that is: ( ( n % m ) + m ) % m
	*/
	open fun euclideanModulo(n: Int = definedExternally, m: Int = definedExternally) : Int


	/**
	* Generate a [link:https://en.wikipedia.org/wiki/Universally_unique_identifier UUID] (universally unique identifier).
	*/
	open fun generateUUID() : dynamic


	/**
	* Return **true** if [page:Number n] is a power of 2.
	*/
	open fun isPowerOfTwo(n: Double = definedExternally) : Boolean


	/**
	* [page:Float x] - Start point. [page:Float y] - End point. [page:Float t] - interpolation factor in the closed interval [0, 1]. Returns a value [link:https://en.wikipedia.org/wiki/Linear_interpolation linearly interpolated] from two known points based on the given interval - [page:Float t] = 0 will return [page:Float x] and [page:Float t] = 1 will return [page:Float y].
	*/
	open fun lerp(x: Double = definedExternally, y: Double = definedExternally, t: Double = definedExternally) : Double


	/**
	* [page:Float x] — Value to be mapped. [page:Float a1] — Minimum value for range A. [page:Float a2] — Maximum value for range A. [page:Float b1] — Minimum value for range B. [page:Float b2] — Maximum value for range B. Linear mapping of [page:Float x] from range [[page:Float a1], [page:Float a2]] to range [[page:Float b1], [page:Float b2]].
	*/
	open fun mapLinear(x: Double = definedExternally, a1: Double = definedExternally, a2: Double = definedExternally, b1: Double = definedExternally, b2: Double = definedExternally) : Double


	/**
	* Returns the smallest power of 2 that is greater than or equal to [page:Number n].
	*/
	open fun ceilPowerOfTwo(n: Double = definedExternally) : Int


	/**
	* Returns the largest power of 2 that is less than or equal to [page:Number n].
	*/
	open fun floorPowerOfTwo(n: Double = definedExternally) : Int


	/**
	* Converts radians to degrees.
	*/
	open fun radToDeg(radians: Double = definedExternally) : Double


	/**
	* Random float in the interval [page:Float low] to [page:Float high].
	*/
	open fun randFloat(low: Double = definedExternally, high: Double = definedExternally) : Double


	/**
	* Random float in the interval **- [page:Float range] / 2** to **[page:Float range] / 2**.
	*/
	open fun randFloatSpread(range: Double = definedExternally) : Double


	/**
	* Random integer in the interval [page:Float low] to [page:Float high].
	*/
	open fun randInt(low: Int = definedExternally, high: Int = definedExternally) : Int


	/**
	* [page:Float x] - The value to evaluate based on its position between min and max. [page:Float min] - Any x value below min will be 0. [page:Float max] - Any x value above max will be 1. Returns a value between 0-1 that represents the percentage that x has moved between min and max, but smoothed or slowed down the closer X is to the min and max. See [link:http://en.wikipedia.org/wiki/Smoothstep Smoothstep] for details.
	*/
	open fun smoothstep(x: Double = definedExternally, min: Double = definedExternally, max: Double = definedExternally) : Double


	/**
	* [page:Float x] - The value to evaluate based on its position between min and max. [page:Float min] - Any x value below min will be 0. [page:Float max] - Any x value above max will be 1. Returns a value between 0-1. A [link:https://en.wikipedia.org/wiki/Smoothstep#Variations variation on smoothstep] that has zero 1st and 2nd order derivatives at x=0 and x=1.
	*/
	open fun smootherstep(x: Double = definedExternally, min: Double = definedExternally, max: Double = definedExternally) : Double
}