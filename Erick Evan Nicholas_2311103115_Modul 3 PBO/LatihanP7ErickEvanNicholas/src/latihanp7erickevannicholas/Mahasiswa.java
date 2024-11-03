/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp7erickevannicholas;

import java.util.ArrayList;
import java.util.List;
/**
 * 2311103115
 * @author Erick Evan Nicholas
 * S1SI-07C
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

    @Override
    public void showInfo() {
        System.out.println("Nama Mahasiswa : " + nama + ", NIM : " + nim + ", Prodi : " + prodi);
    }

    @Override
    public void tambahMatakuliah(MataKuliah mk) {
        daftarKRS.add(mk);
    }

    @Override
    public void hapusMatakuliah(MataKuliah mk) {
        daftarKRS.remove(mk);
    }

    // Metode untuk menampilkan daftar matakuliah yang diambil oleh mahasiswa
    public void showKRS() {
        System.out.println("Daftar Mata Kuliah yang diambil oleh " + nama + ":");
        for (MataKuliah mk : daftarKRS) {
            mk.showInfo();
        }
    }

    // Metode untuk menghitung total SKS yang diambil oleh mahasiswa
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS) {
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }
}