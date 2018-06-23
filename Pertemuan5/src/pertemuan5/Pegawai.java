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
public class Pegawai {
    protected static String kode;
    Pegawai(){
        System.out.println("Constructor pegawai");
    }
    public void setKode(String kode){
        this.kode=kode;
    }
    public String getKode(){
        return kode;
    }
}
