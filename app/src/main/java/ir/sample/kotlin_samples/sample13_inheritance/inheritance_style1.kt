package ir.sample.kotlin_samples.sample13_inheritance

//In Kotlin By Default Any OpenClass isn't Final And Can Have Children.
open class Person(val name: String, var age: Int) {
    init {
        println("Constructor Class Person")
    }

    fun sayHello() = println("Hi")
}


//1- In Kotlin By Default Any Class is Final And Can't Have Children.
//2- Constructor Of Children Must Contains Constructor Of Parent
class Student(name: String, age: Int, id: Int) : Person(name, age) {

    init {
        println("Constructor Class Student")
    }
}

fun main(args: Array<String>) {
    val person = Person("ali", 34)
    person.sayHello()
    val student = Student("Rolph", 35, 2)
}