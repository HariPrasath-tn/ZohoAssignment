package openChallenges;

import java.math.BigInteger;
import java.util.Scanner;

class A {
    public static int i= 0;
    public static int getNumber5(){
        return 5;
    }
    public int getNumber6(){
        i++;
        return i;
    }


}
final class FirstClass {
    static{
        System.out.println("I am in static");
    }
    public static void main(String[] args) {
        A a = new A();
        Scanner input = new Scanner(System.in);
        BigInteger i = input.nextBigInteger();
        a.getNumber6();
        System.out.println(a.getNumber6());
    }
}
