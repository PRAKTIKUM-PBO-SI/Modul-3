package unguided1;
//@author Rizqi Dwi Saputra 2311103133 / S1SI07C

abstract class Person {
    
    protected String nama;
    protected String id;
    
    public Person(String nama, String id){
        this.nama = nama;
        this.id = id;
    }
    
//    Abstarct method (Implmentasi ...)
    public abstract void ShowInfo();
    
}
