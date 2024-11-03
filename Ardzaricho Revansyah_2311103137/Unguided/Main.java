package latihanp7Ardza;

/**
 *
 @author ARDZARICHO REVANSYAH
 * 2311103137
 * 07C 
 */
public class Main {

    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dan Dosen
        System.out.println("===== Informasi Mahasiswa =====");
        Mahasiswa mhs = new Mahasiswa("Revansyah", "123", "2211109001", "Sistem Informasi");
        Dosen dosen = new Dosen("Ardza Richo", "456", "D001");


        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("SI103", "Jaringan Komputer", 3);

        // Mengatur jadwal MataKuliah (Overloading)
        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa");

        // Menambahkan MataKuliah ke KRS Mahasiswa
        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);
        mhs.tambahMatakuliah(mk3);

        // Menampilkan informasi
        mhs.showInfo();         // Menampilkan informasi Mahasiswa (Polimorfisme)
        dosen.showInfo();       // Menampilkan informasi Dosen (Polimorfisme)
        mhs.showKRS();          // Menampilkan daftar MataKuliah
    }
}
