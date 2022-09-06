package assignment.zoho._01To10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to split the students of class into given number of groups
 */

// class declared as package private and final to prevent inheritance
final class P06_SplitStudentIntoGroup {
    // initializing instance for scanner class as constant
    private static final Scanner INPUT = new Scanner(System.in);
    private static ArrayList<ArrayList<Integer>> groupList = new ArrayList<>();
    private final int TOTAL_GROUPS;

    P06_SplitStudentIntoGroup(int total_groups){
        TOTAL_GROUPS = total_groups;
    }

    // method to get user input
    private static int getIntegerFromUser() throws Exception{
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    // method that create instance of a new arraylist and return it
    private ArrayList<Integer> getNewGroup(){
        return new ArrayList<>();
    }


    // method to split the students into given number of groups
    private void splitStudentsIntoGroups(int firstNumber, int lastNumber){
        int count = 0;
        int studentNumber = firstNumber;
        while(studentNumber <= lastNumber){
            if(count == TOTAL_GROUPS)
                count = 0;
            groupList.get(count).add(studentNumber);
            count++;
            studentNumber++;
        }
    }

    // method to print students in group wise
    private void printStudentsInGroupWise(){
        Iterator<ArrayList<Integer>> groupIterator = groupList.iterator();
        int groupNumber = 1;
        while(groupIterator.hasNext()){
            Iterator<Integer> studentIterator = groupIterator.next().iterator();
            out.println("\nStudents of Group" + groupNumber + " are : ");
            while(studentIterator.hasNext()){
                int studentNumber = studentIterator.next();
                out.println(studentNumber);
            }
            groupNumber++;
        }
    }

    public static void main(String [] args) throws Exception{
        try{
            out.println("\nTool to split student of given number into given number of groups ");
            out.print("Enter the total number of groups : ");
            int totalGroups = getIntegerFromUser(); // total number of groups
            P06_SplitStudentIntoGroup program6 = new P06_SplitStudentIntoGroup(totalGroups);

            // Creating given number of groups (arraylist of integer type)
            for(int groupNumber=0; groupNumber<totalGroups; groupNumber++){
                groupList.add(program6.getNewGroup());
            }

            out.print("Enter the beginning role number : ");
            int beginning = getIntegerFromUser();
            out.print("Enter the last roll number : ");
            int last = getIntegerFromUser();

            program6.splitStudentsIntoGroups(beginning, last);
            program6.printStudentsInGroupWise();

        }catch (Exception e){
            out.println(e.getMessage());
        }


    }
}
