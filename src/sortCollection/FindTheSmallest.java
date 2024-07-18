/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortCollection;

/**
 *
 * @author Jeremy
 */
public class FindTheSmallest {
    int[] findSmallest(int[] arr){
        int i;

        // Initialize minimum element
        int min = arr[0];

        // Traverse array elements from second and
        // compare every element with current min
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return new int[]{min};
    }
}