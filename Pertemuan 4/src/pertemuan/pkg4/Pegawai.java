/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 *
 * @author Nashir
 */
public class Pegawai {

    private String kode;
    private String nama;
    private String jenisKelamin;
    private Date tanggalLahir;
    private int umur;
    private int tahunLahir;

    /**
     * @return the kode
     */
    Date date = new Date();
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        if (kode.isEmpty()){
            System.out.println("Kode pegawai harus diiisi");
            return;
        }
        this.kode = kode;
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
    public void setNama(String nama) {
        if (nama.length()>50){
            System.out.println("Nama tidak boleh lebih dari 50 karakter");
            return;
        }
        if (nama.isEmpty()){
            System.out.println("Nama tidak boleh kosong");
        }
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c))
            System.out.println("Nama tidak boleh mengandung digit");
            return;
        }
        this.nama = nama;
    }

    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(String jenisKelamin) {
        if (jenisKelamin.equalsIgnoreCase("laki-laki") ^ jenisKelamin.equalsIgnoreCase("perempuan")){
             this.jenisKelamin = jenisKelamin;
                    return;        
        }
            System.out.println("Gender harus laki-laki atau perempuan");
                    return;    
    }


    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public String perekam() throws IOException{
        BufferedReader bfr =new BufferedReader(new InputStreamReader(System.in));
        String rekam="";
        try{
            rekam=bfr.readLine();
    }   catch(IOException e){
        e.printStackTrace();
    }
        return rekam;
    }

    /**
     * @return the Umur
     */
    public int getUmur() {
        setUmur(new Date().getYear()-tanggalLahir.getYear());
        if (new Date().getMonth() < tanggalLahir.getMonth()){
            umur--;
        }
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

   
}
