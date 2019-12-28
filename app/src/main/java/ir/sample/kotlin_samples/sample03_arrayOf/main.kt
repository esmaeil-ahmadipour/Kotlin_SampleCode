package ir.sample.kotlin_samples.sample03_arrayOf

fun main(args: Array<String>) {
    exerciseSizeType()
    exerciseSetGet()
    exerciseContains()
}

fun exerciseContains() {
    val number: Int = 2
    var array = intArrayOf(1,2,3,4,5,6,7,8,9)

    if (array.contains(number))
        println("Yes Contains : " + number)
    else
        println("No Contains : " + number)
}

fun exerciseSetGet() {
    var x = charArrayOf('H', 'E', 'L', 'L', 'O', ' ')
    var y = x
    print(y.get(0))
    print(y.get(1))
    print(y.get(2))
    print(y.get(3))
    print(y.get(4))
    print(y.get(5))
    x.set(0, 'W')
    x.set(1, 'O')
    x.set(2, 'R')
    x.set(3, 'L')
    x.set(4, 'D')
    x.set(5, '!')
    println(x)
}

private fun exerciseSizeType() {
    var arrayMain = arrayOf(1, 2, 3, "abc", 'd', false, 1.9f)
    var arrayTemp = intArrayOf(4)
    print("First Size:" + arrayMain.size)
    arrayMain = arrayMain + arrayTemp
    println(" , New Size:" + arrayMain.size)
}
