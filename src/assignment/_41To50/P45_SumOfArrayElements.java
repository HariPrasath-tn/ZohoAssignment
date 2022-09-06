package assignment._41To50;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to sum the array elements
 */

// class declared as package private and final to prevent inheritance
final class P45_SumOfArrayElements {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    private int arrayCount = 0;

    // method to get integer input from the user
    private static int getIntegerFromUser() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    // method to get array from the user
    private int[] getArrayFromUser() throws Exception{
        arrayCount++;
        out.print("Enter the number of elements in array"+arrayCount+" : ");
        int arraySize = getIntegerFromUser();
        int [] temp = new int[arraySize];

        out.println("Enter the elements one by one : ");
        // getting array element
        for(int i=0; i<arraySize; i++){
            temp[i] = getIntegerFromUser();
        }
        return temp;
    }

    // method to print the given array
    private void printArraySum(int[] array){
        int sum=0;
        for(int number: array){
            sum += number;
        }
        out.print("Sum of the array elements : " + sum);
    }

    public static void main(String [] args){
        P45_SumOfArrayElements program45 = new P45_SumOfArrayElements();

        try{
            out.println("\nTool to sum the array elements");
            int[] array = program45.getArrayFromUser(); // getting array from the user
            program45.printArraySum(array);  // printing the given array
        }catch (Exception e){
            out.println(e.getMessage());
        }

    }
}
