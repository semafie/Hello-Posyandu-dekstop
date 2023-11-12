/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.panel;

import Repository.kaderRepository;
import entity.bidan;
import entity.kader;
import java.awt.Font;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import main.main;
import util.Conn;
import view.dialog.formeditkader;
import view.dialog.formtambahkader;
import view.dialog.validasiberhasil;
import view.dialog.validasigagal;

/**
 *
 * @author RESCOM-1
 */
public class Data_Kader extends javax.swing.JPanel {
    kaderRepository uwow = new kaderRepository();
    public static int id;
    public Data_Kader() {
        initComponents();
        Font font = new Font("Quicksand", Font.BOLD, 20);
        txttotal.setFont(font);
        total.setFont(font);
        
        load_tabel();
        int rowCount = table.getRowCount();
        total.setText(String.valueOf(rowCount));
    }
    
    
    public void load_tabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA_KADER");
        model.addColumn("TEMPAT LAHIR");
        model.addColumn("TANGGAL LAHIR");
        model.addColumn("PENDIDIKAN");
        model.addColumn("ALAMAT");
        model.addColumn("NO HP");
        try {
            for(kader apa:uwow.get()){
                model.addRow(new Object[]{
                    apa.getId(),
                    apa.getNama(),
                    apa.getTempat_lahir(),
                    apa.getTanggal_lahir(),
                    apa.getPendidikan_terakhir(),
                    apa.getAlamat(),
                    apa.getNo_hp()
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
    model.addColumn("NAMA_KADER");
    model.addColumn("TEMPAT LAHIR");
    model.addColumn("TANGGAL LAHIR");
    model.addColumn("PENDIDIKAN");
    model.addColumn("ALAMAT");
    model.addColumn("NO HP");

    try {
        String sql = "SELECT * FROM kader WHERE id = ? OR nama LIKE ? OR tempat_lahir LIKE ? OR alamat LIKE ? OR no_hp LIKE ?";
        Connection koneksi = (Connection) Conn.configDB();
        PreparedStatement pst = koneksi.prepareStatement(sql);
        pst.setString(1, "%" + search + "%");
        pst.setString(2, "%" + search + "%");
        pst.setString(3, "%" + search + "%");
        pst.setString(4, "%" + search + "%");
        pst.setString(5, "%" + search + "%");

        ResultSet res = pst.executeQuery();

        while (res.next()) {
            model.addRow(new Object[]{
                res.getString("id"),
                res.getString("nama"),
                res.getString("tempat_lahir"),
                res.getString("tanggal_lahir"),
                res.getString("pendidikan"),
                res.getString("alamat"),
                res.getString("no_hp")
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

        txt_form = new javax.swing.JLabel();
        panelShadow25 = new view.swing.panelcustom.PanelShadow();
        jScrollPane25 = new javax.swing.JScrollPane();
        table = new view.swing.Table();
        btntambah = new javax.swing.JLabel();
        btnedit = new javax.swing.JLabel();
        btnhapus = new javax.swing.JLabel();
        btnsimpancetak = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        bgsearch = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 233));

        txt_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/txt_Form Data Kader.png"))); // NOI18N

        panelShadow25.setBackground(new java.awt.Color(234, 245, 255));

        jScrollPane25.setBorder(null);

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
        jScrollPane25.setViewportView(table);

        javax.swing.GroupLayout panelShadow25Layout = new javax.swing.GroupLayout(panelShadow25);
        panelShadow25.setLayout(panelShadow25Layout);
        panelShadow25Layout.setHorizontalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane25)
                .addGap(30, 30, 30))
        );
        panelShadow25Layout.setVerticalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btntambah1.png"))); // NOI18N
        btntambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btntambahMousePressed(evt);
            }
        });

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit1.png"))); // NOI18N
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btneditMousePressed(evt);
            }
        });

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus1.png"))); // NOI18N
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhapusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnhapusMousePressed(evt);
            }
        });

        btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak1.png"))); // NOI18N
        btnsimpancetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsimpancetakMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsimpancetakMousePressed(evt);
            }
        });

        txttotal.setText("Total Kader :");

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.setBackground(new Color(0,0,0,0)
        );
        txt_search.setBorder(null);
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 230, 30));

        bgsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/bgsearch.png"))); // NOI18N
        jPanel1.add(bgsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 284, 57));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btntambah)
                        .addGap(6, 6, 6)
                        .addComponent(btnedit)
                        .addGap(12, 12, 12)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_form, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                        .addComponent(btnsimpancetak))
                    .addComponent(panelShadow25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txt_form, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnhapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(panelShadow25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimpancetak)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseClicked
    main main = (main)SwingUtilities.getWindowAncestor(this);
        formtambahkader a = new formtambahkader(main);
        a.showPopUp();
    }//GEN-LAST:event_btntambahMouseClicked

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
    main main = (main)SwingUtilities.getWindowAncestor(this);
        formeditkader a = new formeditkader(main);
        a.showPopUp();
    }//GEN-LAST:event_btneditMouseClicked

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
    if(id != 0) {
        uwow.delete(id);
        main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasiberhasil aa = new validasiberhasil(wow,"Data Berhasil di hapus");
            aa.showPopUp();
            load_tabel();
    }else {
        main wow = (main)SwingUtilities.getWindowAncestor(this);
            validasigagal aa = new validasigagal(wow,"Pilih dulu dari tabel");
            aa.showPopUp();
    }
    }//GEN-LAST:event_btnhapusMouseClicked

    private void btnsimpancetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpancetakMouseClicked

    private void btntambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseEntered
    btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btntambah2.png")));
    }//GEN-LAST:event_btntambahMouseEntered

    private void btntambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseExited
    btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btntambah1.png")));
    }//GEN-LAST:event_btntambahMouseExited

    private void btntambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMousePressed
    btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btntambah3.png")));
    }//GEN-LAST:event_btntambahMousePressed

    private void btneditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseEntered
    btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit2.png")));
    }//GEN-LAST:event_btneditMouseEntered

    private void btneditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseExited
    btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit1.png")));
    }//GEN-LAST:event_btneditMouseExited

    private void btneditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMousePressed
    btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnedit3.png")));
    }//GEN-LAST:event_btneditMousePressed

    private void btnhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseEntered
    btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus2.png")));
    }//GEN-LAST:event_btnhapusMouseEntered

    private void btnhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseExited
    btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus1.png")));
    }//GEN-LAST:event_btnhapusMouseExited

    private void btnhapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMousePressed
    btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnhapus3.png")));
    }//GEN-LAST:event_btnhapusMousePressed

    private void btnsimpancetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseEntered
    btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak2.png")));
    }//GEN-LAST:event_btnsimpancetakMouseEntered

    private void btnsimpancetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMouseExited
    btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak1.png")));
    }//GEN-LAST:event_btnsimpancetakMouseExited

    private void btnsimpancetakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpancetakMousePressed
    btnsimpancetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnsimpan&cetak3.png")));
    }//GEN-LAST:event_btnsimpancetakMousePressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    int baris = table.rowAtPoint(evt.getPoint());
        String idd = table.getValueAt(baris, 0).toString();
        id = Integer.valueOf(idd);
        System.out.println(id);
    }//GEN-LAST:event_tableMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        load_tabel(txt_search.getText());
    }//GEN-LAST:event_txt_searchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgsearch;
    private javax.swing.JLabel btnedit;
    private javax.swing.JLabel btnhapus;
    private javax.swing.JLabel btnsimpancetak;
    private javax.swing.JLabel btntambah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane25;
    private view.swing.panelcustom.PanelShadow panelShadow25;
    private view.swing.Table table;
    private javax.swing.JLabel total;
    private javax.swing.JLabel txt_form;
    private javax.swing.JTextField txt_search;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
