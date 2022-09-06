package kotlin_assignment._21To30;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * Program to find the largest of the given number
 */

// class declared as package private and final to prevent inheritance
final class P30_LargestNumber {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to get int input from the user
    private static int getUserInput() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    public static void main(String [] args){
        P30_LargestNumber program30 = new P30_LargestNumber();
        int largest=0;
        try{
            out.println("\nTool to find the largest of the three numbers ");
            out.print("Enter the first number : ");
            int num1 = getUserInput();
            largest = Math.max(largest, num1);
            out.print("Enter the second number : ");
            int num2 = getUserInput();
            largest = Math.max(largest, num2);
            out.print("Enter the third number : ");
            int num3 = getUserInput();
            largest = Math.max(largest, num3);

            out.printf("Largest number of %d, %d, %d is %d ", num1, num2, num3, largest);
        }catch(Exception e){
            out.print(e.getMessage());
        }
    }
}
