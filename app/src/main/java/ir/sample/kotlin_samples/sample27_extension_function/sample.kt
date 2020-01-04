package ir.sample.kotlin_samples.sample27_extension_function

open class a {
    companion object{

    }
}
//Like a Static Method.
fun a.Companion.aa()= println("print!")

fun main(args : Array<String>) {
a.aa()
}