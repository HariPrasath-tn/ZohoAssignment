package kotlin_assignment._11To20;
/*
* program to print area of the cylinder
*/

// method to calculate the area of the cylinder
fun getAreaOfCylinderWith(radius:Double, height:Double): Double{
    return 2 * Math.PI * radius * (height + radius)
}


fun main(){
    println("Tool to calculate the area of the cylinder ");
    var radius:Double = 12.0;
    var height:Double = 12.0;

    println("Area of the given cylinder with radius $radius and height $height is : ${getAreaOfCylinderWith(radius, height)}  sq.units");
}