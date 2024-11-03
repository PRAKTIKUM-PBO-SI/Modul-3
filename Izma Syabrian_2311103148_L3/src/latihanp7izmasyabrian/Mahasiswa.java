/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp7izmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */

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
    
    public void showKRS(){
        System.out.println("");
        System.out.println("== Daftar Mata Kuliah ==");
        for(int i = 0; i < daftarKRS.size(); i++){
            MataKuliah mk = daftarKRS.get(i);
            System.out.println((i+1) + ". " + mk.getKode() + ", " + mk.getNamaMataKuliah() + ", " + mk.getSks() + " SKS, " + mk.getJadwalHari() + (mk.getJadwalJam() != null ? " " + mk.getJadwalJam() : ""));
        }
    }
    
    public void hitungTotalSKS(){
        int totalSKS = 0;
        for(MataKuliah mk : daftarKRS){
            totalSKS += mk.getSks();
        }
        System.out.println("========================");
        System.out.println("Total SKS: " + totalSKS + " SKS");
    }
}
