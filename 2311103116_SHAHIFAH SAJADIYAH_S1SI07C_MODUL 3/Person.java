/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan7shahifah;

/**
 *
 * @author Shahifah Sajadiyah
 * 2311103116
 * S1SI 07 C
 */
//kelas abstrak yaitu gambaran umum
abstract class Person {
    protected String nama; 
    protected String id;
    
    public Person (String nama, String id) {
       this.nama = nama;
       this.id = id;
    }
    public abstract void showInfo();
}
