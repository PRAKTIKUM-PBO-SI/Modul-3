/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7Achmadshodiq;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @AchmadShodiq//2311103140
 */
     class Mahasiswa extends Person implements KRS{
     private String nim;
     private String prodi;
     private List<Matakuliah> daftarKRS = new ArrayList<>();
     
     public Mahasiswa(String nama, String id, String nim, String prodi){
         super(nama,id);
         this.nim = nim;
         this.prodi = prodi;
     }
     
     //Overriding showInfo (implementasi khusus untuk mahasiswa
     @Override
     public void showinfo(){
         System.out.println("Nama Mahasiswa :"+ nama +", NIM" +nim+", Prodi:" +prodi );
     }
     @Override
     public void tambahMatakuliah (Matakuliah mk){
         daftarKRS.add(mk);
     }

    @Override
    public void hapusMatakuliah(Matakuliah mk) {
       daftarKRS.remove(mk);
    }
     public void showKRS(){
         System.out.println("Daftar mata kuliah yang diambil oleh " +nama + ":");
         for (Matakuliah mk : daftarKRS){
             mk.showInfo();
         }
     }
     
     //Menghitung SKS total
    public int hitungSKS (){
        int totalSKS = 0;
        for(Matakuliah mk : daftarKRS){
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }
     }