/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author Rafy1
 */
public interface InterfacePerpus {
    public void tambahBuku(String judul, String penulis, String tahun_terbit);
    public void tambahAnggota(String nama, String no_hp, String alamat);
    public void pinjamBuku(String judulBuku);
    public void kembalikanBuku(String judulBuku);
    public void tampilkanBuku();
    public void tampilkanAnggota();
}
