/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp7riskavanydewi;

/**
 * @author RISKA VANY DEWI
 * 2311103111
 * S1SI07C
 */

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa ("Riska Vany Dewi", "123", "2311103111", "Sistem Informasi");
        Dosen dosen = new Dosen ("Sena", "111", "D123");
        
        MataKuliah mk1 = new MataKuliah ("SI001", "PBO", 3);
        MataKuliah mk2 = new MataKuliah ("SI002", "Alpro", 3);
        
        mk1.aturJadwal ("Senin", "08:00");
        mk2.aturJadwal ("Selasa");
        
        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);
        
        mhs.showInfo();
        dosen.showInfo();
        mk1.showInfo();
        mk2.showInfo();
        mhs.showKRS();
        mhs.hitungTotalSKS();
    }
    
}
