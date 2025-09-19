/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4_asleb_muhamad.rafy.ramadhan;

/**
 *
 * @author Rafy1
 */
public class Balok extends Kubus {
    int l, t;
    
    Balok(int s, int l, int t){
        super(s);
        this.l = l;
        this.t = t;
    }

    @Override
    void Volume() {
        System.out.println("Volume Balok = " + s + " x " + l + " x " + t + " = " + s*l*t);
    }

    @Override
    void LuasPermukaan() {
        System.out.println("Luad Permukaan Balok = 2 x (" + s + " x " + l + " + " + s + " x " + t + " + " + l + " x " + t +") = " + 2*(s*l+s*t+l*t));
    }    
    
} 
