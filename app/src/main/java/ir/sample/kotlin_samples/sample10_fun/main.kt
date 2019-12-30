package ir.sample.kotlin_samples.sample10_fun

import java.util.*

fun main(args: Array<String>) {
    sayHello()
    println(getDate())
    println("Number "+ max(2,9) +" Is Max !")
    println(sayBayBay())
}


fun sayHello(){
    println("Hello World!")
}

//Return value  without KEYWORD return And NoNeed FunctionBody
fun getDate(): Date=Date()

//Return Value & Input Value
fun max(number1: Int, number2: Int) : Int {
if (number1>=number2) return number1 else return number2
}


fun sayBayBay():String{
    return "BayBay!"
}
