package assignment._01To10;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to merge the two sorted array into one
 */

// class declared as package private and final to prevent inheritance
public class P09_MergeTwoSortedArray {
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
        for(int i=0; i<arraySize; i++){
            temp[i] = getIntegerFromUser();
        }
        return temp;
    }

    // method to merge two arrays
    private Integer[] mergeTheseArraysIntoOne(int[] array1, int[] array2){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int array1Count = 0;
        int array2Count = 0;
        boolean isArray1Completed = false;
        boolean isArray2Completed = false;

        while(!(isArray1Completed && isArray2Completed)){
            if(!isArray1Completed && array1[array1Count] <= array2[array2Count]){
                if(!newArray.contains(array1[array1Count]))
                    newArray.add(array1[array1Count]);
                array1Count++;
            }else if(!isArray2Completed){
                if(!newArray.contains(array2[array2Count]))
                    newArray.add(array2[array2Count]);
                array2Count++;
            }

            if(array1Count == array1.length)
                isArray1Completed = true;
            if (array2Count == array2.length)
                isArray2Completed = true;

        }
        Integer[] mergedArray = new Integer[newArray.size()];
        mergedArray = newArray.toArray(mergedArray);
        return mergedArray;
    }

    // method to print the given array
    private void printThisArray(Integer[] array){
        int count = 0;
        for(int number: array){
            out.print(++count < array.length ? number + "," : number);
        }
    }

    public static void main(String [] args) throws Exception{
        P09_MergeTwoSortedArray program9 = new P09_MergeTwoSortedArray();
        out.println("\nTool to merge two arrays ");
        try{
            int[] array1 = program9.getArrayFromUser();
            int[] array2 = program9.getArrayFromUser();

            Integer[] mergedArray = program9.mergeTheseArraysIntoOne(array1, array2);

            program9.printThisArray(mergedArray);
        }catch( Exception e){
            out.println(e.getMessage());
        }
    }
}
