package kotlin_assignment._01To10;

import kotlin.math.max


/*
* Program to generate a multiplication and subtraction table for a given number
 */


class P01GenerateMultiplicationAndSubtractionTable{

    fun generateMultiplicationTableFor(num : Int, maxLimit:Int = 16){
        println("Multiplication table for the given number : $num");
        for(iterator in 1..maxLimit){
            println("" + iterator + " * " + num + " = " + iterator*num);
        }

    }

    fun generateSubtractionTableFor(num : Int, maxLimit:Int = 16){
        println("\nSubtraction table for the given number : $num");
        for(iterator in 1..maxLimit){
            println("" + iterator + " - " + num + " = " + (iterator-num));
        }

    }

}

fun main(){
    val program01 = P01GenerateMultiplicationAndSubtractionTable();
    program01.generateMultiplicationTableFor(12);
    program01.generateSubtractionTableFor(12)
}
