
package LatihanP7GeordySiphoSamuelDamanik;

/**
 *
 * @author Geordy Sipho Samuel Damanik
 * S1SI-07-C
 * 2311103112
 */
public class Modul4 {
    
    public static void main(String[] args) {
        // Membuat Objek Mahasiswa dan Dosen
        Mahasiswa mhs = new Mahasiswa("Geordy Sipho Samuel Damanik", "123", "2311103112", "Sistem Informasi");
        Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001");

        // Membuat Objek Matakuliah
        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);

        // Mengatur Jadwal Matakuliah (Overloading)
        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa");

        // Menambahkan Matakuliah ke KRS Mahasiswa
        mhs.tambahMatakuliah(mk1);
        mhs.tambahMatakuliah(mk2);

        // Menampilkan Informasi
        mhs.showInfo(); // Menampilkan informasi Mahasiswa (Polimorfisme)
        dosen.showInfo(); // Menampilkan informasi Dosen (Polimorfisme)
        mk1.ShowInfo(); // Informasi Matakuliah 1
        mk2.ShowInfo(); // Informasi Matakuliah 2
        
        //Menampilkan daftar mata kuliah yang diambil
        mhs.showKRS();
        
        //Menghitung dan menampilkan total SKS
        int totalSKS = mhs.hitungTotalSKS();
        System.out.println("Total SKS yang diambil: " + totalSKS);
    }
}

