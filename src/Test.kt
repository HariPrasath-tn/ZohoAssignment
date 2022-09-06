class Temp (n : String){
    var age : Int = 0;
    var name: String= n;
    constructor(age: Int, name : String ) : this(name){
        this.name = name
        this.age = age
    }
}

fun main(arr: Array<String>){
    val obj = Temp(12, "Test")
    println( obj.name + " " + obj.age)
}
