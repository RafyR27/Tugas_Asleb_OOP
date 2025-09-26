/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.Scanner;
import models.Mahasiswa;

/**
 *
 * @author Rafy1
 */
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do{
            System.out.println("========= Mahasiswa =========");
            System.out.println("1. Masukkan data");
            System.out.println("2. Exit");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();
            
            switch(pilihan){
                case 1:
                    System.out.print("NPM\t\t: ");
                    String npm = input.nextLine();
                    System.out.print("Nama Mahasiswa\t: ");
                    String nama = input.nextLine();
                    System.out.print("NIlai Kehadiran\t: ");
                    double kehadiran = input.nextDouble();
                    input.nextLine();
                    System.out.print("Nilai Tugas\t: ");
                    double tugas = input.nextDouble();
                    input.nextLine();
                    System.out.print("Nilai UTS\t: ");
                    double uts = input.nextDouble();
                    input.nextLine();
                    System.out.print("Nilai UAS\t: ");
                    double uas = input.nextDouble();
                    input.nextLine();

                    Mahasiswa m1 = new Mahasiswa(npm, nama);
                    m1.menghitungNilai(kehadiran, tugas, uts, uas);

                    System.out.println();
                    m1.display();
                    break;
                    
                case 2:
                    System.out.println("Terima Kasih");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }while(pilihan != 2);   
    }
    
}
