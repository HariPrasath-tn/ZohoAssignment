package assignment._01To10;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to rearrange the array in such a way that the first element is first maximum
 * and second element is first minimum
 */

// class declared as package private and final to prevent inheritance
final class P10_RearrangeGivenArray {
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

    // method to rearrange the given array
    private int[] rearrangeArray(int[] array){
        int[] newArray = new int[array.length];
        int max = array.length-1, min=0;
        int i =0;
        while(min<=max && i < array.length){
            if(i%2 == 0)
                newArray[i] = array[max--];
            else
                newArray[i] = array[min++];
            i++;
        }

        return newArray;
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

    public static void main(String [] args) throws Exception{
        P10_RearrangeGivenArray program10 = new P10_RearrangeGivenArray();
        out.println("\nTool to rearrange the number the array ");
        try{
            int[] array = program10.getArrayFromUser();
            array = program10.rearrangeArray(array);
            program10.printThisArray(array);
        }catch( Exception e){
            out.println(e.getMessage());
        }
    }

}
