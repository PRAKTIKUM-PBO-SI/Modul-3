/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2p7hafidramadhan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hafid Ramadhan 2311103104 SI07C
 */
    class Dosen extends Person {

        private String nip;
        private List<MataKuliah> daftarMatakuliah = new ArrayList<>();

        public Dosen(String nama, String id, String nip) {
            super(nama, id);
            this.nip = nip;
        }

        @Override
        public void showInfo() {
            System.out.println("Nama Dosen: " + nama + ", NIP: " + nip);
        }

        public void tambahMatakuliah(MataKuliah mk) {
            daftarMatakuliah.add(mk);
        }
    }
