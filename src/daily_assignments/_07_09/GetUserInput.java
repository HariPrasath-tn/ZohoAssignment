package daily_assignments._07_09;

import static java.lang.System.out;

public class GetUserInput {
    private GetUserInput(){}
    public static int getNumber(String request){
        out.print(request);
        return new java.util.Scanner(System.in).nextInt();
    }
}
