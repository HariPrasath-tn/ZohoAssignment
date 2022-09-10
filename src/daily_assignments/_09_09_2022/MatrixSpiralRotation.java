package daily_assignments._09_09_2022;

import static java.lang.System.out;

final class MatrixSpiralRotation {
    private static int rowRest, columnRest, step=1, rAssigner = 1, cAssigner = 0;
    // method to print the matrix in spiral
    private static void printMatrixSpiral(int [][] matrix, int row, int column){
        // Checking for the last element position
        if(!(column == (matrix.length%2==0 ? (matrix.length/2-1):(matrix.length/2) ) && (row == matrix.length/2))) {
            // condition to rotate column
            if (column != columnRest) {
                out.print(" " + matrix[row][column]);
                printMatrixSpiral(matrix, row, column + step);
            }
            else if (row != rowRest) {
                out.print(" " + matrix[row][column]);
                printMatrixSpiral(matrix, row + step, column);
            }
            else if (row == rowRest && column == columnRest) {
                step = -step;
                rowRest = matrix.length / 2 < rowRest ? rAssigner : matrix.length - rAssigner;
                columnRest = matrix[0].length / 2 < columnRest ? cAssigner : matrix[0].length - cAssigner-1;
                cAssigner++;
                rAssigner++;
                printMatrixSpiral(matrix, row, column);
            }
        }else{
                out.print(" " +matrix[row][column]);
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3}, {5, 6, 7}, {9, 0, 1}};
        columnRest = matrix[0].length-1;
        rowRest = matrix.length-1;
        printMatrixSpiral(matrix, 0, 0);
    }
}

