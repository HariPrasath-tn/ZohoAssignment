package assignment.zoho._11To20;

import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to print area of the square
 */

// class declared as package private and final to prevent inheritance
final class P13_AreaOfSquare {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to get double input from the user
    private static double gerUserInput() throws Exception{
        if(!INPUT.hasNextDouble()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextDouble();
        }
    }

    // method to calculate the area of the square
    private double findAreaOfSquare(double side){
        double area = side * side;
        return area;
    }


    public static void main(String [] args){
        P13_AreaOfSquare program13 = new P13_AreaOfSquare();
        try{
            out.println("\nTool to fin the area of the square");
            out.print("Enter the side length of the square : ");
            double side = gerUserInput();
            double area = program13.findAreaOfSquare(side);

            out.printf("\nArea of the square : %.2f\n", area);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
