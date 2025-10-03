/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainApp;

import controller.Perpustakaan;
import java.util.Scanner;

/**
 *
 * @author Rafy1
 */
public class AppPerpustakaan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        int pil;
        
        do{
            System.out.println("\n===== Sistem Perpustakaan =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Daftar Buku");
            System.out.println("6. Tampilkan Daftar Anggota");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pil = input.nextInt();
            input.nextLine();
            
            switch(pil){
                case 1:
                    System.out.print("Judul buku\t: ");
                    String judul = input.nextLine();
                    System.out.print("Penulis\t\t: ");
                    String penulis = input.nextLine();
                    System.out.print("Tahun Terbit\t: ");
                    String tahun_terbit = input.nextLine();
                    perpustakaan.tambahBuku(judul, penulis, tahun_terbit);
                    break;
                case 2:
                    System.out.print("Nama\t\t: ");
                    String nama = input.nextLine();
                    System.out.print("Nomor Hp\t: ");
                    String no_hp = input.nextLine();
                    System.out.print("Alamat\t\t: ");
                    String alamat = input.nextLine();
                    perpustakaan.tambahAnggota(nama, no_hp, alamat);
                    break;
                case 3:
                    System.out.print("Judul buku\t: ");
                    String judulBukuPinjam = input.nextLine();
                    perpustakaan.pinjamBuku(judulBukuPinjam);
                    break;
                case 4:
                    System.out.print("Judul buku\t: ");
                    String judulBukuKembalikan = input.nextLine();
                    perpustakaan.kembalikanBuku(judulBukuKembalikan);
                    break;
                case 5:
                    perpustakaan.tampilkanBuku();
                    break;
                case 6:
                    perpustakaan.tampilkanAnggota();
                    break;
                case 7:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pil != 7);
    }
}
