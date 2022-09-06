package assignment.zoho._31To40;

import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to print elements at even position in an array
 */

// class declared as package private and final to prevent inheritance
final class P36_PrintEvenPositionElements {
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

    // method to print the given array
    private void printElementsThisArrayAtEvenPosition(int[] array){
        int i;
        out.print("Elements at even position of the array are : ");
        for(i=0; i<array.length; i++){
            if((i+1) %2 == 0)
                out.print(array[i]);
        }
    }

    public static void main(String [] args) throws Exception{
        P36_PrintEvenPositionElements program36 = new P36_PrintEvenPositionElements();
        out.println("\nTool to print elements at even position ");
        try{
            int[] array1 = program36.getArrayFromUser();

            program36.printElementsThisArrayAtEvenPosition(array1);
        }catch( Exception e){
            out.println(e.getMessage());
        }
    }
}
