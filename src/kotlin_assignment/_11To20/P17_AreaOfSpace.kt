package kotlin_assignment._11To20;

import kotlin_assignment.getDouble
import kotlin.math.abs

/*
 * program to find the area of space between two concentric circles
 */


// method to calculate the area of circle
fun calculateTheAreaOfCircleWith(radius:Double): Double{
    return 2 * Math.PI * radius * radius;
}

// method to calculate the area space between two concentric circles
fun areaOfSpaceBetween(area1:Double, area2:Double):String{
    return String.format("%.2f", abs(area1- area2));
}
fun main(){
    println("Tool to calculate the area of space between two concentric circle ")
    val radius1 :Double  = getDouble("Enter the radius of the circle 1 : ");
    val radius2 :Double = getDouble("Enter the radius of the 2nd circle : ");
    val area1 = calculateTheAreaOfCircleWith(radius1); // calculating the radius of the circle with radius1
    var area2 = calculateTheAreaOfCircleWith(radius2); // calculating the radius of the circle with radius2
    print("Area of space between the two concentric circle with radius $radius1 and $radius2 is : ${areaOfSpaceBetween(area1, area2)} sq.units");
}