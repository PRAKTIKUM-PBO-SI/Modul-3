/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7Achmadshodiq;

/**
 *
 * @AchmadShodiq//2311103140
 */
public class Matakuliah {
    private String kode;
    private String namaMatakuliah;
    private int sks;
    private String jadwalHari;
    private String jadwalJam;

    public Matakuliah (String kode, String namaMatakuliah, int sks){
        this.kode = kode;
        this.namaMatakuliah = namaMatakuliah;
        this.sks = sks;
        }
    
    //Untuk mendefinisikan SKS yang ada
    public int getSKS(){
        return sks;
    }
    public void aturJadwal (String hari, String string){
        this.jadwalHari = hari;
    }
    public void showInfo() {
        System.out.println("Kode MK: " + kode + ", Nama: " + namaMatakuliah + ", SKS: " + sks);
    }

}

