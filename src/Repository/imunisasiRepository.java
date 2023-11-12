
package Repository;

import entity.bayi;
import entity.imunisasi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class imunisasiRepository implements Repository<imunisasi>{
    private static String tableName = imunisasi.tableName;

    @Override
    public List<imunisasi> get() {
    String sql = "Select * from "+ tableName;
        List<imunisasi> user = new ArrayList<>();
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
    public imunisasi get(Integer id) {
    String sql = "select * from "+tableName+" where id = ?";
        imunisasi us = new imunisasi();
        
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

    @Override
    public boolean add(imunisasi us) {
    String sql = "Insert into "+tableName+" (`Id_bayi`, `tanggal_imunisasi`, `usia`, `jenis_imunisasi`, `jenis_vitamin`, `keterangan`) values (?,?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            
            pst.setInt(1, us.getId_bayi().getId());
            pst.setDate(2, new Date(us.getTanggal_imunisasi().getTime()));
            pst.setInt(3, us.getUsia());
            pst.setString(4, us.getJenis_imunisasi());
            pst.setString(5, us.getJenis_vitamin());
            pst.setString(6, us.getKeterangan());
            
            pst.execute();
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(imunisasi us) {
    String sql = "update "+tableName+" set Id_bayi = ?, tanggal_imunisasi = ?, usia = ?, jenis_imunisasi = ?, jenis_vitamin = ?, keterangan = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, us.getId_bayi().getId());
            pst.setDate(2, new Date(us.getTanggal_imunisasi().getTime()));
            pst.setInt(3, us.getUsia());
            pst.setString(4, us.getJenis_imunisasi());
            pst.setString(5, us.getJenis_vitamin());
            pst.setString(6, us.getKeterangan());
            pst.setInt(7, us.getId());
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
    
    private imunisasi mapToEntity(ResultSet res) throws SQLException {
        imunisasi us = new imunisasi(
        new bayiRepository().get(res.getInt("id_bayi")),
        res.getDate("tanggal_imunisasi"),
        res.getInt("usia"),
        res.getString("jenis_imunisasi"),
        res.getString("jenis_vitamin"),
        res.getString("keterangan"));
        us.setId(res.getInt("id"));
        return us;
    }
    
}
