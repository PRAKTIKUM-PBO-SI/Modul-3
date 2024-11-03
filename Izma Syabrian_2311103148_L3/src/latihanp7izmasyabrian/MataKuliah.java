/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp7izmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class MataKuliah {

    private String kode;
    private String namaMatakuliah;
    private int sks;
    private String jadwalHari;
    private String jadwalJam;

    public MataKuliah(String kode, String namaMatakuliah, int sks) {
        this.kode = kode;
        this.namaMatakuliah = namaMatakuliah;
        this.sks = sks;
    }

    public void aturJadwal(String hari, String jam) {
        this.jadwalHari = hari;
        this.jadwalJam = jam;
    }

    public void aturJadwal(String hari) {
        this.jadwalHari = hari;
    }

    public void showInfo() {
        System.out.println("Kode MK: " + kode + ", Nama: " + namaMatakuliah + ", SKS: " + sks);
    }
    
    public String getKode() {
        return kode;
    }

    public String getNamaMataKuliah() {
        return namaMatakuliah;
    }

    public int getSks() {
        return sks;
    }

    public String getJadwalHari() {
        return jadwalHari;
    }

    public String getJadwalJam() {
        return jadwalJam;
    }

}
