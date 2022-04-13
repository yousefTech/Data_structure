package OOP

open class Person(firstname:String,lastname:String,age:Int) {
     var firstname:String=firstname
     var lastname: String=lastname
     var age:Int=age
    lateinit var id: String
    constructor(firstname:String,lastname:String,age:Int,id:String): this(firstname,lastname,age){
        this.id=id

    }
    open fun speake(){

    }
    open fun great(){
    }
    open fun info(){
        println("name :$firstname, last name:$lastname, age:$age")
    }
}
class Student(firstname: String,lastname: String,age: Int): Iperson{
    fun aboutEducation(){
    }
    fun aboutLecture(){

    }

    override fun info() {
        TODO("Not yet implemented")
    }

    override fun sayHello() {
        TODO("Not yet implemented")
    }
}

interface Iperson{
    fun info()
    fun sayHello()
}
//sealed class Vehicle
//// create two data classes that inherit Vehicle class
//data class Motorcycle(val manufacturer: String, val type: String): Vehicle()
//data class Car(val manufacturer: String, val type: String): Vehicle()
//
//// create a run()  method that can be called
//// from a class that inherits Vehicle class
//fun Vehicle.run() {
//    // define the run() implementation
//    // based on specific class
//    when(this) {
//        is Motorcycle -> println("Running with two wheels")
//        is Car -> println("Running with four wheels")
//    }
//}

open class A
class B:A()
class C:A()
class D:A()

fun main(){
var num:A = A()
    num = B()
    var num2: List<A> = listOf<A>(B(),C(),D())
    //Create an Array
    var name= listOf("Shroog","ali","Yousef","Maha")
//    for(n in name)
////        println(n)
//    name.forEach {
//        println(it)
//    }
    val num3 = mutableListOf(1,2,3,4,5,6)
    num3.add(7)
    num3.remove(6)
    num3.forEach(){
        println(it)
    }

}