package latihanp7riskavanydewi;

/**
 * @author RISKA VANY DEWI
 * 2311103111
 * S1SI07C
 */

public class MataKuliah {
    private String kode;
    private String namaMatakuliah;
    private int sks;
    private String jadwalHari;
    private String jadwalJam;
    
    public MataKuliah(String kode, String namaMatakuliah, int sks){
        this.kode = kode;
        this.namaMatakuliah = namaMatakuliah;
        this.sks = sks;
    }
    
    public void aturJadwal(String hari, String jam){
        this.jadwalHari = hari;
        this.jadwalJam = jam;
    }
    
    public void aturJadwal(String hari){
        this.jadwalHari = hari;
    }
    
    public void showInfo(){
        System.out.println("Kode MK: " +kode+ ", Nama: " +namaMatakuliah+ ", SKS: " +sks);
    }
    
    public int getSks(){
        return sks;
    }
}
