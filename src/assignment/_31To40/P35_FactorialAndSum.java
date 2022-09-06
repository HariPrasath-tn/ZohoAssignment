package assignment._31To40;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to find the sum of digits of factorial of given number
 */

// class declared as package private and final to prevent inheritance
final class P35_FactorialAndSum {
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

    // method to find the factorial for the given number
    private int getFactorialOf(int number){
        if(!(number > 0))
            return 1;
        return number * this.getFactorialOf(number-1);
    }
    // method to find the sum of the digits
    private int sumOfDigits(int number){
        int sumOfDigit = 0;
        while(number > 0){
            sumOfDigit += (number%10);
            number /= 10;
        }
        return sumOfDigit;
    }


    public static void main(String [] args){
        P35_FactorialAndSum program35 = new P35_FactorialAndSum();
        try{
            out.println("\nTool to find sum of digits of factorial of the given number ");
            out.print("Enter the the natural numbers : ");
            int number = getUserInput();
            int factorial = program35.getFactorialOf(number);
            int sum = program35.sumOfDigits(factorial);
            out.printf("Sum of the digits of factorial(%d) of the given number %d is %d", factorial, number, sum);
        }catch (Exception e){
            out.println(e.getMessage());
        }
    }
}
