package latihan7levina;
/**
 * @author Levina Maheswari M.L
 * 2311103110/S1SI07C
 */

abstract class person {
protected String nama;
protected String id;
  
public person (String nama, String id){
    this.nama = nama;
    this.id = id;
}
public abstract void showInfo();   
}