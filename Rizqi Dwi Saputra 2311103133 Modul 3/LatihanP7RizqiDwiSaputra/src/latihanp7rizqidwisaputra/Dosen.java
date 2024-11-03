package latihanp7rizqidwisaputra;
//@author Rizqi Dwi Saputra 2311103133 / S1SI07C

import java.util.ArrayList;
import java.util.List;

class Dosen extends Person {
    
    private String nip;
    private List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    
    public Dosen(String nama, String id, String nip){
        super(nama, id);
        this.nip = nip;
    }
    
//    Overriding showInfo (Implementasi khusus untuk Dosen)
    @Override
    public void ShowInfo(){
        System.out.println("Nama Dosen: " + nama + ", NIP: " + nip);
    }
    
//    Tambah MataKuliah untuk Dosen
    public void tambahMataKuliah(MataKuliah mk){
        daftarMataKuliah.add(mk);
    }
    
}
