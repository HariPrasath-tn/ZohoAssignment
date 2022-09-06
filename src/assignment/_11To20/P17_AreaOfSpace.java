package assignment._11To20;
/*
 * program to find the area of space between two concentric circles
 */

import java.util.Scanner;

import static java.lang.System.out;

// class declared as package private and final to prevent inheritance
final class P17_AreaOfSpace {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to get double input from the user
    private static double getUserInput() throws Exception{
        if(!INPUT.hasNextDouble()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextDouble();
        }
    }

    // method to calculate the area of the cylinder
    private double findAreaOfCircle(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String [] args){
        P17_AreaOfSpace program17 = new P17_AreaOfSpace();
        try{
            out.println("\nTool to find the area of space between two concentric circles ");
            out.print("Enter the radius of the first Circle : ");
            double radius1 = getUserInput();                  // user input of first circle radius

            out.print("Enter the radius of the second Circle : ");
            double radius2 = getUserInput();                  // user input of second circle radius

            double area1 = program17.findAreaOfCircle(radius1);         // area of circle1
            double area2 = program17.findAreaOfCircle(radius2);         // area of circle2
            out.printf("\nArea of space between two circles of radius %.2f and radius %.2f is %.2f\n", radius1, radius2, Math.abs(area1-area2));
        }catch (Exception e){
            out.println(e.getMessage());
        }
    }
}
