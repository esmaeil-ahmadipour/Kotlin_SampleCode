package ir.sample.kotlin_samples.sample24_const

/*
 * Const variable Type is:  Primitive Or String
 * We Can Declare In Companion Object Or Object.
 * We Can't Passing To ObjectOfClass Or Functions & Methods.
 * We Can't Declare In Class Body.
 * We Can't Declare with var , because We Can't Change ConstValue.
 */


class A {
    fun a() : String = "test_value"

    companion object {
        const val aa : Int = 777
    }
}

object B {
    const val b = "TEST_VALUE"
}

fun main(args : Array<String>) {
    println(B.b)
    println(A.aa)

}