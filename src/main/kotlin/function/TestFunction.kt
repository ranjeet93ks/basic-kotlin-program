package function

fun main() {
    sayHello("Ranjeet", 30)
    val hasInternetConnection = true

    if (hasInternetConnection) {
        getData("some text")
    } else {
        showMessage()
    }
    //or
    when {
        hasInternetConnection -> getData("some text")
        else -> showMessage()
    }
    println(sum1(1,3,5))
    println(sum1(1,3,5,6,8,9,4,2,7))

    println(sum2(1,3,5))
    println(sum2(1,3,5,6,8,9,4,2,7))

    println(varArgs(1,3,5))
}

//in kotlin input para of a method is val and hence we can't reassign any value to it inside method
fun sayHello(name: String, age: Int) {
    println("Hi, $name! Your age is $age")
}

fun getData(data: String) {
    println("Your data is: $data")
}


fun showMessage() {
    println("show some message")
}
fun getMax(a: Int, b:Int): Int {
    if(a>b) {
        return a
    }
    else{
        return b
    }
}
fun getMax1(a: Int, b:Int): Int {
    //curly braces required in case of multiple statement
    return if(a>b) a else b
}

fun getMaximum(a: Int, b:Int): Int = if(a>b) a else b
fun getMaximum1(a: Int, b:Int) = if(a>b) a else b

fun sum(a: Int, b:Int) = a+b

fun sum1(vararg numbers: Int): Int {
    var result =0
    for(number in numbers){
        result += number
    }
    return result
}
fun sum2(vararg numbers: Int): Int {
    return numbers.sum()
}

fun varArgs(vararg numbers: Int) {
    numbers.forEach { println(it) }
}


