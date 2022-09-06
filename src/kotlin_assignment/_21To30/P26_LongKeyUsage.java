package kotlin_assignment._21To30;

import static java.lang.System.out;

/*
 * program to find series and sum
 */

// class declared as package private and final to prevent inheritance
final class P26_LongKeyUsage {
    public static void main(String [] args){
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        out.println("Maximin limit of long is " + max);
        out.println("Minimum limit of long is " + min);
        int number = 12345;
        long multiplication = number * number;
        out.printf("value of multiplication %d which can't be stored in integer", multiplication);

    }

}
