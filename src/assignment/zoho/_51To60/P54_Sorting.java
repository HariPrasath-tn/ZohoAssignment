package assignment.zoho._51To60;

import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to sort the given array in the given format
 */

// class declared as package private and final to prevent inheritance
final class P54_Sorting {

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

    // method to sort the elements in the array
    private int[] sortThisArray(int[] array){
        int temp=0;
        for(int i=0; i<array.length; i++){
            for(int j =i+1; j<array.length; j++){
                if(i%2 == 0 && j%2 ==0) {           // swapping the values at odd position to get descending order values in odd positions of the given array
                    if (array[i] < array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }else if(i%2 != 0 && j%2 !=0){      // swapping the values at even position to get ascending order values in even positions of the given array
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }

    // method to print the given array
    private void printThisArray(int[] array){
        out.print("{");
        int count = 0;
        for(int number: array){
            out.print(++count < array.length ? number + "," : number);
        }
        out.print("}");
    }


    public static void main(String [] args){
        P54_Sorting program54 = new P54_Sorting();
        try{
            out.println("\nTool to Sort the given in recommend format ");
            int[] array = program54.getArrayFromUser(); // getting array from the user
            array = program54.sortThisArray(array); // sorting the array in given format
            out.print("Sorted array in the given format : ");
            program54.printThisArray(array);  // printing the given array
        }catch (Exception e){
            out.println(e.getMessage());
        }

    }
}
