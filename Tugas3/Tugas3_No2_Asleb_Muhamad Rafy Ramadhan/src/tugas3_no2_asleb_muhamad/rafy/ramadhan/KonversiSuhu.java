/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3_no2_asleb_muhamad.rafy.ramadhan;

/**
 *
 * @author Rafy1
 */
public class KonversiSuhu {
    int c;
    
    KonversiSuhu(int c){
        this.c = c;
    }
    
    void celciusToFahrenheit(){
        double hasil = (c*(9.0/5.0)+32);
        System.out.println("Hasil dari " + c + " celcius ke fahrenheit = " + hasil);
    }
    
    void celciusToReamur(){
        double hasil = (c*(4.0/5.0));
        System.out.println("Hasil dari " + c + " celcius ke reamur = " + hasil);
    }
}
