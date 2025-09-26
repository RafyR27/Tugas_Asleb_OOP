/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Rafy1
 */
public class Mahasiswa {
    String npm,nama;
    char grade;
    String keterangan;
    double hasil;
    
    public Mahasiswa(String npm, String nama){
        this.npm = npm;
        this.nama = nama;
    }
    
    public void menghitungNilai(double kehadiran, double tugas, double uts, double uas){
        hasil = (0.1 * kehadiran) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
        
        if(hasil<=100 && hasil>=76){
            grade = 'A';
            keterangan = "Istimewa";
        } else if (hasil<=75 && hasil>=66) {
            grade = 'B';
            keterangan = "Baik";
        } else if (hasil<=65 && hasil>=56) {
            grade = 'C';
            keterangan = "Cukup";
        } else if (hasil<=55 && hasil>=46) {
            grade = 'D';
            keterangan = "Kurang";
        } else if (hasil<=45 && hasil>=0) {
            grade = 'E';
            keterangan = "Kurang Sekali";
        }
    }
    
    public void display(){
        System.out.println("========= NIlai Mahasiswa =========");
        System.out.println("NPM Mahasiswa\t: " + npm);
        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("Nilai Rata-rata\t: " + hasil);
        System.out.println("Grade\t\t: " + grade);
        System.out.println("Keterangan\t: " + keterangan);
        System.out.println("\n");
    }
}
