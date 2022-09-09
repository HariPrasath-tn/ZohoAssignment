package daily_assignments._08_09_2022;

/*
 * Program to find the matrix multiplication
 */

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.System.out;

public class MatrixMultiplication {
    // Method to find the matrix multiplication of 2x2 matrix and 2x3 matrix
    private static int[][] getMatrixMultiplicationOf(int[][] matrix1, int[][]matrix2){
        int[][] resultantMatrix = new int[2][3];
        int temp;
        for(int row=0; row<2; row++){
            for(int column=0; column<3; column++){
                temp = 0;
                for(int k=0; k<2; k++){
                    temp += (matrix1[row][k] * matrix2[k][column]);
                }
                resultantMatrix[row][column] = temp;
            }
        }
        return resultantMatrix;
    }

    public static void main(String[] args) {
        int[][]matrix1 = {{1, 2}, {3, 4}};
        int[][]matrix2 = {{5, 6, 7}, {8, 9, 10}};
        int[][] resultantMatrix = getMatrixMultiplicationOf(matrix1, matrix2);
        out.print("Matrix multiplication is : " + Arrays.deepToString(resultantMatrix));
    }
}
