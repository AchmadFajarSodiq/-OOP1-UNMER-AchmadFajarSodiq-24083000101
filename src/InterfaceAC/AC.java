/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAC;

/**
 *
 * @author FAJAR
 */
public class AC implements InterfaceAC {
    int statusAC;
    
    public AC() {
        statusAC = KEADAAN_MATI;
    }
    
    public void hidupkanAC() {
        if (statusAC == KEADAAN_MATI) {
            statusAC = KEADAAN_HIDUP;
            System.out.println("AC dihidupkan.");
        } else {
            System.out.println("AC sudah dalam keadaan hidup.");
        }
    }
    
    public void matikanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            statusAC = KEADAAN_MATI;
            System.out.println("AC dimatikan.");
        } else {
            System.out.println("AC sudah dalam keadaan mati.");
        }
    }
    
    public void dinginkanAC() {
        if (statusAC == KEADAAN_MATI) {
            System.out.println("AC sedang mendinginkan ruangan");
        } else {
            System.out.println("AC tidak dapat mendinginkan ruangan karena dalam keadaan mati");
        }
    }
    
    public void panaskanAC() {
        if (statusAC == KEADAAN_MATI) {
            System.out.println("AC sedang memanaskan ruangan");
        } else {
            System.out.println("AC tidak dapat memanaskan ruangan karena dalam keadaan mati");
        }
    }
}
