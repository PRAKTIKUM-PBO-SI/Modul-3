/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan7tigris;

/**
 *
 * @author Tigris Yedija
 */
public class LatihanP7Tigris {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Tigris Yedija Maarende", "123", "2311103103", "Sistem Informasi");
        Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001");
        
        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Jaringan Komputer", 3);
        
        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa");
        
        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);
        
        mhs.showInfo();
        dosen.showInfo();
        
        mk1.showInfo();
        mk2.showInfo();
        
        mhs.showKRS();
        
        int totalSKS = mhs.hitungTotalSKS();
        System.out.println("Total SKS yang Diambil: " + totalSKS);
    }
}


