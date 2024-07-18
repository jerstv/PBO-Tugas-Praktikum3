/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transpose;

/**
 *
 * @author user
 */
import static Transpose.transpose.normalize;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Please enter the rows in the matrix");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Please enter the columns in the matrix");
        int column = sc.nextInt();

        int[][] first = new int[row][column];
        int[][] second = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter first[%d][%d] integer", r, c));
                first[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter second[%d][%d] integer", r, c));
                second[r][c] = sc.nextInt();
            }
        }
        normalize(first);
        normalize(second);

        // close the scanner
        sc.close();

        // print both matrices
        System.out.println("First Matrix:\n");
        Print2dArray.print2dArray(first);

        System.out.println("Second Matrix:\n");
        Print2dArray.print2dArray(second);

        // sum and transpose of matrices
        transpose.transpose(Sum.sum(first,second));
        
        // subtraction and transpose of matrices
        transpose.transpose(Subtraction.sub(first,second));
        
        // devided and transpose of matrices
        transpose.transpose(devided.dev(first,second));
        
        // multiple and transpose of matrices
        transpose.transpose(Multiple.mul(first,second));        

        System.out.println("\nNormalized First Matrix:\n");
        Print2dArray.print2dArray(first);

        System.out.println("\nNormalized Second Matrix:\n");
        Print2dArray.print2dArray(second);
    }
}