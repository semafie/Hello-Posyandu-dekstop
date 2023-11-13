
package entity;

import java.util.Date;

public class bayi implements Entity{
    public static String tableName = "bayi";
    private int id;
    private String nama, tempat_lahir,jenis_kelamin, nama_ibu;
    private Date tanggal_lahir;
    
    public bayi (){
        
    }
    
    public bayi (int id){
        this.id = id;
    }
    
    public bayi (String nama, String tempat_lahir,Date tanggal_lahir, String jenis_kelamin, String nama_ibu){
        this.nama= nama;
        this.tempat_lahir= tempat_lahir;
        this.tanggal_lahir= tanggal_lahir;
        this.jenis_kelamin= jenis_kelamin;
        this.nama_ibu= nama_ibu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama_ibu(String nama_ibu) {
        this.nama_ibu = nama_ibu;
    }

    public String getNama_ibu() {
        return nama_ibu;
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
