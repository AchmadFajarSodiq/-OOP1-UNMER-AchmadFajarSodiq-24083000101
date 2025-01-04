/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadingMatematika;

/**
 *
 * @author FAJAR
 */
public class MatematikaCanggih extends Matematika{
    // Overloading dengan 3 parameter
    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }
    
    public double pengurangan(double a, double b, double c) {
        return a - b - c;
    }
    
    public double perkalian(double a, double b, double c) {
        return a * b * c;
    }
    
    public double pembagian(double a, double b, double c) {
        return a / b / c;
    }
    
    public double modulus(double a, double b, double c) {
        return (a % b) % c;
    }
}
