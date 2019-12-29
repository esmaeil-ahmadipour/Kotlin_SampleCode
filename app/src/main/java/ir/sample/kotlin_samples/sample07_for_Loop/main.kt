package ir.sample.kotlin_samples.sample07_for_Loop

import ir.sample.kotlin_samples.sample04_arrayListOf.arrayList

fun main(args: Array<String>) {

    //Sample:Count 1 to 10 and print Counter;
    //    for(i in 1 .. 10)

    
    //Sample:Count 10 to 1 and print Counter;
    //    for(i in 10 downTo 1)


    //Sample:Count 1 to 11 with step 5 and print Counter;
    //    for(i in 1 .. 11 step 5)


    //Sample:Count 1 to 9 and print Counter;
    //    for(i in 1 until 10 )


    //Sample: Factorial 5 ;
    //    var f = 1
    //    for (i in 2..5) {
    //     f=f*i
    //        println(f)
    //    }


    //Sample: Tracking ListItems ;
    //    val namesList = listOf("Amir","John","Sam","Mick","Dan")
    //    for(name in namesList) println(name)


    //Sample: Tracking ListItems with Index,Value Style;
        val namesList = listOf("Amir","John","Sam","Mick","Dan")
        for((index , value) in namesList.withIndex()) println("Element Index: $index , Value Is: $value")

}