/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp7riskavanydewi;

/**
 * @author RISKA VANY DEWI
 * 2311103111
 * S1SI07C
 */

import java.util.ArrayList;
import java.util.List;

class Mahasiswa extends Person implements KRS {
    private String nim;
    private String prodi;
    private List<MataKuliah> daftarKRS = new ArrayList<>();
    
    public Mahasiswa(String nama, String id, String nim, String prodi){
        super(nama, id);
        this.nim = nim;
        this.prodi = prodi;
    }
    
    @Override
    public void showInfo(){
        System.out.println("Nama Mahasiswa: " +nama+ ", NIM: " +nim+ ", Prodi: " +prodi);
    }
    
    @Override
    public void tambahMataKuliah(MataKuliah mk){
        daftarKRS.add(mk);
    }
    
    @Override
    public void hapusMataKuliah(MataKuliah mk) {
        daftarKRS.remove(mk);
    }
    
    public void showKRS() {
        System.out.println("Daftar Mata Kuliah yang Diambil oleh " + nama + ":");
        for (MataKuliah mk : daftarKRS) {
            mk.showInfo();
        }
    }
    
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS) {
            totalSKS += mk.getSks();
        }
        System.out.println("Total SKS: " +totalSKS);
        return totalSKS;
    }
}
