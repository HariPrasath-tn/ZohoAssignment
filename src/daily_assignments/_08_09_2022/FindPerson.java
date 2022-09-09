package daily_assignments._08_09_2022;
import java.util.Scanner;
import static java.lang.System.out;

/*
 * Program to find the number of grandchildren for the given person
 */

final class FindPerson {
    private static String [][] family = {{"luke", "shaw"}, {"wayne", "rooney"}, {"rooney", "ronaldo"}, {"shaw", "rooney"}};

    private static int currentRelations = 0, totalRelation;
    private final static Scanner INPUT = new Scanner(System.in);

    // method to get user input
    private static int getIntegerFromUser(String request) throws Exception{
        out.print(request);
        if(!INPUT.hasNextInt()){
            throw new Exception("Invalid input...");
        }else{
            return INPUT.nextInt();
        }
    }

    // method to get String input from the user
    private static String getStringFromUser(String request){
        out.print(request);
        return INPUT.next();
    }

    // method to initialize the family
    private static void assignFamilyCount(int size){
        family = new String[size][2];
    }

    // method to add relation
    private static void addData(String father, String child){
        family[currentRelations][0] = child;
        family[currentRelations++][1] = father;
    }

    // method find the person of respective relation
    private static int totalGrandChildOf(String father){
        int count = 0;
        for(String [] fatherChild : family){
            if(fatherChild[1] == father) {
                for(String[] childrenGrandchildren : family){
                    if(childrenGrandchildren[1] == fatherChild[0])
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        out.println("Tool to find the number of grandchildren of the given person ");
        try {
//            totalRelation = getIntegerFromUser("Enter the total number of relation :");
//            for(int i=0; i<totalRelation; i++){
//                addData(getStringFromUser(String.format("Enter the name of the father %d name ", i+1)), getStringFromUser(String.format("Enter the name of the child %d name ", i+1)));
//            }
//
            String father = "ronaldo"; //getStringFromUser("Enter the name of the father to find total number of his grandchildren : ");
            out.print("Number of GrandChildren of " + father + " is : " + totalGrandChildOf(father));  //fatherName));
        }catch (Exception e){
            out.print(e.getMessage());
        }
    }
}
