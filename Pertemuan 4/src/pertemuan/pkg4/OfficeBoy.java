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
public class OfficeBoy extends Pegawai{
    private String shiftKErja;
    private String[] waktuKerja={"pagi","siang","sore","malam"};
    /**
     * @return the shiftKErja
     */
    public String getShiftKErja() {
        return shiftKErja;
    }

    /**
     * @param shiftKErja the shiftKErja to set
     */
    public void setShiftKErja(String shiftKErja) {
        if (!isShift(shiftKErja)){
            System.out.println("Shift kerja adala pagi, siang, sore, malam");
            return;
        }
        this.shiftKErja = shiftKErja;
    }
    public boolean isShift(String shiftKerja){
        for(int i=0;i<waktuKerja.length;i++){
            if (waktuKerja[i].equalsIgnoreCase(shiftKerja))
                return true;
        }
        return false;
    }
}
