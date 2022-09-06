package assignment._41To50;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to rotate array right given number of steps
 */

// class declared as package private and final to prevent inheritance
final class P46_RotateArrayRight {
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
    private void printThisArray(int[] array){
        out.print("{");
        int count = 0;
        for(int number: array){
            out.print(++count < array.length ? number + "," : number);
        }
        out.print("}");
    }

    // method to rotate given array right for given number of steps
    private int[] rotateThisArray(int[] array, int steps){
        int temp, i, len = array.length-1, temp2;
        for(int step=0;  step<steps; step++){
            temp2 = array[0];
            for(i=0; i<len; i++){
                temp = array[i+1];
                array[i+1] = temp2;
                temp2 = temp;
            }
            array[0] = temp2;
        }
        return array;
    }


    public static void main(String [] args){
        P46_RotateArrayRight program46 = new P46_RotateArrayRight();

        try{
            out.println("\nTool to rotate the array into given number of steps in right");
            int[] array = program46.getArrayFromUser(); // getting array from the user
            out.print("Enter the number of steps to rotate : ");
            int steps = getIntegerFromUser(); // steps to rotate
            array = program46.rotateThisArray(array, steps); // rotating the given array of given number of steps in right
            program46.printThisArray(array);  // printing the given array
        }catch (Exception e){
            out.println(e.getMessage());
        }

    }
}
