/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7Achmadshodiq;

/**
 *
 * @AchmadShodiq//2311103140
 */
public class Main {
    
     public static void main(String[] args) {
        // Membuat Objek Mahasiswa dan Dosen
        Mahasiswa mhs = new Mahasiswa ("Achmad", "230", "2311103140", "Sistem Informasi") ;
        Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001");

        // Membuat Objek Matakuliah
        Matakuliah mk1 = new Matakuliah("SI101", "PBO", 3);
        Matakuliah mk2 = new Matakuliah("RSY12", "Manajemen Rantai Pasok", 3);
        Matakuliah mk3 = new Matakuliah("RR123", "Kalkulus", 2); 
        
        // Mengatur Jadwal Matakuliah (Overloading)
        mk1.aturJadwal("Senin", "06:30");
        mk2.aturJadwal("Rabu", "09:30");

        // Menambahkan Matakuliah ke KRS Mahasiswa
        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);
        mhs.tambahMatakuliah(mk3);
        // Menampilkan Informasi
        mhs.showinfo(); // Menampilkan informasi Mahasiswa (Polimorfisme)
        dosen.showinfo(); // Menampilkan informasi Dosen (Polimorfisme)
        mk1.showInfo(); // Informasi Matakuliah 1
        mk2.showInfo(); // Informasi Matakuliah 2
        mk3.showInfo();//Informasi Matakuliah 3
        
        mhs.showKRS();
        System.out.println("Total SKS yang diambil :" + mhs.hitungSKS());
    }
}

