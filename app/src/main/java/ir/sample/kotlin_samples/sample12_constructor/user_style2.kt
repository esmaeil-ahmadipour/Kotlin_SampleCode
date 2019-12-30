package ir.sample.kotlin_samples.sample12_constructor

/*
*Input values for Constructor is here (After Name Of Class) And -
*- Define Variables name and age .set ConstructorInputValues to Variables .
*/
class UserStyle2 (var name:String,val age:Int) {

    fun returnName():String=name
    fun returnAge():Int=age
}

fun main(args: Array<String>) {
    val user= UserStyle2("Sam", 20)

    //You can do it . because name variableType is Mutable
    user.name="Brad"

    //You can't do it . because name variableType is ImMutable
    //user.age=52

    //Use Function for Receive Values
    println("User: "+user.returnName()+" , Age: "+user.returnAge())

}