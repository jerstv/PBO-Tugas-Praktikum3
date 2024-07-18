/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transpose;

/**
 *
 * @author user
 */
class Sum{
    public static int[][] sum(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] sum = new int[row][column];

        System.out.println("\nSum of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                sum[r][c] = first[r][c] + second[r][c];

        Print2dArray.print2dArray(sum);
        return sum;
    }
}