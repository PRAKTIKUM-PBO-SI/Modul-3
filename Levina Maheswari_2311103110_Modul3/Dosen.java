package latihan7levina;
import java.util.ArrayList;
import java.util.List;
 /**
 * @author Lenovo
 */
class Dosen extends person {
    
    private String nip;
    private List<Matakuliah> daftarMatakuliah = new ArrayList<>();
    
    public Dosen (String Nama, String Id, String Nip){
        super(Nama , Id);
        this.nip = Nip;
        
    }
    
    @Override
    public void showInfo(){
        System.out.println("Nama Dosen : "+ nama+" NIP : "+ nip);
    }
    
    public void tambahMatakuliah(Matakuliah mk){
        daftarMatakuliah.add(mk);
    }
}
