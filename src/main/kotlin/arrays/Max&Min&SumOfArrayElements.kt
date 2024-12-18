package arrays

fun main() {
    var intArray = arrayOf(100, 60, 20, 50, 30, 80, 90, 70)

    val (min, max) = findMaxAndMinAndSum(intArray)
    println("Min element is : $min, max element is : $max")

    val (minimum, maximum, sum) = findMaxAndMinAndSum(intArray)
    println("Min element is : $minimum, max element is : $maximum, sum of all array elements is: $sum")
}

fun findMaxAndMin(input: Array<Int>): Pair<Int, Int> {
    if (input.isEmpty()) {
        throw IllegalArgumentException("Input array must not be empty")
    }
    var min = input[0]
    var max = input[0]
    for (num in input) {
        if (num < min) {
            min = num
        }
        if (num > max) {
            max = num
        }
    }

    return Pair(min, max)
}

fun findMaxAndMinAndSum(input: Array<Int>): Triple<Int, Int, Int> {
    if (input.isEmpty()) {
        throw IllegalArgumentException("Input array must not be empty")
    }
    var sum = 0
    var min = input[0]
    var max = input[0]
    for (num in input) {
        if (num < min) {
            min = num
        }
        if (num > max) {
            max = num
        }
        sum += num
    }

    return Triple(min, max, sum)
}
