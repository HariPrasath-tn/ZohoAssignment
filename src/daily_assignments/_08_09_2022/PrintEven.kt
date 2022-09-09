package daily_assignments._08_09_2022

import java.util.*

// creating input stream variable
var input = Scanner(System.`in`);


// method to get number from the user
fun getNumber(request : String ):Int{
    print(request);
    if(input.hasNextInt())
        return input.nextInt();
    throw Exception("Expecting number only");
}


// method to print even number for given number of range
fun printEvenBetween(first:Int, last:Int){
    for(i in first .. last){
        if(i%2 == 0)
            print("$i ");
    }
}

fun main(){
    println("Tool to print the even number between the given range ")
    try {
        val head = getNumber("Enter the beginning number : ");
        val tail = getNumber("Enter the ending number : ");
        print("Even numbers between the given range are : ");
        printEvenBetween(head, tail);
    }catch (e:Exception){
        print(e.message);
    }


}