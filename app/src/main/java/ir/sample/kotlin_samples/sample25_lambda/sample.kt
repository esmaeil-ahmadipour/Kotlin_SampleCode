package ir.sample.kotlin_samples.sample25_lambda

/*Note :
 * When One Lambda Expression Passing To a Variable , This Variable get a behavior Like a Function.-
 * -We can Call this Variable.(sample_a)
 *
 */
fun main(args : Array<String>) {

    // When One Lambda Expression Passing To a Variable , This Variable get a behavior Like a Function.
    val sample_a = { p : Int-> println(p) }
    sample_a(10)

    // In This Mood: Return Int Value to Variable sample_b ;
    val sample_b = { p : Int-> p }
    println(sample_b(20))

    // Test with double variable ;
    val sample_c = { p1 : String , p2 : Int-> println(p1.toInt() + p2) }
    sample_c("10" , 20)

    // We Can Set Template For Input/Output Type Of Variable : InputType First And After Set OutputType ;
    val sample_d : (String) -> (Int) = { p-> p.toInt() * 2 + 10 }
    println(sample_d("15"))

    // When Don't Need Return Value: Using Unit KEYWORD.
    val sample_e : (String , Int) -> (Unit) = { p1 , p2-> println(p1 + p2) }
    val sample_eValue = sample_e("5" , 0)
    println("sample_eValue is: " + sample_eValue)

    //If You don't Want to Get InputData From LambdaBody Expression , Simply Write codes in LambdaBody Expression .
    val sample_fValue = "(;"
    val sample_f = { println("sample_fValue Is: $sample_fValue ") }
    sample_f()

    // We Can Set MultiLine In OutPut Of LambdaBody Expression:
    val sample_g = { p : Int->
        val x = ((p + p))
        print((x * 2) + (p * 2))
        println(" (:")
    }
    sample_g(10)

}