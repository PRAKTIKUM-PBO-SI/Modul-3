package latihanp7zoesatrian;

/**
 * @author Zoe Satrian / 2311103141
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
        System.out.println("Nama Mahasiswa: " + nama + ", NIM: " + nim + ", Prodi: " + 
        prodi); 
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
     
    public void showKRS() { 
        System.out.println(""); 
        System.out.println("===== Daftar KRS Mahasiswa " + nama + "====="); 
        if (daftarKRS.isEmpty()) { 
            System.out.println("Tidak ada mata kuliah yang diambil."); 
        } else { 
            for (MataKuliah mk : daftarKRS) { 
                mk.showInfo(); // Memanggil showInfo() dari kelas MataKuliah 
            } 
        } 
    } 
} 