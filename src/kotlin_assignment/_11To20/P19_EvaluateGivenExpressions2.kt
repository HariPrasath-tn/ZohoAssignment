package kotlin_assignment._11To20;

import kotlin_assignment.getNumber

/*
 * program to Evaluate the given expression
 */

fun main(){
    var a = getNumber("Enter the value of A : ");
    a+=a++ + ++a + --a + a--;
    print("Value of the expression a+=a++ + ++a + --a + a-- = $a" );
}
