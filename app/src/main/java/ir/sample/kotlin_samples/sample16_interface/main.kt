package ir.sample.kotlin_samples.sample16_interface

interface CustomInterface {
    // This variable is not set and should be set during an override.
    var x : String

    // This function has no body and should be set during an override.
    fun a() : String

    // This function has a body and doesn't need to be overridden.
    fun b() {
        println("Run function b() >> " + a())
    }
}

class Main(override var x : String): CustomInterface {
    // Function a () is override and set here.
    override fun a() : String {
        return ("Run function a() >> Variable x is : $x")
    }
}

fun main(args : Array<String>) {

    // Defined by CustomInterface
    var customInterface : CustomInterface = Main("test_x_customInterface")
    println(customInterface.x)
    println(customInterface.a())
    customInterface.b()

    // Defined by the class Main
    var main = Main("test_x_main")
    println(main.x)
    println(main.a())
    main.b()

}