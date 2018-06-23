/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.BangunDatar;

import pertemuan5.BangunDatar.BangunDatar;

/**
 *
 * @author Nashir
 */
public class Lingkaran extends BangunDatar{
    private double jari2;

    /**
     * @return the jari2
     */
    public double getJari2() {
        return jari2;
    }

    /**
     * @param jari2 the jari2 to set
     */
    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    @Override
    double getLuas() {
        return Math.PI*Math.pow(jari2, 2);
    }

    @Override
    double getKeliling() {
        return Math.PI*2*jari2;
    }
    
}
