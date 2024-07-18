/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatorApp;

/**
 *
 * @author user
 */
public class Addition implements Operation {
    public double calculateResult(double left, double right) {
        return left + right;
    }
    public double subtractionResult(double left, double right) {
        return left - right;
    }
    public double devidedResult(double left, double right) {
        return left / right;
    }
    public double multipleResult(double left, double right) {
        return left * right;
    }
}