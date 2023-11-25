
package Repository;

import entity.ibu_hamil;
import entity.pemeriksaan_ibuhamil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class pemeriksaan_ibuhamilRepository implements Repository<pemeriksaan_ibuhamil>{
    private static String tableName = pemeriksaan_ibuhamil.tableName;

    @Override
    public List<pemeriksaan_ibuhamil> get() {
    String sql = "Select * from "+ tableName;
        List<pemeriksaan_ibuhamil> user = new ArrayList<>();
        try {
            Connection koneksi = (Connection)Conn.configDB();
            Statement stm = koneksi.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                user.add(mapToEntity(res));
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
        return user;
    }

    @Override
    public pemeriksaan_ibuhamil get(Integer id) {
    String sql = "select * from "+tableName+" where id = ?";
        pemeriksaan_ibuhamil us = new pemeriksaan_ibuhamil();
        
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                return mapToEntity(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    }
    
    public pemeriksaan_ibuhamil getlastid() {
    String sql = "select * from "+tableName+" ORDER BY id DESC LIMIT 1";
        pemeriksaan_ibuhamil us = new pemeriksaan_ibuhamil();
        
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                return mapToEntity(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    }

    @Override
    public boolean add(pemeriksaan_ibuhamil us) {
    String sql = "Insert into "+tableName+" (`id_ibu_hamil`, `tanggal_periksa`, `usia_kandungan`, `hamil_ke`, `riwayat_penyakit`, `bb`, `tb`, `deteksi`, `keterangan`) values (?,?,?,?,?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            
            pst.setInt(1, us.getId_ibuhamil().getId());
            pst.setDate(2, new Date(us.getTanggal_periksa().getTime()));
            pst.setInt(3, us.getUsia_kandungan());
            pst.setInt(4, us.getHamil_ke());
            pst.setString(5, us.getRiwayat_penyakit());
            pst.setInt(6, us.getBb());
            pst.setInt(7, us.getTb());
            pst.setString(8, us.getDeteksi());
            pst.setString(9, us.getKeterangan());
            
            pst.execute();
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(pemeriksaan_ibuhamil us) {
    String sql = "update "+tableName+" set id_ibu_hamil = ?, tanggal_periksa = ?, usia_kandungan = ?, hamil_ke = ?, riwayat_penyakit = ?, bb = ?, tb = ?, deteksi = ?, keterangan = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, us.getId_ibuhamil().getId());
            pst.setDate(2, new Date(us.getTanggal_periksa().getTime()));
            pst.setInt(3, us.getUsia_kandungan());
            pst.setInt(4, us.getHamil_ke());
            pst.setString(5, us.getRiwayat_penyakit());
            pst.setInt(6, us.getBb());
            pst.setInt(7, us.getTb());
            pst.setString(8, us.getDeteksi());
            pst.setString(9, us.getKeterangan());
            pst.setInt(10, us.getId());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
    String sql = "delete from "+tableName+" where id = ?";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private pemeriksaan_ibuhamil mapToEntity(ResultSet res) throws SQLException {
        pemeriksaan_ibuhamil us = new pemeriksaan_ibuhamil(
        new ibu_hamilRepository().get(res.getInt("id_ibu_hamil")),
        res.getDate("tanggal_periksa"),
        res.getInt("usia_kandungan"),
        res.getInt("hamil_ke"),
        res.getString("riwayat_penyakit"),
        res.getInt("bb"),
        res.getInt("tb"),
        res.getString("deteksi"),
        res.getString("keterangan"));
        us.setId(res.getInt("id"));
        return us;
    }
}
