package assignment.zoho._41To50;

import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to print pyramid pattern for given row limit
 */

// class declared as package private and final to prevent inheritance
final class P48_PyramidPattern2 {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to get integer input from the user
    private static int getIntegerFromUser() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    // method print the pattern
    private void printPyramidPattern(int rowLimit){
        for(int row=0; row<rowLimit; row++){
            for(int lColumn=0; lColumn<=rowLimit-row-1; lColumn++){
                out.print(" ");
            }
            for(int lColumn=row; lColumn>=0; lColumn--){
                out.print(rowLimit - lColumn);
            }
            for(int rColumn=1; rColumn<=row; rColumn++){
                out.print(rowLimit-rColumn);
            }
            out.println("");
        }
    }

    public static void main(String [] args){
        P48_PyramidPattern2 program48 = new P48_PyramidPattern2();
        try{
            out.println("\nTool to print the pyramid patter ");
            out.print("Enter the row limit : ");
            int row = getIntegerFromUser();
            program48.printPyramidPattern(row);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
