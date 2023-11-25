
package entity;

import java.util.Date;

public class pemeriksaan_ibuhamil implements Entity{
    public static String tableName = "pemeriksaan_ibu_hamil";
    private ibu_hamil id_ibuhamil;
    private int usia_kandungan, hamil_ke, bb, tb , id;
    private String riwayat_penyakit, deteksi, keterangan;
    private Date tanggal_periksa;
    public pemeriksaan_ibuhamil(){
        
    }
    
    public pemeriksaan_ibuhamil(ibu_hamil id_ibuhamil,Date tanggal_periksa, int usia_kandungan, int hamil_ke, String riwayat_penyakit, int bb, int tb ,String deteksi,String keterangan ){
        this.id_ibuhamil = id_ibuhamil;
        this.tanggal_periksa = tanggal_periksa;
        this.usia_kandungan = usia_kandungan;
        this.hamil_ke = hamil_ke;
        this.riwayat_penyakit = riwayat_penyakit;
        this.bb = bb;
        this.tb = tb;
        this.deteksi = deteksi;
        this.keterangan = keterangan;
    }
    
    public pemeriksaan_ibuhamil(int id, ibu_hamil id_ibuhamil,Date tanggal_periksa, int usia_kandungan, int hamil_ke, String riwayat_penyakit, int bb, int tb ,String deteksi,String keterangan ){
        this.id = id;
        this.id_ibuhamil = id_ibuhamil;
        this.tanggal_periksa = tanggal_periksa;
        this.usia_kandungan = usia_kandungan;
        this.hamil_ke = hamil_ke;
        this.riwayat_penyakit = riwayat_penyakit;
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

    public void setHamil_ke(int hamil_ke) {
        this.hamil_ke = hamil_ke;
    }

    public int getHamil_ke() {
        return hamil_ke;
    }

    public void setId_ibuhamil(ibu_hamil id_ibuhamil) {
        this.id_ibuhamil = id_ibuhamil;
    }

    public ibu_hamil getId_ibuhamil() {
        return id_ibuhamil;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setRiwayat_penyakit(String riwayat_penyakit) {
        this.riwayat_penyakit = riwayat_penyakit;
    }

    public String getRiwayat_penyakit() {
        return riwayat_penyakit;
    }

    public void setTb(int tb) {
        this.tb = tb;
    }

    public int getTb() {
        return tb;
    }

    public void setUsia_kandungan(int usia_kandungan) {
        this.usia_kandungan = usia_kandungan;
    }

    public int getUsia_kandungan() {
        return usia_kandungan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTanggal_periksa(Date tanggal_periksa) {
        this.tanggal_periksa = tanggal_periksa;
    }

    public Date getTanggal_periksa() {
        return tanggal_periksa;
    }
    
}
