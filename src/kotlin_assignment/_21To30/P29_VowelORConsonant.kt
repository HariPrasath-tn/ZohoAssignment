package kotlin_assignment._21To30;

import kotlin_assignment.getCharacter

/*
 * Program to find whether the given number is odd or not
 */
var vowels = arrayOf('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');

// method to find the given character is Vowel
fun isThisVowel(character: Char):Boolean{
    for(vowel in vowels){
        if(character == vowel)
            return true;
    }
    return false;
}

fun main(){
    println("Tool to find the given character is vowel or consonant");

    var character = getCharacter("Enter the character : ");
    print("The given character $character is : ${if(isThisVowel(character)){"Vowel"} else {"Consonant"}}");
}