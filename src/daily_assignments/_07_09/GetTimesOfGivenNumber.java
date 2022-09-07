package daily_assignments._07_09;
import java.math.BigInteger;import static java.lang.System.out;
public class GetTimesOfGivenNumber {
    private static BigInteger getResult(BigInteger num, int limit){
        //return limit!=1 ? num.add(getResult(num.add(num), limit-1)) : num;
        return limit!=1 ? getResult(num.add(num), limit-1) : num;
    }
    public static void main(String[] args) {
        out.println(getResult(BigInteger.valueOf(new GetUserInput().getNumber("Enter the number : ")),  new  GetUserInput().getNumber("Enter the limit : ")));
    }
}