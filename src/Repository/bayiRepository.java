
package Repository;

import entity.bayi;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import util.Conn;

public class bayiRepository implements Repository<bayi>{
    private static String tableName = bayi.tableName;

    @Override
    public List<bayi> get() {
    String sql = "Select * from "+ tableName;
        List<bayi> user = new ArrayList<>();
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
    public bayi get(Integer id) {
    String sql = "select * from "+tableName+" where id = ?";
        bayi us = new bayi();
        
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
    public boolean add(bayi us) {
    String sql = "Insert into "+tableName+" (`nama`, `tempat_lahir`, `tanggal_lahir`, `jenis_kelamin`, `nama_ibu`) values (?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            
            pst.setString(1, us.getNama());
            pst.setString(2, us.getTempat_lahir());
            pst.setDate(3, new Date(us.getTanggal_lahir().getTime()));
            pst.setString(4, us.getJenis_kelamin());
            pst.setString(5, us.getNama_ibu());
            
            pst.execute();
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(bayi us) {
    String sql = "update "+tableName+" set nama = ?, tempat_lahir = ?, tanggal_lahir = ?, jenis_kelamin = ?, nama_ibu = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, us.getNama());
            pst.setString(2, us.getTempat_lahir());
            pst.setDate(3, new Date(us.getTanggal_lahir().getTime()));
            pst.setString(4, us.getJenis_kelamin());
            pst.setString(5, us.getNama_ibu());
            pst.setInt(6, us.getId());
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
    
    private bayi mapToEntity(ResultSet res) throws SQLException {
        bayi us = new bayi(
                res.getString("nama"),
                res.getString("tempat_lahir"),
                res.getDate("tanggal_lahir"),
                res.getString("jenis_kelamin"),
                res.getString("nama_ibu"));
        us.setId(res.getInt("id"));
        return us;
    }
}
