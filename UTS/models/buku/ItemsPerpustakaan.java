/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.buku;

import interfaces.InterfaceBuku;

/**
 *
 * @author Rafy1
 */
abstract class ItemsPerpustakaan implements InterfaceBuku {
    private String judul, penulis, tahun_terbit;
    private boolean tersedia = true;
    
    ItemsPerpustakaan(String judul, String penulis, String tahun_terbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahun_terbit = tahun_terbit;
    };
    
    public boolean getStatus(){
        return tersedia;
    }
    
    public String getJudul(){
        return judul;
    }
    
    @Override
    public void infoBuku(){
        System.out.println(judul + " - " + penulis + " - " + tahun_terbit + " [" + (getStatus() ? "Tersedia" : "Dipinjam") + "]");
    }
    
    @Override
    public void pinjam(){
        if(tersedia){
            tersedia = false;
            System.out.println(judul + " berhasil dipinjam!");
        } else {
            System.out.println(judul + " sudah dipinjam!");
        }
    }
    
    @Override
    public void kembalikan(){
        if(!tersedia){
            tersedia = true;
            System.out.println(judul + " berhasil dikembalikan!");
        } else {
            System.out.println("Gagal mengembalikan buku karena buku sudah tersedia!");
        }
    }
}
