package OOP

class day5 {
}
fun main(){
    var input:String?=null //? for avoid  error in both run time and mean time but some time will give you an error
    var counter:Int=0

    println("what is the input string")
    input= readln()
    counter=input!!.length // if its null give me an error at the run time to avoid syntax error
    println("$input has $counter")
    if(input!!.length>7)
        println("$input has $counter")
}