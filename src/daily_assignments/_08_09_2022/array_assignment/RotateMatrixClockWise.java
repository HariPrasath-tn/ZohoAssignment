package daily_assignments._08_09_2022.array_assignment;

import java.util.Arrays;

import static java.lang.System.out;

/*
 * Program to rotate the matrix in to 90degree
 */
public class RotateMatrixClockWise {
    // method to rotate the matrix in clock wise
    private static int [][] rotateMatrixClockwise(int[][] matrix){
        int [][] resultantMatrix = new int [matrix[0].length][matrix.length];

        for(int row=0; row<matrix.length; row++){
            for(int column=0; column<matrix[0].length; column++){
                resultantMatrix[column][ matrix.length-1-row] = matrix[row][column];
            }
        }
        return resultantMatrix;
    }


    public static  void main(String [] args){
        int [][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int [][] newMatrix = rotateMatrixClockwise(matrix);
        out.print("Matrix after rotation is : " + Arrays.deepToString(newMatrix));
    }
}
