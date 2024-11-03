/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp7marsya;
import java.util.ArrayList;
import java.util.List;

        
/**
 *
 * @author Marsya Valeria
 * 2311103105
 * 07c
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
    public void tambahMatakuliah(MataKuliah mk) {
        daftarKRS.add(mk);
    }

    public void hapusMatakuliah(MataKuliah mk) {
        daftarKRS.remove(mk);
    }
    
    //Menampilkan daftar KRS Mahasiswa
    public void showKRS(){
        System.out.println("Daftar KRS Mahasiswa " + nama + ":");
        for (MataKuliah mk : daftarKRS){
            mk.showInfo();
        }
    }

    public int hitungTotalSKS(){
    int totalSKS = 0;
    for (MataKuliah mk : daftarKRS){
        totalSKS += mk.getSks();
    }
    return totalSKS;
    }
}