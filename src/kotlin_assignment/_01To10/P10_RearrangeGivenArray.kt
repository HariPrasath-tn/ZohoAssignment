package kotlin_assignment._01To10;

/*
 * program to rearrange the array in such a way that the first element is first maximum
 * and second element is first minimum
 */

// method to swap numbers

// method to sort array
fun sortArray(arr:Array<Int>):Array<Int>{
    var temp:Int;
    for(i in arr.indices){
        for ( j in i+1 until arr.size){
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
}

// method to print the array in the given pattern
fun printPattern(arr1:Array<Int>): Array<out Any> {
    var arr1 = sortArray(arr1);
    var arr2:ArrayList<Int> = ArrayList();
    var count:Int=0;
    for(i in arr1.indices){
        if(count > arr1.size/2)
            break;
        if(i%2 == 0) {
            arr2.add(arr1[arr1.size-count-1]);
        }else{
            arr2.add(arr1[count]);
            count++;
        }
    }
    return arr2.toArray();
}

fun main(){
    val arr1:Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    print("Given array in the given pattern : ")
    for(number in printPattern(arr1)){
        print("$number ");
    }
}