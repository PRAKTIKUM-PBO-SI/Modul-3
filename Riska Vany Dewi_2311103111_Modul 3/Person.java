package latihanp7riskavanydewi;

/**
 * @author RISKA VANY DEWI
 * 2311103111
 * S1SI07C
 */
abstract class Person {
    protected String nama;
    protected String id;
    
    public Person(String nama, String id){
        this.nama = nama;
        this.id = id;
    }
    
    public abstract void showInfo();
    
}
