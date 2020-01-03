package ir.sample.kotlin_samples.sample25_lambda

fun main(args : Array<String>) {
    Runnable { println("Method Run() executed !") }.run()
}