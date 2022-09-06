package assignment.zoho._21To30;

import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to find the ascii value of the given character
 */

// class declared as package private and final to prevent inheritance
final class P24_AsciiOfCharacter {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    //method to find the ascii value of the character
    private static int getAsciiValueOf(char letter){
        return letter;
    }


    public static void main(String [] args){
        // defining info to the user
        out.println("\nTool to find the ascii value of the given character ");
        out.print("Enter a character : ");
        try{
            String userInput = INPUT.nextLine();

            if(userInput.length() > 1){
                out.println("Invalid input...");
            }else {
                char letter = userInput.charAt(0);
                int asciiValue = getAsciiValueOf(letter);
                out.printf("\nAscii value of the character '%c' is : %d", asciiValue, asciiValue);
            }
        }catch(Exception e){
            out.print("Invalid input...");
        }

    }
}
