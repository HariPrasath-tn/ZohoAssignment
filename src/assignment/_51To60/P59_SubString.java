package assignment._51To60;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to find the substring
 */

// class declared as package private and final to prevent inheritance
final class P59_SubString {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to find the Substring
    private int findStartingOf(String str1, String str2){
        return str1.indexOf(str2);
    }

    public static void main(String [] args){
        P59_SubString program59 = new P59_SubString();
        out.print("Enter the main string : ");
        String str1 = INPUT.nextLine();
        out.print("Enter the substring string : ");
        String str2 = INPUT.nextLine();
        out.print("OutPut = " + program59.findStartingOf(str1, str2));

    }
}
