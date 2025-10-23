/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_dosen_pertemuan11;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Rafy1
 */
public class ArrayListSort {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList();
        arr.add(4);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        
        System.out.println("Before sorting list:");
        System.out.println(arr);
        
        Collections.sort(arr);
        
        System.out.println("After sorting list:");
        System.out.println(arr);
    }
}
