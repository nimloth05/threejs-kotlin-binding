# threejs-kotlin-binding
This project provides an update to date binding of three.js. (r101)
This binding was generated out of the threejs doc. This means, that most classes/methods/properties contains documentation.

## setup

The binding is available at the maven central repository.

Reference this library in your build.gradle file:

    dependencies {
        implementation "ch.viseon.threejs:binding:101.0.0"
    }

Threejs needs to be loaded via npm (use kotlinFrontend Plugin)

    kotlinFrontend {
        npm {
            dependency("three", "0.101.0")
        }
    }
    
## Example

Example code for rotating cube:


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
        camera = PerspectiveCamera(70.0, (window.innerWidth / window.innerHeight).toNumber(), 1.0, 1000.0)
        camera.position.z = 400.0
        scene = Scene()
        val texture = TextureLoader().load("textures/crate.gif")
        val geometry = BoxBufferGeometry(200.0, 200.0, 200.0)
        val material = MeshBasicMaterial(MeshBasisMaterialParameter().apply { map = texture })
        mesh = Mesh(geometry.asDynamic(), material)
        scene.add(mesh)
        renderer = WebGLRenderer(WebGlRendererParams(true))
        renderer.setPixelRatio(window.devicePixelRatio)
        renderer.setSize(window.innerWidth, window.innerHeight)

        document.body?.appendChild(renderer.domElement)

        window.addEventListener("resize", ::onWindowResize, false)
      }

      fun onWindowResize(event: Event) {
        camera.aspect = (window.innerWidth / window.innerHeight).toNumber()
        camera.updateProjectionMatrix()
        renderer.setSize(window.innerWidth, window.innerHeight)
      }

      fun animate() {
        window.requestAnimationFrame {
          animate()
        }
        mesh.rotation.x += 0.005f
        mesh.rotation.y += 0.01f
        renderer.render(scene, camera);
      }
    }
    
The complete example is in the `example` project.

# Future
Next thing I'd like to implement is coroutine based loading of assets. Threejs uses a callback based mechanism.
 This would be a separate project.

    
## threejs-kotlin-parser (details)
A Parser which parses threeJs doc to generate Kotlin bindings

The process works as follows:

- It downloads a JSON description from the threeJs doc page, which contains all existing API reference links
- Parse every API doc and generate an abstract declaration object
- For each declaration object, a Kotlin file is generated

