/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp7izmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class LatihanP7IzmaSyabrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Rian", "3174", "2311103148", "Sistem Informasi");
        Dosen dosen = new Dosen("Kato", "777", "D001");

        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);

        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa");

        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);


        mhs.showInfo(); 
        dosen.showInfo(); 
        mk1.showInfo(); 
        mk2.showInfo();
        mhs.showKRS();
        mhs.hitungTotalSKS();
    }
    
}
