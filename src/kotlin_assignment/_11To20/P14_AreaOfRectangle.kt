package kotlin_assignment._11To20;

/*
 * program to print area of the rectangle
 */

// method to calculate the area of the rectangle of given length
fun getAreaOfRectangleWith(length:Double, breadth:Double):Double{
    return length * breadth;
}

fun main(){
    println("Tool to Calculate the Area of the rectangle ");
    var length:Double = 12.0;
    var breadth:Double = 5.0;
    println("Area of the rectangle with length $length and breadth $breadth is : ${getAreaOfRectangleWith(length, breadth)}  sq.units")
}