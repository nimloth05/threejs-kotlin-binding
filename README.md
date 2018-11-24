# threejs-kotlin-binding
This project provides an update to date binding of three.js. This binding was generated out of the threejs doc.

This projects consists of the actual binding and parser, which generates the binding from the three.js doc.

Please report any bug or type problem you encounter.

## Maven dependency

The binding is available at the maven central repository.

Gradle:

    dependencies {
        compile "ch.viseon.threejs:binding:98.0.2"
    }
    
# threejs-kotlin-parser
A Parser which parses threeJs doc to generate Kotlin bindings

The process works as follows:

- It downloads a JSON description from the threeJs doc page, which contains all existing API reference links
- Parse every API doc and generate an abstract declaration object
- For each declaration object, a Kotlin file is generated

