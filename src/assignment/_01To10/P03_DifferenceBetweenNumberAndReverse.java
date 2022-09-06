package assignment._01To10;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to find the difference between given number, and it's reverse
 */


// class declared as package private and final to prevent inheritance
final class P03_DifferenceBetweenNumberAndReverse {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to return reverse of the given number
    private long getReverseOf(long number){
        long reverse = 0;
        while(number > 0){
            // reversing the given number by multiplying the reverse number with 10 and
            // adding it with the remainder of the number
            reverse  = reverse * 10 + number%10;
            // removing the last number
            number /= 10;
        }
        return reverse;
    }

    // method to find the difference between given number, and it's reverse
    private void printDifferenceBetween(long number, long reverse){
        out.println("Difference between " + number + " and " + reverse + " is : " + (number-reverse) );
    }

    public static void main(String [] args){
        P03_DifferenceBetweenNumberAndReverse program3 = new P03_DifferenceBetweenNumberAndReverse();

        // defining info to the user
        out.println("\nTool to find the difference between the given number and it's reverse ");
        out.print("Enter the number : ");
        // validating whether the user input is number or not
        if(!INPUT.hasNextLong()){
            out.println("Invalid input");
        }else{
            long number = INPUT.nextLong();

            // validating whether the user input is greater than 0 or not
            if(number < 0){
                out.print("Invalid input...");
            }else{
                long reverse = program3.getReverseOf(number);

                program3.printDifferenceBetween(number, reverse);
            }
        }
    }
}
