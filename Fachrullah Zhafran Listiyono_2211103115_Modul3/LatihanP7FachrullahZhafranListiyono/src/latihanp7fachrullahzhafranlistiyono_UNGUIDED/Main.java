package latihanp7fachrullahzhafranlistiyono_UNGUIDED;

public class Main {

    public static void main(String[] args) {
        // Membuat Objek Mahasiswa dan Dosen
        Mahasiswa mhs = new Mahasiswa("Budi", "123", "2211109001", "Sistem Informasi");
        Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001");

        // Membuat Objek MataKuliah
        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("SI103", "Jaringan Komputer", 3);
        // Mengatur Jadwal MataKuliah (Overloading)
        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa");
        mk3.aturJadwal("Rabu", "10.00");

        // Menambahkan MataKuliah ke KRS Mahasiswa
        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);
        mhs.tambahMatakuliah(mk3);
        
        // Menampilkan informasi Mahasiswa
        mhs.showInfo();

        // Menampilkan daftar MataKuliah (KRS) yang diambil Mahasiswa
        mhs.showKRS();

        // Menghitung dan menampilkan total SKS yang diambil Mahasiswa
        System.out.println("Total SKS yang diambil: " + mhs.hitungTotalSKS());
    }
}
