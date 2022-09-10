package exceptionHandling;
import static java.lang.System.out;

// creating an user defined exception class that extending the Exception class
final class StupidError extends Exception{
    StupidError(String message){
        super(message);
    }

}

// Playing with Exception
public class TestException {
    // Infinite recursion
    public static void infiniteRecursion(){
        infiniteRecursion();
    }

    public static void main(String[] args) {
        try{
//            throw new IOException("Ithu Stupid error illa");
            throw new StupidError("Ithu naa create pannuna error da paithiyamea");
        }catch (StupidError e){
            out.println(e.getClass().getName() + ": " + e.getMessage());
        }catch (Exception ignored){}
    }
}
