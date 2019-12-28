package ir.sample.kotlin_samples.sample05_HashMap

fun main(args: Array<String>) {
    val map: HashMap<Int, String> = hashMapOf(0 to "zero", 1 to "one", 2 to "two", 3 to "three")

    //Result: See Full Contents;
    println("statement:  map  Result:" + map)

    //Result: By KeyValue PrintData;
    println("statement:  map.get(1)  Result:" + map.get(1))

    //Result: Size Of HashMap;
    println("statement:  map.size  Result:" + map.size)

    //Result: Check HashMap if empty return TRUE value;
    println("statement:  map.isEmpty()  Result:" + map.isEmpty())

    //Result: PrintData Like  a ArrayList ;
    //We Has One Array And Members Is One List!
    // (one Pair KeyValue In One List)
    println("statement:  map.toList()  Result:" + map.toList())
    println("statement:  map.toList().get(0)  Result:" + map.toList().get(0))

    //Add to HashMap
    map.put(4,"four")
    println("Add To HashMap : "+map)

    //Update HashMap
    map.set(1,"One")
    map.set(2,"Two")
    map.set(3,"Three")
    map.set(4,"Four")
    println("Update HashMap : "+map)


    //Remove From HashMap
    map.remove(4)
    println("Remove HashMap : "+map)

}