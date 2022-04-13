package OOP

class Student1 {
    var name:String
    var phone:Int
    var id:Int
    constructor(){
        name = "Yousef"
        phone= 966537832028.toInt()
        id=1104050694
    }
    fun sayHello(){
        println("Hello")
    }
}
//assighnment1 creat an object of class Person that has the attributes of person
class Person1(name:String,age: Int,hight: Int){
    var name:String=""
    var age:Int = 0
    var hight:Int = 0
    //in the "this section" we should add the all variables and one value at least to prevent null
    constructor( name: String,age:Int) : this(name,age,0) {
        this.name=name
        this.age=age
       this.hight=hight
    }
    constructor( name: String) : this(name,0,0) {
        this.name=name
        this.age=age
        this.hight=hight
    }
    constructor(): this("",0,0){

    }

    override fun toString(): String {
        return "Person(name='$name', age=$age, hight=$hight)"
    }

}
class Product(name: String,category: String,price: Double,quantity:Int){
    lateinit var name:String
    lateinit var category:String
    //i cant use the lateinit in the double and in data type
     var price:Double = 0.0
    var quantity:Int = 0


}
fun main(){
    var s1 = Student1();
    var p1= Person1("Yousef");
    var p2=Person1("Yousef",23,174)
    var p3 = Person1()
    var p4=Person1("Mohammed",30)

    p1.name="Mohammed"
    p1.age=30
    p1.hight=170
    println(p1.toString())

}
