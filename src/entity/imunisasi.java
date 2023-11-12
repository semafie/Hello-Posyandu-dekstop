
package entity;

import java.util.Date;

public class imunisasi implements Entity{
    public static String tableName = "imunisasi";
    private String jenis_imunisasi, jenis_vitamin, keterangan;
    private bayi id_bayi;
    private int usia, id;
    private Date tanggal_imunisasi;
    
    public imunisasi(bayi id_bayi,Date tanggal_imunisasi, int usia, String jenis_imunisasi,String jenis_vitamin,String keterangan){
    this.id_bayi = id_bayi;
    this.tanggal_imunisasi = tanggal_imunisasi;
    this.usia = usia;
    this.jenis_imunisasi = jenis_imunisasi;
    this.jenis_vitamin = jenis_vitamin;
    this.keterangan = keterangan;
    }
    public imunisasi(){
    }

    public void setId_bayi(bayi id_bayi) {
        this.id_bayi = id_bayi;
    }

    public bayi getId_bayi() {
        return id_bayi;
    }

    public void setJenis_imunisasi(String jenis_imunisasi) {
        this.jenis_imunisasi = jenis_imunisasi;
    }

    public String getJenis_imunisasi() {
        return jenis_imunisasi;
    }

    public void setJenis_vitamin(String jenis_vitamin) {
        this.jenis_vitamin = jenis_vitamin;
    }

    public String getJenis_vitamin() {
        return jenis_vitamin;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setTanggal_imunisasi(Date tanggal_imunisasi) {
        this.tanggal_imunisasi = tanggal_imunisasi;
    }

    public Date getTanggal_imunisasi() {
        return tanggal_imunisasi;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
}
