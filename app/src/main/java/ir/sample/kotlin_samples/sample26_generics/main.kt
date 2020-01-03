package ir.sample.kotlin_samples.sample26_generics

fun main(args : Array<String>) {
    val test1 = Test<String>(10.toString())
    val test2 = Test<Int>("10".toInt())


    val test3 = TestDoubleValue<String , String>(10.toString() , 10.toString())
    val test4 = TestDoubleValue<Int , String>("10".toInt() , 10.toString())

    //MultiInputParameters Due To vararg!
    test2.g<Int>(10 , 20 ,30 ,40 ,50 ,60)

}