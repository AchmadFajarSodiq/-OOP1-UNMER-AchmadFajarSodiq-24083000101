/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadingMatematika;

/**
 *
 * @author FAJAR
 */
public class Matematika {
    double hasil;
    
    public double pertambahan(double a, double b) {
        hasil = a + b;
        return hasil;
    }
    
    public double pengurangan(double a, double b) {
        hasil = a - b;
        return hasil;
    }
    
    public double perkalian(double a, double b) {
        hasil = a * b;
        return hasil;
    }
    
    public double pembagian(double a, double b) {
        hasil = a / b;
        return hasil;
    }
    
    public double modulus(double a, double b) {
        hasil = a % b;
        return hasil;
    }
}
