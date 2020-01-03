package ir.sample.kotlin_samples.sample26_generics

//Generic Class :
class Test<T>(var x : T) {

    fun a() : T? {

        return null
    }

    /*Note :
     *set Return TypeValue to F & Quantity Of InputArguments is Unlimited & InputType is  F .
     */
    fun <F> g(vararg items : F) {
        //Iterate items & Print All Items ;
        items.forEach { p-> println("$p") }
    }
}

//Generic Class :
class TestDoubleValue<T , V>(var x : T , var y : V) {

    fun a() : T? {

        return null
    }

    fun b() : V? {

        return null
    }
}