package kotlin_assignment._01To10;

/*
 * program to find the difference between given number, and it's reverse
 */

// method to return the the reverse of the given number
fun getReverseOf(num : Int): Int {
    var num = num;
    var reverse = 0;
    while (num > 0) {
        reverse = reverse * 10 + (num % 10);
        num /= 10;
    }
    return reverse;
}

// method to return the difference of the given two numbers
fun getDifferenceBetween(num1:Int, num2: Int): Int{
    return num1-num2;
}

fun main(){
    var number = 12345;
    var reverse = getReverseOf(number);
    var difference = getDifferenceBetween(number, reverse);
    print("Difference between the numbers $number and $reverse is : $difference");
}