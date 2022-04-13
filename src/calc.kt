import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueConstant

fun main(){
    //var input=0
    var a =10
    /*
for (i in 0..4){
    println("Enter Number")
    input = readLine()?.toInt()!!
    input+=input
}*/
    while (a>=0){
        println(a)
        a--;
    }
    println(sum(4,6))
    //println("The totle Number is $input")
/*
    var number1=5
    var number2=10
    var password = "75598YAZ"
    var name = "Yousef"
    println("Enter Name:")
    var inputname = readLine()
    println("Enter Password:")
    var input = readLine()
    /*
    if (input==password)
        println("Welcome")
    else
        println("Idon't know you!")
        */
    //SWITCH but for kotlin language
    when(input){
        "75598YAZ" -> println("Welcome "+inputname)
        "75598MAZ" -> println("Welcome "+inputname)
        "75598FAZ" -> println("Welcome "+inputname)
        else -> println("Sorry wrong input!")
    }

    println(Integer.sum(number2, number1))
    println(Integer.divideUnsigned(number2,number1))
    println(Math.subtractExact(number2,number1))
    println(Math.multiplyExact(number2,number1))*/
}
fun sum (n1:Int,n2:Int) = n1+n2
