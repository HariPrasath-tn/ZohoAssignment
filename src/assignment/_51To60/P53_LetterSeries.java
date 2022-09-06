package assignment._51To60;

import java.util.Scanner;

import static java.lang.System.out;

/*
 * program to print Letter series for the give expression
 */

// class declared as package private and final to prevent inheritance
final class P53_LetterSeries {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);

    // method to print the series
    private void printLetterSeries(String config){
        config += " ";
        char[] coll = config.toCharArray();
        String pattern = "";
        char temp = ' ';
        String times = "";
        for(char chr: coll){
            if(chr >= '0' && chr <= '9'){
                times += chr;
            }else if(!times.equals("")){
                for(int i=0; i < Integer.parseInt(times); i++){
                    pattern += temp;
                }
                times = "";
                temp = chr;
            }else{
                temp = chr;
            }
        }

        out.printf("Letter series for the given expression %s is %s\n", config, pattern);
    }

    public static void main(String [] args){
        P53_LetterSeries program53 = new P53_LetterSeries();
        try{
            out.println("\nTool to print Letter series ");
            out.print("Enter the sentence : ");
            String sentence = INPUT.nextLine();
            program53.printLetterSeries(sentence);
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
}
