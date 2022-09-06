package kotlin_assignment._21To30;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to swap two numbers
 */

// class declared as package private and final to prevent inheritance
final class P27_SwapNumbers {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    private int num1, num2;

    // method to get int input from the user
    private static int getUserInput() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    // setter for number1
    private void setNum1(int num1){
        this.num1=num1;
    }

    // setter for number2
    private void setNum2(int num2){
        this.num2 = num2;
    }

    // getter for number1
    private int getNum1(){
        return num1;
    }

    // getter for number2
    private int getNum2(){
        return num2;
    }


    // method to swap two numbers
    private void swapTheseNumbers(){
        int num1 = this.getNum1();
        int num2 = this.getNum2();
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        this.setNum1(num1);
        this.setNum2(num2);
    }

    public static void main (String [] args){
        P27_SwapNumbers program27 = new P27_SwapNumbers();
        try{
            out.println("\nTool to swap two number");
            out.print("Enter the first number : ");
            program27.num1 = getUserInput();
            out.print("Enter the second number : ");
            program27.num2 = getUserInput();

            out.printf("'a' and 'b' before swapping : %d and %d ", program27.getNum1(), program27.getNum2());
            program27.swapTheseNumbers();
            out.printf("\n'a' and 'b' after swapping : %d and %d ", program27.getNum1(), program27.getNum2());
        }catch (Exception e){
            out.print(e.getMessage());
        }
    }
}
