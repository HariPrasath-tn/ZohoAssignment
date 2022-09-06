package assignment._31To40;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to find whether the given character is alphabet or not
 */

// class declared as package private and final to prevent inheritance
final class P33_GivenCharacterISAlpha {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to get character as user input
    private static char getUserInput() throws Exception{
        try {
            String userInput = INPUT.nextLine();

            if (userInput.length() > 1) {
                throw new Exception("Invalid input...");
            } else {
                return userInput.charAt(0);
            }
        }catch (Exception e){
            throw new Exception("No character found");
        }
    }

    // method to print the alphabet series till the 'Z' from the given character
    private boolean isThisAlphabet(char character){
        if((character <= 'z' && character >= 'a') || (character <= 'Z' && character >= 'A'))
            return true;
        return false;
    }

    public static void main(String [] args){
        P33_GivenCharacterISAlpha program33 = new P33_GivenCharacterISAlpha();

        // defining info to the user
        out.println("\nTool to find character is alphabet or not");
        out.print("Enter a character : ");

        boolean alphabet=false;
        char character=' ';
        try {
            character = getUserInput();
            alphabet = program33.isThisAlphabet(character);
            if(alphabet){
                out.printf("\nGiven character '%c' is an alphabet", character);
            }else{
                out.printf("\nGiven character '%c' is not an alphabet", character);
            }
        }catch (Exception e){
            out.print(e.getMessage());
        }


    }
}
