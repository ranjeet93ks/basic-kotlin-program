package basic

fun main(args: Array<String>) {
    var count =0
    while(count<10){
        println(count)
        count++
    } // o/p 0,1,2.... 9

    var count1 =0
    while(count1<10) println(count1++) // o/p 0,1,2.... 9

    var count2 =0
    while(count2<10) println(++count2) // o/p 1,2.... 10
}
