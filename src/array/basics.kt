package array

class basics {


}

fun main(){
    var array: Array<Int> = arrayOf(1,2,3,4,5)
    var num = 0
    array = delete(array,3)

    while (num<array.size-1) {
        println(array[num])
        num++
    }
   // array = array.drop(1).toTypedArray()
//    for (e in array)
//        println(e)
//
}
fun delete(array:Array<Int>,value:Int):Array<Int>{
    var counter:Int=1
    if(array==null)
        println("empty array")
    else
        while (counter<=array.size){
            if(value==array[counter]){
                var count =counter
                while (count<array.size-1){
                    array[count]=array[counter+1]
                    count++
                    counter++
                }
                break
            }
            counter++
        }

    return array
}