package assignment.zoho._31To40;

import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to find the largest digit of sum of natural numbers of given limit
 */

// class declared as package private and final to prevent inheritance
final class P34_LargestDigitOfSum {
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

    // method to fin the sum of natural numbers from 1 till the limit
    private int sumOfNumbers(int limit){
        int sum =0;
        for(int number=1; number<limit+1; number++){
            sum += number;
        }
        return sum;
    }

    // method to find and print the largest digit of the given number
    private void printLargestDigitOf(int number){
        int temp = number;
        int largest=number%10;
        while(temp > 0){
            largest = Math.max(temp%10, largest);
            temp /= 10;
        }
        out.println("Largest digit of the number " + number + " is " + largest );
    }

    public static void main(String [] args){
        P34_LargestDigitOfSum program34 = new P34_LargestDigitOfSum();
        try{
            out.println("\nTool to find largest digit of sum of natural number of given limit ");
            out.print("Enter the limit of the natural numbers to be totaled : ");
            int limit = getUserInput();
            int sum = program34.sumOfNumbers(limit);
            program34.printLargestDigitOf(sum);
        }catch (Exception e){
            out.println(e.getMessage());
        }
    }
}
