/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortCollection;

/**
 *
 * @author Jeremy
 */
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        PrintArray pa = new PrintArray();
        InsertionSort is = new InsertionSort();
        FindTheLargest fl = new FindTheLargest();
        FindTheSmallest fs = new FindTheSmallest();
        Scanner sc = new Scanner(System.in);
        RemoveOddNumbers re = new RemoveOddNumbers();
        
        System.out.println("Masukkan ukuran array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }


        int[] arr = new int[arr_size];

        System.out.println("Masukkan elemen array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("Array yang diberikan");
        pa.PrintArray(arr);

        System.out.println("Angka Terbesar dalam array");
        pa.PrintArray(fl.findlargest(arr));
        
        System.out.println("Angka Terkecil dalam array");
        pa.PrintArray(fs.findSmallest(arr));
        
        System.out.println("Penyisipan Array yang diurutkan");
        pa.PrintArray(is.insort(arr));

        System.out.println("Seleksi Array yang diurutkan");
        pa.PrintArray(ob.selsort(arr));
        
        System.out.println("Hapus bilangan ganjil atau genap (y/n)?");
        char choice = sc.next().charAt(0);
        int[] removedNumbers = re.remove(arr, choice == 'y');
        System.out.println("Nomor Yang Di Hapus:");
        pa.PrintArray(removedNumbers);        
        
    }
}
