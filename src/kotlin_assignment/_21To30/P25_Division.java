package kotlin_assignment._21To30;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to find the quotient and the remainder
 */

// class declared as package private and final to prevent inheritance
final class P25_Division {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    private double quotient, remainder;

    // method to get double input from the user
    private static double getUserInput() throws Exception{
        if(!INPUT.hasNextDouble()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextDouble();
        }
    }

    // getter for Quotient
    private double getQuotient(){
        return this.quotient;
    }

    // getter for Remainder
    private double getRemainder(){
        return this.remainder;
    }

    // setter for Quotient
    private void setQuotient(double quotient){
        this.quotient=quotient;
    }

    // setter for Remainder
    private void setRemainder(double remainder){
        this.remainder=remainder;
    }

    // method to find the Quotient and remainder
    private void setQuotientRemainder(double divident, double divisor){
        this.setQuotient(divident/divisor);
        this.setRemainder(divident%divisor);
    }

    public static void main(String [] args){
        P25_Division program25 = new P25_Division();
        try{
            out.println("\nTool to find the quotient and the remainder ");
            out.print("Enter the divident : ");
            double divident = getUserInput();

            out.print("Enter the divisor : ");
            double divisor = getUserInput();

            program25.setQuotientRemainder(divident, divisor);

            out.printf("\nQuotient and remainder of the expression (%.1f/%.1f) is %.1f and %.1f\n", divident, divisor, program25.getQuotient(), program25.getRemainder());

        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
