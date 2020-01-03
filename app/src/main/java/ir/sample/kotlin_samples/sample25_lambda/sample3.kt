package ir.sample.kotlin_samples.sample25_lambda

import android.annotation.TargetApi
import android.os.Build

@TargetApi(Build.VERSION_CODES.N)
fun main(args : Array<String>) {
    listOf<Int>(1,5,10,20,30,40,50).stream().filter{p-> p >= 20}.forEach{p-> println(p)}
}