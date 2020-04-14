package ch.viseon.threejs.parser

/**
 * This class is for correcting doc mistakes. For example a base class has a matrix: Matrix4 property which a base class defines as matrix: object
 *
 *
 * - Additional declarations, where threejs returns an Object, can be placed inside AdditionalDeclarations.kt. Add a type mapping to
 * fullMember2Type hashmap
 * - fullMember2Type hashmap can be used to map members of a class (properties or methods) to another type (return values or property declarations)
 * - docType2KotlinType can be used to generally map specific types to antoher type.
 */
object DocCorrections {

    private val names = mapOf(
        "BooleanKeyframeTrack.ValueBufferType" to "_bufferData",
        "StringKeyframeTrack.ValueBufferType" to "_bufferData"
    )

    private const val DYNAMIC = "dynamic"
    private const val DYNAMIC_ARRAY = "Array<dynamic>"
    private const val FLOAT_TYPE = "Double"

    val docType2KotlinType = mapOf(
        "object" to DYNAMIC,
        "Object" to DYNAMIC,
        "Constant" to "Int",
        "Float32Array" to "org.khronos.webgl.Float32Array",
        "Float64Array" to "org.khronos.webgl.Float64Array",
        "Int8Array" to "org.khronos.webgl.Int8Array",
        "Int16Array" to "org.khronos.webgl.Int16Array",
        "Int32Array" to "org.khronos.webgl.Int32Array",
        "Uint8Array" to "org.khronos.webgl.Uint8Array",
        "Uint16Array" to "org.khronos.webgl.Uint16Array",
        "Uint32Array" to "org.khronos.webgl.Uint32Array",
        "Uint8ClampedArray" to "org.khronos.webgl.Uint8ClampedArray",
        "Array" to DYNAMIC_ARRAY,
        "array" to DYNAMIC_ARRAY,
        "TypedArray" to DYNAMIC_ARRAY,
        "GainNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
        "AudioNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
        "AnalyserNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
        "AudioContext" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
        "PannerNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
        "BiquadFilterNode" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
        "UUID" to DYNAMIC, //FIXME: Add to Kotlin-js-stdlib
        "Integer" to "Int",
        "integer" to "Int",
        "float" to FLOAT_TYPE,
        "Float" to FLOAT_TYPE,
        "number" to FLOAT_TYPE,
        "Number" to FLOAT_TYPE,
        "Radians" to FLOAT_TYPE,
        "Hex" to "Int",
        "hex" to "Int",
        "Vector" to DYNAMIC, //FIXME Most likely vector2
        "Image" to DYNAMIC,
        "Color_Hex_or_String" to DYNAMIC,
        "boolean" to "Boolean",
        "Video" to "dynamic",
        "WebGLShadowMap" to DYNAMIC,
        "WebGLRenderLists" to DYNAMIC,
        "WebGLRenderingContext" to "org.khronos.webgl.WebGLRenderingContext",
        "WebGLProgram" to " org.khronos.webgl.WebGLProgram",
        "RenderTarget" to DYNAMIC,
        "WebGLContextAttributes" to "org.khronos.webgl.WebGLContextAttributes",
        "WebGLFramebuffer" to "org.khronos.webgl.WebGLFramebuffer",
        "DOMElement" to "org.w3c.dom.Element",
        "HTMLElement" to "org.w3c.dom.HTMLElement",
        "Function" to DYNAMIC,
        "function" to DYNAMIC,
        "null" to DYNAMIC,
        "string" to "String",
        "Blending" to "Int",
        "shaderprogram" to DYNAMIC,  //FIXME Could this be WebGlProgram?
        "void" to "Unit",  //FIXME Could this be WebGlProgram?
        "Constructor" to DYNAMIC,
        //Typos
        "material" to "Material",
        "AudioConetxt" to DYNAMIC,
        "Quaterion" to "Quaternion",
        "TextureCube" to "CubeTexture",
        "XMLHttpRequest" to "org.w3c.xhr.XMLHttpRequest",
        "HTMLImageElement" to "org.w3c.dom.HTMLImageElement",
        "ImageBitmap" to "org.w3c.dom.ImageBitmap",
        "HTMLCanvasElement" to "org.w3c.dom.HTMLCanvasElement",
        "Shader" to "ch.viseon.threejs.declarations.Shader",
        "Usage" to "Int"
    )

    /**
     * The names in this list must be the corrected one, not the original from the doc
     */
    val fullMemberName2Type = mapOf(
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
//        "ShaderMaterial.vertexColors" to "Int",
        "Object3D.children" to "Array<Object3D>",
        "Texture.wrapS" to "Int",
        "Texture.wrapT" to "Int",
        "Texture.mapping" to "Int",
        "Texture.magFilter" to "Int",
        "Texture.minFilter" to "Int",
        "Texture.format" to "Int",
        "Texture.encoding" to "Int",
        "Raycaster.intersectObject" to "Array<ch.viseon.threejs.declarations.Intersection>",
        "Raycaster.intersectObjects" to "Array<ch.viseon.threejs.declarations.Intersection>"
    )

    val declarationsAcceptingNullValues = hashSetOf(
        "MeshPhongMaterial.map",
        "MeshPhongMaterial.lightMap",
        "MeshPhongMaterial.emissiveMap",
        "MeshPhongMaterial.displacementMap",
        "MeshStandardMaterial.map",
        "MeshStandardMaterial.lightMap",
        "MeshStandardMaterial.emissiveMap",
        "MeshStandardMaterial.displacementMap",
        "Object3D.parent"
    )

    val constructorDeclarationCorrections = mapOf(
        "Texture" to listOf(
            ParamDeclaration("image", "dynamic", false),
            ParamDeclaration("mapping", "Int", false),
            ParamDeclaration("wrapS", "Int", false),
            ParamDeclaration("wrapT", "Int", false),
            ParamDeclaration("magFilter", "Int", false),
            ParamDeclaration("minFilter", "Int", false),
            ParamDeclaration("format", "Int", false),
            ParamDeclaration("anisotropy", "Double", false),
            ParamDeclaration("encoding", "Int", false)
        )
    )

    private val classesWithAdditionalConstructors = mapOf(
        "Mesh" to listOf(
            ConstructorDeclaration(
                listOf(
                    ParamDeclaration("geometry", "BufferGeometry", true),
                    ParamDeclaration("material", "Material", false)
                )
            )
        ),
        "LineSegments" to listOf(
            ConstructorDeclaration(
                listOf(
                    ParamDeclaration("geometry", "BufferGeometry", true),
                    ParamDeclaration("material", "Material", false)
                )
            )
        )
    )


    fun correctMemberName(className: String, name: String): String {
        val result = names.getOrDefault("$className.$name", name)
        return if (result.startsWith(".")) {
            result.substring(1)
        } else {
            result
        }
    }

    fun getOverloadedConstructors(className: String): List<ConstructorDeclaration> {
        println("accessing: $className")
        return classesWithAdditionalConstructors.getOrDefault(className, listOf())
    }

}
