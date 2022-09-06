package kotlin_assignment._31To40;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to the Smallest element of the array
 */

// class declared as package private and final to prevent inheritance
final class P39_SmallestArrayElement {
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

    // method to find and print the Smallest element of the given array
    private void printSmallestElementOf(int[] array){
        int smallest=array[0];
        for(int element: array){
            smallest = Math.min(element, smallest);
        }
        out.println("Smallest element of the array is " + smallest );
    }


    public static void main(String [] args) throws Exception{
        P39_SmallestArrayElement program39 = new P39_SmallestArrayElement();
        out.println("\nTool to print Smallest element of the array ");
        try{
            int[] array1 = program39.getArrayFromUser();

            program39.printSmallestElementOf(array1);
        }catch( Exception e){
            out.println(e.getMessage());
        }
    }
}
