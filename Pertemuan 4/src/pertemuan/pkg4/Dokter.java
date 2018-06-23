/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg4;

/**
 *
 * @author Nashir
 */
public class Dokter extends Pegawai{
    private String spesialisasi;

    /**
     * @return the spesialisasi
     */
    public String getSpesialisasi() {
        return spesialisasi;
    }

    /**
     * @param spesialisasi the spesialisasi to set
     */
    public void setSpesialisasi(String spesialisasi) {
        if (Character.isDigit(spesialisasi.charAt(0))){
            System.out.println("Spesialisas tiak dimulai dengan angka");
            return;
        }else if (Character.isWhitespace(spesialisasi.charAt(0))){
            System.out.println("Spesialisasi tidak dimulai dengan karakter spasi");
            return;
        }
        this.spesialisasi = spesialisasi;
    }
    
}
