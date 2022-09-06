package kotlin_assignment._11To20;
/*
* program to print area of the cylinder
*/

import java.util.Scanner;

import static java.lang.System.out;

// class declared as package private and final to prevent inheritance
final class P15_AreaOfCylinder {
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
    private double findAreaOfCylinder(double height, double radius){
        double area = 2 * Math.PI * radius *(height + radius);
        return area;
    }


    public static void main(String [] args){
        P15_AreaOfCylinder program15 = new P15_AreaOfCylinder();
        try{
            out.println("\nTool to find the radius of the cylinder ");
            out.print("Enter the radius of the cylinder : ");
            double radius = getUserInput();                  // radius user input
            out.print("Enter the height of the cylinder : ");
            double height = getUserInput();                 // height user input

            double area = program15.findAreaOfCylinder(height, radius);         // area of cylinder
            out.printf("\nArea of the cylinder of height %.2f and radius %.2f is %.2f\n", height, radius, area);
        }catch (Exception e){
            out.println(e.getMessage());
        }
    }

}
