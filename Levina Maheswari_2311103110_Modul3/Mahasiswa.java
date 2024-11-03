package latihan7levina;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Levina Maheswari M.L
 * 2311103110/S1SI07C 
 */
class Mahasiswa extends person implements KRS{
    private String nim;
    private String prodi;
    private List<Matakuliah> daftarKRS = new ArrayList<>();
    
    public Mahasiswa (String Nama, String Id, String Nim, String Prodi){
        super(Nama,Id);
        this.nim = Nim;
        this.prodi = Prodi;
    }
    
    @Override
    public void showInfo(){
        System.out.println("Nama Mahasiswa : "+ nama+" NIM : "+ nim+" Prodi : "+ prodi);
    }
    
    @Override
    public void tambahMatakuliah(Matakuliah mk){
        daftarKRS.add(mk);
    }
    
    @Override
    public void hapusMatakuliah(Matakuliah mk){
        daftarKRS.remove(mk);
    }
    
    public void showKRS() {
        System.out.println("Daftar Mata Kuliah yang Diambil:");
        for (Matakuliah mk : daftarKRS) {
            mk.showInfo(); 
        }
    }

    // Menghitung total SKS yang diambil tanpa getter
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (Matakuliah mk : daftarKRS) {
            totalSKS += mk.sks; // Mengakses atribut SKS secara langsung
        }
        return totalSKS;
    }
}
