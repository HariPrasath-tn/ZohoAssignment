package kotlin_assignment._51To60;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to print strings of sentence in Reverse Order
 */

// class declared as package private and final to prevent inheritance
final class P52_ReverseWordsInSentence {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to reverse the given String
    private void printStringInReverse(String sentence){
        String reversed = "";

        String [] coll = sentence.split(" ");
        for(String str: coll){
            reversed = str + " " + reversed;
        }
        out.println("Strings in reversed order is : " + reversed);
    }

    public static void main(String [] args){
        P52_ReverseWordsInSentence program52 = new P52_ReverseWordsInSentence();
        try{
            out.println("\nTool to print strings of a sentence in reverse ");
            out.print("Enter the sentence : ");
            String sentence = INPUT.nextLine();
            program52.printStringInReverse(sentence);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
