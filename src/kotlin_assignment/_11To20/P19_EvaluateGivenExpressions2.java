package kotlin_assignment._11To20;
/*
 * program to Evaluate the given expression
 */

import static java.lang.System.out;

// class declared as package private and final to prevent inheritance
final class P19_EvaluateGivenExpressions2 {
    public static void main(String [] args){
        int a=28, b=a++, c=++a, d=--a, e=a--;
        a += b + c + d + e;
        out.println("\nValue of 'a' after this expression a+=a++ + ++a + –-a + a–- : " + a);
    }
}
