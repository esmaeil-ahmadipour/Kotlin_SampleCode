package ir.sample.kotlin_samples.sample06_StringMethods

fun main(args: Array<String>) {
    var test = "This Is A Test!"
    val age = 20

    // Add value to String (unstop method)
    print("01:")
    println("My Age Is $age And I'm Developer!")

    // Get Length Of StringValue
    print("02:")
    println(test.length)

    // Get First Character Of StringValue
    print("03:")
    println(test[0])

    // Get Second Character Of StringValue
    print("04:")
    println(test.get(1))

    // Get First Character Of StringValue
    print("05:")
    println(test.first())

    // Get Last Character Of StringValue
    print("06:")
    println(test.last())

    // State Of Characters In StringValue (return boolean Type)
    print("07:")
    println(test.contains("A"))

    // State Of Characters In StringValue (return boolean Type)
    print("08:")
    println(test.equals("Test"))

    print("08:")
    println()


    //Start StringValue with ?
    print("09:")
    println(test.startsWith('T'))

    //End StringValue with ?
    print("10:")
    println(test.endsWith("t!"))

    //Index Of First Character in String Value that Equals..
    print("11:")
    println(test.indexOf('T'))

    //Index Of Last Character in String Value that Equals..
    print("12:")
    println(test.lastIndexOf('T'))

    // Replace Character With Another Character In StringValue..
    print("13:")
    println(test.replace('T','D'))

    // Replace String With Another String In StringValue..
    print("14:")
    println(test.replace("Th" , "D"))

    // Reverse StringValue !
    print("15:")
    println(test.reversed())

    //Create SubString By Index Number (start,finish)
    print("16:")
    println(test.substring(1,3))

    // Return List , ListItems  Detect By (character ',')
    print("17:")
    val stringNames:String = "Amir,John,Cathrine,Fred,Bijan,Omid"
    val namesList=stringNames.split(',')
    println(namesList)

    //
    val stringHello="   Hello   "
    val stringWorld="World!"

    //Remove All Spaces From StringValue
    print("18:")
    println(stringHello.trim()+stringWorld)

    //Remove End Spaces From StringValue
    print("19:")
    println(stringHello.trimEnd()+stringWorld)

    //Remove Start Spaces From StringValue
    print("20:")
    println(stringHello.trimStart()+stringWorld)

}