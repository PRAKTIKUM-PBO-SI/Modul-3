package latihanp7rizqidwisaputra;
//@author Rizqi Dwi Saputra 2311103133 / S1SI07C

import java.util.ArrayList;
import java.util.List;

class Mahasiswa extends Person implements KRS{
    
    private String nim;
    private String prodi;
    private List<MataKuliah> daftarKRS = new ArrayList<>();
    
    public Mahasiswa(String nama, String id, String nim, String prodi){
        super(nama, id);
        this.nim = nim;
        this.prodi = prodi;
    }
    
    // Overriding showInfo (Implementasi khusus untuk Mahasiswa)
    @Override
    public void ShowInfo(){
        System.out.println("Nama Mahasiswa: " + nama + ", NIM: " + nim + 
                ", Prodi: " + prodi);
    }
    
    // Implementasi metode interface untuk tambah dan hapus matakuliah
    @Override
    public void tambahMataKuliah(MataKuliah mk){
        daftarKRS.add(mk);
    }
    
    @Override
    public void hapusMataKuliah(MataKuliah mk){
        daftarKRS.remove(mk);
    }
    
}
