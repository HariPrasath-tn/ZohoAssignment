package daily_assignments._08_09_2022;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;


/*
 * program is given with an array of numbers, weight of each number is increased by 5,4,3 if they are perfect square,
 * divisible by both 4 and 6, even respectively. finally the array is sorted in descending order based on weight
 */
public class NumberSortWithWeight {
    // input stream initialization
    private final static Scanner INPUT = new Scanner(System.in);

    /*  Method to find the given number is perfect square or not  */
    private static boolean isThisPerfectSquare(int number){
        return Math.sqrt(number)%1 == 0;
    }


    /* Method to find the given number is divisible by both 4 and 6 */
    private static boolean isThisDivisibleBy4_6(int number){
        return number%4==0 && number%6==0;
    }

    /* Method find the given number is even or not */
    private static boolean isThisEven(int number){
     return (number&1) == 0;
    }
    
    /* Method to sort Array */
    private static void sortArray(int[][] array){
        Arrays.sort(array, (a1, a2)-> (Integer.compare(a2[1], a1[1]) == 0 ? Integer.compare(a2[0], a1[0]) : Integer.compare(a2[1], a1[1])));
    }

    public static void main(String[] args) {
        int[] arr = {49, 36, 8, 10, 12};
        int[][] resultant = new int[5][2];
        int weight;

        for(int i=0; i<arr.length; i++){
            weight = 0;
            if(isThisPerfectSquare(arr[i])) // adding the weight by 5 if number is perfect square
                weight += 5;
            if(isThisDivisibleBy4_6(arr[i])) // adding the weight by 4 if number is divisible by both 4 and 6
                weight += 4;
            if(isThisEven(arr[i]))   // adding the weight by 5 if number is even
                weight += 3;
            resultant[i][0] = arr[i];
            resultant[i][1] = weight;
        }
        sortArray(resultant);
        out.println("Sorted array is " + Arrays.deepToString(resultant));
    }
}
