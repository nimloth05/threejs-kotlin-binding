import ch.viseon.threejs.declarations.cameras.PerspectiveCamera
import ch.viseon.threejs.declarations.geometries.BoxBufferGeometry
import ch.viseon.threejs.declarations.loaders.TextureLoader
import ch.viseon.threejs.declarations.materials.MeshBasicMaterial
import ch.viseon.threejs.declarations.objects.Mesh
import ch.viseon.threejs.declarations.renderers.WebGLRenderer
import ch.viseon.threejs.declarations.scenes.Scene
import org.w3c.dom.events.Event
import kotlin.browser.document
import kotlin.browser.window

//external fun require(module: String): dynamic

fun main(args: Array<String>) {
//  require("three")

  window.onload = {
    CubeExample.init()
    CubeExample.animate()
  }
}

object CubeExample {

  lateinit var camera: PerspectiveCamera
  lateinit var scene: Scene
  lateinit var renderer: WebGLRenderer
  lateinit var mesh: Mesh

  fun init() {
    camera = PerspectiveCamera(70.0, (window.innerWidth / window.innerHeight).toDouble(), 1.0, 1000.0)
    camera.position.z = 400.0
    scene = Scene()
    val texture = TextureLoader().load("textures/crate.gif")
    val geometry = BoxBufferGeometry(200.0, 200.0, 200.0)
    val material = MeshBasicMaterial(object { val map = texture })
    mesh = Mesh(geometry.asDynamic(), material)
    scene.add(mesh)
    renderer = WebGLRenderer(object { val antialias = true} )
    renderer.setPixelRatio(window.devicePixelRatio)
    renderer.setSize(window.innerWidth, window.innerHeight)

    document.body?.appendChild(renderer.domElement)

    window.addEventListener("resize", { onWindowResize(it)}, false)
  }

  fun onWindowResize(event: Event) {
    camera.aspect = (window.innerWidth / window.innerHeight).toDouble()
    camera.updateProjectionMatrix()
    renderer.setSize(window.innerWidth, window.innerHeight)
  }

  fun animate() {
    window.requestAnimationFrame {
      animate()
    }
    mesh.rotation.x += 0.005f
    mesh.rotation.y += 0.01f
    renderer.render(scene, camera)
  }
}