package daily_assignments._06_09;

import static java.lang.System.out;

final class OddOrEvenUsingBitwiseAnd {
    /*
    *   method to find the given number is odd or even
     */
    public static boolean isOdd(int number){
        return (number & 1) != 0;
    }

    public static void main(String[] args) {
        int number = 121;
        out.printf("Given number %d is %s", number, isOdd(number) ? "Odd" : "Even");
    }
}
