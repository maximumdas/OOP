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
public class SegiTiga extends BangunDatar{
    private double sisi1,sisi2,sisi3;

   
    @Override
    double getKeliling() {
        return sisi1+sisi2+sisi3;
    }

    @Override
    double getLuas() {
        return Math.sqrt(0.5*getKeliling()/2*(getKeliling()/2-sisi1)*(getKeliling()/2-sisi2)*(getKeliling()/2-sisi3));    
    }

    /**
     * @return the sisi1
     */
    public double getSisi1() {
        return sisi1;
    }

    /**
     * @param sisi1 the sisi1 to set
     */
    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    /**
     * @return the sisi2
     */
    public double getSisi2() {
        return sisi2;
    }

    /**
     * @param sisi2 the sisi2 to set
     */
    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    /**
     * @return the sisi3
     */
    public double getSisi3() {
        return sisi3;
    }

    /**
     * @param sisi3 the sisi3 to set
     */
    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }
}
