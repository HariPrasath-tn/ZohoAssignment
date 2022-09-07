package kotlin_assignment._01To10;
/*
* Program to print the letters from the user input character to 'Z' without using String
 */

//method to validate user input
fun getInput(){

}

// method to print the alphabetic series from the given letter to 'Z'
fun printLetterSeries(beginning: Char){
    print("Alphabetic series from the given character till 'Z' : ");
    for(i in beginning..'Z'){
        print(i);
    }
}

fun main(){
    println("Tool to print the alphabetic series from the given character till 'Z' ")
    printLetterSeries('A');
}
