package latihanp7tegarferdian;

/**
 *
 * @author Tegar Ferdian (2311103123)
 */

public class Main {

    public static void main(String[] args) {
        // Membuat Objek Mahasiswa dan Dosen
        Mahasiswa mhs = new Mahasiswa("Tegar Ferdian Firmansyah", "123", "2311103123", "Sistem Informasi");
        Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001");

        // Membuat Objek MataKuliah
        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);

        // Mengatur Jadwal MataKuliah (Overloading)
        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa");

        // Menambahkan MataKuliah ke KRS Mahasiswa
        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);

        // Menampilkan Informasi
        mhs.showInfo(); // Menampilkan informasi Mahasiswa (Polimorfisme)
        dosen.showInfo(); // Menampilkan informasi Dosen (Polimorfisme)
        mk1.showInfo(); // Informasi MataKuliah 1
        mk2.showInfo(); // Informasi MataKuliah 2

        // Menampilkan KRS Mahasiswa
        mhs.showKRS();

        // Menghitung dan menampilkan total SKS
        System.out.println("Total SKS yang diambil: " + mhs.hitungSKS());
    }
}
