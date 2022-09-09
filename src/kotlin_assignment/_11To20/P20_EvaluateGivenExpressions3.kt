package kotlin_assignment._11To20;

import kotlin_assignment.getNumber

/*
 * program to Evaluate the given expression
 */

fun main(){
    var x = getNumber("Enter the value of X : ");
    x = (x++ * 2) + (3 * --x);
    print("Value of the expression x = (x++ * 2) + (3 * --x) = $x");
}