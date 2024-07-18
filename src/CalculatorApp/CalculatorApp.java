/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatorApp;

/**
 *
 * @author user
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Selamat Datang Di Kalkulator Sederhana!");

    double firstNum = 0;
    double secondNum = 0;
    char operator = 0;

    while (true) {
      try {
        System.out.println("Masukan Nomor Pertama: ");
        firstNum = scanner.nextDouble();

        System.out.println("Masukan Nomor Kedua: ");
        secondNum = scanner.nextDouble();

        System.out.println("Masukan Operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        break;

      } catch (InputMismatchException ime) {
        System.out.println("Input Gagal. Mohon Untuk Masukkan Nomor dan Operator Kembali (+, -, *, /).");
        scanner.nextLine(); 
      }
    }

    Calculation calculation = new Calculation(firstNum, secondNum, operator);
    System.out.println("Hasilnya: " + calculation.makeCalculation());
  }
}