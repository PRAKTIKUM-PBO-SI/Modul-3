package latihanp7tegarferdian;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tegar Ferdian (2311103123)
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
    
    public void showKRS(){
        System.out.println("Daftar mata kuliah yang diambil oleh " + nama + ":");
        for (MataKuliah mk : daftarKRS){
            mk.showInfo();
        }
    }
    
    //menghitung total sks
    public int hitungSKS(){
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS){
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }
}