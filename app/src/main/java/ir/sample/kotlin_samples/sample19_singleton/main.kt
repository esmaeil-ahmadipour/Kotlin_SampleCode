package ir.sample.kotlin_samples.sample19_singleton

object Test {
    init {
        print("Constructor Test is Running: ")
        println(Test)
    }
    fun Method() {
        println("Method() From Class Test is Running")
    }
}

fun main(args : Array<String>) {
    //In This Sample 1st Run Constructor.because We Have One Object From Class Test;
    Test.Method()
    Test.Method()
    Test.Method()
    Test.Method()
    Test.Method()
    Test.Method()
}