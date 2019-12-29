package ir.sample.kotlin_samples.sample09_break_continue

fun main(args:Array<String>){
var list = listOf(1,2,3,4,5,6,7,8,9)

    //Sample: when CounterValue is 3 then DoNothing And Stop Loop;
    for (listItem in list)
    {
        if (listItem == 3)
        {
            break
        }
        println("break mode: $listItem")
    }


//Sample: when CounterValue is 3 then DoNothing And Continue Loop;
    for (listItem in list)
    {
        if (listItem == 3)
        {
            continue
        }
        println("continue mode: $listItem")
    }

}