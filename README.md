# threejs-kotlin-binding
This project provides an update to date binding of three.js. This binding was generated out of the threejs doc.

# threejs-kotlin-parser
A Parser which parses threeJs doc to generate Kotlin bindings

Kotlin as a typesafe langauge needs bindings to a specific library. At the time of writing, only outdated bindings could be found.
Sadly threeJs does not provide an up to date typescript declaration, so I decided to parse the API doc which yielded very good results.

The process works as follows:

- It downloads a JSON description from the threeJs doc page, which contains all existing API reference links
- Parse every API doc and generate an abstract declaration object
- For each declaration object, a Kotlin file is generated

This is an initial commit, tailed to my needs. Based on this parser, I will upload a complete binding to maven central soon. 

In the meantime

- checkout project
- change package prefix in `main.kt`
- execute `main.kt`
