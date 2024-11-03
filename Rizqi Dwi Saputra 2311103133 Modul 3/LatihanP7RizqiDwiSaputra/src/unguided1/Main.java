package unguided1;
//@author Rizqi Dwi Saputra 2311103133 / S1SI07C

public class Main {
    
    public static void main(String[] args) {
        
//        Membuat objek Mahasiswa dan Dosen
        Mahasiswa mhs = new Mahasiswa("Rizqi Dwi Saputra", "001", "2311103133", "Sistem Informasi");
        Dosen dosen = new Dosen("Sena Wijayanto", "456", "D001");
        
//        Membuat objek Mata Kuliah
        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);
        
//        Mengatur jadwal Matakuliah (Overloading)
        mk1.aturJadwal("Senin", "08:00");
        mk2.aturJadwal("Selasa");
        
        // Menambahkan Matakuliah ke KRS Mahasiswa
        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);
        
        // Menampilkan Informasi
        mhs.ShowInfo(); // Menampilkan informasi Mahasiswa (Polimorfisme)
        dosen.ShowInfo(); // Menampilkan informasi Dosen (Polimorfisme)
        mk1.ShowInfo(); // Informasi Matakuliah 1
        mk2.ShowInfo(); // Informasi Matakuliah 2
        mhs.showKRS(); // Informasi daftar MatKul Putra ganteng
    }
    
}
