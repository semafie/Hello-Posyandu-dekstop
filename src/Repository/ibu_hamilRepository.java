
package Repository;

import entity.ibu_hamil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class ibu_hamilRepository implements Repository<ibu_hamil>{
    private static String tableName = ibu_hamil.tableName;

    @Override
    public List<ibu_hamil> get() {
    String sql = "Select * from "+ tableName;
        List<ibu_hamil> user = new ArrayList<>();
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
    public ibu_hamil get(Integer id) {
    String sql = "select * from "+tableName+" where id = ?";
        ibu_hamil us = new ibu_hamil();
        
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
    public boolean add(ibu_hamil us) {
    String sql = "Insert into "+tableName+" (`nama`, `tempat_lahir`, `tanggal_lahir`, `gol_darah`, `alamat`, `no_hp`, `nama_suami`, `tempat_lahir_suami`, `tanggal_lahir_suami`) values (?,?,?,?,?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            
            pst.setString(1, us.getNama());
            pst.setString(2, us.getTempat_lahir());
            pst.setDate(3, new Date(us.getTanggal_lahir().getTime()));
            pst.setString(4, us.getGol_darah());
            pst.setString(5, us.getAlamat());
            pst.setString(6, us.getNo_hp());
            pst.setString(7, us.getNama_suami());
            pst.setString(8, us.getTempat_lahir_suami());
            pst.setDate(9,new Date(us.getTanggal_lahir_suami().getTime()));
            
            pst.execute();
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(ibu_hamil us) {
    String sql = "update "+tableName+" set nama = ?, tempat_lahir = ?, tanggal_lahir = ?, gol_darah = ?, alamat = ?, no_hp = ?, nama_suami = ?, tempat_lahir_suami = ?, tanggal_lahir_suami = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, us.getNama());
            pst.setString(2, us.getTempat_lahir());
            pst.setDate(3, new Date(us.getTanggal_lahir().getTime()));
            pst.setString(4, us.getGol_darah());
            pst.setString(5, us.getAlamat());
            pst.setString(6, us.getNo_hp());
            pst.setString(7, us.getNama_suami());
            pst.setString(8, us.getTempat_lahir_suami());
            pst.setDate(9, new Date(us.getTanggal_lahir_suami().getTime()));
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
    
    private ibu_hamil mapToEntity(ResultSet res) throws SQLException {
        ibu_hamil us = new ibu_hamil(
                res.getString("nama"),
                res.getString("tempat_lahir"),
                res.getDate("tanggal_lahir"),
                res.getString("gol_darah"),
                res.getString("alamat"),
                res.getString("no_hp"),
                res.getString("nama_suami"),
                res.getString("tempat_lahir_suami"),
                res.getDate("tanggal_lahir_suami"));
        us.setId(res.getInt("id"));
        return us;
    }
}
