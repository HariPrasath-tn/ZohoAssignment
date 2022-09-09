package daily_assignments._08_09_2022

fun main(){
    print("Enter the number : ")
    var number = input.next();
    try{
        number.toInt()
        if(number.length == 3 ){
            print("Least number is " + when(number.toCharArray()[0]){
                ('1')->{100};
                ('2')->{200};
                ('3')->{300};
                ('4')->{400};
                ('5')->{500};
                ('6')->{600};
                ('7')->{700};
                ('8')->{800};
                else ->{900};
            });
        }else{
            throw Exception();
        }
    }catch (_:Exception){
        print("Invalid number");
    };

}
