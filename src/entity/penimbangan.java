
package entity;

import java.util.Date;

public class penimbangan implements Entity{
    public static String tableName = "penimbangan";
    private bayi id_bayi;
    private int bb, tb, id;
    private String deteksi, keterangan; 
    private Date tanggal_timbang;

    public penimbangan(){
        
    }
    
    public penimbangan(bayi id_bayi, Date tanggal_timbang, int bb, int tb , String deteksi, String keterangan){
        this.id_bayi = id_bayi;
        this.tanggal_timbang = tanggal_timbang;
        this.bb = bb;
        this.tb = tb;
        this.deteksi = deteksi;
        this.keterangan = keterangan;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    public int getBb() {
        return bb;
    }

    public void setDeteksi(String deteksi) {
        this.deteksi = deteksi;
    }

    public String getDeteksi() {
        return deteksi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId_bayi(bayi id_bayi) {
        this.id_bayi = id_bayi;
    }

    public bayi getId_bayi() {
        return id_bayi;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setTanggal_timbang(Date tanggal_timbang) {
        this.tanggal_timbang = tanggal_timbang;
    }

    public Date getTanggal_timbang() {
        return tanggal_timbang;
    }

    public void setTb(int tb) {
        this.tb = tb;
    }

    public int getTb() {
        return tb;
    }
    
    
}
