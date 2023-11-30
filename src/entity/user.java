
package entity;

import java.util.Date;

public class user implements Entity{
    public static String tableName = "user";
    private String username, password, email, role, nama, tempat_lahir, pendidikan_terakhir, alamat, no_hp ;
    private int id, jumlah_data;
    private Date tanggal_lahir;
    public user(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
        
    }
    
    public user(int jumlah,String username, String password, String email,String role,String nama,String tempat_lahir,Date tanggal_lahir,String pendidikan_terakhir,String alamat, String no_hp){
        this.jumlah_data = jumlah;
        this.username = username;
        this.password = password;
        this.email = email;
        this.alamat = alamat;
        this.nama = nama;
        this.no_hp = no_hp;
        this.pendidikan_terakhir = pendidikan_terakhir;
        this.role = role;
        this.tanggal_lahir = tanggal_lahir;
        this.tempat_lahir = tempat_lahir;
    }
    
    public user(String username, String password, String email,String role,String nama,String tempat_lahir,Date tanggal_lahir,String pendidikan_terakhir,String alamat, String no_hp){
        
        this.username = username;
        this.password = password;
        this.email = email;
        this.alamat = alamat;
        this.nama = nama;
        this.no_hp = no_hp;
        this.pendidikan_terakhir = pendidikan_terakhir;
        this.role = role;
        this.tanggal_lahir = tanggal_lahir;
        this.tempat_lahir = tempat_lahir;
    }
    
    public user(int id,String username, String password, String email,String nama,String tempat_lahir,Date tanggal_lahir,String pendidikan_terakhir,String alamat, String no_hp){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.alamat = alamat;
        this.nama = nama;
        this.no_hp = no_hp;
        this.pendidikan_terakhir = pendidikan_terakhir;

        this.tanggal_lahir = tanggal_lahir;
        this.tempat_lahir = tempat_lahir;
    }
    
    public user(){
        
    }
    
    public user(int id){
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
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

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
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

    public void setJumlah_data(int jumlah_data) {
        this.jumlah_data = jumlah_data;
    }

    public int getJumlah_data() {
        return jumlah_data;
    }
    
    
}
