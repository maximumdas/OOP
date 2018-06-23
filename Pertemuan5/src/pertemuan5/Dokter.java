/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Nashir
 */
public class Dokter extends Pegawai {
    Dokter(){
        System.out.println("Construktor Dokter");
    }
    public void setKode(String e){
        super.setKode("D"+e);
        System.out.println();
    }
   
}
