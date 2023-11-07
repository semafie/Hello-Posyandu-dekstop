
package entity;

import java.util.Date;

public class bidan implements Entity{
    public static String tableName = "bidan";
    private int id;
    private String nama, tempat_lahir,  pendidikan_terakhir,alamat, no_hp;
    private Date tanggal_lahir;
    
    public bidan(){
        
    }
    
    public bidan(String nama, String tempat_lahir,Date tanggal_lahir, String pendidikan_terakhir, String alamat, String no_hp){
        this.nama = nama;
        this.tempat_lahir = tempat_lahir;
        this.tanggal_lahir = tanggal_lahir;
        this.pendidikan_terakhir = pendidikan_terakhir;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
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

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setPendidikan_terakhir(String pendidikan_terakhir) {
        this.pendidikan_terakhir = pendidikan_terakhir;
    }

    public String getPendidikan_terakhir() {
        return pendidikan_terakhir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }
    
    
}
