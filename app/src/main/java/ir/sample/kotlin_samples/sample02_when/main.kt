package ir.sample.kotlin_samples.sample02_when

import java.util.*

private val playerScanner = Scanner(System.`in`)
private var footballSpectators = ("NO Player!\n" + "may be..\n" + "Football Spectators..\n")

fun main(args: Array<String>) {
    print("Enter Player Number :")
    detectPersons()
}
//

private fun detectPersons() {
    if (!playerScanner.hasNextInt())
        println(footballSpectators)
    else
        println(playerDetect())
}

private fun playerDetect(): String {
    return when (playerScanner.nextInt()) {
        1 -> "GoalKeeper"
        2 -> "Right Defence"
        3 -> "Middle Right Defence"
        4 -> "Middle Left Defence"
        5 -> "Left Defence"
        6 -> "Right Midfielder"
        7 -> "Middle Right Midfielder"
        8 -> "Middle Left Midfielder"
        9 -> "Left Midfielder"
        10 -> "Right Forward"
        11 -> "Left Forward"
        in 12..22 -> "Substitute Players"
        else -> footballSpectators
    }

}