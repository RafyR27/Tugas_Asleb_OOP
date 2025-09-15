/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3_no2_asleb_muhamad.rafy.ramadhan;

/**
 *
 * @author Rafy1
 */
public class KonversiSuhu2 extends KonversiSuhu {
    int f;
    
    KonversiSuhu2(int c, int f){
        super(c);
        this.f = f;
    }
    
    void fahrenheitToReamur(){ 
        double hasil = ((f - 32)*4.0/9.0);
        System.out.println("Hasil dari " + f + " fahrenheit ke reamur = " + hasil);
    }
}
