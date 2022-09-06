package assignment.zoho._01To10;

import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to define the functionality of the bitwise operator
 */

// class declared as package private and final to prevent inheritance
final class P04_FunctionalityOfBitwiseOperators {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to get user input
    private static int getIntegerFromUser() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            int number = INPUT.nextInt();
            if(number>9){
                throw new Exception("Number should not exceed 9");
            }else if(number < 0){
                throw new Exception("Number should not less than 0");
            }
            return number;
        }
    }

    // method to demonstrate the functionality of the bitwise And '&' using the given number
    private void explainBitwiseAndWith(int number1, int number2){
        out.println("Bitwise And(&) functionality explanation using the given numbers " + number1 + " and " + number2);
        out.println("\tRules of Bitwise And operator are : ");
        out.print("\t\t1 & 1 = 1 \n\t\t1 & 0 = 0 \n\t\t0 & 1 = 0 \n\t\t0 & 0 = 0");
        out.println("\n\tBitwise & of ");
        String binNumber1 = Integer.toBinaryString(number1);  // binary value of number1
        binNumber1 = "0000".substring(binNumber1.length(), 4) + binNumber1;


        String binNumber2 = Integer.toBinaryString(number2);   // binary value of number1
        binNumber2 = "0000".substring(binNumber2.length(), 4) + binNumber2;

        out.println("\t\t  " + number1 + " = " + binNumber1);
        out.println("\t\t  " + number2 + " = " + binNumber2 + "\t&");

        int resultant = number1&number2;                           // binary and of number1 and number2
        String resultant_ = "   ".substring((resultant + "").length(), 3) + resultant;
        String binResultant = Integer.toBinaryString(resultant);   // binary value of resultant
        binResultant = "0000".substring(binResultant.length(), 4) + binResultant;

        out.println("\t\t----------");
        out.println("\t\t" + resultant_ + " = " + binResultant);
        out.println("\n--------------------x---------------------");
    }


    // method to demonstrate the functionality of the bitwise OR '|' using the given number
    private void explainBitwiseOrWith(int number1, int number2){
        out.println("Bitwise Or(|) functionality explanation using the given numbers " + number1 + " and " + number2);
        out.println("\tRules of Bitwise OR operator are : ");
        out.print("\t\t1 | 1 = 1 \n\t\t1 | 0 = 1 \n\t\t0 | 1 = 1 \n\t\t0 | 0 = 0");
        out.println("\n\tBitwise | of ");
        String binNumber1 = Integer.toBinaryString(number1);  // binary value of number1
        binNumber1 = "0000".substring(binNumber1.length(), 4) + binNumber1;


        String binNumber2 = Integer.toBinaryString(number2);   // binary value of number1
        binNumber2 = "0000".substring(binNumber2.length(), 4) + binNumber2;

        out.println("\t\t  " + number1 + " = " + binNumber1);
        out.println("\t\t  " + number2 + " = " + binNumber2 + "\t|");

        int resultant = number1|number2;                           // binary Or of number1 and number2
        String resultant_ = "   ".substring((resultant + "").length(), 3) + resultant;
        String binResultant = Integer.toBinaryString(resultant);   // binary value of resultant
        binResultant = "0000".substring(binResultant.length(), 4) + binResultant;

        out.println("\t\t----------");
        out.println("\t\t" + resultant_ + " = " + binResultant);
        out.println("\n--------------------x---------------------");
    }


    // method to demonstrate the functionality of the bitwise XOr '^' using the given number
    private void explainBitwiseXOrWith(int number1, int number2){
        out.println("Bitwise XOr(^) functionality explanation using the given numbers " + number1 + " and " + number2);
        out.println("\tRules of Bitwise And operator are : ");
        out.print("\t\t1 ^ 1 = 0 \n\t\t1 ^ 0 = 1 \n\t\t0 ^ 1 = 1 \n\t\t0 ^ 0 = 0");
        out.println("\n\tBitwise ^ of ");
        String binNumber1 = Integer.toBinaryString(number1);  // binary value of number1
        binNumber1 = "0000".substring(binNumber1.length(), 4) + binNumber1;


        String binNumber2 = Integer.toBinaryString(number2);   // binary value of number1
        binNumber2 = "0000".substring(binNumber2.length(), 4) + binNumber2;

        out.println("\t\t  " + number1 + " = " + binNumber1);
        out.println("\t\t  " + number2 + " = " + binNumber2 + "\t^");

        int resultant = number1^number2;                           // binary XOr of number1 and number2
        String resultant_ = "   ".substring((resultant + "").length(), 3) + resultant;
        String binResultant = Integer.toBinaryString(resultant);   // binary value of resultant
        binResultant = "0000".substring(binResultant.length(), 4) + binResultant;

        out.println("\t\t----------");
        out.println("\t\t" + resultant_ + " = " + binResultant);
        out.println("\n--------------------x---------------------");
    }


    // method to demonstrate the functionality of the bitwise Not '!'
    private void explainBitwiseNot(){
        out.println("Bitwise Not(!) functionality explanation ");
        out.println("\tRules of Bitwise And operator are : ");
        out.print("\t\t!1 = 0 \n\t\t!0 = 1 ");
        out.println("\n--------------------x---------------------");
    }

    // method to demonstrate the functionality of the bitwise left shift "<<"
    private void explainBitwiseLeftShiftWith(int number1, int number2){
        out.println("Bitwise LeftShift(<<) functionality explanation using the given numbers " + number1 + " and " + number2);
        out.println("\tRules of Bitwise << operator are : ");
        out.print("\t\t0001 << 2 = 0100 \n\t\t0001 << 1 = 0010");
        out.println("\n\tBitwise << of ");
        String binNumber1 = Integer.toBinaryString(number1);  // binary value of number1
        binNumber1 = "0000".substring(binNumber1.length(), 4) + binNumber1;

        int resultant = number1<<number2;                           // binary Left Shift of number1 to number2 position
        String binResultant = Integer.toBinaryString(resultant);   // binary value of resultant
        binResultant = "0000".substring(Math.min(binResultant.length(), 4), 4) + binResultant;

        out.println("\t\t  " + number1 + "(" + binNumber1 + ") << " + number2 + " ==> (" + resultant + ") " + binResultant);

        out.println("\n--------------------x---------------------");
    }

    // method to demonstrate the functionality of the bitwise right shift "<<"
    private void explainBitwiseRightShiftWith(int number1, int number2){
        out.println("Bitwise RightShift(>>) functionality explanation using the given numbers " + number1 + " and " + number2);
        out.println("\tRules of Bitwise << operator are : ");
        out.print("\t\t1000 >> 2 = 0010 \n\t\t1000 >> 1 = 0100");
        out.println("\n\tBitwise >> of ");
        String binNumber1 = Integer.toBinaryString(number1);  // binary value of number1
        binNumber1 = "0000".substring(binNumber1.length(), 4) + binNumber1;

        int resultant = number1>>number2;                           // binary Right shift of number1 to number2 position
        String binResultant = Integer.toBinaryString(resultant);   // binary value of resultant
        binResultant = "0000".substring(Math.min(binResultant.length(), 4), 4) + binResultant;

        out.println("\t\t  " + number1 + "(" + binNumber1 + ") << " + number2 + " ==> (" + resultant + ") " + binResultant);

        out.println("\n--------------------x---------------------");
    }

    public static void main(String [] args) throws Exception{
        P04_FunctionalityOfBitwiseOperators program4 = new P04_FunctionalityOfBitwiseOperators();

        int choice = 0;
        out.println("\nTools for Bitwise operator tutorials ");
        out.println("1. Explain Bitwise AND \n2. Explain Bitwise OR \n3. Explain Bitwise XOr \n4. Explain Bitwise NOT \n5. Explain Bitwise LeftShift \n6. Explain Bitwise RightShift");
        int number1;
        int number2;
        out.print("Enter your choice : ");
        try{
            choice = getIntegerFromUser();
            switch(choice){
                case 1:
                    // case that explain Bitwise And
                    out.print("Enter the number 1 : ");
                    number1 = getIntegerFromUser();
                    out.print("Enter the number 2 : ");
                    number2 = getIntegerFromUser();
                    program4.explainBitwiseAndWith(number1, number2);
                    break;
                case 2:
                    // case that explain Bitwise Or
                    out.print("Enter the number 1 : ");
                    number1 = getIntegerFromUser();
                    out.print("Enter the number 2 : ");
                    number2 = getIntegerFromUser();
                    program4.explainBitwiseOrWith(number1, number2);
                    break;
                case 3:
                    // case that explain Bitwise XOr
                    out.print("Enter the number 1 : ");
                    number1 = getIntegerFromUser();
                    out.print("Enter the number 2 : ");
                    number2 = getIntegerFromUser();
                    program4.explainBitwiseXOrWith(number1, number2);
                    break;
                case 4:
                    // case that explain Bitwise Not
                    program4.explainBitwiseNot();
                    break;
                case 5:
                    // case that explain Bitwise leftShift
                    out.print("Enter the number 1 : ");
                    number1 = getIntegerFromUser();
                    out.print("Enter the number of left shift : ");
                    number2 = getIntegerFromUser();
                    program4.explainBitwiseLeftShiftWith(number1, number2);
                    break;
                case 6:
                    // case that explain Bitwise RightShift
                    out.print("Enter the number 1 : ");
                    number1 = getIntegerFromUser();
                    out.print("Enter the number of right shift : ");
                    number2 = getIntegerFromUser();
                    program4.explainBitwiseRightShiftWith(number1, number2);
                    break;
                case 7:
                    // case to exit the program
                    out.println("Thank You.");
                    break;
                default:
                    out.println("Invalid choice...");
                    break;
            }
        }catch (Exception e){
            out.println(e.getMessage());
        }

    }

}
