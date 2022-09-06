import java.util.*;
import static java.lang.System.out;
public class ClassTest {

    public static List<Integer> coll =  new ArrayList<>();

    private static void appendElement(String number, int n){
        if(number.length() == n && !coll.contains(Integer.parseInt(number)))
            coll.add(Integer.parseInt(number));
    }
    public static int[] numsSameConsecDiff(int n, int k) {
        String forwardNumber = "", upNumber = "", downNumber = "", backwardNumber = "";
        int temp = 1, temp2=1, temp3=1, temp4=1, count = 0;
        for(int i=1; i<10; i++){
            upNumber += i;
            downNumber += i;
            forwardNumber += i;
            backwardNumber += i;
            temp=i; temp2=i; temp3=i; temp4=i;
            while(++count < n){
                if(temp + k < 10 && count % 2 != 0)
                    upNumber += (temp += k);
                else if(temp - k > -1 && count % 2 == 0)
                    upNumber += (temp -= k);
                if(temp2 -k > -1 && count % 2 != 0)
                    downNumber += (temp2 -= k);
                else if(temp2 + k < 10 && count % 2 == 0)
                    downNumber += (temp2+=k);



                if(temp3 + k < 10)
                    forwardNumber += (temp3 += k);

                if(temp4 - k > -1)
                    backwardNumber += (temp4 -= k);
            }
            appendElement(forwardNumber, n);
            appendElement(backwardNumber, n);
            appendElement(upNumber, n);
            appendElement(downNumber, n);
            forwardNumber = "";
            backwardNumber = "";
            upNumber = "";
            downNumber = "";
            count = 0;
        }
        int [] arr = new int[coll.size()];
        for (int i=0; i<coll.size(); i++){
            arr[i] = coll.get(i);
        }
        return arr;
    }

    public static void main(String [] args){
        int [] arr = numsSameConsecDiff(4, 1);
        for (int num : arr){
            out.print(" " + num);
        }
    }
}


/*
[1010,1012,1210,1212,1232,1234,2101,2121,2123,2321,2323,2343,2345,3210,3212,3232,3234,3432,3434,3454,3456,4321,4323,
4343,4345,4543,4545,4565,4567,5432,5434,5454,5456,5654,5656,5676,5678,6543,6545,6565,6567,6765,6767,6787,6789,7654,7656,
7676,7678,7876,7878,7898,8765,8767,8787,8789,8987,8989,9876,9878,9898]
 */