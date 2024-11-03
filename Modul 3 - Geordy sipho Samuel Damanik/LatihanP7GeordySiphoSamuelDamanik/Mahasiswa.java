
package LatihanP7GeordySiphoSamuelDamanik;
/**
 *
 * @author Geordy Sipho Samuel Damanik
 * S1SI-07-C
 * 2311103112
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
        System.out.println("Daftar Mata Kuliah yang diambil:");
        for (MataKuliah mk : daftarKRS){
            mk.ShowInfo();
        }
    }
    
    public int hitungTotalSKS(){
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS){
            totalSKS += mk.getSks(); //getter untuk mendapatkan nilai SKS
        }
        return totalSKS;
    }
}
