package ir.sample.kotlin_samples.sample15_abstract_class_method_var


//Like open classes, Can be implemented.
abstract class persons(val name : String , val age : Int) {
    // This variable necessary to be implemented in classes that implement class persons.
    abstract var className : String

    // All classes can access this method but can't override it.
    fun login() = "Login Successfully !"

    // This Function necessary to be implemented in classes that implement class persons.
    abstract fun userInfo()
}

class Students(name : String , age : Int , val studentsId : Int): persons(name , age) {
    // The className variable is implemented here
    override var className : String = "Students"

    // The userInfo method is implemented here
    override fun userInfo() {
        println("class: $className , name : $name , age: $age , studentsId: $studentsId")
    }
}

class Employees(name : String , age : Int , val employeesId : Int): persons(name , age) {
    // The className variable is implemented here
    override var className : String = "Employees"

    // The userInfo method is implemented here
    override fun userInfo() {
        println("class: $className , name : $name , age: $age , employeeId: $employeesId")
    }
}

fun main(args : Array<String>) {
    val studentsObject = Students("John" , 25 , 81)
    val employeesObject = Employees("Bob" , 35 , 14)

    studentsObject.userInfo()
    employeesObject.userInfo()
}