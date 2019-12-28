package ir.sample.kotlin_samples.sample04_arrayListOf

val arrayList= arrayListOf(-2,-1,0,1,2)
var number:Int=0


fun main(args:Array<String>){

    println("Detail : "+arrayList)

    //Add To ArrayList
    exerciseAddNegativeNumber()
    exerciseAddPositiveNumber()
    exerciseAddNegativeNumber()
    exerciseAddPositiveNumber()

    //Remove From ArrayList
    exerciseRemoveNegativeNumber()
    exerciseRemovePositiveNumber()

    //Sublist
    sublistNegativeNumber();
    sublistPositiveNumber();

}

fun sublistPositiveNumber() {
var sublistPositive = arrayList.subList(arrayList.indexOf(1), 1+arrayList.lastIndex)

    println("Sublist Positive :"+ sublistPositive)
}

fun sublistNegativeNumber() {
    var sublistNegative = arrayList.subList(0, arrayList.indexOf(0))

    println("Sublist Negative :"+sublistNegative)

}

fun exerciseRemovePositiveNumber() {
    arrayList.removeAt(arrayList.lastIndex)
    println("Remove Positive Number : "+arrayList)
}

fun exerciseRemoveNegativeNumber() {
    arrayList.removeAt(0)
    println("Remove Negative Number : "+arrayList)
}

fun exerciseAddPositiveNumber() {
    arrayList.add(arrayList.lastIndex+1,arrayList.last()+1)
    println("Add Positive Number : "+arrayList)
}

fun exerciseAddNegativeNumber() {
    arrayList.add(0,arrayList.first()-1)
    println("Add Negative Number : "+arrayList)

//    number= arrayList.last()
//    print("number"+number)
//    arrayList.add(0,-3)
//    println("Add Negative Number : "+arrayList)
//
//    println("Detail : "+arrayList)

}

