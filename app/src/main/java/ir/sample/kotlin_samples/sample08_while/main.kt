package ir.sample.kotlin_samples.sample08_while

fun main(args: Array<String>) {

    var x = 1
    var y = 10
    var z = false

//    while (x <= 10) {
//        Thread.sleep(1000);
//        println(x)
//        x++;
//    }


//    while (y >= x) {
//    Thread.sleep(1000);
//        println(y)
//        y--
//    }


//    Sample : Different Between do-while And while ;
    while (z.equals(true)) println("Result Of while lopp: $z")

    do println("Result Of do-while loop: $z") while (z.equals(true))

}