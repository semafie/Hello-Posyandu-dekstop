
package Repository;

import entity.bidan;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import util.Conn;

public class bidanRepository implements Repository<bidan>{
    private String tableName = bidan.tableName;

    @Override
    public List<bidan> get() {
    String sql = "Select * from "+ tableName;
        List<bidan> user = new ArrayList<>();
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
    public bidan get(Integer id) {
    String sql = "select * from "+tableName+" where id = ?";
        bidan us = new bidan();
        
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
    public boolean add(bidan us) {
    String sql = "Insert into "+tableName+" (`nama`, `tempat_lahir`, `tanggal_lahir`, `pendidikan_terakhir`, `alamat`, `no_hp`) values (?,?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            
            pst.setString(1, us.getNama());
            pst.setString(2, us.getTempat_lahir());
            pst.setDate(3, new Date(us.getTanggal_lahir().getTime()));
            pst.setString(4, us.getPendidikan_terakhir());
            pst.setString(5, us.getAlamat());
            pst.setString(6, us.getNo_hp());
            pst.execute();
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(bidan us) {
    String sql = "update "+tableName+" set nama = ?, tempat_lahir = ?, tanggal_lahir = ?, pendidikan_terakhir = ?, alamat = ?, no_hp = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, us.getNama());
            pst.setString(2, us.getTempat_lahir());
            pst.setDate(3, new Date(us.getTanggal_lahir().getTime()));
            pst.setString(4, us.getPendidikan_terakhir());
            pst.setString(5, us.getAlamat());
            pst.setString(6, us.getNo_hp());
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
    
    private bidan mapToEntity(ResultSet res) throws SQLException {
        bidan us = new bidan(
                res.getString("nama"),
                res.getString("tempat_lahir"),
                res.getDate("tanggal_lahir"),
                res.getString("pendidikan_terakhir"),
                res.getString("alamat"),
                res.getString("no_hp"));
        us.setId(res.getInt("id"));
        return us;
    }
}
