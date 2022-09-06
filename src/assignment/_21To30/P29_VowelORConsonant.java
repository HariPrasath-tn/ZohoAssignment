package assignment._21To30;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

/*
 * Program to find whether the given number is odd or not
 */

// class declared as package private and final to prevent inheritance
final class P29_VowelORConsonant {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    private final ArrayList<Character> VOWELS = new ArrayList<>();
    P29_VowelORConsonant(){
        VOWELS.add('a');
        VOWELS.add('e');
        VOWELS.add('i');
        VOWELS.add('o');
        VOWELS.add('u');
    }

    // method to get user input
    private static char getUserInput() throws Exception{
        String userInput = INPUT.next();
        if(userInput.length() > 1){
            throw new Exception("Invalid input...");
        }else{
            return userInput.charAt(0);
        }
    }

    // method to find whether the character is vowel or not
    private boolean isVowel(char letter){
        return VOWELS.contains(letter);
    }

    public static void main(String [] args){
        P29_VowelORConsonant program29 = new P29_VowelORConsonant();

        // defining info to the user
        out.println("\nTool to generate the downwards right angle triangle of alphabet till 'A' from th given character in reverse");
        out.print("Enter a character between 'A' and 'Z' : ");

        boolean vowel=false;
        char letter='c';
        try {
            letter = getUserInput();
            if (letter <= 'Z' && letter >= 'A') {
                vowel = program29.isVowel((char)(letter + 32));
            } else if (letter <= 'z' && letter >= 'a') {
                vowel = program29.isVowel(letter);
            } else {
                throw new Exception("Invalid input....");
            }
        }catch (Exception e){
            out.print(e.getMessage());
        }

        if(vowel){
            out.printf("\nGiven character '%c' is vowel", letter);
        }else{
            out.printf("\nGiven character '%c' is consonant", letter);
        }
    }
}
