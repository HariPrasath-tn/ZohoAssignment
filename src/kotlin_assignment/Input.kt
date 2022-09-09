package kotlin_assignment
import java.util.Scanner;

val input = Scanner(System.`in`);

// method to get integer input from user
fun getNumber(request : String ): Int{
    print(request);
    if(input.hasNextInt()){
        return input.nextInt();
    }
    throw  Exception("Excepting number");
}



// method to get integer input from user
fun getString(request : String ): String{
    print(request);
    if(input.hasNext()){
        return input.nextLine();
    }
    throw  Exception("Excepting String");
}

// method to get integer input from user
fun getCharacter(request : String ): Char{
    print(request);
    if(input.hasNext()){
        val character = input.next()
        if(character.length > 1)
            throw  Exception("Excepting Character");
        return character.toCharArray()[0];
    }
    return 'A';
}


// method to get integer input from user
fun getDouble(request : String ): Double{
    print(request);
    if(input.hasNextDouble()){
        return input.nextDouble();
    }
    throw  Exception("Excepting a Double value");
}
