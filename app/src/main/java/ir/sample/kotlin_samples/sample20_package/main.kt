package ir.sample.kotlin_samples.sample20_package

//import for Method 1 in main Method : No Need Import Any Class . because In Current Directory.
//import for Method 2 in main Method:
import ir.sample.kotlin_samples.sample20_package.InnerPackage.One.sayYourName
//import for Method 3 in main Method:
import ir.sample.kotlin_samples.sample20_package.InnerPackage.Three.InnerClass
//import for Method 4 in main Method:
import ir.sample.kotlin_samples.sample20_package.InnerPackage.Two.Test

fun main(args : Array<String>) {
    //Method 1 :
    TestClass().sayYourName()

    //Method 2 :
    sayYourName()

    //Method 3 :
    Test.sayYourName()

    //Method 4 :
    InnerClass().sayYourName()

}