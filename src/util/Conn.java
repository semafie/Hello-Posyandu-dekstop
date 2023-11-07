
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    private static Connection mysqlConfig;
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost/db_posyandu";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.err.println("koneksi gagal" + e.getLocalizedMessage());
        }
        return mysqlConfig;
    }
    public static Connection getConnection(){
        return mysqlConfig;
}
}
