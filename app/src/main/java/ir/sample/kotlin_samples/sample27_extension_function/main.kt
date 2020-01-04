package ir.sample.kotlin_samples.sample27_extension_function

//Sample 1 :
class A
fun A.a() = println("Test Value: A")

//Sample 2 :
open class B(){}
fun  B.b( i : Int = 5) = println("Test fun b : $i")
open class C: B(){}

//Sample 3
class D:C(){}
fun D.b(x : Int) = println("Test fun b : $x") //This Function Is Overrated From ParentClass.


fun main(args : Array<String>) {
    //Sample 1 :
    A().a()

    //Sample 2 : We Can Access to method b From Parents Class
    C().b(43)

    //Sample 3 : We Can Override Method b() ;
    D().b(12)

}