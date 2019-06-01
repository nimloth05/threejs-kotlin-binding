package ch.viseon.threejs.extensions

import ch.viseon.threejs.declarations.loaders.CubeTextureLoader
import ch.viseon.threejs.declarations.loaders.FileLoader
import ch.viseon.threejs.declarations.loaders.TextureLoader
import ch.viseon.threejs.declarations.textures.CubeTexture
import ch.viseon.threejs.declarations.textures.Texture
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

suspend fun TextureLoader.coroutineLoad(path: String): Texture = suspendCoroutine { continuation ->
    load(path,
        onLoad = { texture: dynamic ->
            continuation.resume(texture)
        },
        onError = {
            continuation.resumeWithException(LoadException("could not load file: '$path'"))
        })
}

suspend fun CubeTextureLoader.coroutineLoad(urls: Array<String>): CubeTexture = suspendCoroutine { conitunuation ->
    load(urls.asDynamic(),
        onLoad = { result: dynamic ->
            conitunuation.resume(result)
        },
        onError = {
            conitunuation.resumeWithException(LoadException("could not load cube texture: $path"))
        })
}

suspend fun FileLoader.coroutineLoad(path: String): String = suspendCoroutine { continuation ->
    load(path,
        onLoad = { data: String ->
            continuation.resume(data)
        },
        onError = {
            continuation.resumeWithException(LoadException("could not load file: '$path'."))
        })
}

class LoadException(message: String) : RuntimeException(message)

