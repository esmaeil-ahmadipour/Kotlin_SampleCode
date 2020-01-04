package ir.sample.kotlin_samples.sample28_file

import java.io.File

fun main(args : Array<String>) {
    var line=0
    File("app/src/main/java/ir/sample/kotlin_samples/sample28_file/Test.txt").forEachLine {

        print("#${++line}")

        println(it)
    }
}