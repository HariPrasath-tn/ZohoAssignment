package assignment._01To10;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to generate the reverse alphabetic Pattern from the given character till 'A'
 */

// class declared as package private and final to prevent inheritance
final class P05_PrintAlphaPattern {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    // head of the alphabet is declared as constant to keep it immutable
    private final char HEAD = 'A';

    // method to print the alphabet Pattern in the form of downwards right angle triangle till the 'A'
    // from the given character in reverse order
    private void printAlphaPatternFrom(char tail){
        out.println("\nAlphabet series from '" + tail + "' is : ");

        // loop that runs till it reaches 'A'
        while(tail >= HEAD){
            int count = 0;

            // loop that runs till it prints the character its position time in alphabet series
            while(tail-count > 64 ){
                out.print(tail);
                count++;
            }
            out.println("");
            tail--;
        }
    }

    public static void main(String [] args){
        P05_PrintAlphaPattern program2 = new P05_PrintAlphaPattern();

        // defining info to the user
        out.println("\nTool to generate the downwards right angle triangle of alphabet till 'A' from th given character in reverse");
        out.print("Enter a character between 'A' and 'Z' : ");
        String userInput = INPUT.next();

        if(userInput.length() > 1){
            out.println("Invalid input...");
        }else{
            char head = userInput.charAt(0);
            if(head <= 'Z' && head >= 'A'){
                program2.printAlphaPatternFrom(head);
            }else if(head <= 'z' && head >= 'a'){
                head -= 32;
                program2.printAlphaPatternFrom(head);
            }else{
                out.print("Invalid input....");
            }
        }
    }
}
