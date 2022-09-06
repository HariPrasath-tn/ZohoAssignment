package assignment.zoho._31To40;

import static java.lang.System.out;

/*
 * program to calculate number of elements in the array
 */

// class declared as package private and final to prevent inheritance
final class P40_NumberOfArrayElements {

    public static void main(String [] args) throws Exception{
        out.println("\nTool to print number of elements in the array ");
        try{
            int[] arr = {1, 3, 5, 6, 22, 6, 33, 6, 66, 77, 22, 66, 120};
            out.print("Number of Elements in the given array is : " + arr.length);
        }catch( Exception e){
            out.println(e.getMessage());
        }
    }
}
