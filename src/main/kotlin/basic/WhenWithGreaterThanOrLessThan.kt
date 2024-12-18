package basic

fun main() {
    val alarm =7 
    val text2 = when{
        alarm >=1 && alarm <= 5 -> {
            println("some text")
            "The time is in range of 1 and 5."
        }
        alarm >=6 && alarm <= 10 -> {
            println("some text")
            "The time is in range of 6 and 10."
        }
        else -> {
            "The time is out of range."
        }
    }
    println(text2)
}