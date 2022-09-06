package kotlin_assignment._51To60;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to print the string in x pattern
 */

// class declared as package private and final to prevent inheritance
final class P57_XPattern {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to print the x pattern of the string
    private void printXPattern(String string){
        int len = string.length()/2 ;
        int count = len;
        int subtractElement = -1;
        String newString="";
        int temp1, temp2;

        out.println("\nString pattern is : ");
        // loop that runs to the length of character in length
        for(int letterPosition=0; letterPosition<string.length(); letterPosition++){
            temp1 = letterPosition;
            temp2 = len*2-letterPosition;

            if(subtractElement>0){
                temp2 = letterPosition;
                temp1 = string.length()-letterPosition-1;
            }

            newString = "      ";
            // loop to add space in front of the string
            for(int outerSpaceCount=0; outerSpaceCount<len-count; outerSpaceCount++){
                newString += " ";
            }

            newString += string.charAt(temp1);

            // loop to add space in between the string
            for(int spaceCount=0; spaceCount<2*(count); spaceCount++){
                newString += " ";
            }

            //
            if(letterPosition != len) {
                newString += string.charAt(temp2);
            }else{
                subtractElement = -subtractElement;
            }

            // prints the line pattern
            out.println(newString);
            count += subtractElement;
        }
    }

    public static void main(String [] args){
        P57_XPattern program57 = new P57_XPattern();
        String string;
        out.println("\nTool to print the String in X pattern ");
        out.print("Enter the string : ");
        string = INPUT.nextLine();       // user input ==> string
        program57.printXPattern(string);
    }
}
