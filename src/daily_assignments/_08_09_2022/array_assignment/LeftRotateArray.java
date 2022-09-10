package daily_assignments._08_09_2022.array_assignment;

import java.util.Scanner;

import static java.lang.System.out;

public class LeftRotateArray {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    private static int arrayCount = 0;

    // method to get integer input from the user
    private static int getIntegerFromUser() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    // method to get array from the user
    private static int[] getArrayFromUser() throws Exception{
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
    private static void printThisArray(int[] array){
        out.print("{");
        int count = 0;
        for(int number: array){
            out.print(++count < array.length ? number + "," : number);
        }
        out.print("}");
    }

    // method to rotate given array left for given number of steps
    private static int[] rotateThisArray(int[] array, int steps){
        int temp, i;
        for(int step=0;  step<steps; step++){
            temp = array[0];
            for(i=0; i<array.length-1; i++){
                array[i] = array[i+1];
            }
            array[i] = temp;
        }
        return array;
    }


    public static void main(String [] args){
        try{
            out.println("\nTool to rotate the array into given number of steps");
            int[] array = getArrayFromUser(); // getting array from the user
            out.print("Enter the number of steps to rotate : ");
            int steps = getIntegerFromUser(); // steps to rotate
            array = rotateThisArray(array, steps); // rotating the given array of given number of steps
            printThisArray(array);  // printing the given array
        }catch (Exception e){
            out.println(e.getMessage());
        }

    }
}
