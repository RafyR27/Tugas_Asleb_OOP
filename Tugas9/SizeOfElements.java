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
public class SizeOfElements {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList();
        arr.add(4);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        System.out.println(arr);
        
        int b = arr.size();
        System.out.println("The size is: " + b);
    }
}
