/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg8;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nashir
 */
public class Mahasiswa implements Serializable{

    private String nama;
    private String nim;
    private String gender;
    private double tinggi;
    private ArrayList<String> hobi = new ArrayList<>();
    private String provAsal;
    
    public Mahasiswa(){
        this.nim="16.9325";
        this.tinggi=150;
    }
    public Mahasiswa(String nama, String nim, String gender, double tinggi, ArrayList<String> hobi, String provAsal) throws Exception{
        setNama(nama);
        setNim(nim);
        setGender(gender);
        setTinggi(tinggi);
        setHobi(hobi);
        setProvAsal(provAsal);
    }

    /**
     * @return the nama
     */
    public String getNama() {
        
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama)throws Exception {
        char[] temp=nama.trim().toCharArray();
        for(char a: temp){
            if (Character.isDigit(a)){
                throw new Exception("Nama tidak boleh mengandung digit angka!");
            }
        }
        this.nama = nama;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim)throws Exception {
        char[] temp=nim.toCharArray();
        for (char a: temp){
            if (!Character.isDigit(a)){
                throw new Exception("Nim Hanya berisi angka!");
            }
        }
        this.nim = nim;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender)throws Exception {
        if (gender.isEmpty()){
            throw new Exception("Field gender harus diisi!");
        }
        this.gender = gender;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the hobi
     */
    public ArrayList<String> getHobi() {
        return hobi;
    }

    /**
     * @param hobi the hobi to set
     */
    public void setHobi(ArrayList<String> hobi) {
        this.hobi = hobi;
    }

    /**
     * @return the provAsal
     */
    public String getProvAsal() {
        return provAsal;
    }

    /**
     * @param provAsal the provAsal to set
     */
    public void setProvAsal(String provAsal) {
        this.provAsal = provAsal;
    }

}
