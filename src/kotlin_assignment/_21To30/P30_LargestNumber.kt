package kotlin_assignment._21To30;

import kotlin_assignment.getNumber

/*
 * Program to find the largest of the given number
 */


fun main(){
    var number1 = getNumber("Enter the first number : ");
    var number2 = getNumber("Enter the second number : ");
    var number3 = getNumber("Enter the third number : ");

    // finding the largest of the threee numbers
    var largest = if(number1 > number2 && number3 < number1){
        number1;
    }else if (number2 >  number3) {
        number2;
    }else{
        number3;
    }
    print("Largest of the three numbers ($number1, $number2, $number3) is : $largest");
}