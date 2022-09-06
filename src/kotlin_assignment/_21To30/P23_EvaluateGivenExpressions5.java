package kotlin_assignment._21To30;
/*
 * program to Evaluate the given expression
 */

import static java.lang.System.out;

// class declared as package private and final to prevent inheritance
final class P23_EvaluateGivenExpressions5 {
    public static void main(String [] args){
        int x= 5, x2=++x, x3=x++, x4=--x;
        int x1;
        x1 = x2 -x3;
        x1 += x4;
        out.println("\nValue of 'X1' of the expression x1 = x1=++x – x++ + -–x (where x=5) : " + x1);
    }
}
