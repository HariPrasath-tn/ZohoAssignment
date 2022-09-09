package daily_assignments._08_09_2022;

import static java.lang.System.out;
import java.util.Scanner;


/*
*   Program to find the given number is fashion number or not
 */
final class FashionNumber {
    private final static Scanner input = new Scanner(System.in); // initializing Scanner class instance as input

    // method to get number from the use
    private static int getNumber(String request) throws Exception{
        out.print(request);
        if(input.hasNextInt())
            return input.nextInt();
        throw new Exception("Expecting number");
    }

    // method to find the given number is fashion number or not
    private static boolean isFashionNumber(int number){
        int number2 = 0, number1 = 0;
        number2 += number/100;
        number1 = number%100;
        return Math.pow(number1+number2, 2) == number;
    }

    public static void main(String[] args) {
        out.println("Tool to find the given number is fashion number or not ");
        try {
            int number = getNumber("Enter the number : ");
            // resultant output
            out.printf("The given number %d is %s", number, isFashionNumber(number)? "a fashion number" : "not a fashion number");

        }catch(Exception e){
            out.print(e.getMessage());
        }
    }
}
