/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguided1p7hafid;

/**
 *
 * @author Hafid Ramadhan 2311103104 SI07C
 */
public class Main {

        public static void main(String[] args) {
            Mahasiswa mhs = new Mahasiswa("Hafid Ramadhan", "123", "2311103104", "Sistem Informasi");
            Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001");

            MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
            MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);
            MataKuliah mk3 = new MataKuliah("SI103", "Algoritma dan Pemrograman", 4);

            mk1.aturJadwal("Senin", "08:00");
            mk2.aturJadwal("Selasa");
            mk3.aturJadwal("Rabu", "13:00");

            mhs.tambahMatakuliah(mk1);
            mhs.tambahMatakuliah(mk2);
            mhs.tambahMatakuliah(mk3);

            mhs.showInfo(); 
            dosen.showInfo(); 

            mhs.showKRS();

            System.out.println("Setelah menghapus mata kuliah Basis Data:");
            mhs.hapusMatakuliah(mk2);
            mhs.showKRS();
        }
    
}
