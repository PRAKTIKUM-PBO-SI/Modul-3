/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnguidedP7MuhammadRafiAwallaisal;

// @author Muhammad Rafi Awallaisal

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa extends Person implements KRS {
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

    // Menampilkan daftar mata kuliah yang diambil oleh mahasiswa
    public void showKRS() {
        System.out.println("Daftar Mata Kuliah yang Diambil:");
        for (MataKuliah mk : daftarKRS) {
            System.out.println("- " + mk.kode + " " + mk.namaMatakuliah + " (" + mk.sks + " SKS)");
        }
    }

    // Menghitung total SKS yang diambil oleh mahasiswa
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS) {
            totalSKS += mk.sks;
        }
        return totalSKS;
    }
}
