package daily_assignments._07_09;

import static java.lang.System.out;

/*
* program to print my name "HARI" using nested loops
 */
public class NestedForLoop {
    public static void main(String[] args) {
        int column=0, limit = 7; //GetUserInput.getNumber("Enter the row limit : ");

        out.println("");
        for(int row=0; row<limit; row++){
            // loop to print my first letter 'H'
            while(column < limit){
                if (column == 0 || row == limit/2 || column==limit-1)
                    out.print("#");
                else
                    out.print(" ");
                column++;
            }
            out.print("  ");  column = 0;

            // loop to print second letter half 'A'
            while(column < limit){
                if (column == limit-row || (row == limit/2 && column > row))
                    out.print("#");
                else
                    out.print(" ");
                column++;
            }
            column = 0;

            // loop to print my first letter remaining half 'A'
            while(column < limit){
                if (column == row || (row == limit/2 && column < row))
                    out.print("#");
                else
                    out.print(" ");
                column++;
            }
            out.print("  "); column=0;


            // loop to print my first letter 'R'
            do{
                if (column == 0 || row==0 || column == (limit-row*2 > 0 ? limit-row*2 : row*2-column-2) || (row == limit/2 && column == limit/2-2))
                    out.print("#");
                else
                    out.print(" ");
                column++;
            }while(column < limit-1);
            out.print("   ");  column = 0;

            // loop to print my first letter 'I'
            do{
                if (row == 0 || row == limit-1 || column==limit/2)
                    out.print("#");
                else
                    out.print(" ");
                column++;
            }while(column < limit-1); column = 0;

            out.println("");
        }
    }
}
