/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortCollection;


/**
 *
 * @author Jeremy
 */
public class RemoveOddNumbers {
    int[] remove(int[] arr, boolean removeEven) {
        int countRemoved = 0;
        int countKept = 0;
        for (int num : arr) {
            if ((num % 2 == 0) == removeEven) {
                countRemoved++;
            } else {
                countKept++;
            }
        }

        int[] result = new int[countKept];
        int[] removed = new int[countRemoved];
        int resultIndex = 0;
        int removedIndex = 0;
        for (int num : arr) {
            if ((num % 2 == 0) == removeEven) {
                removed[removedIndex++] = num;
            } else {
                result[resultIndex++] = num;
            }
        }

        System.out.print("Hasil nya: \n");
        for (int num : removed) 
        {
            System.out.print(num + " ");
        }
        System.out.println();

        return result;
    }
}