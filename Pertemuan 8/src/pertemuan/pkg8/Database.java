/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg8;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nashir
 */
public class Database {

    private static ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
    private static File file = new File("D:\\STIS\\File Test\\Mhs.dat");

    private Database() {
    }
    private static Database database = new Database();

    public static Database getInstance() {
        if (file.exists()) {
            reloadDB();
        }
        return database;
    }

    //update file
    private static void save() {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mahasiswa);
            fos.close();
            oos.close();

        } catch (FileNotFoundException ex) {
            System.err.println("File tidak dapat dibuat!");
        } catch (IOException ex) {
            System.err.println("File tidak dapat ditulis!");
        }
    }

    private static void reloadDB() {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            mahasiswa = (ArrayList<Mahasiswa>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak dikenali!");
        } catch (IOException ex) {
            System.err.println("File tidak dapat dibaca!");
        } catch (ClassNotFoundException ex) {
            System.err.println("File tidak ditemukan!!");
        }

    }

    public void addMahasiswa(Mahasiswa mhs) throws Exception {
        if (getInstance().getMhs(mhs.getNim()) != null) {
            throw new Exception("Mahasiswa dengan Nim bersesuaian sudah terdaftar!");
        }
        mahasiswa.add(mhs);
        save();

    }

    public void setMahasiswa(int index, Mahasiswa mhs) {
        mahasiswa.set(index, mhs);
    }

    public Mahasiswa getMhsByNim(String nim) throws Exception {
        if (getMhs(nim) != null) {
            return getMhs(nim);
        }
        throw new Exception("Nim yang anda cari belum terdaftar...");
    }

    public int isElement(Mahasiswa mhs) {
        return mahasiswa.indexOf(mhs);
    }

    public int getIndexMhsByNim(String nim) {
        for (int i = 0; i < mahasiswa.size(); i++) {
            if (mahasiswa.get(i).getNim().equals(nim)) {

                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return mahasiswa.size();
    }

    private Mahasiswa getMhs(String nim) {
        for (Mahasiswa a : mahasiswa) {
            if (a.getNim().equals(nim)) {
                return a;
            }
        }
        return null;
    }
    public Mahasiswa getMahasiswaByIndex(int index){
        return mahasiswa.get(index);
    }

    /**
     *
     * @return
     */
    public ArrayList getAllMhs(){
        return mahasiswa;
    }
}
