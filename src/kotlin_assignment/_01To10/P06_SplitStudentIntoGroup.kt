package kotlin_assignment._01To10;

/*
 * program to split the students of class into given number of groups
 */

// method to split students in the given range
fun splitStudentOfRange(from:Int, till: Int, numberOfGroups:Int): List<List<Int>>{
    val groups = ArrayList<ArrayList<Int>>();
    for (i in 1..numberOfGroups){
        val group = ArrayList<Int>();
        groups.add(group);
    }
    for(student in from .. till){
        groups[student%numberOfGroups].add(student);
    }
    return groups;
}
// method to print the students list groupwise
fun printStudentsList(groups:List<List<Int>>){
    var count = 0;
    for(group in groups){
        println("Students of group${++count} : ");
        for(student in group){
            println(student);
        }
        println("");
    }
}


fun main(){
    var groups = splitStudentOfRange(101, 120, 4);
    printStudentsList(groups);

}