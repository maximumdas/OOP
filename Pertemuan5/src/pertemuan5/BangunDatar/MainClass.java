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
public class MainClass {
    public static void main(String[] args){
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari2(5);
        System.out.println("Luasnya:"+lingkaran.getLuas());
        SegiTiga segitiga = new SegiTiga();
        
        System.out.println("Luas Segitiga:"+segitiga.getLuas());
    }
}
