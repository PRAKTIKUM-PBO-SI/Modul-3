/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguided2p7hafidramadhan;

/**
 *
 * @author Hafid Ramadhan 2311103104 SI07C
 */
public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Hafid Ramadhan", "789", "2311103104", "Sistem Informasi");
        Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001");

        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("SI103", "Algoritma dan Pemrograman", 4);
        MataKuliah mk4 = new MataKuliah("SI104", "Statistika", 2);

        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa", "10:00");
        mk3.aturJadwal("Rabu", "13:00");
        mk4.aturJadwal("Kamis");

        System.out.println("=== Demonstrasi Penambahan Mata Kuliah dan Perhitungan SKS ===\n");

        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);
        mhs.tambahMatakuliah(mk3);
        mhs.tambahMatakuliah(mk4);

        mhs.showKRS();

        System.out.println("=== Demonstrasi Penghapusan Mata Kuliah ===\n");
        
       
        mhs.hapusMatakuliah(mk2); 
        mhs.hapusMatakuliah(mk4); 

        mhs.showKRS();

        System.out.println("=== Informasi Akhir Mahasiswa ===");
        mhs.showInfo();
    }
}
