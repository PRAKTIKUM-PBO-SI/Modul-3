
package LatihanP7GeordySiphoSamuelDamanik;

/**
 *
 * @author Geordy Sipho Samuel Damanik
 * S1SI-07-C
 * 2311103112
 */

import java.util.ArrayList;
import java.util.List;

class Dosen extends Person {
    
    private String nip;
    private List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    
    public Dosen(String nama, String id, String nip) {
        super(nama, id);
        this.nip = nip;
    }
    
    //Overriding showInfo (IMplementasi khusus untuk dosen)
    @Override
    public void showInfo() {
        System.out.println("NAma Dosen: " + nama + ", NIP: " + nip);
    }
    
    //Tambah Matakuliah untuk dosen
    public void tambahMatakuliah(MataKuliah mk) {
        daftarMataKuliah.add(mk);
    }
}
