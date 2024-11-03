package latihanp7tegarferdian;

/**
 *
 * @author Tegar Ferdian (2311103123)
 */
abstract class Person {
    protected String nama;
    protected String id;

    public Person(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    // Abstract Method (Implementasi khusus di subclass)
    public abstract void showInfo();
}

