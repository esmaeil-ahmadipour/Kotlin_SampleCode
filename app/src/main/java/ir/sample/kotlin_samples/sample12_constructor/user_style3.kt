package ir.sample.kotlin_samples.sample12_constructor

//Initialize variable In Constructor,Variable Get DefaultValue.
class UserStyle3(var name:String , val age:Int=30){}

fun main(args: Array<String>) {
    //1-NoNeed initialize age variable . because Has Default value in Constructor.
    //2-We Can Initialize Customize the Order for Constructor by Typing VariableNames
    var user=UserStyle3(name="ahmad")
    println(user.name)
    println(user.age)
}