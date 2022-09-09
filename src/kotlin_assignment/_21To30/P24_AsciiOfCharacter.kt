package kotlin_assignment._21To30;

import kotlin_assignment.getCharacter

/*
 * program to find the ascii value of the given character
 */

// method to calculate the ascii value of the character
fun findAsciiOf(character:Char): Int{
    return character.code;
}

fun main(){
    try{
        println("Tool to calculate the ascii value of the given character ");
        var character:Char = getCharacter("Enter the character : ");
        print("Ascii value of the character $character is : ${findAsciiOf(character)}");
    }catch (e:Exception){
        print(e.message);
    }
}