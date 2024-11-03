/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2p7hafidramadhan;
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

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS) {
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }

    @Override
    public void showInfo() {
        System.out.println("Nama Mahasiswa: " + nama + ", NIM: " + nim + ", Prodi: " + prodi);
        System.out.println("Total SKS yang diambil: " + hitungTotalSKS());
    }

    @Override
    public void tambahMatakuliah(MataKuliah mk) {
        daftarKRS.add(mk);
        System.out.println("Mata kuliah " + mk.getNamaMatakuliah() + " (" + mk.getSKS() + " SKS) berhasil ditambahkan");
        System.out.println("Total SKS saat ini: " + hitungTotalSKS());
    }

    @Override
    public void hapusMatakuliah(MataKuliah mk) {
        if (daftarKRS.remove(mk)) {
            System.out.println("Mata kuliah " + mk.getNamaMatakuliah() + " (" + mk.getSKS() + " SKS) berhasil dihapus");
            System.out.println("Total SKS saat ini: " + hitungTotalSKS());
        } else {
            System.out.println("Mata kuliah tidak ditemukan dalam KRS");
        }
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
            System.out.println("Total SKS: 0");
        } else {
            int nomor = 1;
            for (MataKuliah mk : daftarKRS) {
                System.out.println(nomor + ". " + mk.getNamaMatakuliah() + " (" + mk.getKode() + ")");
                System.out.println("   SKS: " + mk.getSKS());
                System.out.println("   Jadwal: " + 
                    (mk.getJadwalHari() != null ? mk.getJadwalHari() : "Belum diatur") + 
                    (mk.getJadwalJam() != null ? ", " + mk.getJadwalJam() : ""));
                nomor++;
            }
            System.out.println("----------------------------------");
            System.out.println("Total SKS: " + hitungTotalSKS());
        }
        System.out.println("==================================\n");
    }
}
