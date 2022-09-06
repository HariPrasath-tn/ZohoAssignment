package kotlin_assignment._51To60;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to print pattern for given row limit
 */

// class declared as package private and final to prevent inheritance
final class P58_Pattern {
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
    private void printPyramidPattern(int __){
        for(int row=0; row<__; row++){
            for(int lColumn=0; lColumn<__-row; lColumn++){
                out.print("*");
            }
            for(int rColumn=0; rColumn<row; rColumn++){
                out.print("_");
            }
            for(int rColumn=0; rColumn<row; rColumn++){
                out.print("_");
            }
            for(int lColumn=0; lColumn<__-row; lColumn++){
                out.print("*");
            }
            out.println("");
        }
        for(int row=__-1; row>=0; row--){
            for(int lColumn=0; lColumn<__-row; lColumn++){
                out.print("*");
            }
            for(int rColumn=0; rColumn<row; rColumn++){
                out.print("_");
            }
            for(int rColumn=0; rColumn<row; rColumn++){
                out.print("_");
            }
            for(int lColumn=0; lColumn<__-row; lColumn++){
                out.print("*");
            }
            out.println("");
        }


    }

    public static void main(String [] args){
        P58_Pattern program58 = new P58_Pattern();
        try{
            out.println("\nTool to print the patter ");
            out.print("Enter the total '_' limit : ");
            int __ = getIntegerFromUser();
            program58.printPyramidPattern(__);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
