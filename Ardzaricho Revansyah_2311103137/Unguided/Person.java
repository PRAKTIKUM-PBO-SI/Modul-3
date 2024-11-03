package latihanp7Ardza;
/**
 *
 @author ARDZARICHO REVANSYAH
 * 2311103137
 * 07C 
 */
abstract class Person {

    protected String nama;
    protected String id;

    public Person(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public abstract void showInfo();
}
