package assignment.zoho._01To10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to print the string in x pattern
 */

// class declared as package private and final to prevent inheritance
final class P07_PrintStringIn_X_Pattern {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to print the x pattern of the string
    private void printXPattern(String string){
        int len = string.length()/2 ;
        int count = len;
        int subtractElement = -1;
        String newString="";

        out.println("\nString pattern is : ");
        // loop that runs to the length of character in length
        for(int letterPosition=0; letterPosition<string.length(); letterPosition++){
            newString = "      ";
            // loop to add space in front of the string
            for(int outerSpaceCount=0; outerSpaceCount<len-count; outerSpaceCount++){
                newString += " ";
            }
            newString += string.charAt(letterPosition);

            // loop to add space in between the string
            for(int spaceCount=0; spaceCount<2*(count); spaceCount++){
                newString += " ";
            }

            //
            if(letterPosition != len) {
                newString += string.charAt(letterPosition);
            }else {
                subtractElement = -subtractElement;
            }
            // prints the each line pattern
            out.println(newString);
            count += subtractElement;
        }
    }

    public static void main(String [] args){
        P07_PrintStringIn_X_Pattern program7 = new P07_PrintStringIn_X_Pattern();
        String string;
        out.println("\nTool to print the String in X pattern ");
        out.print("Enter the string : ");
        string = INPUT.nextLine();       // user input ==> string
        program7.printXPattern(string);
    }
}
