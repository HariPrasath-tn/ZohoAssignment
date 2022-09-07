package kotlin_assignment._01To10;


/*
 * program to print the string in x pattern
 */

// method to print the x pattern for the given input of odd length
fun printPatterFor(number : Int){
    val num = "" + number;
    var space:Int = 0;
    for(i in 1..num.length){
        space = if(num.length/2 +1 >= i){ ++space; }else { --space; }
        for(j in (num.length/2 + 1) .. num.length+space ){
            print(" ");
        }
        print(num[i-1]);
        for(j in space*2 .. (num.length/2)*2){
            print(" ");
        }
        println(if (i != num.length/2 + 1) {num[i-1]} else {""});

    }
}

fun main(){
    printPatterFor(12345);
}