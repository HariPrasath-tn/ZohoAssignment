package assignment.zoho._41To50;

import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to print pyramid pattern for given row limit
 */

// class declared as package private and final to prevent inheritance
final class P47_PyramidPattern1 {
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
            for(int lColumn=0; lColumn<=row; lColumn++){
                out.print(lColumn+1);
            }
            for(int rColumn=row; rColumn>0; rColumn--){
                out.print(rColumn);
            }
            out.println("");
        }
    }

    public static void main(String [] args){
        P47_PyramidPattern1 program47 = new P47_PyramidPattern1();
        try{
            out.println("\nTool to print the pyramid patter ");
            out.print("Enter the row limit : ");
            int row = getIntegerFromUser();
            program47.printPyramidPattern(row);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
