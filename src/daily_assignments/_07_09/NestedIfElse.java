package daily_assignments._07_09;

import java.util.Scanner;

import static java.lang.System.out;

public class NestedIfElse {
    private static final Scanner input = new Scanner(System.in);
    private static int getNumber()throws Exception{
        if(!input.hasNextInt())
            throw new Exception("Enter a valid number..");
        return input.nextInt();
    }

    public static void main(String[] args) {
        out.print("Enter a number : ");
        try{
            int number = getNumber();
            if(0 < number && number < 3){
                if(number == 1)
                    out.println("Its 1");
                if(number == 2)
                    out.println("Its 2");
            }else if(2 < number && number < 5) {
                if (number == 3)
                    out.println("Its 3");
                if (number == 4)
                    out.println("Its 4");
            }else{
                out.println("Given number not listed in the conditions");
            }
        }catch (Exception e){
            out.println(e.getMessage());
        }
    }
}
