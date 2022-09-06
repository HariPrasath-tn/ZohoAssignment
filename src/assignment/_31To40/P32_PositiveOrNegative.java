package assignment._31To40;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * Program to find whether the given number is positive or negative
 */

// class declared as package private and final to prevent inheritance
final class P32_PositiveOrNegative {
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

    // method to find whether the given number is positive or negative
    private boolean isThisPositive(int number){
        return number >= 0;
    }

    public static void main (String [] args){
        P32_PositiveOrNegative program32 = new P32_PositiveOrNegative();
        try{
            out.println("\nTool to find whether the given number is Positive or negative ");
            out.print("Enter the number : ");
            int number = getUserInput();
            if(number == 0)
                throw new Exception("Given number " + number + " is zero");
            boolean positive = program32.isThisPositive(number);
            if(positive){
                out.printf("Given number %d is positive", number);
            }else{
                out.printf("Given number %d is negative", number);
            }
        }catch (Exception e){
            out.print(e.getMessage());
        }
    }
}
