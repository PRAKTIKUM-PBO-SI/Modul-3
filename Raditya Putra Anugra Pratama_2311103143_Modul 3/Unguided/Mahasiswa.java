package Unguided;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raditya Putra Anugra Pratama
 * 2311103143
 * S1SI07-C
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
        System.out.println("Nama Mahasiswa: " + nama + ", NIM: " + nim + ", Prodi: " + prodi);
    }

    @Override
    public void tambahMatakuliah(MataKuliah mk) {
        daftarKRS.add(mk);
    }

    @Override
    public void hapusMatakuliah(MataKuliah mk) {
        daftarKRS.remove(mk);
    }

    public void showKRS() {
        System.out.println("\n-==== Daftar KRS Mahasiswa " + nama + " ====-");
        if (daftarKRS.isEmpty()) {
            System.out.println("Tidak ada mata kuliah yang diambil.");
        } else {
            for (MataKuliah mk : daftarKRS) {
                mk.showInfo();
            }
            System.out.println("Total SKS yang diambil: " + hitungTotalSKS());
        }
    }

    // Metode untuk menghitung total SKS
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }
}