/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transpose;

/**
 *
 * @author user
 */
public class transpose {
    public static void transpose(int[][] data) {
        int row = data.length;
        int column = data[0].length;

        System.out.println("Elements of transpose matrix T are: ");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(data[c][r] + "\t");
            }
            System.out.println();
        }
    }
          public static void normalize(int[][] matrix) {
          int row = matrix.length;
          int column = matrix[0].length;

            for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
            int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }
}
