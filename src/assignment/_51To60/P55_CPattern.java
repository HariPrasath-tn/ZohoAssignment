package assignment._51To60;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to print C pattern for given row limit
 */

// class declared as package private and final to prevent inheritance
final class P55_CPattern {
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

    // method to print the c Pattern for given number of rows
    private void printCPattern(int rowLimit){
        for(int row=0; row<rowLimit; row++){
            for(int Column=0; Column<rowLimit; Column++){
                if(row == rowLimit - 1 || Column == 0 || row == 0)
                    out.print("* ");
            }
            out.println("");
        }
    }

    public static void main(String [] args){
        P55_CPattern program55 = new P55_CPattern();
        try{
            out.println("\nTool to print the C patter ");
            out.print("Enter the row limit : ");
            int row = getIntegerFromUser();
            program55.printCPattern(row);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
