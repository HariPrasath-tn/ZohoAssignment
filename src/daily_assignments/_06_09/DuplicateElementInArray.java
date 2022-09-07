package daily_assignments._06_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

final class DuplicateElementInArray {
    /*
    *    method to find duplicates in an array using the bitwise operator Xor '^'
     */

    private static List<Integer> duplicateIn(int[] arr){
        List<Integer> duplicates = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                // checking whether the two numbers are same using the bitwise operator Xor
                if((arr[i] ^ arr[j]) == 0 && !duplicates.contains(arr[i])){
                    duplicates.add(arr[i]);
                }
            }
        }
        return duplicates;
    }

    /*
     * method to print the duplicate elements in the array
     */
    public static void printDuplicate(int [] arr){
        List<Integer> duplicates = duplicateIn(arr);

        if(duplicates.size() > 0) {
            out.println("Duplicate elements are ");
            for (Integer duplicate : duplicates) {
                out.println(duplicate);
            }
        }else{
            out.println("No duplicate elements in the given array");
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 3, 5, 7};
        printDuplicate(arr);
        int [] arr2 = {1, 2, 4, 3, 5, 5, 7, 4};
        printDuplicate(arr2);
    }

}
