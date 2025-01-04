/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author FAJAR
 */
public class MatematikaBeraksi {
     public static void main(String[] args) {
        Matematika mtk = new Matematika();
        
        mtk.setNilai(20, 20);
        System.out.println("Pertambahan: " + mtk.a + " + " + mtk.b + " = " + mtk.pertambahan());
        
        mtk.setNilai(10, 5);
        System.out.println("Pengurangan: " + mtk.a + " - " + mtk.b + " = " + mtk.pengurangan());
        
        mtk.setNilai(10, 20);
        System.out.println("Perkalian: " + mtk.a + " * " + mtk.b + " = " + mtk.perkalian());
        
        mtk.setNilai(21, 2);
        System.out.println("Pembagian: " + mtk.a + " / " + mtk.b + " = " + mtk.pembagian());
    }
}
