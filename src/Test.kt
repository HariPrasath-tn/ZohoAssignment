import kotlin.math.sqrt

class Temp (n : String){
    var age : Int = 0;
    var name: String= n;
    constructor(age: Int, name : String ) : this(name){
        this.name = name
        this.age = age
    }
}

fun main(arr: Array<String>){
//    val obj = Temp(12, "Test")
//    println( obj.name + " " + obj.age)
    var number = 49.0;
//    if(Math.sqrt(number) % 1)
    print(if(sqrt(number) % 1 == 0.0) {"Perfect sqrt "} else {"Not Perfect Sqrt"});
}

