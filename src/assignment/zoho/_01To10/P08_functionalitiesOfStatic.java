package assignment.zoho._01To10;

import java.util.Scanner;
import static java.lang.System.out;

/*
 * program to explain the functionality of the static
 */

// class declared as package private and final to prevent inheritance
final class P08_functionalitiesOfStatic {
    private static final String STATIC_FINAL_VARIABLE;    // static final variable can be initialized only on the static block
    private static int staticInt=1; // static variable have only one instance for all objects
    private final int instanceCount=staticInt; // final variable "instanceCount" will be unique for all instances

    // static block will the one that get executed first
    static{
        out.println("JVM at static block");
        STATIC_FINAL_VARIABLE="Value assigned in static block";
    }

    // constructor with no argument
    P08_functionalitiesOfStatic(){
        out.println("\n\nJVM at constructor of object"+staticInt);
        staticInt++;
    }

    public static void main(String [] args){
        out.println("JVM at main block");
        P08_functionalitiesOfStatic firstObject = new P08_functionalitiesOfStatic();
        out.println("Now the value of staticInt is " + staticInt);
        out.println("Now the value of STATIC_FINAL_VARIABLE " + STATIC_FINAL_VARIABLE);
        P08_functionalitiesOfStatic secondObject = new P08_functionalitiesOfStatic();
        out.println("Now the value of staticInt is " + staticInt);
        out.println("Now the value of STATIC_FINAL_VARIABLE " + STATIC_FINAL_VARIABLE);
        P08_functionalitiesOfStatic thirdObject = new P08_functionalitiesOfStatic();
        out.println("Now the value of staticInt is " + staticInt);
        out.println("Now the value of STATIC_FINAL_VARIABLE " + STATIC_FINAL_VARIABLE);
        P08_functionalitiesOfStatic fourthObject = new P08_functionalitiesOfStatic();
        out.println("Now the value of staticInt is " + staticInt);
        out.println("Now the value of STATIC_FINAL_VARIABLE " + STATIC_FINAL_VARIABLE);

        out.println("\n\nNow the value of instance Count of first object is " + firstObject.instanceCount + " and \nthe value of staticInt = " + firstObject.staticInt);
        out.println("Now the value of instance Count of second object is " + secondObject.instanceCount + " and \nthe value of staticInt = " + secondObject.staticInt);
        out.println("Now the value of instance Count of third object is " + thirdObject.instanceCount + " and \nthe value of staticInt = " + thirdObject.staticInt);
        out.println("Now the value of instance Count of forth object is " + fourthObject.instanceCount + " and \nthe value of staticInt = " + fourthObject.staticInt);

    }



}
