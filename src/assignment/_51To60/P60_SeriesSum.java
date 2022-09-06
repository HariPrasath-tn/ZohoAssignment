package assignment._51To60;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to find series and sum
 */

// class declared as package private and final to prevent inheritance
final class P60_SeriesSum {
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

    // method to print the series and its sum
    private void printSeriesAndSum(int limit){
        int sum = 0;
        String series = "";
        String number = "";
        for(int i=0; i<limit; i++){
            number += "1";
            series += i==limit-1 ? number: number+"+";
            sum += Integer.parseInt(number);
        }

        out.println("Series for the given limit is : " + series);
        out.println("Sum of the series is : " + sum);
    }

    public static void main(String [] args){
        P60_SeriesSum program60 = new P60_SeriesSum();
        try{
            out.println("\nTool to print the  series and sum  ");
            out.print("Enter the series limit : ");
            int limit = getIntegerFromUser();
            program60.printSeriesAndSum(limit);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
