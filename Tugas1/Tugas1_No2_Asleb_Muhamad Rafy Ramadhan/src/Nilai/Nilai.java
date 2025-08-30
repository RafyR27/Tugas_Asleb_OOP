package Nilai;

public class Nilai {
    String NIM;
    String nama;
    float absen, tugas, uts, uas, akhir;
    
    
    public Nilai(String NIM, String nama, float absen, float tugas, float uts, float uas) {
        this.NIM = NIM;
        this.nama = nama;
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }
    
    public void CetakNilai() {
        akhir = (absen*10/100)+(tugas*20/100)+(uts*30/100)+(uas*40/100);
        
        System.out.println("NIM\t\t\t\t: " + NIM);
        System.out.println("Nama\t\t\t\t: " + nama);
        System.out.println("Nilai Absen[10%]\t\t: " + absen*10/100);
        System.out.println("Nilai Tugas[20%]\t\t: " + tugas*20/100);
        System.out.println("Nilai UTS[30%]\t\t\t: " + uts*30/100);
        System.out.println("Nilai UAS[40%]\t\t\t: " + uas*40/100);
        System.out.println("Nilai Akhir\t\t\t: " + akhir);
    }
}
