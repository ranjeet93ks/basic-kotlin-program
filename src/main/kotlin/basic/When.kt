package basic

fun main() {
    val alarm = 7
    when(alarm){
        7 -> println("The time is $alarm.")
        14 -> println("The time is $alarm.")
        else -> println("The time is neither 7 nor 14.")
    }
    when(alarm){
        7,14 -> println("The time is $alarm.")
        else -> println("The time is neither 7 nor 14.")
    }

    val text1 = when(alarm){
        7 -> "The time is $alarm."
        14 -> "The time is $alarm."
        else -> "The time is neither 7 nor 14."
    }
    println(text1)

    val text2 = when(alarm){
        1 -> {
            println("some text")
            "The time is $alarm."
        }
        2 -> {
            println("some text")
            "The time is $alarm."
        }
        else -> {
            "The time is neither 1 nor 2."
        }
    }
    println(text2)
}