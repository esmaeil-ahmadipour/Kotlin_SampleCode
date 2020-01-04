package ir.sample.kotlin_samples.sample25_lambda

fun main(args : Array<String>) {
    //it keyword : return value with valueType of variable "a";
    val a:(Int) -> Unit = { println("value: $it")
    println("Add 10 to value : ${it+10}")
    }
    a(50)


    val b =arrayOf(1,2,3,4,5,6,7,8,9).forEach { println(it) }
}