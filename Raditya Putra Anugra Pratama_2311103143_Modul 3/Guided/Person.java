package com.mycompany.latihanp7radityaputra;

/**
 *
 * @author Raditya Putra Anugra Pratama
 * 2311103143
 * S1SI07-C
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
