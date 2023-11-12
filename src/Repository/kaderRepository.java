
package Repository;

import entity.kader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class kaderRepository implements Repository<kader>{
    public static String tableName = kader.tableName;

    @Override
    public List<kader> get() {
    String sql = "Select * from "+ tableName+"";
        List<kader> user = new ArrayList<>();
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
    public kader get(Integer id) {
    String sql = "select * from "+tableName+" where id = ?";
        kader us = new kader();
        
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
    public boolean add(kader us) {
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
    public boolean update(kader us) {
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
    
    private kader mapToEntity(ResultSet res) throws SQLException {
        kader us = new kader(
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
