package basic

fun main() {
    val alarm = 17
    when(alarm){
        in 1..10 -> println("The time is in range of 1 and 10.")
        else -> println("The time is out of range.")
    }

    val alarm1 = 7
    val text1 = when(alarm){
        !in 1..10 -> "The time is not in range of 1 to 10."
        else -> "The time is in range."
    }
    println(text1)


}