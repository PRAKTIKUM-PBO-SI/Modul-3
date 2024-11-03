package latihan7levina;
/**
 * @author Levina Maheswari
 * 2311103110/S1SI07C
 */
public class Matakuliah {
    private String kode;
    private String namaMataKuliah;
    int sks;
    private String jadwalHari;
    private String jadwalJam;
    
    public Matakuliah(String Kode, String NamaMatakuliah, int SKS){
        this.kode = Kode;
        this.namaMataKuliah = NamaMatakuliah;
        this.sks = SKS;
    }
    public void aturJadwal(String hari, String jam){
        this.jadwalHari = hari;
        this.jadwalJam = jam;
    }
     public void aturJadwal(String hari){
        this.jadwalHari = hari;
     }
    public void showInfo (){
        System.out.println("Kode MK : "+ kode+" Nama : "+ namaMataKuliah+" SKS : "+ sks);
    }
}
