package daily_assignments._08_09_2022;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.lang.System.out;

public class Watch {
    // method to create a watch simulation
    private static void turnOnWatch(){
        out.println("Now ->  " + getDateTime()); // printing today's date and time
        try{Thread.sleep(1000);} catch (Exception ignored){}
        turnOnWatch();
    }

    // method to return current date and time
    private static String getDateTime(){
        // creating the pattern for formatting the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDateTime today = LocalDateTime.now();
        return formatter.format(today); // returning the todays date and time in format yyyy/MM/dd HH:mm:ss
    }

    public static void main(String[] args){
        turnOnWatch();
    }

}
