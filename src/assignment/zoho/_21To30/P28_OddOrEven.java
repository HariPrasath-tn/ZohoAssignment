package assignment.zoho._21To30;

import java.util.Scanner;
import static java.lang.System.out;

/*
* Program to find whether the given number is odd or not
 */

// class declared as package private and final to prevent inheritance
final class P28_OddOrEven {
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

    // method to find whether the given number is odd or not
    private boolean isThisOdd(int number){
        return number % 2 != 0;
    }

    public static void main (String [] args){
        P28_OddOrEven program28 = new P28_OddOrEven();
        try{
            out.println("\nTool to find whether the given number is odd or Even ");
            out.print("Enter the number : ");
            int number = getUserInput();
            boolean odd = program28.isThisOdd(number);
            if(odd){
                out.printf("Given number %d is odd", number);
            }else{
                out.printf("Given number %d is even", number);
            }
        }catch (Exception e){
            out.print(e.getMessage());
        }
    }
}
