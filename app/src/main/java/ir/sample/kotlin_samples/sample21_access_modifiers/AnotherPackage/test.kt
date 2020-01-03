package ir.sample.kotlin_samples.sample21_access_modifiers.AnotherPackage

import ir.sample.kotlin_samples.sample21_access_modifiers.People

fun main(args : Array<String>) {
    People().name
    //Not Access to Variable (age) & (email)
    //    People().email
    //    People().age

}