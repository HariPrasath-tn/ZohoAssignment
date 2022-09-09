package daily_assignments._08_09_2022

/*
 * Program to  print the fibonacci series for the given number of positions
 */

// method to print the fibonacci series
fun printFibonacci(limit:Int){
    var count = 0;
    var a = 0;
    var b = 1;
    var c = 0;
    while (limit > count){
        print("$a ");
        c = a+b;
        b = a;
        a = c;
        count++;
    }
}

fun main(){
    println("Tool to print the fibannacci series till the nth position");
    var limit = getNumber("Enter the limit of the fibinacci series : ");
    print("Fibonacci Series is ");
    printFibonacci(limit);
}
