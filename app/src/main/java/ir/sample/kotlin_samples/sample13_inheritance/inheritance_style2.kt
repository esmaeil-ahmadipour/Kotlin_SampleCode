package ir.sample.kotlin_samples.sample13_inheritance


//In Kotlin By Default Any OpenClass isn't Final  And Can Have Children .
open class Persons(val name: String, var age: Int=50) {
    fun sayHello() = println("Hi")
}


//1- In Kotlin By Default Any Class is Final And Can't Have Children.
//2- Constructor Of Children Must Contains ConstructorVariable Of Parent & Then Calling Parent with ConstructorVariable.
class Students(name: String, age: Int, val id: Int) : Persons(name, age) {}

fun main(args: Array<String>) {


    val student = Students("Jack", 35, 2)

    println("student.name :"+student.name)
    println("student.age :"+student.age)
    println("student.id :"+student.id)


}