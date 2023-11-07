
package entity;

import java.util.Date;

public class ibu_hamil implements Entity{
    public static String tableName = "ibu_hamil";
    private int id;
    private String nama, tempat_lahir,gol_darah, alamat, no_hp,nama_suami, tempat_lahir_suami;
    private Date tanggal_lahir, tanggal_lahir_suami;
    
    public ibu_hamil(){
        
    }
    
    public ibu_hamil(String nama,String tempat_lahir,Date tanggal_lahir, String gol_darah, String alamat,String no_hp,String nama_suami,String tempat_lahir_suami,Date tanggal_lahir_suami ){
        this.nama = nama;
        this.tempat_lahir =tempat_lahir;
        this.tanggal_lahir = tanggal_lahir;
        this.gol_darah = gol_darah;
        this.alamat = alamat;
        this. no_hp = no_hp;
        this.nama_suami = nama_suami;
        this.tempat_lahir_suami = tempat_lahir_suami;
        this.tanggal_lahir_suami = tanggal_lahir_suami;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setGol_darah(String gol_darah) {
        this.gol_darah = gol_darah;
    }

    public String getGol_darah() {
        return gol_darah;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama_suami(String nama_suami) {
        this.nama_suami = nama_suami;
    }

    public String getNama_suami() {
        return nama_suami;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir_suami(Date tanggal_lahir_suami) {
        this.tanggal_lahir_suami = tanggal_lahir_suami;
    }

    public Date getTanggal_lahir_suami() {
        return tanggal_lahir_suami;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir_suami(String tempat_lahir_suami) {
        this.tempat_lahir_suami = tempat_lahir_suami;
    }

    public String getTempat_lahir_suami() {
        return tempat_lahir_suami;
    }
    
    
}
