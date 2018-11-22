//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* A light that gets emitted in a specific direction. This light will behave as though it is infinitely far away and the rays produced from it are all parallel. The common use case for this is to simulate daylight; the sun is far enough away that its position can be considered to be infinite, and all light rays coming from it are parallel. This light can cast shadows - see the [page:DirectionalLightShadow] page for details.
	*/
open external class DirectionalLight(color: Int = definedExternally, intensity: Float = definedExternally): ch.viseon.threejs.declarations.lights.Light{

	/**
	* If set to **true** light will cast dynamic shadows. **Warning**: This is expensive and requires tweaking to get shadows looking right. See the [page:DirectionalLightShadow] for details. The default is **false**.
	*/
	override var castShadow: Boolean 


	/**
	* Used to check whether this or derived classes are directional lights. Default is **true**. You should not change this, as it is used internally for optimisation.
	*/
	open var isDirectionalLight: Boolean  = definedExternally


	/**
	* This is set equal to [page:Object3D.DefaultUp] (0, 1, 0), so that the light shines from the top down.
	*/
	override var position: ch.viseon.threejs.declarations.math.Vector3 


	/**
	* A [page:DirectionalLightShadow] used to calculate shadows for this light.
	*/
	open var shadow: ch.viseon.threejs.declarations.lights.shadows.DirectionalLightShadow  = definedExternally


	/**
	* The DirectionalLight points from its [page:.position position] to target.position. The default position of the target is **(0, 0, 0)**. **Note**: For the target's position to be changed to anything other than the default, it must be added to the [page:Scene scene] using
	*/
	open var target: ch.viseon.threejs.declarations.core.Object3D  = definedExternally


	/**
	* Copies value of all the properties from the [page:DirectionalLight source] to this DirectionalLight.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.lights.DirectionalLight = definedExternally) : ch.viseon.threejs.declarations.lights.DirectionalLight
}