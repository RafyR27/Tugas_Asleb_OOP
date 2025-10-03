/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.user;

import interfaces.InterfaceAnggota;

/**
 *
 * @author Rafy1
 */
abstract class AnggotaPerpustakaan implements InterfaceAnggota {
    private String nama, no_hp, alamat;
    
    AnggotaPerpustakaan(String nama, String no_hp, String alamat){
        this.nama = nama;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }
    
    @Override
    public void infoAnggota(){
        System.out.println("Nama\t: " + nama);
        System.out.println("No Hp\t: " + no_hp);
        System.out.println("Alamat\t: " + alamat);
        System.out.println();
    }
}
