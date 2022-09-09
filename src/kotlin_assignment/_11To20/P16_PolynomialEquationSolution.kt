package kotlin_assignment._11To20;

import kotlin_assignment.getDouble
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

/*
 * program to solve polynomial equation
 */

// method to solve the polynomial equation
fun solveThisEquation(a: Double, b: Double, c: Double){
    var secondHalf: Double =  b.pow(2.0) - (4 * a * c);
    val result1 = if (secondHalf < 0){
        "" + (-b/2) + String.format(" -i %.2f", sqrt(abs(secondHalf))/2);
    } else {
        (-b/2) - sqrt(secondHalf);
    }

    val result2= if (secondHalf < 0){
        "" + (-b/2) + String.format(" +i %.2f", sqrt(abs(secondHalf))/2);
    } else {
        (-b/2) + sqrt(secondHalf)/2;
    }
    print("X  = ($result1)"); // calculating the first root
    print(", ($result2)"); // calculating the second root
}

fun main() {
    try {
        println("Tool to solve the polynomial equation")

        val a : Double = getDouble("Enter the value of a : ");
        val b : Double = getDouble("Enter the value of b : ");
        val c : Double = getDouble("Enter the value of c : ");
        solveThisEquation(a, b, c);
    } catch (e: Exception) {
        print(e.message);

    }
}
