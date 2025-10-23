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
public class IteratingElements {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Object");
        arr.add("Programming");
        arr.add(1, "Oriented");
        
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        
        System.out.println();
        
        for(String str : arr){
            System.out.println(str + " ");
        }
    }
}
