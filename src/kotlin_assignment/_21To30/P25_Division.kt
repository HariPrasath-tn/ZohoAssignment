package kotlin_assignment._21To30;

import kotlin_assignment.getNumber

/*
 * program to find the quotient and the remainder
 */

// method to calculate the remainder of the division
fun getRemainder(divident: Int, divisor:Int):Int{
    return divident%divisor;
}

// method to find the quotient of for the division operation of the given number
fun getQuotient(divident: Int, divisor:Int):Int{
    return divident/divisor;
}

fun main(){
    var divident = getNumber("Enter the divident : ");
    var divisor = getNumber("Enter the divisor : ");

    // printing the remainder
    println("Remainder of the operation $divident/$divisor is : ${getRemainder(divident, divisor)}");

    // printing the quotient
    println("Quotient of the operation $divident/$divisor is : ${getQuotient(divident, divisor)}");

}