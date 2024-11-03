package latihan7levina;
/**
 * @author Levina Maheswari M.L 
 * 2311103110/S1SI07C
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Levina Maheswari", "123", "2311103110", "Sistem Informasi");
        Dosen dosen = new Dosen("Pak awiet", "456", "D001");

        Matakuliah mk1 = new Matakuliah("SII01", "PBO", 3);
        Matakuliah mk2 = new Matakuliah("SII02", "", 3);

        mk1.aturJadwal("Senin", "08.00");
        mk2.aturJadwal("Selasa");

        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);

        mhs.showInfo();
        dosen.showInfo();
        mk1.showInfo();
        mk2.showInfo();
        mhs.showKRS(); // Menampilkan daftar KRS
        System.out.println("Total SKS: " + mhs.hitungTotalSKS()); 
    }
}
