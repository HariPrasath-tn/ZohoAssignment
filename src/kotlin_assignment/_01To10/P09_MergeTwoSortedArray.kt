package kotlin_assignment._01To10;

/*
 * program to merge the two sorted array into one
 */

// method to merge given two sorted arrays
fun mergeTheseArrays(arr1: Array<Int>, arr2 : Array<Int>): Array<out Any> {
    var mergedArray = ArrayList<Int>();
    var arr1Count: Int = 0;
    var arr2Count: Int = 0;
    while(!mergedArray.contains(arr1[arr1.size-1]) || !mergedArray.contains(arr2[arr2.size-1])){
        if (arr1.size-1 > arr1Count && arr1[arr1Count] < arr2[arr2Count]){
            if(!mergedArray.contains(arr1[arr1Count]))
                mergedArray.add(arr1[arr1Count]);
            arr1Count++;
        }else if (arr2.size > arr2Count){
            if(!mergedArray.contains(arr2[arr2Count]))
                mergedArray.add(arr2[arr2Count]);
            arr2Count++;
        }
    }
    return mergedArray.toArray();
}

fun main (){
    var arr1:Array<Int> = arrayOf(1, 2, 3, 4, 5, 6);
    var arr2:Array<Int> = arrayOf(1, 2, 5, 6, 7, 8, 9);
    mergeTheseArrays(arr1, arr2);
    print("Merged array is : ")
    for(i in mergeTheseArrays(arr1, arr2))
        print(i);
}