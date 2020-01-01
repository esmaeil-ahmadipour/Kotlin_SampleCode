package ir.sample.kotlin_samples.sample12_constructor

//Multi Constructors

class A {
    var x : Int

    //This variable isNullable , Dou to One Constructor initialized without this variable.
    var y : Int? = null

    constructor(x : Int) {
        this.x = x
        println("Run Constructor A: constructor(x:Int){}")
    }

    constructor(x : Int , y : Int) {
        this.x = x;
        this.y = y;
        println("Run Constructor A: constructor(x:Int , y:Int){}")
    }
}

class B() {
    /*
    * for Accesses to Multiple Constructor: We Need Set Variables a,b to nullable . because Primary -
    * -Constructor without input variable and Another constructor , initialized with 3 Variables .
    */
    var a : Int? = null
    var b : Int? = null

    constructor(a : Int , b : Int): this() {
        this.a = a
        this.b = b
        println("Run Constructor B: constructor(a:Int , b:Int){}")
    }

    constructor(a : Int): this() {
        this.a = a
        println("Run Constructor B: constructor(a:Int){}")
    }
}

class C(var m : Int , var n : Int) {
    var z : Int? = null

    //We Have primary constructor with 2 parameters & another constructor with 3 parameters.

    constructor(m : Int , n : Int , z : Int): this(m , n) {
        this.z = z
    }
}

fun main(args : Array<String>) {
    var objA_1 = A(10)
    var objA_2 = A(10 , 20)

    var objB_1 = B(10)
    var objB_2 = B(10 , 20)

    val objC_1 = C(10 , 20)
    val objC_2 = C(1 , 2 , 3)

    println("objC_1.m : " + objC_1.m)
    println("objC_1.n : " + objC_1.n)
    println("objC_1.z : " + objC_1.z)

    println("objC_2.m : " + objC_2.m)
    println("objC_2.n : " + objC_2.n)
    println("objC_2.z : " + objC_2.z)

    println("objB_a : " + B().a)
    println("objB_b : " + B().b)

}