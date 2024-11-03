/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided1p7hafid;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hafid Ramadhan 2311103104 SI07C
 */
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

    public void showKRS() {
        System.out.println("\n=== Kartu Rencana Studi (KRS) ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + prodi);
        System.out.println("\nDaftar Mata Kuliah:");
        System.out.println("----------------------------------");
        
        if (daftarKRS.isEmpty()) {
            System.out.println("Belum ada mata kuliah yang diambil");
        } else {
            int totalSKS = 0;
            int nomor = 1;
            // Menggunakan for-each loop untuk menampilkan setiap mata kuliah
            for (MataKuliah mk : daftarKRS) {
                System.out.println(nomor + ". " + mk.getNamaMatakuliah() + " (" + mk.getKode() + ") - " + mk.getSKS() + " SKS");
                totalSKS += mk.getSKS();
                nomor++;
            }
            System.out.println("----------------------------------");
            System.out.println("Total SKS: " + totalSKS);
        }
        System.out.println("==================================\n");
    }
}
