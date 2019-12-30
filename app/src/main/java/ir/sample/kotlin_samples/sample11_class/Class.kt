package ir.sample.kotlin_samples.sample11_class

class User {
    var name:String="John"
    var age:Int=20

    fun sayHello(name:String){
        println("hi $name")
    }
}

fun main(args:Array<String>) {

    //Create Object
    var user=User()

    //Access to Properties  by Object
    println("Original: "+user.name)
    println("Original: "+user.age)

    //Update Values Of Properties
    user.name="Sam"
    user.age=30
    println("Updated: "+user.name)
    println("Updated: "+user.age)

    //Call Method
    user.sayHello(user.name)
}