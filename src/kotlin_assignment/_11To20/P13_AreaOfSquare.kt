package kotlin_assignment._11To20;

/*
 * program to print area of the square
 */

// method to calculate the area of the square of the given length
fun getAreaOfSquareWithLength(length:Double):Double{
    return length*length;
}

fun main(){
    println("Tool to print the area of the square : ");
    var length:Double = 6.0;
    print("Area of the given square of lenght : $length is ${getAreaOfSquareWithLength(length)} sq.units");
}

