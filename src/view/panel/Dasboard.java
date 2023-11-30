
package view.panel;

import Repository.userRepository;
import entity.user;
import javax.swing.SwingUtilities;
import main.main;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Conn;
import view.dialog.validasiberhasil;

public class Dasboard extends javax.swing.JPanel {
    private int imunisasi = 0, penimbangan = 0 , periksa = 0, bayi = 0, ibu = 0;
            
    userRepository user = new userRepository();
    public Dasboard() {
        initComponents();
        Font font = new Font("Quicksand", Font.BOLD, 20);
        total_data_bayi.setFont(font);
        total_data_bidan.setFont(font);
        total_data_ibuhamil.setFont(font);
        total_data_kader.setFont(font);
        total_data_pelayanan.setFont(font);
        total_data_registrasi.setFont(font);
        gettotalbidan();
        gettotalkader();
        gettotalbayi();
        gettotalibuhamil();
        gettotalimunisasi();
        gettotalpenimbangan();
        gettotalperiksa();
        total_data_pelayanan.setText(String.valueOf(imunisasi+ penimbangan+ periksa));
        total_data_registrasi.setText(String.valueOf(ibu+bayi));
//        main main =(main)SwingUtilities.getWindowAncestor(this);
//        validasiberhasil aa = new validasiberhasil(main,"Anda Berhasil Login");
//            aa.showPopUp();
    }
public void gettotalbidan() {
    String sql = "SELECT COUNT(*) AS jumlahbro FROM user where role = 'bidan'";
    
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                int jumlah = res.getInt("jumlahbro");
                total_data_bidan.setText(String.valueOf(jumlah));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
public void gettotalkader() {
    String sql = "SELECT COUNT(*) AS jumlahbro FROM user where role = 'kader'";
    
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                int jumlah = res.getInt("jumlahbro");
                total_data_kader.setText(String.valueOf(jumlah));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
public void gettotalbayi() {
    String sql = "SELECT COUNT(*) AS jumlahbro FROM bayi";
    
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                int jumlah = res.getInt("jumlahbro");
                total_data_bayi.setText(String.valueOf(jumlah));
                bayi = jumlah;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
public void gettotalibuhamil() {
    String sql = "SELECT COUNT(*) AS jumlahbro FROM ibu_hamil";
    
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                int jumlah = res.getInt("jumlahbro");
                total_data_ibuhamil.setText(String.valueOf(jumlah));
                ibu = jumlah;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
public void gettotalimunisasi() {
    String sql = "SELECT COUNT(*) AS jumlahbro FROM imunisasi";
    
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                int jumlah = res.getInt("jumlahbro");
                imunisasi = jumlah;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
public void gettotalpenimbangan() {
    String sql = "SELECT COUNT(*) AS jumlahbro FROM penimbangan";
    
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                int jumlah = res.getInt("jumlahbro");
                penimbangan = jumlah;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
public void gettotalperiksa() {
    String sql = "SELECT COUNT(*) AS jumlahbro FROM pemeriksaan_ibu_hamil";
    
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                int jumlah = res.getInt("jumlahbro");
                periksa = jumlah;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_form = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        total_data_pelayanan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        total_data_bayi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        total_data_kader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        total_data_bidan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        total_data_registrasi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        total_data_ibuhamil = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 233));

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Form Beranda.png"))); // NOI18N

        jPanel4.setBackground(new Color(0,0,0,0)
        );
        jPanel4.setLayout(null);
        jPanel4.add(total_data_pelayanan);
        total_data_pelayanan.setBounds(90, 50, 30, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Jumlah Data Pelayanan.png"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(6, 6, 120, 100);

        jPanel3.setBackground(new Color(0,0,0,0)
        );
        jPanel3.setLayout(null);
        jPanel3.add(total_data_bayi);
        total_data_bayi.setBounds(90, 50, 30, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Jumlah Data Bayi.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(6, 6, 120, 100);

        jPanel2.setBackground(new Color(0,0,0,0)
        );
        jPanel2.setLayout(null);
        jPanel2.add(total_data_kader);
        total_data_kader.setBounds(90, 50, 30, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Jumlah Data Kader.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(6, 6, 120, 100);

        jPanel1.setBackground(new Color(0,0,0,0)
        );
        jPanel1.setLayout(null);
        jPanel1.add(total_data_bidan);
        total_data_bidan.setBounds(90, 50, 30, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Jumlah Data Bidan.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(6, 6, 120, 100);

        jPanel5.setBackground(new Color(0,0,0,0)
        );
        jPanel5.setLayout(null);
        jPanel5.add(total_data_registrasi);
        total_data_registrasi.setBounds(90, 50, 30, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Jumlah Data Registrasi.png"))); // NOI18N
        jPanel5.add(jLabel5);
        jLabel5.setBounds(6, 6, 120, 100);

        jPanel6.setBackground(new Color(0,0,0,0)
        );
        jPanel6.setLayout(null);
        jPanel6.add(total_data_ibuhamil);
        total_data_ibuhamil.setBounds(90, 50, 30, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/Jumlah Data Ibu Hamil.png"))); // NOI18N
        jPanel6.add(jLabel6);
        jLabel6.setBounds(6, 6, 120, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_form))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel total_data_bayi;
    private javax.swing.JLabel total_data_bidan;
    private javax.swing.JLabel total_data_ibuhamil;
    private javax.swing.JLabel total_data_kader;
    private javax.swing.JLabel total_data_pelayanan;
    private javax.swing.JLabel total_data_registrasi;
    private javax.swing.JLabel txt_form;
    // End of variables declaration//GEN-END:variables
}
