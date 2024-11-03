/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2p7hafidramadhan;

/**
 *
 * @author Hafid Ramadhan 2311103104 SI07C
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

    public String getKode() {
        return kode;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public int getSKS() {
        return sks;
    }

    public String getJadwalHari() {
        return jadwalHari;
    }

    public String getJadwalJam() {
        return jadwalJam;
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
}
