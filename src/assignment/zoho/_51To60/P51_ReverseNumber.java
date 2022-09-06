package assignment.zoho._51To60;

import javax.swing.*;
import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to print number in Reverse Order
 */

// class declared as package private and final to prevent inheritance
final class P51_ReverseNumber {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    private int arrayCount = 0;

    // method to get integer input from the user
    private static int getIntegerFromUser() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    // method to reverse the given number
    private void printNumberInReverse(int number){
        int reversed = 0;
        while(number>0){
            reversed = (reversed*10) + number%10;
            number /= 10;
        }
        out.println("Number in reversed order is : " + reversed);
    }

    public static void main(String [] args){
        P51_ReverseNumber program51 = new P51_ReverseNumber();
        try{
            out.println("\nTool to print number in reverse without using string ");
            out.print("Enter the number : ");
            int number = getIntegerFromUser();
            program51.printNumberInReverse(number);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
