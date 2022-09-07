package kotlin_assignment._01To10;

/*
 * program to generate the reverse alphabetic Pattern from the given character till 'A'
 */

// method to get character input from the user
fun getCharacterInput():Char{
    return 'c';
}

// method to print the alphabet pattern
fun printReversePatternFrom(beginning:Char){
    for(letter in beginning downTo 'A'){
        for(iteration in 'A' .. letter){
            print(letter);
        }
        println("");
    }
}


fun main(){
    printReversePatternFrom('E');
}