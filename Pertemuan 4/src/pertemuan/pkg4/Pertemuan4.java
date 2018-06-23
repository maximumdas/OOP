/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Nashir
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        // TODO code application logic here
        Pegawai [] pegawai = new Pegawai[100];
        Pegawai pg = new Pegawai();
        
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Input jumlah pegawai yang akan di entri:");
        int n=Integer.parseInt(pg.perekam());
        
        for (int i=0;i<n;i++){
            System.out.print("Inpt peran pegawai ke "+(i+1)+":");
            String peran=pg.perekam();
            if (peran.equalsIgnoreCase("dokter")){
                Dokter dokter = new Dokter();
                System.out.print("Input nama dokter:");
                dokter.setNama(pg.perekam());
                System.out.print("Input kode:");
                dokter.setKode(pg.perekam());
                System.out.print("Input Gender:");
                dokter.setJenisKelamin(pg.perekam());
                System.out.print("Input Tanggal Lahir:");
                dokter.setTanggalLahir(simpleDate.parse(pg.perekam()));
                System.out.print("Input spesialisasi:");
                dokter.setSpesialisasi(pg.perekam());
                pegawai[i]=dokter;
            }else if (peran.equalsIgnoreCase("perawat")){
                Perawat perawat = new Perawat();
                System.out.print("Input nama perawat:");
                perawat.setNama(pg.perekam());
                System.out.print("Input kode:");
                perawat.setKode(pg.perekam());
                System.out.print("Input Gender:");
                perawat.setJenisKelamin(pg.perekam());
                System.out.print("Input Tanggal Lahir:");
                perawat.setTanggalLahir(simpleDate.parse(pg.perekam()));
                System.out.print("Input unit kerja:");
                perawat.setUnitKerja(pg.perekam());
                pegawai[i]=perawat;

            }else if (peran.equalsIgnoreCase("office boy")){
                OfficeBoy ob = new OfficeBoy();
                System.out.print("Input nama OB:");
                ob.setNama(pg.perekam());
                System.out.print("Input kode:");
                ob.setKode(pg.perekam());
                System.out.print("Input Gender:");
                ob.setJenisKelamin(pg.perekam());
                System.out.print("Input Tanggal Lahir:");
                ob.setTanggalLahir(simpleDate.parse(pg.perekam()));
                System.out.print("Input shift kerja:");
                ob.setShiftKErja(pg.perekam());
                pegawai[i]=ob;
            }
            System.out.println("\n");
        }
        System.out.println("DATA PEGAWAI");
        
        for (int i =0 ; i<n ; i++){
            System.out.println("\nNama :"+pegawai[i].getNama());
            System.out.println("Gender :"+pegawai[i].getJenisKelamin());
            System.out.println("Kode :"+pegawai[i].getKode());
            System.out.println("Umur: "+pegawai[i].getUmur());
            
            if (pegawai[i] instanceof Dokter){
                System.out.println("Jabatan :Dokter");
                Dokter d = (Dokter) pegawai[i];//casting superclass menjadi subclass
                System.out.println("Spesialisasi :"+d.getSpesialisasi());
            }else if (pegawai[i] instanceof Perawat){
                System.out.println("Jabatan :Perawat");
                Perawat d = (Perawat) pegawai[i];//casting superclass menjadi subclass
                System.out.println("Unik Kerja :"+d.getUnitKerja());
            }else if (pegawai[i] instanceof OfficeBoy){
                System.out.println("Jabatan :Office Boy");
                OfficeBoy d = (OfficeBoy) pegawai[i];//casting superclass menjadi subclass
                System.out.println("Shift Kerja :"+d.getShiftKErja());
            }
        }
                
    }
    
    
    
}
