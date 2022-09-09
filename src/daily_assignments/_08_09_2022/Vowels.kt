package daily_assignments._08_09_2022;


// method to get character from the user
fun getCharacter(request:String):Char{
    print(request);
    var character = input.next();

    if(character.length == 1)
        return character.toCharArray()[0];
    throw Exception("Expecting only Alphabets");
}

// method to find the given is vowel or not
fun isThisVowel(character:Char):Boolean{
    return when(character){
        ('A')->{true};
        ('a')->{true};
        ('E')->{true};
        ('e')->{true};
        ('I')->{true};
        ('i')->{true};
        ('O')->{true};
        ('o')->{true};
        ('U')->{true};
        ('u')->{true};
        else->{false};
    }
}


fun main(){
    println("Tool to find the given character is vowel or consonant ");
    try{
        var character = getCharacter("Enter any one of the alphabets : ");
        print("The given character $character is : ${if(isThisVowel(character)){"a Vowel"} else {"a consonant"}}")
    }catch(e:Exception){
        print(e.message);
    }

}