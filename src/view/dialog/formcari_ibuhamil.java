/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Repository.ibu_hamilRepository;
import entity.ibu_hamil;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import util.Conn;
import static view.dialog.formcari_bayi.id;

/**
 *
 * @author semafie
 */
public class formcari_ibuhamil extends Dialog {
    ibu_hamilRepository uwow = new ibu_hamilRepository();
    public static int id;
    public formcari_ibuhamil(JFrame frame) {
        super(frame);
        initComponents();
        id = 0;
        load_tabel();
    }
public void load_tabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA_IBU_HAMIL");
        model.addColumn("TEMPAT LAHIR");
        model.addColumn("TANGGAL LAHIR");
        model.addColumn("GOL_DARAH");
        model.addColumn("ALAMAT");
        model.addColumn("NO_HP");
        model.addColumn("NAMA_SUAMI");
        model.addColumn("TEMPAT LAHIR SUAMI");
        model.addColumn("TANGGAL LAHIR SUAMI");
        
        try {
            for(ibu_hamil apa:uwow.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getNama(),
                    apa.getTempat_lahir(),
                    apa.getTanggal_lahir(),
                    apa.getGol_darah(),
                    apa.getAlamat(),
                    apa.getNo_hp(),
                    apa.getNama_suami(),
                    apa.getTempat_lahir_suami(),
                    apa.getTanggal_lahir_suami()
                });
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
public void load_tabel(String search) {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("NAMA_IBU_HAMIL");
    model.addColumn("TEMPAT LAHIR");
    model.addColumn("TANGGAL LAHIR");
    model.addColumn("GOL_DARAH");
    model.addColumn("ALAMAT");
    model.addColumn("NO_HP");
    model.addColumn("NAMA_SUAMI");
    model.addColumn("TEMPAT LAHIR SUAMI");
    model.addColumn("TANGGAL LAHIR SUAMI");

    try {
        String sql = "SELECT * FROM ibu_hamil WHERE id = ? OR nama LIKE ? OR tempat_lahir LIKE ? OR gol_darah LIKE ? OR alamat LIKE ? OR no_hp LIKE ? OR nama_suami LIKE ? OR tempat_lahir_suami LIKE ? OR tanggal_lahir_suami LIKE ?";
        Connection koneksi = (Connection) Conn.configDB();
        PreparedStatement pst = koneksi.prepareStatement(sql);
        pst.setString(1, "%" + search + "%");
        pst.setString(2, "%" + search + "%");
        pst.setString(3, "%" + search + "%");
        pst.setString(4, "%" + search + "%");
        pst.setString(5, "%" + search + "%");
        pst.setString(6, "%" + search + "%");
        pst.setString(7, "%" + search + "%");
        pst.setString(8, "%" + search + "%");
        pst.setString(9, "%" + search + "%");

        ResultSet res = pst.executeQuery();

        while (res.next()) {
            model.addRow(new Object[]{
                res.getString("id"),
                res.getString("nama"),
                res.getString("tempat_lahir"),
                res.getString("tanggal_lahir"),
                res.getString("gol_darah"),
                res.getString("alamat"),
                res.getString("no_hp"),
                res.getString("nama_suami"),
                res.getString("tempat_lahir_suami"),
                res.getString("tanggal_lahir_suami")
            });
        }

        table.setModel(model);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnbatal = new javax.swing.JLabel();
        btnpilih = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new view.swing.Table();
        search = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal1.png"))); // NOI18N
        btnbatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbatalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbatalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnbatalMousePressed(evt);
            }
        });
        jPanel1.add(btnbatal);
        btnbatal.setBounds(800, 480, 190, 60);

        btnpilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnpilih1.png"))); // NOI18N
        btnpilih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpilihMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpilihMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpilihMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnpilihMousePressed(evt);
            }
        });
        jPanel1.add(btnpilih);
        btnpilih.setBounds(1010, 480, 190, 60);

        jScrollPane1.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 1160, 370);

        search.setBackground(new Color(0,0,0,0));
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(950, 30, 230, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/formcari_ibuhamil.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(6, 0, 1218, 557);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1230, 560);

        setSize(new java.awt.Dimension(1244, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnpilihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpilihMouseClicked
    if(id != 0 ){
        closeMessage();
    }else {
        System.out.println("pilih sulu bro");
    }
    }//GEN-LAST:event_btnpilihMouseClicked

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
        closeMessage();
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btnpilihMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpilihMouseEntered

        btnpilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnpilih2.png")));
    }//GEN-LAST:event_btnpilihMouseEntered

    private void btnpilihMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpilihMouseExited
        btnpilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnpilih1.png")));
    }//GEN-LAST:event_btnpilihMouseExited

    private void btnpilihMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpilihMousePressed
       btnpilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnpilih3.png")));
    }//GEN-LAST:event_btnpilihMousePressed

    private void btnbatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseEntered
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal2.png")));
    }//GEN-LAST:event_btnbatalMouseEntered

    private void btnbatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseExited
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal1.png")));
    }//GEN-LAST:event_btnbatalMouseExited

    private void btnbatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMousePressed
       btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnformbatal3.png")));
    }//GEN-LAST:event_btnbatalMousePressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int baris = table.rowAtPoint(evt.getPoint());
        String idd = table.getValueAt(baris, 0).toString();
        id = Integer.valueOf(idd);
        System.out.println(id);
    }//GEN-LAST:event_tableMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        load_tabel(search.getText());
    }//GEN-LAST:event_searchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnbatal;
    private javax.swing.JLabel btnpilih;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private view.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
