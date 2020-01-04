package ir.sample.kotlin_samples.sample29_exception_management

fun main(args : Array<String>) {

    arraySample()
    divideToZero()

    //Get Index & Detect & return result!
    val selectedIndex : Int = 10
    println("Result: ${arraySample2(selectedIndex)} \n")
}

fun divideToZero() {
    val number1 : Int = 10
    val number2 : Int = 0

    //Duo to Divide 10 To zero , We Have ArithmeticException
    //For Management Exception , GoTo catch Body and Write "Exception" OR "ArithmeticException"  !

    try {
        println(number1 / number2)
    } catch (e : ArithmeticException) {
        println("Don't Divide To zero!")
    } finally {
        println("Have A Good Day .. Bay Bay :)")
    }
}

fun arraySample() {
    val elementNumber : Int = 10
    var array = arrayOf(10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90)

    //Duo to Request Access to Invalid Element From Array , We Have ArrayIndexOutOfBoundsException
    //For Management Exception , GoTo catch Body and Write "Exception"  OR "ArrayIndexOutOfBoundsException"  !

    try {
        println(array[elementNumber])
    } catch (e : ArrayIndexOutOfBoundsException) {
        println("No Access to element $elementNumber")
    } finally {
        println("Wish The Best For You ;)")
    }
}

fun arraySample2(elementNumber : Int) : String {
    var array = arrayOf(10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90)
    return try {
        array[elementNumber].toString()
    } catch (e : ArrayIndexOutOfBoundsException) {
        "Invalid Index,Try Another Index.."
    } finally {
        print("\n Selected Index is : $elementNumber And ")
    }
}