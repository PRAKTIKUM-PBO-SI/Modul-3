package latihanp7Ardza;
/**
 *
 @author ARDZARICHO REVANSYAH
 * 2311103137
 * 07C 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Revansyah", "123", "2211109001", "Sistem Informasi");
        Dosen dosen = new Dosen("Ardza Richo", "456", "D001");

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
    }
}
