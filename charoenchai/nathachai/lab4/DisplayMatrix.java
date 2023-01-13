package charoenchai.nathachai.lab4;

import java.util.Scanner;

/**
 * <b> This program calls DisplayMatrix </b> <br>
 * Creat the matrix <br>
 * Input the number from scanner in the matrix <br>
 * 
 * @author Nathachai Charoenchai
 * @version 1.0 13/1/2023
 */
public class DisplayMatrix {
    static int[][] matrix; // 2 dimensional array for storing a matrix
    static int rowDim, colDim; // the number of rows and columns in the matrix

    /**
     * <b> This is main medthod </b>
     * @param args <br>
     */
    public static void main(String[] args) {        
        inputMatrix(); // input matrix
        showMatrix(); // show the original matrix
        showMatrixByRow(); // show the matrix by row
        showMatrixByColumn(); // show the matrix by column
        showMatrixByRowBackward(); // show the matrix by row backward
        showMatrixByColumnBackward(); // show the matrix by column backward
        // show the diagonal element of the matrix
        // from top left to bottom right
        showMatrixByDiagonalTopLeftBottomRight();
        // show the diagonal element of the matrix
        // from top right to bottom left
        showMatrixByDiagonalTopRightBottomLeft();
        // show the matrix by row zigzag
        showMatrixByRowZigzag();   
    }

    /**
     * <b> This is inputMatrix method get size from scanner and creat the matrix </b> <br>
     * Get the number from scanner add to the matrix <br>
     */
    public static void inputMatrix() {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (number of rows then number of collumns) : ");
        String inputNumSize = inputUser.nextLine();
        String[] sizeList = inputNumSize.split(" "); // split " " from input scanner
        try { // try to run program below
            rowDim = Integer.parseInt(sizeList[0]); // change string in sizeList[0] to Integer
            colDim = Integer.parseInt(sizeList[1]); // change string in sizeList[1] to Integer
            matrix = new int[rowDim][colDim]; // set new matrix
            for (int i = 0; i < rowDim; i++) {
                for (int j = 0; j < colDim; j++) {
                   System.out.print("Enter element at row " + i + " column " + j + " : ");  
                   int inputNumSizeInt = Integer.parseInt(inputUser.nextLine()); // change string from scanner to integer in value inputNumSizeInt
                   matrix[i][j] = inputNumSizeInt ; //set matrix[i][j] is inputNumSizeInt 
                }
                
            }
            inputUser.close();
        } catch (Exception e) {  // if error it will catch and show below
            System.out.println("Hi, Why you incorect number??????");
            System.exit(0); // stop the programe
        }
    
    }

    /**
     * <b> This is showMatrix method will show the original matrix </b>
     */
    public static void showMatrix() {
        System.out.println("Show the original matrix :");
        for (int i = 0; i < rowDim; i++) { // count up i = 0 to a number before rowDim
            for (int j = 0; j < colDim; j++) { // count up j = 0 to a number before colDim
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // if end for j loop will start new line
        }
    }

    /**
     * <b> This is showMatrixByRow method will show the matrix by row </b>
     */
    public static void showMatrixByRow() {
        System.out.print("Show the matrix by row : ");
        for (int i = 0; i < rowDim; i++) { // count up i = 0 to a number before rowDim
            for (int j = 0; j < colDim; j++) { // count up j = 0 to a number before colDim
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    /**
     * <b> This is showMatrixByColum method will show the matrix by column </b>
     */
    public static void showMatrixByColumn() {
        System.out.print("\nShow the matrix by column : ");
        for (int i = 0; i < colDim; i++) { // count up i = 0 to a number before colDim
            for (int j = 0; j < rowDim; j++) { // count up j = 0 to a number before rowDim
                System.out.print(matrix[j][i]+ " "); // print matrix[j][i]
            }
        }
    }

    /**
     * <b> This is showMatrixByRowBackward method will show the matrix by row backward </b>
     */
    public static void showMatrixByRowBackward() {
        System.out.print("\nShow the matrix by row backward : ");
        for (int i = rowDim-1 ; i >= 0 ; i--) { // count donw i = rowDim minus 1 to i >= 0
            for (int j = colDim-1 ; j >= 0 ; j--) { // count donw j = colDim minus 1 to j >= 0
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    /**
     * <b> This is showMatrixByColumnBackWard method will show the matrix by column backward </b>
     */
    public static void showMatrixByColumnBackward() {
        System.out.print("\nShow the matrix by column backward : ");
        for (int i = colDim-1 ; i >= 0 ; i--) { // count donw i = colDim minus 1 to i >= 0
            for (int j = rowDim-1 ; j >= 0 ; j--) { // count donw i = rowDim minus 1 to i >= 0
                System.out.print(matrix[j][i] + " "); // print matrix[j][i]
            }
        }
    }

    /**
     * <b> This is showMatrixByDiagonalTopLeftBottomRight method will show the diagonal element of the matrix from top-left to bottom-right </b>
     */
    public static void showMatrixByDiagonalTopLeftBottomRight() {
        System.out.print("\nShow the diagonal element of the matrix from top-left to bottom-right : ");
        for (int i = 0; i < rowDim; i++) { // count up i = 0 to a number before rowDim
            System.out.print(matrix[i][i] + " "); // print matrix[i][i] is same position
        }
    }

    /**
     * <b> This is showMatrixByDiagonalTopRightBottomLeft method will show the diagonal element of the matrix from top-right to bottom-left </b>
     */
    public static void showMatrixByDiagonalTopRightBottomLeft() {
        System.out.print("\nShow the diagonal element of the matrix from top-right to bottom-left : ");
        for (int i = 0; i < rowDim; i++) { // count up i = 0 to a number before rowDim
            System.out.print(matrix[i][rowDim-i] + " "); // print matrix[i][rowDim-i] the position is run opposite
        }
    }

    /**
     * <b> This is showMatrixByRowZigzag method will show the matrix by row zigzag </b>
     */
    public static void showMatrixByRowZigzag() {
        System.out.print("\nShow the matrix by row zigzag : ");
        for (int i = 0; i < rowDim; i++) { // count up i = 0 to a number before rowDim
            if(i % 2==0){ // check even number
                for (int j = 0; j < colDim; j++) { // count up j = 0 to a number before colDim
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else{ // check odd number
                for (int j = colDim-1 ; j >= 0 ; j--) { // count donw j = 0 to a number before colDim
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

}
