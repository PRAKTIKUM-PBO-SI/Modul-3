/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP7Hanafiilham;

/**
 *
 * @author hanaf
 */
import java.util.ArrayList;
import java.util.List;

class Mahasiswa extends Person implements KRS {

    private final String nim;
    private final String prodi;
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final List<MataKuliah> daftarKRS = new ArrayList<>();

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
    
    // Menampilkan daftar mata kuliah yang diambil
    public void showKRS() {
        System.out.println("Daftar Mata Kuliah yang Diambil oleh " + nama + ":");
        for (MataKuliah mk : daftarKRS) {
            mk.showInfo(); // Menampilkan informasi setiap mata kuliah
        }
    }
    
    // Menghitung total SKS yang diambil
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS) {
            totalSKS += mk.getSks(); // Menjumlahkan SKS dari setiap mata kuliah
        }
        return totalSKS;
    }
}

