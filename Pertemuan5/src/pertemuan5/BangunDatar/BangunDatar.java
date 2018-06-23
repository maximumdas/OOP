/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.BangunDatar;

/**
 *
 * @author Nashir
 */
public abstract class BangunDatar {//
    protected double luas;
    private double keliling;
    private int jumlahSisi;
    private int banyakSudut;

    /**
     * @return the luas
     */
    abstract double getLuas();
    /**
     * @return the keliling
     */
    abstract double getKeliling();

    /**
     * @return the jumlahSisi
     */
    public int getJumlahSisi() {
        return jumlahSisi;
    }

    /**
     * @param jumlahSisi the jumlahSisi to set
     */
    public void setJumlahSisi(int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    /**
     * @return the banyakSudut
     */
    public int getBanyakSudut() {
        return banyakSudut;
    }

    /**
     * @param banyakSudut the banyakSudut to set
     */
    public void setBanyakSudut(int banyakSudut) {
        this.banyakSudut = banyakSudut;
    }
}
