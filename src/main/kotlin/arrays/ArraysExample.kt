package arrays

fun main() {
    var names = arrayOf("Ranjeet", "Advik", "Sonam")
    names[0] = "Ranjeet Kumar"
    println("First Element of an array: ${names[0]}")
    println("Size of an array: ${names.size}")

    var mixedArray = arrayOf("Ranjeet", "Advik", 30, 4, 'c')
    mixedArray[0] = "Ranjeet Kumar"
    println("First Element of an array: ${mixedArray[4]}")
    println("Size of mixed array: ${mixedArray.size}")

    for (i in mixedArray) {
        if (i is Int) {
            println(i)
        }
    }

}