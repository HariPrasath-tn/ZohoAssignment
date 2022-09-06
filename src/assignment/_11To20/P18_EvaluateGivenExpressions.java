package assignment._11To20;
/*
 * program to Evaluate the given expression
 */

import java.util.Scanner;

import static java.lang.System.out;

// class declared as package private and final to prevent inheritance
final class P18_EvaluateGivenExpressions {
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
        P18_EvaluateGivenExpressions program18 = new P18_EvaluateGivenExpressions();
        try{
            out.print("Enter the value of a : ");
            int a = getUserInput();
            out.print("Enter the value of b : ");
            int b = getUserInput();

            b--;
            out.println("\nValue of the expression ++a-b–- : " + (++a - b) );

            out.printf("\nNow the value of \na=%d \nb=%d ",a , b);
            out.println("\nValue of the expression a%b++ : " + a%b++ );

            out.printf("\nNow the value of \na=%d \nb=%d ",a , b);
            a*=b+5;
            out.println("\nValue of the expression a*=b+5 : " + a);

            int x=69>>>2;
            out.println("\nValue of the expression 69>>>2 : " + x);
        }catch (Exception e){
            out.println(e.getMessage());
        }
    }
}
