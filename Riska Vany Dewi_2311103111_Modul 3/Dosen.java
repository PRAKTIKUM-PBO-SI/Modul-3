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

class Dosen extends Person {
    private String nip;
    private List<MataKuliah> daftarMatakuliah = new ArrayList<>();
    
    public Dosen(String nama, String id, String nip){
        super(nama, id);
        this.nip = nip;
    }
        
    @Override
    public void showInfo(){
        System.out.println("Nama Dosen: " + nama + ", NIP: " + nip);
    }
    
    public void tambahMataKuliah(MataKuliah mk){
        daftarMatakuliah.add(mk);
    }

    
}
