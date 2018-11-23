package ch.viseon.threejs.parser

/**
 * This class is for correcting doc misstakes. For example a base class has a matrix: Matrix4 property which a base clas defines as matrix: object
 */
object DocCorrections {

    val types = mapOf(
        "CameraHelper.matrix" to "Matrix4",
        "CameraHelper.matrixAutoUpdate" to "Boolean",
        "DirectionalLightHelper.matrix" to "Matrix4",
        "DirectionalLightHelper.matrixAutoUpdate" to "Boolean",
        "FaceNormalsHelper.matrixAutoUpdate" to "Boolean",
        "HemisphereLightHelper.matrix" to "Matrix4",
        "HemisphereLightHelper.matrixAutoUpdate" to "Boolean",
        "HemisphereLight.color" to "Color",
        "PointLightHelper.matrix" to "Matrix4",
        "PointLightHelper.matrixAutoUpdate" to "Boolean",
        "SpotLightHelper.matrix" to "Matrix4",
        "SpotLightHelper.matrixAutoUpdate" to "Boolean",
        "VertexNormalsHelper.matrixAutoUpdate" to "Boolean",
        "ShaderMaterial.vertexColors" to "Int"
    )

    private val names = mapOf(
        "BooleanKeyframeTrack.ValueBufferType" to "_bufferData",
        "StringKeyframeTrack.ValueBufferType" to "_bufferData"
    )

    fun correctMemberName(className: String, name: String): String {
        val result = names.getOrDefault("$className.$name", name)
        return if (result.startsWith(".")) {
            result.substring(1)
        } else {
            result
        }
    }

}