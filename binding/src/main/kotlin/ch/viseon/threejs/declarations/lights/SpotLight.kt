//Generated date 23.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.lights

	/**
	* This light gets emitted from a single point in one direction, along a cone that increases in size the further from the light it gets. This light can cast shadows - see the [page:SpotLightShadow] page for details.
	*/
open external class SpotLight(color: Int = definedExternally, intensity: Double = definedExternally, distance: Double = definedExternally, angle: Double = definedExternally, penumbra: Double = definedExternally, decay: Double = definedExternally): ch.viseon.threejs.declarations.lights.Light{

	/**
	* Maximum extent of the spotlight, in radians, from its direction. Should be no more than **Math.PI/2**. The default is **Math.PI/3**.
	*/
	open var angle: Double  = definedExternally


	/**
	* If set to **true** light will cast dynamic shadows. **Warning**: This is expensive and requires tweaking to get shadows looking right. See the [page:SpotLightShadow] for details. The default is **false**.
	*/
	override var castShadow: Boolean 


	/**
	* The amount the light dims along the distance of the light. In [page:WebGLRenderer.physicallyCorrectLights physically correct] mode, decay = 2 leads to physically realistic light falloff. The default is **1**.
	*/
	open var decay: Double  = definedExternally


	/**
	* Default mode — When distance is zero, light does not attenuate. When distance is non-zero, light will attenuate linearly from maximum intensity at the light's position down to zero at this distance from the light.
[page:WebGLRenderer.physicallyCorrectLights Physically correct] mode — When distance is zero, light will attenuate according to inverse-square law to infinite distance. When distance is non-zero, light will attenuate according to inverse-square law until near the distance cutoff, where it will then attenuate quickly and smoothly to 0. Inherently, cutoffs are not physically correct.
Default is **0.0**.
	*/
	open var distance: Double  = definedExternally


	/**
	* Used to check whether this or derived classes are spot lights. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isSpotLight: Boolean  = definedExternally


	/**
	* Percent of the spotlight cone that is attenuated due to penumbra. Takes values between zero and 1. The default is **0.0**.
	*/
	open var penumbra: Double  = definedExternally


	/**
	* This is set equal to [page:Object3D.DefaultUp] (0, 1, 0), so that the light shines from the top down.
	*/
	override var position: ch.viseon.threejs.declarations.math.Vector3 


	/**
	* The light's power. In [page:WebGLRenderer.physicallyCorrectLights physically correct] mode, the luminous power of the light measured in lumens. Default is **4Math.PI**. This is directly related to the [page:.intensity intensity] in the ratio power = intensity ** π and changing this will also change the intensity.
	*/
	open var power: Double  = definedExternally


	/**
	* A [page:SpotLightShadow] used to calculate shadows for this light.
	*/
	open var shadow: ch.viseon.threejs.declarations.lights.shadows.SpotLightShadow  = definedExternally


	/**
	* The Spotlight points from its [page:.position position] to target.position. The default position of the target is **(0, 0, 0)**. **Note**: For the target's position to be changed to anything other than the default, it must be added to the [page:Scene scene] using scene.add( light.target ); This is so that the target's [page:Object3D.matrixWorld matrixWorld] gets automatically updated each frame. It is also possible to set the target to be another object in the scene (anything with a [page:Object3D.position position] property), like so: var targetObject = new THREE.Object3D(); scene.add(targetObject); light.target = targetObject; The spotlight will now track the target object.
	*/
	open var target: ch.viseon.threejs.declarations.core.Object3D  = definedExternally


	/**
	* Copies value of all the properties from the [page:SpotLight source] to this SpotLight.
	*/
	open fun copy(source: ch.viseon.threejs.declarations.lights.SpotLight = definedExternally) : ch.viseon.threejs.declarations.lights.SpotLight
}