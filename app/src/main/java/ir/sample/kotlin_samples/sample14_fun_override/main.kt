package ir.sample.kotlin_samples.sample14_fun_override

open class GrandPa() {
    //open classes Can be implemented for Children by use "override" KEYWORD.
    open fun  drivingStyle() {
        print("GrandPa say : I'm Slow Car Driving ..")
    }
    open fun favoriteSpeed(){
        println("Favorite Speed:70 k/h")
    }

}
open class Father() : GrandPa() {
    override fun drivingStyle() {
        print("Father say : I'm Careful Car Driving ..")
    }
//Because of using the "final" KEYWORD, This Function isn't overrideable for the child, But It Inherits ;
    override final fun favoriteSpeed() {
        println("Favorite Speed:90 k/h")
    }
}

class Child() : Father() {
    override fun drivingStyle() {
        print("Child say : I'm Bad Car Driving ..")
    }

}

fun main(args: Array<String>) {

    val child = Child()
    val father = Father()
    val grandPa = GrandPa()

    grandPa.drivingStyle()
    grandPa.favoriteSpeed()

    father.drivingStyle()
    father.favoriteSpeed()

    child.drivingStyle()
    child.favoriteSpeed()
}
