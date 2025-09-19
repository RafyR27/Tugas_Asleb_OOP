/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4_asleb_muhamad.rafy.ramadhan;

/**
 *
 * @author Rafy1
 */
public class VolumeAndLuasPermukaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus k1 = new Kubus(5);
        k1.Volume();
        k1.LuasPermukaan();
        
        System.out.println();
        
        Balok b1 = new Balok(5, 3, 2);
        b1.Volume();
        b1.LuasPermukaan();
        
    }
    
}
