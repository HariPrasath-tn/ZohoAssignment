package assignment._31To40;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to the Largest element of the array
 */

// class declared as package private and final to prevent inheritance
final class P38_LargestArrayElement {
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

        // getting array element
        out.println("Enter the elements one by one : ");
        for(int i=0; i<arraySize; i++){
            temp[i] = getIntegerFromUser();
        }
        return temp;
    }

    // method to find and print the largest element of the given array
    private void printLargestElementOf(int[] array){
        int largest=array[0];
        for(int element: array){
            largest = Math.max(element, largest);
        }
        out.println("Largest element of the array is " + largest );
    }


    public static void main(String [] args) throws Exception{
        P38_LargestArrayElement program38 = new P38_LargestArrayElement();
        out.println("\nTool to print Largest element of the array ");
        try{
            int[] array1 = program38.getArrayFromUser();

            program38.printLargestElementOf(array1);
        }catch( Exception e){
            out.println(e.getMessage());
        }
    }
}
