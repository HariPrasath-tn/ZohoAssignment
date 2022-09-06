package assignment._41To50;

import static java.lang.System.out;

/*
 * program to copy elements of one array to another
 */

// class declared as package private and final to prevent inheritance
final class P41_CopyArray {

    // method to print the given array
    private static void printThisArray(int[] array){
        int count = 0;
        for(int number: array){
            out.print(++count < array.length ? number + "," : number);
        }
    }

    public static void main(String [] args) throws Exception{
        out.println("\nTool to copy elements of one array to another ");
        try{
            int[] arr = {1, 3, 5, 6, 22, 6, 33, 6, 66, 77, 22, 66, 120};
            int[] arr2 = arr.clone();
            out.print("Elements of the array 1 are : ");
            printThisArray(arr);
            out.print("\nElements of the array 2 are : ");
            printThisArray(arr2);
        }catch( Exception e){
            out.println(e.getMessage());
        }
    }
}
