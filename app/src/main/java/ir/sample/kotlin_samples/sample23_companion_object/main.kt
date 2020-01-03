package ir.sample.kotlin_samples.sample23_companion_object

/* Note :
 * We Use It For Static Variables Like Of Java
 * Give One JVM Object From Class Benz.
 * And All Variables in CompanionObject Only For This JVM Object.
 * Access Modified Just with Class Benz.
 * Objects Of Benz don't Access to this JVM object.
 * */

class Benz {
    companion object {
        val MAX_SPEED = 250
    }
}

fun main(args : Array<String>) {

var benz = Benz()

//    We don't Access to MAX_SPEED On Object Of Class Benz
//    benz.MAX_SPEED


// We Access to MAX_SPEED On Benz !
    Benz.MAX_SPEED
    println(Benz.MAX_SPEED)
}