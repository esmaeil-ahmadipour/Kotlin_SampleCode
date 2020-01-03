package ir.sample.kotlin_samples.sample22_getter_setter

class User {
    val name = ""
    // We Can't Define Setter For val Variables.
    //    set(value) {}

    var age : Int = 0

        //When getter Run In "println(user.age)" : Automatically increase Value +10 ;
        get() = field + 10

        set(value) {
            // if variable (age) LessThan 100  then Condition True and run ifBody
            if(value < 100) {
                field = value
            } else {
                //because getter Automatically increase Value +10 , Result is :"0"
                field = -10
            }
        }
    /* Notes:
     * if (set) configured to  private , We Can't Set Another Value to this variable
     */

}

fun main(args : Array<String>) {

    var user = User()
    user.age = 100
    println(user.age)
}