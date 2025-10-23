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
public class GetElements {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Andrew");
        arr.add("Bob");
        arr.add("Cella");
        arr.add("Denlie");
        arr.add(null);
        arr.add("Emely");
        System.out.println(arr);
        
        String s = arr.get(1);
        System.out.println("at indext 1 number is: " + s);
    }
}
