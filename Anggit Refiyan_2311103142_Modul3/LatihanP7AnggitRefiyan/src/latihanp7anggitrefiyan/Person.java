/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp7anggitrefiyan;

/**
 *
 * @author Anggit Refiyan
 * 2311103142
 * 07C
 */
abstract class Person {
    
    protected String nama;
    protected String id;
    
    public Person(String nama, String id){
        this.nama = nama;
        this.id = id;
    }
    
    //Abstract Method (Implementasi khusus di subclass
    public abstract void showinfo();
}
