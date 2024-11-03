package latihanp7rizqidwisaputra;
//@author Rizqi Dwi Saputra 2311103133 / S1SI07C

public class MataKuliah {
    
    private String kode;
    private String namaMataKuliah;
    private int sks;
    private String jadwalHari;
    private String jadwalJam;
    
    public MataKuliah(String kode, String namaMataKuliah, int sks){
        this.kode = kode;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
    }
    
    public void aturJadwal(String hari, String jam){
        this.jadwalHari = hari;
        this.jadwalJam = jam;
    }
    
    public void aturJadwal(String hari){
        this.jadwalHari = hari;
    }
    
    public void ShowInfo(){
        System.out.println("Kode MK: " + kode + ", Nama: " + namaMataKuliah + ", SKS: " + sks);
    }
    
}