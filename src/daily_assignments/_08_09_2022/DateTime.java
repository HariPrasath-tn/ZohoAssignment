package daily_assignments._08_09_2022;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;

import static java.lang.System.out;

/*
*   Program to find the current date and time
 */
final class DateTime {
    // method to return current date and time
    private static String getDateTime(){
        // creating the pattern for formatting the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        LocalDateTime today = LocalDateTime.now();
        return formatter.format(today); // returning the todays date and time in format yyyy/MM/dd HH:mm:ss
    }

    // method to return today's name
    private static String getDay(){
        String [] week = {"Monday", "Tuesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Date day = new Date();
         return week[day.getDay()];
    }

    public static void main(String[] args){
        out.println("Today is : " + getDay() + " " + getDateTime()); // printing today's date and time
    }

}
