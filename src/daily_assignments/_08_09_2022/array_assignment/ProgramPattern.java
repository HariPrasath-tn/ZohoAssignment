package daily_assignments._08_09_2022.array_assignment;

import static java.lang.System.out;

public class ProgramPattern {
    /* method to print the odd length string in 'x' pattern */
    private static void printXPattern(char[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i==j)
                    out.print(arr[i]);
                else if (j==arr.length-i-1)
                    out.print(arr[arr.length-i-1]);
                else out.print(" ");
            }
            out.println("");
        }
    }

    public static void main(String[] args) {
        char[] arr = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
        printXPattern(arr);
    }
}
