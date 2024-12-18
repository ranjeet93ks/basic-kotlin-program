package basic

fun main(args: Array<String>) {// 10 is inclusive
    for(i in 1..10){
        println(i)
    }
    for(i in 1 until 10){// 10 is exclusive
        println(i)
    }
    for(i in 10 downTo  1){// 10 is exclusive
        println(i)
    }
    for(i in 1 until 10 step 2){// 10 is exclusive
        println(i)
    }
}
