package daily_assignments._08_09_2022

/*
 * Program to find the frequency of the a number in the given number
 */


// method to find the frequency of the given number in the source number
fun findFrequency(number:Int, sourceNumber:Int):Int{
    var _sourceNumber = sourceNumber;
    var count = 0;
    while(_sourceNumber > 0){
        if (_sourceNumber%10 == number)
            count++;
        _sourceNumber /= 10;
    }
    return count;
}

fun main(){
    println("Tool to find the frequency of the given number in the given source number ");
    try{
        var sourceNumber = getNumber("Enter the source number : ");
        var number = getNumber("Enter the number you want to find the frequency in the source number : ");
        print("Frequency of the given number $number in the source number $sourceNumber is : ${findFrequency(number, sourceNumber)}");
    }catch(e:Exception){
        print(e.message);
    }
}