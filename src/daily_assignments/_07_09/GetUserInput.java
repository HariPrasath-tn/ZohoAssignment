package daily_assignments._07_09;

import static java.lang.System.out;

public class GetUserInput {
    //private GetUserInput() {}
    public int getNumber(String request){
        out.print(request);
        return new java.util.Scanner(System.in).nextInt();
    }

    public int getString(String request){
        out.print(request);
        return new java.util.Scanner(System.in).nextInt();
    }

    public int getCharacter(String request){
        out.print(request);
        return new java.util.Scanner(System.in).nextInt();
    }

    public int getDouble(String request){
        out.print(request);
        return new java.util.Scanner(System.in).nextInt();
    }
}
