
package Repository;

import entity.user;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class userRepository implements Repository<user>{
    private String tableName = user.tableName;

    @Override
    public List<user> get() {
    String sql = "Select * from "+ tableName+"";
        List<user> user = new ArrayList<>();
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
    
    public List<user> getbidan() {
    String sql = "Select * from "+ tableName+" where role = 'bidan'";
        List<user> user = new ArrayList<>();
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
    
    public List<user> getkader() {
    String sql = "Select * from "+ tableName+" where role = 'kader'";
        List<user> user = new ArrayList<>();
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
    public user get(Integer id) {
    String sql = "select * from "+tableName+" where id = ?";
        user us = new user();
        
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
    public boolean add(user us) {
    String sql = "Insert into "+tableName+" (`username`, `password`, `email`, `role`, `nama`, `tempat_lahir`, `tanggal_lahir`, `pendidikan_terakhir`, `alamat`, `no_hp`) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, us.getUsername());
            pst.setString(2, us.getPassword());
            pst.setString(3, us.getEmail());
            pst.setString(4, us.getRole());
            pst.setString(5, us.getNama());
            pst.setString(6, us.getTempat_lahir());
            pst.setDate(7, new Date(us.getTanggal_lahir().getTime()));
            pst.setString(8, us.getPendidikan_terakhir());
            pst.setString(9, us.getAlamat());
            pst.setString(10, us.getNo_hp());
            pst.execute();
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(user us) {
    String sql = "update "+tableName+" set username = ?, password = ?, email = ?, nama = ?, tempat_lahir = ?, tanggal_lahir = ?, pendidikan_terakhir = ?, alamat = ?, no_hp = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, us.getUsername());
            pst.setString(2, us.getPassword());
            pst.setString(3, us.getEmail());
            pst.setString(4, us.getNama());
            pst.setString(5, us.getTempat_lahir());
            pst.setDate(6, new Date(us.getTanggal_lahir().getTime()));
            pst.setString(7, us.getPendidikan_terakhir());
            pst.setString(8, us.getAlamat());
            pst.setString(9, us.getNo_hp());
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
    
    private user mapToEntity(ResultSet res) throws SQLException {
        user us = new user(
                res.getString("username"),
                res.getString("password"),
                res.getString("email"),
                res.getString("role"),
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
