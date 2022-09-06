package assignment.zoho._11To20;

/*
 * program to solve polynomial equation
 */

import java.util.Scanner;
import static java.lang.System.out;

// class declared as package private and final to prevent inheritance
final class P16_PolynomialEquationSolution {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to get integer input from the user
    private static int getUserInput() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    // method to calculate the area of the cylinder
    private String solvePolynomialEquationWithCoefficient(double a, double b, double c){
        String solution;
        boolean isComplex = false;
        double sqt = b*b - 4 * a * c;
        if(sqt<0){
            isComplex = true;
        }

        sqt = Math.abs(sqt);
        if(isComplex){
            solution = "(" + ( -b/(2*a) ) + " + i " + ( sqt/(2*a) );
            solution += "), (" + ( -b/(2*a) ) + " - i " + ( sqt/(2*a) ) + ")";
        }else{
            solution = "" + ( (-b + sqt )/(2*a) );

            solution += (", " + ( (-b -  sqt)/(2*a) ) );
        }
        return solution;
    }

    public static void main(String [] args){
        P16_PolynomialEquationSolution program16 = new P16_PolynomialEquationSolution();
        try{
            out.println("\nTool to solve the polynomial equation (ax^2 + bx + c)");
            out.print("Enter the value of a : ");
            double a = getUserInput();
            out.print("Enter the value of b : ");
            double b = getUserInput();
            out.print("Enter the value of c : ");
            double c = getUserInput();

            String solution = program16.solvePolynomialEquationWithCoefficient(a, b, c);
            out.println("Solution of the polynomial equation is : " + solution);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }

}
