/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp7anggitrefiyan;

/**
 *
 * @author Anggit Refiyan
 * 2311103142
 * 07C
 */
public class LatihanP7AnggitRefiyan {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Anggit", " 123", "2311103142", "Sistem Informasi");
        Dosen dosen = new Dosen("Refiyan", "456", "A01");
        
        MataKuliah mk1 = new MataKuliah("SI07", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI07", "Perancangan Interaksi", 3);
        
        mk1.aturJadwal("senin", "07.00");
        mk2.aturJadwal("selasa", "07.30");
        
        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);

        // Menampilkan Informasi
        mhs.showinfo(); // Menampilkan informasi Mahasiswa (Polimorfisme)
        dosen.showinfo(); // Menampilkan informasi Dosen (Polimorfisme)
        mk1.showInfo(); // Informasi Matakuliah 1
        mk2.showInfo(); // Informasi Matakuliah 2
        
        //menampilkan KRS 
        mhs.showKRS();
        
        //Menghitung dan menampilkan total SKS 
        System.out.println("Total SKS yang diambil : " + mhs.hitungSKS());
    } 
}
