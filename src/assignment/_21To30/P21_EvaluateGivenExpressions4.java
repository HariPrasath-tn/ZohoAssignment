package assignment._21To30;
/*
 * program to Evaluate the given expression
 */

import static java.lang.System.out;

// class declared as package private and final to prevent inheritance
final class P21_EvaluateGivenExpressions4 {
    public static void main(String [] args){
        // If int y = 10 then find int z = (++y * (y++ + 5));
        int y=10, y1=++y, y2=y++;
        int z = (y1 * (y2 + 5));
        out.println("\nValue of 'z' of the expression z = (++y * (y++ + 5)) (where y=10) : " + z);
    }
}
