package ir.sample.kotlin_samples.sample21_access_modifiers

open class People {
    public var name = "Mike"
    protected var email = "Mike@gamil.com"
    private var age = 28
    //In ClassBody : Access To All Variables
    fun testPeople() {
        name
        email
        age
    }

}

class Students: People() {
    fun testStudents() {
        name
        email //protected : Limited to InheritedClass
        //private : Access Limited to DeclaredClass
        //Not Access to Variable (age)
        // age
    }
}

fun main(args : Array<String>) {
    var people = People()
    people.name // public : Access to This In All Area's
    //Not Access to Variable (age) & (email)
    // people.email
    // people.age

}