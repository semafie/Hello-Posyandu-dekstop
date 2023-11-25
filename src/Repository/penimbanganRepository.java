
package Repository;

import entity.penimbangan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class penimbanganRepository implements Repository<penimbangan>{
    private static String tableName = penimbangan.tableName;

    @Override
    public List<penimbangan> get() {
    String sql = "Select * from "+ tableName;
        List<penimbangan> user = new ArrayList<>();
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
    public penimbangan get(Integer id) {
    String sql = "select * from "+tableName+" where id = ?";
        penimbangan us = new penimbangan();
        
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
    public boolean add(penimbangan us) {
    String sql = "Insert into "+tableName+" ( `Id_bayi`, `tanggal_timbang`, `bb`, `tb`, `deteksi`, `keterangan`) values (?,?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            
            pst.setInt(1, us.getId_bayi().getId());
            pst.setDate(2, new Date(us.getTanggal_timbang().getTime()));
            pst.setInt(3, us.getBb());
            pst.setInt(4, us.getTb());
            pst.setString(5, us.getDeteksi());
            pst.setString(6, us.getKeterangan());
            
            pst.execute();
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(penimbangan us) {
     String sql = "update "+tableName+" set Id_bayi = ?, tanggal_timbang = ?, bb = ?, tb = ?, deteksi = ?, keterangan = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, us.getId_bayi().getId());
            pst.setDate(2, new Date(us.getTanggal_timbang().getTime()));
            pst.setInt(3, us.getBb());
            pst.setInt(4, us.getTb());
            pst.setString(5, us.getDeteksi());
            
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
    
    private penimbangan mapToEntity(ResultSet res) throws SQLException {
        penimbangan us = new penimbangan(
        new bayiRepository().get(res.getInt("id_bayi")),
        res.getDate("tanggal_timbang"),
        res.getInt("bb"),
        res.getInt("tb"),
        res.getString("deteksi"),
        res.getString("keterangan"));
        us.setId(res.getInt("id"));
        return us;
    }
}
