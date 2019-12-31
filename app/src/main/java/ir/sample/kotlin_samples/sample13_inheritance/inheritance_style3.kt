package ir.sample.kotlin_samples.sample13_inheritance

open class AllPersons(open val name: String, val age: Int) {

}

/*
For Change Value Of Variable "name" :
1- in Class AllPersons: change  (val name)  To (open val name)
2- in Class AllStudents : change  (name)  To (override var name)
3- Change Value Of Variable
*/
class AllStudents(override var name: String,  age: Int=999, val id: Int) : AllPersons(name, age)


fun main(args: Array<String>) {

    val student = AllStudents("Jack", 35, 2)
    student.name="Sarah"
    println(student.name)
    println(student.age)
    println(student.id)
}