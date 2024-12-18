package oops

fun main(){
    var dog1 = Dog()
    var dog2 = Dog("","","")

    //var bus = Bus() //compile time error
    var bus1 = Bus("","","","")

    var car1 = Car()
    //var car2 = Car("","","","") //compile time error
    car1.name ="Tesla"
    car1.model ="S plaid"
    car1.color ="Red"
    car1.type ="Electric"

    println(car1.name)
    println(car1.model)
    println(car1.color)
    println(car1.type)

    println("------")

    println("name = ${car1.name}")
    println("model = ${car1.model}")
    println("color = ${car1.color}")
    println("type = ${car1.type}")

    car1.move()
    car1.stop()

}


//example of no args constructor
class Car {
    var name = ""
    var model = ""
    var color = ""
    var type = ""

    fun move(){
     println("The car is moving.")
    }
    fun stop(){
        println("The car has stopped.")
    }
}

//example of no args constructor
class Bus(name: String, model: String, color: String, type: String) {
    fun move(){
        println("The bus is moving.")
    }
    fun stop(){
        println("The bus has stopped.")
    }
}

//all args and no args constructors
class Dog(name: String ="", color: String ="", breed: String ="") {
    fun run(){
        println("The bus is running.")
    }
    fun bark(){
        println("The bus is barking.")
    }
}