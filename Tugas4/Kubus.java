/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4_asleb_muhamad.rafy.ramadhan;

/**
 *
 * @author Rafy1
 */
public class Kubus {
    int s;
    
    Kubus(int s){
        this.s = s;
    }
    
    void Volume(){
        System.out.println("Volume Kubus = " + s + " x " + s + " x " + s + " = " + s*s*s);
    }
    
    void LuasPermukaan(){
        System.out.println("Luad Permukaan Kubus = 6 x " + s + " x " + s + " = " + 6*s*s );
    }
}
