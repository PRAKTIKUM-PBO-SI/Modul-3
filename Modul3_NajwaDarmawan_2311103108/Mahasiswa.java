/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP7najwa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Najwa Darmawan
 * 2311103108
 * S1SI07C
 */
class Mahasiswa extends Person implements KRS {
    private String nim;
    private String prodi;
    private List<MataKuliah> daftarKRS = new ArrayList<>();

    public Mahasiswa(String nama, String id, String nim, String prodi) {
        super(nama, id);
        this.nim = nim;
        this.prodi = prodi;
    }

    // Overriding showInfo (Implementasi khusus untuk Mahasiswa)
    @Override
    public void showInfo() {
        System.out.println("Nama Mahasiswa: " + nama + ", NIM: " + nim + ", Prodi: " + prodi);
    }

    // Implementasi metode interface untuk tambah dan hapus matakuliah
    @Override
    public void tambahMatakuliah(MataKuliah mk) {
        daftarKRS.add(mk);
    }

    @Override
    public void hapusMatakuliah(MataKuliah mk) {
        daftarKRS.remove(mk);
    }

    // Feature 1: Menampilkan Daftar Mata Kuliah yang Diambil
    public void showKRS() {
        System.out.println("\nDaftar KRS Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + prodi);
        System.out.println("\nMata Kuliah yang Diambil:");
        
        if (daftarKRS.isEmpty()) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        } else {
            for (MataKuliah mk : daftarKRS) {
                mk.showInfo();
            }
            System.out.println("Total SKS: " + hitungTotalSKS());
        }
    }

    // Feature 2: Menghitung Total SKS
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS) {
            totalSKS += mk.getSKS();  // Assuming you'll add getSKS() method in MataKuliah class
        }
        return totalSKS;
    }
}

