package assignment._51To60;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to print pyramid pattern for given row limit
 */

// class declared as package private and final to prevent inheritance
final class P56_PyramidPattern5 {
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
        int count=0, row=0, lColumn, rColumn;
        while(true){
            lColumn=0;
            while(lColumn<=((rowLimit/2) - row )){
                out.print(" ");
                lColumn++;
            }
            rColumn = 0;
            while(rColumn<=row && count < rowLimit){
                out.print(++count + " ");
                rColumn++;
            }
            out.println("");
            row++;
            if(count >= rowLimit)
                break;
        }
    }

    public static void main(String [] args){
        P56_PyramidPattern5 program56 = new P56_PyramidPattern5();
        try{
            out.println("\nTool to print the pyramid patter ");
            out.print("Enter the row limit : ");
            int row = getIntegerFromUser();
            program56.printPyramidPattern(row);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
