package kotlin_assignment._11To20;


import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to print given number without using string
 */

// class declared as package private and final to prevent inheritance
final class P12_PrintGivenNumber {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to get integer input from the user
    private static float getIntegerFromUser() throws Exception{
        if(!INPUT.hasNextFloat()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextFloat();
        }
    }

    public static void main (String [] args){
        try{
            out.println("\nTool to print the given number in two decimal without using string ");
            out.print("Enter the number : ");
            float number = getIntegerFromUser();
            out.print("Number of two decimal : ");
            out.printf("%.2f", number);
        }catch (Exception e){
            out.println(e.getMessage());
        }

    }
}
