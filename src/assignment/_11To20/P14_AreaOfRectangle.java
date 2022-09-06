package assignment._11To20;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to print area of the rectangle
 */

// class declared as package private and final to prevent inheritance
final class P14_AreaOfRectangle {
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
    private double findAreaOfRectangle(double length, double breadth){
        double area = length * breadth;
        return area;
    }


    public static void main(String [] args){
        P14_AreaOfRectangle program14 = new P14_AreaOfRectangle();
        try{
            out.println("\nTool to fin the area of the Rectangle");
            out.print("Enter the length of the rectangle : ");
            double length = gerUserInput();                     // length of the rectangle
            out.print("Enter the breadth of the rectangle : ");
            double breadth = gerUserInput();                    // breadth of the rectangle
            double area = program14.findAreaOfRectangle(length, breadth);

            out.printf("\nArea of the rectangle : %.2f\n", area);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
