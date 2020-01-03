package ir.sample.kotlin_samples.sample17_dataClass

class User(val name : String , var age : Int)

// DataClass is final :That Means, Using AbstractClass &  OpenClass is prohibited.
data class DataUser(val name : String , var age : Int)

fun main(args : Array<String>) {
    val user1 = User("ali" , 20)
    val dataUser1 = DataUser("Mat" , 24)
    //print Address Of Memory
    println(user1)
    //print values of ObjectsVariables
    println(dataUser1)

    val dataUser2 = DataUser("Mat" , 24)
    val user2 = User("ali" , 20)

    //return false : because Class return Different ObjectAddress in Memory!
    println(user1.equals(user2))
    //return true : because DataClass return Values Of ObjectsVariables in Memory!
    println(dataUser1.equals(dataUser2))

    //user2  copy of  user3 . if on user3 changing The Values Then user2 Too changed;
    var user3 = user2
    user2.age = 17
    println("user2: ${user2.age}")
    println("user3: ${user3.age}")

    //dataUser2  dependence copy of  dataUser3 . if on dataUser3 changing The Values Then  dataUser2 never changed.
    var dataUser3 = dataUser2.copy(age = 35)
    println("dataUser2: ${dataUser2.age}")
    println("dataUser3: ${dataUser3.age}")

    //Automatically x , y Initialized to parameters of dataUserObject ;
    val (x , y) = dataUser1




}