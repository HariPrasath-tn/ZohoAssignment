package assignment._41To50;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to print pyramid pattern for given row limit
 */

// class declared as package private and final to prevent inheritance
final class P50_PyramidPattern4 {
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
            for(int lColumn=0; lColumn<row; lColumn++){
                out.print(" ");
            }
            for(int lColumn=row; lColumn<rowLimit; lColumn++){
                out.print((rowLimit-row)+" ");
            }
            out.println("");
        }
    }

    public static void main(String [] args){
        P50_PyramidPattern4 program50 = new P50_PyramidPattern4();
        try{
            out.println("\nTool to print the pyramid patter ");
            out.print("Enter the row limit : ");
            int row = getIntegerFromUser();
            program50.printPyramidPattern(row);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
