package kotlin_assignment._21To30;

import kotlin_assignment.getNumber

/*
 * program to swap two numbers
 */

fun main(){
    var num1 = getNumber("Enter the first number : ");
    var num2 = getNumber("Enter the second number : ");
    println("Numbers num1 and num2 before swapping is  $num1 and $num2");

    // Swapping two numbers
    var temp = num1;
    num1 = num2;
    num2 = temp;

    println("Numbers num1 and num2 before swapping is  $num1 and $num2");
}