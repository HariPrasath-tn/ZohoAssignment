package assignment._01To10;

import java.util.Scanner;

import static java.lang.System.out;
/*
* program to generate multiplication and subtraction table for the given table
 */

// class declared as package private and final to prevent inheritance
final class P01_GenerateMultiplicationAndSubtractionTable {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    private int iterator;

    // method to print the multiplication table for the given number
    private void printMultiplicationTable(int number){
        out.println("\nMultiplication table for the given number : ");

        for(iterator=0; iterator<17; iterator++){
            out.println(iterator + " x " + number + " = " + iterator * number);
        }
    }

    // method to print the subtraction table for the given number
    private void printSubtractionTable(int number){
        out.println("\nSubtraction table for the given number : ");

        for(iterator=0; iterator<17; iterator++){
            out.println(iterator + " - " + number + " = " + (iterator - number));
        }
    }

    // Main method
    public static void main(String [] args){

        // creating the instance for the class
        P01_GenerateMultiplicationAndSubtractionTable program1 = new P01_GenerateMultiplicationAndSubtractionTable();

        // defining info to the user
        out.println("Tool to generate multiplication and subtraction table");
        out.print("Enter the number : ");

        // validation whether the user input is integer or not
        if(!INPUT.hasNextInt()){
            out.println("Invalid input...");
        }else{
            int number = INPUT.nextInt();

            // validating whether the user input is greater than 0 or not
            if(number < 1){
                out.println("Enter a number greater than 0");
            }else{
                program1.printMultiplicationTable(number);
                program1.printSubtractionTable(number);
            }
        }
    }
}
