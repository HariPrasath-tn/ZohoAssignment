package assignment._11To20;
/*
 * program to Evaluate the given expression
 */

import java.util.Scanner;

import static java.lang.System.out;

// class declared as package private and final to prevent inheritance
final class P20_EvaluateGivenExpressions3 {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to get double input from the user
    private static int getUserInput() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    public static void main(String [] args){
        int x=0;
        try{
            out.print("Enter the value of x : ");
            x = getUserInput();
            int x1 = x++, x2=--x;
            x = x1 * 2 + 3 * x2;
        }catch (Exception e){
            out.println(e.getMessage());
        }
        out.println("\nValue of 'x' after this expression (x =x++ * 2 + 3 * -–x) : " + x);
    }
}
