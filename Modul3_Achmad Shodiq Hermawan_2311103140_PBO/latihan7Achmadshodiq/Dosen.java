/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7Achmadshodiq;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @AchmadShodiq//2311103140
 */
class Dosen extends Person {
  private String nip;
  private List<Matakuliah> daftarMatakuliah = new ArrayList<>();
  
  public Dosen (String nama, String id, String nip){
      super(nama,id);
      this.nip= nip;
  }
  //Overriding showinfo (Implementasi khusus untuk Dosen)
  @Override
  public void showinfo(){
      System.out.println("Nama Dosen:" + nama +", NIP"+ nip);
  }
  
  // Tambah Matakuliah untuk Dosen
  public void tambahMatakuliah(Matakuliah mk){
      daftarMatakuliah.add(mk);
  }
}
