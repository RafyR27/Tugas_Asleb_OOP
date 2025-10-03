/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import interfaces.InterfacePerpus;
import java.util.ArrayList;
import models.buku.Buku;
import models.user.Anggota;

/**
 *
 * @author Rafy1
 */
public class Perpustakaan implements InterfacePerpus{
    ArrayList<Buku> buku = new ArrayList<>();
    ArrayList<Anggota> anggota = new ArrayList<>();
    
    @Override
    public void tambahBuku(String judul, String penulis, String tahun_terbit){
        buku.add(new Buku(judul, penulis, tahun_terbit));
        System.out.println("Buku berhasil ditambahkan!");
    }
    
    @Override
    public void tambahAnggota(String nama, String no_hp, String alamat){
        anggota.add(new Anggota(nama, no_hp, alamat));
        System.out.println("Anggota berhasil ditambahkan!");
    }
    
    @Override
    public void pinjamBuku(String judulBuku){
        for (int i = 0; i < buku.size(); i++) {
            Buku b = buku.get(i);
            if(b.getJudul().equalsIgnoreCase(judulBuku)){
                b.pinjam();
                return;
            }
        }
        System.out.println("Buku tidak ditemukan!");
    }
    
    @Override
    public void kembalikanBuku(String judulBuku){
        for (int i = 0; i < buku.size(); i++) {
            Buku b = buku.get(i);
            if(b.getJudul().equalsIgnoreCase(judulBuku)){
                b.kembalikan();
                return;
            }
        }
        System.out.println("Buku tidak ditemukan!");
    }
    
    @Override
    public void tampilkanBuku() {
        System.out.println("\n===== Daftar Buku =====");
        if(buku.size() == 0){
            System.out.println("Belum ada buku yang ditambahkan!");
            return;
        }
        
        for (int i = 0; i < buku.size(); i++) {
            Buku b = buku.get(i);
            System.out.print((i+1) + ". ");
            b.infoBuku();
        }
    }
    
    @Override
    public void tampilkanAnggota() {
        System.out.println("\n===== Anggota Perpustakaan =====");
        if(anggota.size() == 0){
            System.out.println("Belum ada anggota yang ditambahkan!");
            return;
        }
        for (int i = 0; i < anggota.size(); i++) {
            Anggota b = anggota.get(i);
            b.infoAnggota();
        }
    }
}
