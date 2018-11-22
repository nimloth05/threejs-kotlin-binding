package ch.viseon.threejs.parser


fun main(args: Array<String>) {
    val result = ClassList.compile(FileToken::class.java.getResource("/test.json"), "test")

//    generateKotlinFile("AnimationObjectGroup", "api/en/animation/AnimationObjectGroup", "animation")
//    generateKotlinFile("KeyframeTrack", "api/en/animation/KeyframeTrack", "animation")

//    val entry = result.class2PackageName["BufferGeometry"]!!
//    generateKotlinFile(entry, result, classDeclarations,)
}