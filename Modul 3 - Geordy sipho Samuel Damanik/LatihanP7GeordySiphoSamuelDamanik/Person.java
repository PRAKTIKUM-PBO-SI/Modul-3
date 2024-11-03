
package LatihanP7GeordySiphoSamuelDamanik;

/**
 *
 * @author Geordy Sipho Samuel Damanik
 * S1SI-07-C
 * 2311103112
 */
abstract class Person {
    
    protected String nama;
    protected String id;
    
    public Person(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
    
    //Abstract Method (IMplementasi khusus di subclass)
    public abstract void showInfo();
}
