package ir.sample.kotlin_samples.sample07_for_Loop

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
    //        val namesList = listOf("Amir","John","Sam","Mick","Dan")
    //        for((index , value) in namesList.withIndex()) println("Element Index: $index , Value Is: $value")


    //Inner Loop Canceling ( Just when i=2 )
    for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 1) {
                break
            }
            println("Sample 1 : i=$i and j=$j")
        }
        println("Sample 1 : i=$i")
    }


    //Outer Loop Canceling ( by Naming outer (for loop))
    outerLoop@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 1) {
                break@outerLoop
            }
            println("Sample 2 : i=$i and j=$j")
        }
        println("Sample 2 : i=$i")
    }
}