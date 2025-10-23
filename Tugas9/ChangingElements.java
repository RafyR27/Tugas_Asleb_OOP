/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_dosen_pertemuan11;

import java.util.ArrayList;

/**
 *
 * @author Rafy1
 */
public class ChangingElements {
    public static void main(String[] args){
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add(20);
        arr.add("Cindy");
        arr.add(null);
        System.out.println(arr);
        
        arr.set(4, "Deasy");
        System.out.println(arr);
        
        arr.set(2, "Anne");
        System.out.println(arr);
    }
}
