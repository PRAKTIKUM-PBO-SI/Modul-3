/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp7erickevannicholas;

/**
 * 2311103115
 * @author Erick Evan Nicholas
 * S1SI-07C
 */
public class LatihanP7ErickEvanNicholas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Objek Mahasiswa dan Dosen
        Mahasiswa mhs = new Mahasiswa("Erick Evan Nicholas", "123", "2311103115", "Sistem Informasi.");
        Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001.");

        // Membuat Objek Matakuliah
        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("SI103", "Algoritma pemrograman", 3);

        // Mengatur Jadwal Matakuliah (Overloading)
        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa");

        // Menambahkan Matakuliah ke KRS Mahasiswa
        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);
        mhs.tambahMatakuliah(mk3);

        // Menampilkan Informasi
        mhs.showInfo(); // Menampilkan informasi Mahasiswa (Polimorfisme)
        mhs.showKRS(); // Menampilkan daftar matakuliah yang diambil oleh mahasiswa
        dosen.showInfo(); // Menampilkan informasi Dosen (Polimorfisme)
        mk1.showInfo(); // Informasi Matakuliah 1
        mk2.showInfo(); // Informasi Matakuliah 2
        mk3.showInfo(); // Informasi Matakuliah 3
        
        // Menghitung dan menampilkan total SKS yang diambil oleh mahasiswa
        int totalSKS = mhs.hitungTotalSKS();
        System.out.println("Total SKS yang diambil: " + totalSKS);
    }
}