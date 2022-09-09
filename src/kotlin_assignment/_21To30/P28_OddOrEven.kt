package kotlin_assignment._21To30;

import kotlin_assignment.getNumber

/*
* Program to find whether the given number is odd or not
 */

// method to find the given number is odd
fun isThisOdd(number:Int):Boolean{
    return number%2 != 0;
}

fun main(){
    println("Tool to find the given number is odd or even ");
    var number = getNumber("Enter the number : ");
    print("The given number $number is : ${if(isThisOdd(number)){"Odd"} else {"Even"}}");
}