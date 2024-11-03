package unguided2;
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
    
    public void showKRS(){
        System.out.println("");
        System.out.println("Daftar MatKul " + nama + ":");
        for(int i = 0; i < daftarKRS.size(); i++){
            MataKuliah mk = daftarKRS.get(i);
            System.out.println((i+1) + ". Kode MatKul: " + mk.getKode()
            + ", Nama MatKul: " + mk.getNamaMataKuliah()
            + ", SKS: " + mk.getSks()
            + ", Jadwal: " + (mk.getJadwalHari() != null ? mk.getJadwalHari(): "Tidak ada hari")
            + (mk.getJadwalJam() != null ? " " + mk.getJadwalJam() : ""));
        }
    }
    
    public void hitungTotalSKS(){
        int totalSKS = 0;
        for(MataKuliah mk : daftarKRS){
            totalSKS += mk.getSks();
        }
        System.out.println("Total SKS yang diambil oleh " + nama + ": " + totalSKS + " SKS");
    }
    
}
