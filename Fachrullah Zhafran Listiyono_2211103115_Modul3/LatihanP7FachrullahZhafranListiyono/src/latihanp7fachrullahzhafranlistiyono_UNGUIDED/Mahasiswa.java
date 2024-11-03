package latihanp7fachrullahzhafranlistiyono_UNGUIDED;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

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

    // Menampilkan daftar mata kuliah yang diambil oleh mahasiswa
    public void showKRS() {
        System.out.println("Daftar Mata Kuliah yang diambil oleh " + nama + ":");
        for (MataKuliah mk : daftarKRS) {
            mk.showInfo();
        }
    }

    // Menghitung total SKS yang diambil oleh mahasiswa
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }
}
