package nullAndRelated

fun main() {
    var name: String? = "Kotlin"
    println(name?.length) // Safe call

    name = null
    println(name?.length)
    println(name?.length ?: "No name") // Elvis operator

    try {
        //println(name!!.length) // Not-null assertion (throws NPE)
    } catch (e: NullPointerException) {


        println("Caught NullPointerException!")
    }
}
