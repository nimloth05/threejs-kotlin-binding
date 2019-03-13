package ch.viseon.threejs.declarations

import ch.viseon.threejs.declarations.core.Face3
import ch.viseon.threejs.declarations.core.Object3D
import ch.viseon.threejs.declarations.math.Vector2
import ch.viseon.threejs.declarations.math.Vector3

//This file is maintained by hand
external interface Intersection {
    var distance: Number
    var distanceToRay: Number? get() = definedExternally; set(value) = definedExternally
    var point: Vector3
    var index: Number? get() = definedExternally; set(value) = definedExternally
    var face: Face3? get() = definedExternally; set(value) = definedExternally
    var faceIndex: Number? get() = definedExternally; set(value) = definedExternally
    var `object`: Object3D
    var uv: Vector2? get() = definedExternally; set(value) = definedExternally
}
