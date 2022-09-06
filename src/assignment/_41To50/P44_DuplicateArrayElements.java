package assignment._41To50;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to find the duplicate elements of the array
 */

// class declared as package private and final to prevent inheritance
final class P44_DuplicateArrayElements {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    private int arrayCount = 0;
    private ArrayList<Collection_> coll = new ArrayList<>();


    // collection to maintain the dictionary of the array elements
    private class Collection_{
        private final int key;
        private int frequency;
        Collection_(int key){
            this.key = key;
            frequency = 1;
        }

        // getter of key
        private int getKey(){
            return this.key;
        }

        //getter of value
        private int getFrequency(){
            return this.frequency;
        }

        // method to increase the frequency
        private void increaseFrequency(){
            this.frequency++;
        }
    }

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

    private void printDuplicate(int[] arr){
        int count=0;
        for(int element : arr){
            for(Collection_ temp : coll){
                if(temp.key == element){
                    count++;
                    temp.increaseFrequency();
                    break;
                }
            }
            if(count==0){
                coll.add(new Collection_(element));
            }
            count = 0;
        }

        out.print("Duplicate elements are : ");
        for(Collection_ temp : coll){
            if(temp.getFrequency()>1)
                out.print(temp.getKey() + " ");
        }
    }

    public static void main(String [] args){
        P44_DuplicateArrayElements program44 = new P44_DuplicateArrayElements();
        out.println("\nTool to print Duplicate element of the array ");
        try{
            int[] array1 = program44.getArrayFromUser();

            program44.printDuplicate(array1);
        }catch( Exception e){
            out.println(e.getMessage());
        }
    }
}
