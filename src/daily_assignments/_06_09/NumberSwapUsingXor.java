package daily_assignments._06_09;

import static java.lang.System.out;

public class NumberSwapUsingXor {
    /*
    * method to swap the given numbers
     */
    private static int []  swapNumbers(int num1, int num2){
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        return new int[]{num1, num2};
    }


    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 13;
        out.println("Number1  and number2 before swapping : " + num1 + " , " + num2);
        int [] swapped = swapNumbers(num1, num2);
        num1 = swapped[0];
        num2 = swapped[1];
        out.println("Number1  and number2 after swapping : " + num1 + " , " + num2);
    }
}
