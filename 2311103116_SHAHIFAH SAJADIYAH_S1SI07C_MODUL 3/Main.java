/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7shahifah;

/**
 *
 * @author Shahifah Sajadiyah
 * 2311103116
 * S1SI07C
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Shahifah Sajadiyah", "163", "2311103116", "Sistem Informasi");
        Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001");

        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "JARKOM", 3);

        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa", "10:00");

        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);

        // Menampilkan informasi mahasiswa dan dosen
        mhs.showInfo();
        dosen.showInfo();

        // Menampilkan daftar mata kuliah yang diambil mahasiswa beserta jadwalnya
        mhs.showKRS();

        // Menghitung dan menampilkan total SKS yang diambil mahasiswa
        int totalSKS = mhs.hitungTotalSKS();
        System.out.println("Total SKS yang diambil: " + totalSKS);
    }
}