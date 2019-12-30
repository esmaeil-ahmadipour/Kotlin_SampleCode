package ir.sample.kotlin_samples.sample12_constructor

//Input values for Constructor is here (After Name Of Class)
class UserStyle1 (name:String,age:Int) {


    var name:String
    val age:Int

    // init is KEYWORD for set Constructor
    init {
        this.age=age
        this.name=name
    }

}

fun main(args: Array<String>) {

    val user= UserStyle1("Sam", 20)

    //You can do it . because name variableType is Mutable
    user.name="Brad"

    //You can't do it . because name variableType is ImMutable
    //user.age=52

    println("User: "+user.name+" , Age: "+user.age)

}