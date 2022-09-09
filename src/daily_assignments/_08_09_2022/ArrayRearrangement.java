package daily_assignments._08_09_2022;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.System.out;

public class ArrayRearrangement {
    // method to sort the array
    private static int[] sort(int[] array){
        Arrays.sort(array);
        return array;
    }

    // method to rearrange the array in such a way {1, 2, 3, 4, 5, 6, 7} ==> {4, 5, 3, 6, 2, 7, 1}
    private static int[] rearrangeArray(int [] array){
        array = sort(array);
        int[] rearrangedArray = new int[array.length];
        int center = array.length/2;
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(i%2 == 0)
                // if the given array is odd then the equation will be
                // rearrangedArray[i] = array[center- count];
                // else
                // rearrangedArray[i] = array[center-count+1];
                rearrangedArray[i] = array[center- (array.length%2 == 0? count+1:count)];
            else
                // if the given array is odd then the equation will be
                // rearrangedArray[i] = array[center + count++];
                // else
                // rearrangedArray[i] = array[center + ++count];
                rearrangedArray[i] = array[center + (array.length%2 == 0? count++:++count)];
        }
        return rearrangedArray;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        array = rearrangeArray(array);
        out.print("Array after rearrangement : " + Arrays.toString(array));
    }

}
