//Generated date 13.03.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* Object for keeping track of time. This uses performance.now() if it is available, otherwise it reverts to the less accurate Date.now().
	*/
open external class Clock(autoStart: Boolean = definedExternally){

	/**
	* If set, starts the clock automatically when the first update is called. Default is true.
	*/
	open var autoStart: Boolean  = definedExternally


	/**
	* Holds the time at which the clock's [page:Clock.start start] method was last called.
	*/
	open var startTime: Double  = definedExternally


	/**
	* Holds the time at which the clock's [page:Clock.start start], [page:Clock.getElapsedTime getElapsedTime] or [page:Clock.getDelta getDelta] methods were last called.
	*/
	open var oldTime: Double  = definedExternally


	/**
	* Keeps track of the total time that the clock has been running.
	*/
	open var elapsedTime: Double  = definedExternally


	/**
	* Whether the clock is running or not.
	*/
	open var running: Boolean  = definedExternally


	/**
	* Starts clock. Also sets the [page:Clock.startTime startTime] and [page:Clock.oldTime oldTime] to the current time, sets [page:Clock.elapsedTime elapsedTime] to **0** and [page:Clock.running running] to **true**.
	*/
	open fun start() : dynamic


	/**
	* Stops clock and sets [page:Clock.oldTime oldTime] to the current time.
	*/
	open fun stop() : dynamic


	/**
	* Get the seconds passed since the clock started and sets [page:Clock.oldTime oldTime] to the current time. If [page:Clock.autoStart autoStart] is **true** and the clock is not running, also starts the clock.
	*/
	open fun getElapsedTime() : Double


	/**
	* Get the seconds passed since the time [page:Clock.oldTime oldTime] was set and sets [page:Clock.oldTime oldTime] to the current time. If [page:Clock.autoStart autoStart] is **true** and the clock is not running, also starts the clock.
	*/
	open fun getDelta() : Double
}