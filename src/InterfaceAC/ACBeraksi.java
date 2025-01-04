/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAC;

/**
 *
 * @author FAJAR
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC acKamar = new AC();
        
        System.out.println("Status awal AC: Mati");
        acKamar.hidupkanAC(); // Hidupkan AC
        acKamar.dinginkanAC(); // Dinginkan ruangan
        acKamar.matikanAC(); // Matikan AC
        acKamar.panaskanAC(); // Memanaskan ruangan (seharusnya gagal karena AC mati)
        acKamar.hidupkanAC(); // Hidupkan AC kembali
        acKamar.panaskanAC(); // Memanaskan ruangan
    }
}
