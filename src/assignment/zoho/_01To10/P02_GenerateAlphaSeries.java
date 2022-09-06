package assignment.zoho._01To10;

import java.util.Scanner;
import static java.lang.System.out;

/*
* program to generate the alphabetic series from the given character till 'Z'
 */

// class declared as package private and final to prevent inheritance
final class P02_GenerateAlphaSeries {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    // tail of the alphabet is declared as constant to keep it immutable
    private final char TAIL = 'Z';

    // method to print the alphabet series till the 'Z' from the given character
    private void printAlphaSeriesFrom(char head){
        out.print("\nAlphabet series from '" + head + "' is : ");
        while(head <= TAIL){
            out.print(head);
            head++;
        }
    }

    public static void main(String [] args){
        P02_GenerateAlphaSeries program2 = new P02_GenerateAlphaSeries();

        // defining info to the user
        out.println("\nTool to generate the series of alphabet till 'Z' from th given character ");
        out.print("Enter a character between 'A' and 'Z' : ");
        String userInput = INPUT.next();

        if(userInput.length() > 1){
            out.println("Invalid input...");
        }else{
            char head = userInput.charAt(0);
            if(head <= 'Z' && head >= 'A'){
                program2.printAlphaSeriesFrom(head);
            }else if(head <= 'z' && head >= 'a'){
                head -= 32;
                program2.printAlphaSeriesFrom(head);
            }else{
                out.print("Invalid input....");
            }
        }
    }

}
